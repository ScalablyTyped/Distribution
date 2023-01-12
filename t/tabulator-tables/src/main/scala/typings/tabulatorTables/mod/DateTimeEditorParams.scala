package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeEditorParams
  extends StObject
     with SharedEditorParams
     with _EditorParams {
  
  var format: js.UndefOr[String] = js.undefined
}
object DateTimeEditorParams {
  
  inline def apply(): DateTimeEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeEditorParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeEditorParams] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
