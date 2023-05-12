package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosXCUITest extends StObject {
  
  var ios: XCUITest
}
object IosXCUITest {
  
  inline def apply(ios: XCUITest): IosXCUITest = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosXCUITest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosXCUITest] (val x: Self) extends AnyVal {
    
    inline def setIos(value: XCUITest): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
