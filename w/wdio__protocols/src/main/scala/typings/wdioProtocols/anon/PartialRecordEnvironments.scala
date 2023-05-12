package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@wdio/protocols.@wdio/protocols/build/types.Environments, string>> */
trait PartialRecordEnvironments extends StObject {
  
  var UIAutomation: js.UndefOr[String] = js.undefined
  
  var UiAutomator: js.UndefOr[String] = js.undefined
  
  var XCUITest: js.UndefOr[String] = js.undefined
}
object PartialRecordEnvironments {
  
  inline def apply(): PartialRecordEnvironments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordEnvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordEnvironments] (val x: Self) extends AnyVal {
    
    inline def setUIAutomation(value: String): Self = StObject.set(x, "UIAutomation", value.asInstanceOf[js.Any])
    
    inline def setUIAutomationUndefined: Self = StObject.set(x, "UIAutomation", js.undefined)
    
    inline def setUiAutomator(value: String): Self = StObject.set(x, "UiAutomator", value.asInstanceOf[js.Any])
    
    inline def setUiAutomatorUndefined: Self = StObject.set(x, "UiAutomator", js.undefined)
    
    inline def setXCUITest(value: String): Self = StObject.set(x, "XCUITest", value.asInstanceOf[js.Any])
    
    inline def setXCUITestUndefined: Self = StObject.set(x, "XCUITest", js.undefined)
  }
}
