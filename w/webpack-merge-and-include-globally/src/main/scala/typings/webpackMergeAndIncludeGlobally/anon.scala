package typings.webpackMergeAndIncludeGlobally

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dest extends StObject {
    
    var dest: String | (js.Function1[/* code */ String, StringDictionary[String]]) = js.native
    
    var src: js.Array[String] = js.native
  }
  object Dest {
    
    @scala.inline
    def apply(dest: String | (js.Function1[/* code */ String, StringDictionary[String]]), src: js.Array[String]): Dest = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dest]
    }
    
    @scala.inline
    implicit class DestMutableBuilder[Self <: Dest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: String | (js.Function1[/* code */ String, StringDictionary[String]])): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestFunction1(value: /* code */ String => StringDictionary[String]): Self = StObject.set(x, "dest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    }
  }
}
