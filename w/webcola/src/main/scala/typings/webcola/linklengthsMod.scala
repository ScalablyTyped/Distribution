package typings.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linklengthsMod {
  
  @JSImport("webcola/dist/src/linklengths", "generateDirectedEdgeConstraints")
  @js.native
  def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = js.native
  
  @JSImport("webcola/dist/src/linklengths", "jaccardLinkLengths")
  @js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  @JSImport("webcola/dist/src/linklengths", "jaccardLinkLengths")
  @js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
  
  @JSImport("webcola/dist/src/linklengths", "stronglyConnectedComponents")
  @js.native
  def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("webcola/dist/src/linklengths", "symmetricDiffLinkLengths")
  @js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  @JSImport("webcola/dist/src/linklengths", "symmetricDiffLinkLengths")
  @js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
  
  @js.native
  trait DirectedEdgeConstraints extends StObject {
    
    var axis: String = js.native
    
    var gap: Double = js.native
  }
  object DirectedEdgeConstraints {
    
    @scala.inline
    def apply(axis: String, gap: Double): DirectedEdgeConstraints = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectedEdgeConstraints]
    }
    
    @scala.inline
    implicit class DirectedEdgeConstraintsMutableBuilder[Self <: DirectedEdgeConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IConstraint extends StObject {
    
    var gap: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
  }
  object IConstraint {
    
    @scala.inline
    def apply(gap: Double, left: Double, right: Double): IConstraint = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstraint]
    }
    
    @scala.inline
    implicit class IConstraintMutableBuilder[Self <: IConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkAccessor[Link] extends StObject {
    
    def getSourceIndex(l: Link): Double = js.native
    
    def getTargetIndex(l: Link): Double = js.native
  }
  object LinkAccessor {
    
    @scala.inline
    def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkAccessor[Link]]
    }
    
    @scala.inline
    implicit class LinkAccessorMutableBuilder[Self <: LinkAccessor[_], Link] (val x: Self with LinkAccessor[Link]) extends AnyVal {
      
      @scala.inline
      def setGetSourceIndex(value: Link => Double): Self = StObject.set(x, "getSourceIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTargetIndex(value: Link => Double): Self = StObject.set(x, "getTargetIndex", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
    
    def setLength(l: Link, value: Double): Unit = js.native
  }
  object LinkLengthAccessor {
    
    @scala.inline
    def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, setLength: (Link, Double) => Unit): LinkLengthAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2(setLength))
      __obj.asInstanceOf[LinkLengthAccessor[Link]]
    }
    
    @scala.inline
    implicit class LinkLengthAccessorMutableBuilder[Self <: LinkLengthAccessor[_], Link] (val x: Self with LinkLengthAccessor[Link]) extends AnyVal {
      
      @scala.inline
      def setSetLength(value: (Link, Double) => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
    
    def getMinSeparation(l: Link): Double = js.native
  }
  object LinkSepAccessor {
    
    @scala.inline
    def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
      val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkSepAccessor[Link]]
    }
    
    @scala.inline
    implicit class LinkSepAccessorMutableBuilder[Self <: LinkSepAccessor[_], Link] (val x: Self with LinkSepAccessor[Link]) extends AnyVal {
      
      @scala.inline
      def setGetMinSeparation(value: Link => Double): Self = StObject.set(x, "getMinSeparation", js.Any.fromFunction1(value))
    }
  }
}
