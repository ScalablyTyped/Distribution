package typings.typedoc.optionsOptionsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OptionsReadMode with Double] = js.native
  /* 1 */ @js.native
  object Fetch extends TopLevel[Fetch with Double]
  
  /* 0 */ @js.native
  object Prefetch extends TopLevel[Prefetch with Double]
  
}

