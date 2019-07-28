package typings.typedoc.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsReadMode extends js.Object

@JSImport("typedoc/dist/lib/utils/options/options", "OptionsReadMode")
@js.native
object OptionsReadMode extends js.Object {
  @js.native
  sealed trait Fetch extends OptionsReadMode
  
  @js.native
  sealed trait Prefetch extends OptionsReadMode
  
  /* 1 */ val Fetch: typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsReadMode.Fetch with Double = js.native
  /* 0 */ val Prefetch: typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsReadMode.Prefetch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OptionsReadMode with Double] = js.native
}

