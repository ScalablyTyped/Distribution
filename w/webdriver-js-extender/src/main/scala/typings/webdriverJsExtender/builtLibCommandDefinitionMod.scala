package typings.webdriverJsExtender

import typings.webdriverJsExtender.builtLibExtenderMod.Extender
import typings.webdriverJsExtender.webdriverJsExtenderStrings.DELETE
import typings.webdriverJsExtender.webdriverJsExtenderStrings.GET
import typings.webdriverJsExtender.webdriverJsExtenderStrings.POST
import typings.webdriverJsExtender.webdriverJsExtenderStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibCommandDefinitionMod {
  
  @JSImport("webdriver-js-extender/built/lib/command_definition", "CommandDefinition")
  @js.native
  open class CommandDefinition[T] protected () extends StObject {
    def this(name: String, params: js.Array[String], method: GET | POST | DELETE | PUT, path: String) = this()
    def this(
      name: String,
      params: js.Array[String],
      method: GET | POST | DELETE | PUT,
      path: String,
      preprocessParams: js.Function1[/* repeated */ Any, js.Array[Any]]
    ) = this()
    
    def compile[T](extender: Extender, silentFailure: Boolean): js.Function1[/* repeated */ Any, js.Promise[T]] = js.native
    
    var method: GET | POST | DELETE | PUT = js.native
    
    var name: String = js.native
    
    var params: js.Array[String] = js.native
    
    var path: String = js.native
    
    /* private */ var preprocessParams: Any = js.native
  }
}
