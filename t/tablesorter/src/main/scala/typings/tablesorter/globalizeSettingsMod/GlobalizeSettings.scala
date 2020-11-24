package typings.tablesorter.globalizeSettingsMod

import typings.globalize.globalizeMod.DateFormatterOptions
import typings.globalize.globalizeMod.Globalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalizeSettings extends DateFormatterOptions {
  
  /**
    * The `Globalize`-object to use for localization.
    */
  var Globalize: typings.globalize.globalizeMod.Globalize = js.native
  
  /**
    * The language to localize the dates to.
    */
  var lang: String = js.native
}
object GlobalizeSettings {
  
  @scala.inline
  def apply(Globalize: Globalize, lang: String): GlobalizeSettings = {
    val __obj = js.Dynamic.literal(Globalize = Globalize.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizeSettings]
  }
  
  @scala.inline
  implicit class GlobalizeSettingsOps[Self <: GlobalizeSettings] (val x: Self) extends AnyVal {
    
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
    def setGlobalize(value: Globalize): Self = this.set("Globalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
  }
}
