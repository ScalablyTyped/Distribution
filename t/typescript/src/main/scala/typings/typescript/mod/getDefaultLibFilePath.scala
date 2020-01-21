package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getDefaultLibFilePath")
@js.native
object getDefaultLibFilePath extends js.Object {
  /**
    * Get the path of the default library files (lib.d.ts) as distributed with the typescript
    * node package.
    * The functionality is not supported if the ts module is consumed outside of a node module.
    */
  def apply(options: CompilerOptions): java.lang.String = js.native
}

