package typings.titanium.Titanium.App

import typings.titanium.LaunchOptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a new URL is handled by the application.
  */
@js.native
trait iOSHandleurlEvent extends iOSBaseEvent {
  
  /**
    * The launch options that are related to opening the URL.
    */
  var launchOptions: LaunchOptionsType = js.native
}
object iOSHandleurlEvent {
  
  @scala.inline
  def apply(launchOptions: LaunchOptionsType, source: iOS): iOSHandleurlEvent = {
    val __obj = js.Dynamic.literal(launchOptions = launchOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSHandleurlEvent]
  }
  
  @scala.inline
  implicit class iOSHandleurlEventMutableBuilder[Self <: iOSHandleurlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchOptions(value: LaunchOptionsType): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
  }
}
