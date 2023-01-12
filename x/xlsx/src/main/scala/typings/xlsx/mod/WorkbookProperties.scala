package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookProperties extends StObject {
  
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.undefined
  
  /** Worksheet Epoch (1904 if true, 1900 if false) */
  var date1904: js.UndefOr[Boolean] = js.undefined
  
  /** Warn or strip personally identifying info on save */
  var filterPrivacy: js.UndefOr[Boolean] = js.undefined
}
object WorkbookProperties {
  
  inline def apply(): WorkbookProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    
    inline def setCodeName(value: String): Self = StObject.set(x, "CodeName", value.asInstanceOf[js.Any])
    
    inline def setCodeNameUndefined: Self = StObject.set(x, "CodeName", js.undefined)
    
    inline def setDate1904(value: Boolean): Self = StObject.set(x, "date1904", value.asInstanceOf[js.Any])
    
    inline def setDate1904Undefined: Self = StObject.set(x, "date1904", js.undefined)
    
    inline def setFilterPrivacy(value: Boolean): Self = StObject.set(x, "filterPrivacy", value.asInstanceOf[js.Any])
    
    inline def setFilterPrivacyUndefined: Self = StObject.set(x, "filterPrivacy", js.undefined)
  }
}
