package typings.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLinklengthsMod {
  
  @JSImport("webcola/dist/src/linklengths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDirectedEdgeConstraints")(n.asInstanceOf[js.Any], links.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[IConstraint]]
  
  inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stronglyConnectedComponents")(numVertices.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DirectedEdgeConstraints extends StObject {
    
    var axis: String
    
    var gap: Double
  }
  object DirectedEdgeConstraints {
    
    inline def apply(axis: String, gap: Double): DirectedEdgeConstraints = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectedEdgeConstraints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectedEdgeConstraints] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConstraint extends StObject {
    
    var gap: Double
    
    var left: Double
    
    var right: Double
  }
  object IConstraint {
    
    inline def apply(gap: Double, left: Double, right: Double): IConstraint = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConstraint] (val x: Self) extends AnyVal {
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkAccessor[Link] extends StObject {
    
    def getSourceIndex(l: Link): Double
    
    def getTargetIndex(l: Link): Double
  }
  object LinkAccessor {
    
    inline def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkAccessor[Link]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkAccessor[?], Link] (val x: Self & LinkAccessor[Link]) extends AnyVal {
      
      inline def setGetSourceIndex(value: Link => Double): Self = StObject.set(x, "getSourceIndex", js.Any.fromFunction1(value))
      
      inline def setGetTargetIndex(value: Link => Double): Self = StObject.set(x, "getTargetIndex", js.Any.fromFunction1(value))
    }
  }
  
  trait LinkLengthAccessor[Link]
    extends StObject
       with LinkAccessor[Link] {
    
    def setLength(l: Link, value: Double): Unit
  }
  object LinkLengthAccessor {
    
    inline def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, setLength: (Link, Double) => Unit): LinkLengthAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2(setLength))
      __obj.asInstanceOf[LinkLengthAccessor[Link]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkLengthAccessor[?], Link] (val x: Self & LinkLengthAccessor[Link]) extends AnyVal {
      
      inline def setSetLength(value: (Link, Double) => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction2(value))
    }
  }
  
  trait LinkSepAccessor[Link]
    extends StObject
       with LinkAccessor[Link] {
    
    def getMinSeparation(l: Link): Double
  }
  object LinkSepAccessor {
    
    inline def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
      val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkSepAccessor[Link]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkSepAccessor[?], Link] (val x: Self & LinkSepAccessor[Link]) extends AnyVal {
      
      inline def setGetMinSeparation(value: Link => Double): Self = StObject.set(x, "getMinSeparation", js.Any.fromFunction1(value))
    }
  }
}
