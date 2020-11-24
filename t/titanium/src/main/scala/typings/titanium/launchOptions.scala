package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the arguments passed to the application on startup.
  * Use the [getArguments](Titanium.App.getArguments) method to retrieve the launch options.
  */
@js.native
trait launchOptions extends js.Object {
  
  /**
    * If set to `true`, this key indicates that the application was launched in response to an
    * incoming location event.
    */
  var launchOptionsLocationKey: js.UndefOr[Boolean] = js.native
  
  /**
    * This key indicates that the application was launched by another
    * application with the specified bundle ID.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * This key indicates that the application was launched in order to open
    * the specified URL.
    */
  var url: js.UndefOr[String] = js.native
}
object launchOptions {
  
  @scala.inline
  def apply(): launchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[launchOptions]
  }
  
  @scala.inline
  implicit class launchOptionsOps[Self <: launchOptions] (val x: Self) extends AnyVal {
    
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
    def setLaunchOptionsLocationKey(value: Boolean): Self = this.set("launchOptionsLocationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchOptionsLocationKey: Self = this.set("launchOptionsLocationKey", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
