package typings.wdioProtocols

import typings.wdioProtocols.WDIOProtocols.CommandEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint> */
  @js.native
  trait RecordCommandMethodComman extends StObject {
    
    var DELETE: CommandEndpoint = js.native
    
    var GET: CommandEndpoint = js.native
    
    var POST: CommandEndpoint = js.native
  }
  object RecordCommandMethodComman {
    
    @scala.inline
    def apply(DELETE: CommandEndpoint, GET: CommandEndpoint, POST: CommandEndpoint): RecordCommandMethodComman = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCommandMethodComman]
    }
    
    @scala.inline
    implicit class RecordCommandMethodCommanMutableBuilder[Self <: RecordCommandMethodComman] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: CommandEndpoint): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: CommandEndpoint): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: CommandEndpoint): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.Environments, string> */
  @js.native
  trait RecordEnvironmentsstring extends StObject {
    
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
    implicit class RecordEnvironmentsstringMutableBuilder[Self <: RecordEnvironmentsstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUIAutomation(value: String): Self = StObject.set(x, "UIAutomation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiAutomator(value: String): Self = StObject.set(x, "UiAutomator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXCUITest(value: String): Self = StObject.set(x, "XCUITest", value.asInstanceOf[js.Any])
    }
  }
}
