package typings.webdriverJsExtender

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumWebdriver.mod.WebDriver
import typings.webdriverJsExtender.anon.DefineCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-js-extender/built/lib/extender", JSImport.Namespace)
@js.native
object extenderMod extends js.Object {
  
  @js.native
  class Extender protected () extends js.Object {
    def this(driver: WebDriver) = this()
    
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
    
    var driver_ : WebDriver = js.native
    
    /**
      * Executes a command which was defined by defineCommand()
      *
      * @param {string} name The command name.
      * @param {*[]} params The parameters to the command
      * @return {webdriver.promise.Promise<*>} A promise that will be resolved with
      *     the command result
      */
    def execCommand[T](name: String, method: String, params: js.Array[_]): js.Promise[T] = js.native
    
    var executor_ : DefineCommand = js.native
    
    var params_ : StringDictionary[js.Array[String]] = js.native
  }
}
