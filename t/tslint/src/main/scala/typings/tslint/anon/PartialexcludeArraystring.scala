package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  exclude :std.Array<string>,   format :string}> */
trait PartialexcludeArraystring extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
}
object PartialexcludeArraystring {
  
  inline def apply(): PartialexcludeArraystring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialexcludeArraystring]
  }
  
  extension [Self <: PartialexcludeArraystring](x: Self) {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
