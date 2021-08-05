package typings.wdioProtocols

import typings.wdioProtocols.WDIOProtocols.CommandEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint> */
  trait RecordCommandMethodComman extends StObject {
    
    var DELETE: CommandEndpoint
    
    var GET: CommandEndpoint
    
    var POST: CommandEndpoint
  }
  object RecordCommandMethodComman {
    
    inline def apply(DELETE: CommandEndpoint, GET: CommandEndpoint, POST: CommandEndpoint): RecordCommandMethodComman = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCommandMethodComman]
    }
    
    extension [Self <: RecordCommandMethodComman](x: Self) {
      
      inline def setDELETE(value: CommandEndpoint): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: CommandEndpoint): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: CommandEndpoint): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.Environments, string> */
  trait RecordEnvironmentsstring extends StObject {
    
    var UIAutomation: String
    
    var UiAutomator: String
    
    var XCUITest: String
  }
  object RecordEnvironmentsstring {
    
    inline def apply(UIAutomation: String, UiAutomator: String, XCUITest: String): RecordEnvironmentsstring = {
      val __obj = js.Dynamic.literal(UIAutomation = UIAutomation.asInstanceOf[js.Any], UiAutomator = UiAutomator.asInstanceOf[js.Any], XCUITest = XCUITest.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEnvironmentsstring]
    }
    
    extension [Self <: RecordEnvironmentsstring](x: Self) {
      
      inline def setUIAutomation(value: String): Self = StObject.set(x, "UIAutomation", value.asInstanceOf[js.Any])
      
      inline def setUiAutomator(value: String): Self = StObject.set(x, "UiAutomator", value.asInstanceOf[js.Any])
      
      inline def setXCUITest(value: String): Self = StObject.set(x, "XCUITest", value.asInstanceOf[js.Any])
    }
  }
}
