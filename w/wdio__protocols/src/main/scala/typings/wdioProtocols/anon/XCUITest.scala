package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCUITest extends StObject {
  
  var XCUITest: String
}
object XCUITest {
  
  inline def apply(XCUITest: String): XCUITest = {
    val __obj = js.Dynamic.literal(XCUITest = XCUITest.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCUITest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCUITest] (val x: Self) extends AnyVal {
    
    inline def setXCUITest(value: String): Self = StObject.set(x, "XCUITest", value.asInstanceOf[js.Any])
  }
}
