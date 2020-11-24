package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options passed to <Titanium.Android.createServiceIntent>.
  */
@js.native
trait ServiceIntentOptions extends js.Object {
  
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
  implicit class ServiceIntentOptionsOps[Self <: ServiceIntentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStartMode(value: Double): Self = this.set("startMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMode: Self = this.set("startMode", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
