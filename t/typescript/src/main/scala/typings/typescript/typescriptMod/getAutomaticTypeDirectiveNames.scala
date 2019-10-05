package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getAutomaticTypeDirectiveNames")
@js.native
object getAutomaticTypeDirectiveNames extends js.Object {
  /**
    * Given a set of options, returns the set of type directive names
    *   that should be included for this program automatically.
    * This list could either come from the config file,
    *   or from enumerating the types root + initial secondary types lookup location.
    * More type directives might appear in the program later as a result of loading actual source files;
    *   this list is only the set of defaults that are implicitly included.
    */
  def apply(options: CompilerOptions, host: ModuleResolutionHost): js.Array[String] = js.native
}

