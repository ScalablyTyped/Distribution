package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContactInstantMessageField
  extends StObject
     with IContactField {
  
  var displayText: String
  
  var launchUri: Uri
  
  var service: String
  
  var userName: String
}
object IContactInstantMessageField {
  
  inline def apply(
    category: ContactFieldCategory,
    displayText: String,
    launchUri: Uri,
    name: String,
    service: String,
    `type`: ContactFieldType,
    userName: String,
    value: String
  ): IContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], launchUri = launchUri.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactInstantMessageField]
  }
  
  extension [Self <: IContactInstantMessageField](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setLaunchUri(value: Uri): Self = StObject.set(x, "launchUri", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
