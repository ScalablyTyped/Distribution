package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionEventCallback extends StObject {
  
  /**
    * The uri of the endpoint that is hit when an event occurs
    */
  var uri: String
}
object ExtensionEventCallback {
  
  @scala.inline
  def apply(uri: String): ExtensionEventCallback = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventCallback]
  }
  
  @scala.inline
  implicit class ExtensionEventCallbackMutableBuilder[Self <: ExtensionEventCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
