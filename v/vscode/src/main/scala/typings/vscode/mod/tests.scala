package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tests {
  
  @JSImport("vscode", "tests")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestController(id: String, label: String): TestController = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestController")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[TestController]
}
