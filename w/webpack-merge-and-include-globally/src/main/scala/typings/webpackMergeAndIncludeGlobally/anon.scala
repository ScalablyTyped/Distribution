package typings.webpackMergeAndIncludeGlobally

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dest extends StObject {
    
    var dest: String | (js.Function1[/* code */ String, StringDictionary[String]])
    
    var src: js.Array[String]
  }
  object Dest {
    
    inline def apply(dest: String | (js.Function1[/* code */ String, StringDictionary[String]]), src: js.Array[String]): Dest = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dest]
    }
    
    extension [Self <: Dest](x: Self) {
      
      inline def setDest(value: String | (js.Function1[/* code */ String, StringDictionary[String]])): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestFunction1(value: /* code */ String => StringDictionary[String]): Self = StObject.set(x, "dest", js.Any.fromFunction1(value))
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
}
