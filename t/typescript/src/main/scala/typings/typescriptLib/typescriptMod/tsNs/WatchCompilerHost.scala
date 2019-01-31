package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchCompilerHost[T /* <: BuilderProgram */]
  extends ProgramHost[T]
     with WatchHost {
  /** If provided, callback to invoke after every new program creation */
  var afterProgramCreate: js.UndefOr[js.Function1[/* program */ T, scala.Unit]] = js.native
}

