package typings.traceryGrammar

import typings.traceryGrammar.mod.TraceryNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    def a(s: String): String
    
    def capitalize(s: String): String
    
    def capitalizeAll(s: String): String
    
    def ed(s: String): String
    
    def firstS(s: String): String
    
    def replace(s: String, params: js.Array[String]): String
    
    def s(s: String): String
  }
  object A {
    
    inline def apply(
      a: String => String,
      capitalize: String => String,
      capitalizeAll: String => String,
      ed: String => String,
      firstS: String => String,
      replace: (String, js.Array[String]) => String,
      s: String => String
    ): A = {
      val __obj = js.Dynamic.literal(a = js.Any.fromFunction1(a), capitalize = js.Any.fromFunction1(capitalize), capitalizeAll = js.Any.fromFunction1(capitalizeAll), ed = js.Any.fromFunction1(ed), firstS = js.Any.fromFunction1(firstS), replace = js.Any.fromFunction2(replace), s = js.Any.fromFunction1(s))
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: String => String): Self = StObject.set(x, "a", js.Any.fromFunction1(value))
      
      inline def setCapitalize(value: String => String): Self = StObject.set(x, "capitalize", js.Any.fromFunction1(value))
      
      inline def setCapitalizeAll(value: String => String): Self = StObject.set(x, "capitalizeAll", js.Any.fromFunction1(value))
      
      inline def setEd(value: String => String): Self = StObject.set(x, "ed", js.Any.fromFunction1(value))
      
      inline def setFirstS(value: String => String): Self = StObject.set(x, "firstS", js.Any.fromFunction1(value))
      
      inline def setReplace(value: (String, js.Array[String]) => String): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      inline def setS(value: String => String): Self = StObject.set(x, "s", js.Any.fromFunction1(value))
    }
  }
  
  trait Modifiers extends StObject {
    
    var modifiers: js.Array[Any]
    
    var postactions: js.Array[Any]
    
    var preactions: js.Array[Any]
    
    var symbol: Any
  }
  object Modifiers {
    
    inline def apply(modifiers: js.Array[Any], postactions: js.Array[Any], preactions: js.Array[Any], symbol: Any): Modifiers = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], postactions = postactions.asInstanceOf[js.Any], preactions = preactions.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifiers]
    }
    
    extension [Self <: Modifiers](x: Self) {
      
      inline def setModifiers(value: js.Array[Any]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: Any*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setPostactions(value: js.Array[Any]): Self = StObject.set(x, "postactions", value.asInstanceOf[js.Any])
      
      inline def setPostactionsVarargs(value: Any*): Self = StObject.set(x, "postactions", js.Array(value*))
      
      inline def setPreactions(value: js.Array[Any]): Self = StObject.set(x, "preactions", value.asInstanceOf[js.Any])
      
      inline def setPreactionsVarargs(value: Any*): Self = StObject.set(x, "preactions", js.Array(value*))
      
      inline def setSymbol(value: Any): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: js.UndefOr[TraceryNode] = js.undefined
  }
  object Node {
    
    inline def apply(): Node = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: TraceryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
