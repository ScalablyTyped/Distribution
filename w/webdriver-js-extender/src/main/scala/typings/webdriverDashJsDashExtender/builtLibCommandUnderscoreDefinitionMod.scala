package typings.webdriverDashJsDashExtender

import typings.webdriverDashJsDashExtender.builtLibExtenderMod.Extender
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.DELETE
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.GET
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.POST
import typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender/built/lib/command_definition", JSImport.Namespace)
@js.native
object builtLibCommandUnderscoreDefinitionMod extends js.Object {
  @js.native
  class CommandDefinition[T] protected () extends js.Object {
    def this(name: String, params: js.Array[String], method: DELETE, path: String) = this()
    def this(name: String, params: js.Array[String], method: GET, path: String) = this()
    def this(name: String, params: js.Array[String], method: POST, path: String) = this()
    def this(name: String, params: js.Array[String], method: PUT, path: String) = this()
    def this(
      name: String,
      params: js.Array[String],
      method: DELETE,
      path: String,
      preprocessParams: js.Function1[/* repeated */ js.Any, js.Array[_]]
    ) = this()
    def this(
      name: String,
      params: js.Array[String],
      method: GET,
      path: String,
      preprocessParams: js.Function1[/* repeated */ js.Any, js.Array[_]]
    ) = this()
    def this(
      name: String,
      params: js.Array[String],
      method: POST,
      path: String,
      preprocessParams: js.Function1[/* repeated */ js.Any, js.Array[_]]
    ) = this()
    def this(
      name: String,
      params: js.Array[String],
      method: PUT,
      path: String,
      preprocessParams: js.Function1[/* repeated */ js.Any, js.Array[_]]
    ) = this()
    var method: GET | POST | DELETE | PUT = js.native
    var name: String = js.native
    var params: js.Array[String] = js.native
    var path: String = js.native
    var preprocessParams: js.Any = js.native
    def compile[T](extender: Extender, silentFailure: Boolean): js.Function1[/* repeated */ js.Any, js.Promise[T]] = js.native
  }
  
}

