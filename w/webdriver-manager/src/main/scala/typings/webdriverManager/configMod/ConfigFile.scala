package typings.webdriverManager.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFile extends /* key */ StringDictionary[String] {
  
  var android: js.UndefOr[String] = js.native
  
  var appium: js.UndefOr[String] = js.native
  
  var chrome: js.UndefOr[String] = js.native
  
  var gecko: js.UndefOr[String] = js.native
  
  var ie: js.UndefOr[String] = js.native
  
  var maxChrome: js.UndefOr[String] = js.native
  
  var selenium: js.UndefOr[String] = js.native
}
object ConfigFile {
  
  @scala.inline
  def apply(): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit class ConfigFileOps[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: String): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setAppium(value: String): Self = this.set("appium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppium: Self = this.set("appium", js.undefined)
    
    @scala.inline
    def setChrome(value: String): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    
    @scala.inline
    def setGecko(value: String): Self = this.set("gecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGecko: Self = this.set("gecko", js.undefined)
    
    @scala.inline
    def setIe(value: String): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe: Self = this.set("ie", js.undefined)
    
    @scala.inline
    def setMaxChrome(value: String): Self = this.set("maxChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChrome: Self = this.set("maxChrome", js.undefined)
    
    @scala.inline
    def setSelenium(value: String): Self = this.set("selenium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium: Self = this.set("selenium", js.undefined)
  }
}
