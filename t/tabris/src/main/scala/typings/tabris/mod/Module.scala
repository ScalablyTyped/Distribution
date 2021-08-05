package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Module")
@js.native
class Module protected () extends StObject {
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
object Module {
  
  @JSImport("tabris", "Module")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads the given JavaScript file from the given (local or http) url and wraps it as a module loader
    * function.
    * @param url
    */
  inline def createLoader(url: String): ModuleLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoader")(url.asInstanceOf[js.Any]).asInstanceOf[ModuleLoader]
  
  /**
    * Creates a "require" function that finds a module relative to the given path. If found the exports are
    * returned. Throws if no matching module can be found.
    * @param path An absolute path, beginning with "/". The path does not have to point to an existing file.
    */
  inline def createRequire(path: String): js.Function1[/* request */ String, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ String, js.Object]]
  
  /**
    * Evaluates the given JavaScript code and returns the result of the last expression. The url is used to
    * identify the source in stack traces.
    * @param code
    * @param url
    */
  inline def execute(code: String, url: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Returns the source map object (decoded from base64 and parsed from JSON) for the JavaScript file of
    * the given url. Returns `null` if no source map can be found. This method only works with code
    * side-loaded via the tabris CLI `serve` command.
    * @param url
    */
  inline def getSourceMap(url: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceMap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Loads a text from the given (local or http) url and returns its content. File is expected to be utf-8
    * encoded. This is a blocking operation, in almost all cases it is preferable to use `fetch()` or the
    * file system API to read a text file.
    * @param url
    */
  inline def load(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Loads the JSON file from the given (local or http) url, parses it and returns the result. This is a
    * blocking operation, in almost all cases it is preferable to use `fetch()` or the file system API to
    * obtain and parse a JSON file.
    * @param url
    */
  inline def readJSON(url: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
