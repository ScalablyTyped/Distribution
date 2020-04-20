package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Module")
@js.native
class Module protected () extends js.Object {
  def this(id: String, parent: Null, content: js.Object) = this()
  def this(id: String, parent: Null, content: ModuleLoader) = this()
  def this(id: String, parent: Module, content: js.Object) = this()
  def this(id: String, parent: Module, content: ModuleLoader) = this()
  /**
    * @constant
    */
  val exports: js.Object = js.native
  /**
    * Full id (path) of the module
    * @constant
    */
  val id: String = js.native
  /**
    * The module that first required this module
    * @constant
    */
  val parent: Module = js.native
  /**
    * Finds a module relative to the id of this module and returns the exports object of that module.
    * Throws if no matching module can be found.
    * @param request
    */
  def require(request: String): js.Object = js.native
}

/* static members */
@JSImport("tabris", "Module")
@js.native
object Module extends js.Object {
  /**
    * Loads the given JavaScript file from the given (local or http) url and wraps it as a module loader
    * function.
    * @param url
    */
  def createLoader(url: String): ModuleLoader = js.native
  /**
    * Evaluates the given JavaScript code and returns the result of the last expression. The url is used to
    * identify the source in stack traces.
    * @param code
    * @param url
    */
  def execute(code: String, url: String): js.Any = js.native
  /**
    * Returns the source map object (decoded from base64 and parsed from JSON) for the JavaScript file of
    * the given url. Returns `null` if no source map can be found. This method only works with code
    * side-loaded via the tabris CLI `serve` command.
    * @param url
    */
  def getSourceMap(url: String): js.Any = js.native
  /**
    * Loads a text from the given (local or http) url and returns its content. File is expected to be utf-8
    * encoded. This is a blocking operation, in almost all cases it is preferable to use `fetch()` or the
    * file system API to read a text file.
    * @param url
    */
  def load(url: String): String = js.native
  /**
    * Loads the JSON file from the given (local or http) url, parses it and returns the result. This is a
    * blocking operation, in almost all cases it is preferable to use `fetch()` or the file system API to
    * obtain and parse a JSON file.
    * @param url
    */
  def readJSON(url: String): js.Any = js.native
}

