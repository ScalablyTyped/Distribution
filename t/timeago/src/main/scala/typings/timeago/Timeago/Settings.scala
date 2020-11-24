package typings.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var allowFuture: Boolean = js.native
  
  var allowPast: Boolean = js.native
  
  var autoDispose: Boolean = js.native
  
  var cutoff: Double = js.native
  
  var localeTitle: Boolean = js.native
  
  var refreshMillis: Double = js.native
  
  var strings: LocalizedStrings = js.native
}
object Settings {
  
  @scala.inline
  def apply(
    allowFuture: Boolean,
    allowPast: Boolean,
    autoDispose: Boolean,
    cutoff: Double,
    localeTitle: Boolean,
    refreshMillis: Double,
    strings: LocalizedStrings
  ): Settings = {
    val __obj = js.Dynamic.literal(allowFuture = allowFuture.asInstanceOf[js.Any], allowPast = allowPast.asInstanceOf[js.Any], autoDispose = autoDispose.asInstanceOf[js.Any], cutoff = cutoff.asInstanceOf[js.Any], localeTitle = localeTitle.asInstanceOf[js.Any], refreshMillis = refreshMillis.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setAllowFuture(value: Boolean): Self = this.set("allowFuture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPast(value: Boolean): Self = this.set("allowPast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDispose(value: Boolean): Self = this.set("autoDispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoff(value: Double): Self = this.set("cutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleTitle(value: Boolean): Self = this.set("localeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshMillis(value: Double): Self = this.set("refreshMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrings(value: LocalizedStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
  }
}
