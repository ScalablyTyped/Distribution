package typings
package typedocLib.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsReadMode extends js.Object

@JSImport("typedoc/dist/lib/utils/options/options", "OptionsReadMode")
@js.native
object OptionsReadMode extends js.Object {
  @js.native
  sealed trait Fetch
    extends typedocLib.distLibUtilsOptionsOptionsMod.OptionsReadMode
  
  @js.native
  sealed trait Prefetch
    extends typedocLib.distLibUtilsOptionsOptionsMod.OptionsReadMode
  
  /* 1 */ val Fetch: Fetch with scala.Double = js.native
  /* 0 */ val Prefetch: Prefetch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibUtilsOptionsOptionsMod.OptionsReadMode with scala.Double] = js.native
}

