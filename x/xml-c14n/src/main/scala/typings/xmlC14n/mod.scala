package typings.xmlC14n

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): CanonizationFactory = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CanonizationFactory]
  
  @JSImport("xml-c14n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Canonicalize extends StObject {
    
    def _processInner(node: Node): String
    
    def canonicalise(node: Node, cb: canonicaliseCb): Unit
    
    def name(): String
  }
  object Canonicalize {
    
    inline def apply(_processInner: Node => String, canonicalise: (Node, canonicaliseCb) => Unit, name: () => String): Canonicalize = {
      val __obj = js.Dynamic.literal(_processInner = js.Any.fromFunction1(_processInner), canonicalise = js.Any.fromFunction2(canonicalise), name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[Canonicalize]
    }
    
    extension [Self <: Canonicalize](x: Self) {
      
      inline def setCanonicalise(value: (Node, canonicaliseCb) => Unit): Self = StObject.set(x, "canonicalise", js.Any.fromFunction2(value))
      
      inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      inline def set_processInner(value: Node => String): Self = StObject.set(x, "_processInner", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CanonizationFactory extends StObject {
    
    def createCanonicaliser(kind: String): Canonicalize = js.native
    def createCanonicaliser(kind: String, options: Options): Canonicalize = js.native
    
    def getAlgorithm(uri: String): Any = js.native
    
    def registerAlgorithm(uri: String, implementation: Any): Any = js.native
  }
  
  trait Options extends StObject {
    
    var includeComments: js.UndefOr[Boolean] = js.undefined
    
    var inclusiveNamespaces: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeComments(value: Boolean): Self = StObject.set(x, "includeComments", value.asInstanceOf[js.Any])
      
      inline def setIncludeCommentsUndefined: Self = StObject.set(x, "includeComments", js.undefined)
      
      inline def setInclusiveNamespaces(value: Boolean): Self = StObject.set(x, "inclusiveNamespaces", value.asInstanceOf[js.Any])
      
      inline def setInclusiveNamespacesUndefined: Self = StObject.set(x, "inclusiveNamespaces", js.undefined)
    }
  }
  
  type canonicaliseCb = js.Function2[/* err */ Any, /* data */ String, Unit]
}
