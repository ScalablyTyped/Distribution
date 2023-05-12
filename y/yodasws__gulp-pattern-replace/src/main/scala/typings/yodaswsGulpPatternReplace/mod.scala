package typings.yodaswsGulpPatternReplace

import typings.node.NodeJS.ReadWriteStream
import typings.replacestream.mod.ReplaceFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`object`: SearchObject): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(`object`: SearchObject, replaceTo: Replacement): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], replaceTo.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("@yodasws/gulp-pattern-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Replacement = String | ReplaceFunction
  
  type SearchObject = SearchOptions | SearchPattern | (js.Array[SearchOptions | SearchPattern | (js.Tuple2[SearchPattern, Replacement])])
  
  trait SearchOptions extends StObject {
    
    var pattern: js.UndefOr[SearchPattern] = js.undefined
    
    var replacement: js.UndefOr[Replacement] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: SearchPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setReplacement(value: Replacement): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementFunction4(value: (/* match */ String, /* p1 */ String, /* offset */ Double, /* string */ String) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction4(value))
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
  
  type SearchPattern = js.RegExp | String
}
