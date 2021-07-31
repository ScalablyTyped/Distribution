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
  
  @scala.inline
  def apply(): WorkbookProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProperties]
  }
  
  @scala.inline
  implicit class WorkbookPropertiesMutableBuilder[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeName(value: String): Self = StObject.set(x, "CodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNameUndefined: Self = StObject.set(x, "CodeName", js.undefined)
    
    @scala.inline
    def setDate1904(value: Boolean): Self = StObject.set(x, "date1904", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate1904Undefined: Self = StObject.set(x, "date1904", js.undefined)
    
    @scala.inline
    def setFilterPrivacy(value: Boolean): Self = StObject.set(x, "filterPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPrivacyUndefined: Self = StObject.set(x, "filterPrivacy", js.undefined)
  }
}
