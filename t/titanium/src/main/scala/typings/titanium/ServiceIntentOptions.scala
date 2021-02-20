package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options passed to <Titanium.Android.createServiceIntent>.
  */
@js.native
trait ServiceIntentOptions extends StObject {
  
  /**
    * One of the `START_*` constants from <Titanium.Android> to specify the "stickiness" of the Service when Android shuts down the host application.
    */
  var startMode: js.UndefOr[Double] = js.native
  
  /**
    * URL for the service's JavaScript.
    */
  var url: js.UndefOr[String] = js.native
}
object ServiceIntentOptions {
  
  @scala.inline
  def apply(): ServiceIntentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceIntentOptions]
  }
  
  @scala.inline
  implicit class ServiceIntentOptionsMutableBuilder[Self <: ServiceIntentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartMode(value: Double): Self = StObject.set(x, "startMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartModeUndefined: Self = StObject.set(x, "startMode", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
