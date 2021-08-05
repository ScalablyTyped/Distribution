package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMethod extends StObject {
  
  var container: String
  
  var name: String
}
object TestMethod {
  
  inline def apply(container: String, name: String): TestMethod = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMethod]
  }
  
  extension [Self <: TestMethod](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
