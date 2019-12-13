package typings.xstate

import typings.xstate.libTypesMod.ActivityMap
import typings.xstate.libTypesMod.DefaultGuardType
import typings.xstate.xstateStrings.DOT
import typings.xstate.xstateStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/constants", JSImport.Namespace)
@js.native
object libConstantsMod extends js.Object {
  val DEFAULT_GUARD_TYPE: DefaultGuardType = js.native
  val EMPTY_ACTIVITY_MAP: ActivityMap = js.native
  val STATE_DELIMITER: DOT = js.native
  val TARGETLESS_KEY: Empty = js.native
}

