package typings.wdioProtocols.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.WDIOProtocols.Environments, string> */
@js.native
trait RecordEnvironmentsstring extends js.Object {
  
  var UIAutomation: String = js.native
  
  var UiAutomator: String = js.native
  
  var XCUITest: String = js.native
}
object RecordEnvironmentsstring {
  
  @scala.inline
  def apply(UIAutomation: String, UiAutomator: String, XCUITest: String): RecordEnvironmentsstring = {
    val __obj = js.Dynamic.literal(UIAutomation = UIAutomation.asInstanceOf[js.Any], UiAutomator = UiAutomator.asInstanceOf[js.Any], XCUITest = XCUITest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordEnvironmentsstring]
  }
  
  @scala.inline
  implicit class RecordEnvironmentsstringOps[Self <: RecordEnvironmentsstring] (val x: Self) extends AnyVal {
    
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
    def setUIAutomation(value: String): Self = this.set("UIAutomation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiAutomator(value: String): Self = this.set("UiAutomator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCUITest(value: String): Self = this.set("XCUITest", value.asInstanceOf[js.Any])
  }
}
