package typings.yeomanEnvironment.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yeoman-environment/lib/util/log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a new `Logger` instance with the specified `options`.
    *
    * @param options
    * The options for creating the new logger.
    */
  def apply[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = js.native
}
