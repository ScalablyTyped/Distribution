package typings.wdioProtocols.WDIOProtocols

import typings.wdioProtocols.anon.RecordEnvironmentsstring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supported mobile environments, e.g.
  * ```
  * "ios": {
  *   "UIAutomation": "8.0 to 9.3"
  * }
  * ```
  */
/* Inlined std.Record<@wdio/protocols.WDIOProtocols.Platform, std.Record<@wdio/protocols.WDIOProtocols.Environments, string>> */
@js.native
trait SupportedEnvironments extends js.Object {
  
  var android: RecordEnvironmentsstring = js.native
  
  var ios: RecordEnvironmentsstring = js.native
}
object SupportedEnvironments {
  
  @scala.inline
  def apply(android: RecordEnvironmentsstring, ios: RecordEnvironmentsstring): SupportedEnvironments = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedEnvironments]
  }
  
  @scala.inline
  implicit class SupportedEnvironmentsOps[Self <: SupportedEnvironments] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: RecordEnvironmentsstring): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: RecordEnvironmentsstring): Self = this.set("ios", value.asInstanceOf[js.Any])
  }
}
