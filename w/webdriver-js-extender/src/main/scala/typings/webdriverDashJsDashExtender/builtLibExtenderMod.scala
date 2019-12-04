package typings.webdriverDashJsDashExtender

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender/built/lib/extender", JSImport.Namespace)
@js.native
object builtLibExtenderMod extends js.Object {
  @js.native
  class Extender protected () extends js.Object {
    def this(driver: WebDriver) = this()
    var driver_ : WebDriver = js.native
    var executor_ : Anon_DefineCommand = js.native
    var params_ : StringDictionary[js.Array[String]] = js.native
    /**
      * Defines a new command. When a command is sent, the {@code path} will be
      * preprocessed using the command's parameters; any path segments prefixed
      * with ":" will be replaced by the parameter of the same name. For example,
      * given "/person/:name" and the parameters "{name: 'Bob'}", the final command
      * path will be "/person/Bob".
      *
      * @param {string} name The command name.
      * @param {string} params The names of the parameters to the command
      * @param {string} method The HTTP method to use when sending this command.
      * @param {string} path The path to send the command to, relative to
      *     the WebDriver server's command root and of the form
      *     "/path/:variable/segment".
      */
    def defineCommand(name: String, params: js.Array[String], method: String, path: String): Unit = js.native
    /**
      * Executes a command which was defined by defineCommand()
      *
      * @param {string} name The command name.
      * @param {*[]} params The parameters to the command
      * @return {webdriver.promise.Promise<*>} A promise that will be resolved with
      *     the command result
      */
    def execCommand[T](name: String, method: String, params: js.Array[_]): js.Promise[T] = js.native
  }
  
}

