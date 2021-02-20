package typings.xmlC14n

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-c14n", JSImport.Namespace)
  @js.native
  def apply(): CanonizationFactory = js.native
  
  @js.native
  trait Canonicalize extends StObject {
    
    def _processInner(node: Node): String = js.native
    
    def canonicalise(node: Node, cb: canonicaliseCb): Unit = js.native
    
    def name(): String = js.native
  }
  object Canonicalize {
    
    @scala.inline
    def apply(_processInner: Node => String, canonicalise: (Node, canonicaliseCb) => Unit, name: () => String): Canonicalize = {
      val __obj = js.Dynamic.literal(_processInner = js.Any.fromFunction1(_processInner), canonicalise = js.Any.fromFunction2(canonicalise), name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[Canonicalize]
    }
    
    @scala.inline
    implicit class CanonicalizeMutableBuilder[Self <: Canonicalize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonicalise(value: (Node, canonicaliseCb) => Unit): Self = StObject.set(x, "canonicalise", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_processInner(value: Node => String): Self = StObject.set(x, "_processInner", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CanonizationFactory extends StObject {
    
    def createCanonicaliser(kind: String): Canonicalize = js.native
    def createCanonicaliser(kind: String, options: Options): Canonicalize = js.native
    
    def getAlgorithm(uri: String): js.Any = js.native
    
    def registerAlgorithm(uri: String, implementation: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var includeComments: js.UndefOr[Boolean] = js.native
    
    var inclusiveNamespaces: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeComments(value: Boolean): Self = StObject.set(x, "includeComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCommentsUndefined: Self = StObject.set(x, "includeComments", js.undefined)
      
      @scala.inline
      def setInclusiveNamespaces(value: Boolean): Self = StObject.set(x, "inclusiveNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusiveNamespacesUndefined: Self = StObject.set(x, "inclusiveNamespaces", js.undefined)
    }
  }
  
  type canonicaliseCb = js.Function2[/* err */ js.Any, /* data */ String, Unit]
}
