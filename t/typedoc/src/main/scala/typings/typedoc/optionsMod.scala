package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options", JSImport.Namespace)
@js.native
object optionsMod extends js.Object {
  @js.native
  class Options ()
    extends typings.typedoc.optionsOptionsMod.Options
  
  @js.native
  object OptionsReadMode extends js.Object {
    /* 1 */ val Fetch: typings.typedoc.optionsOptionsMod.OptionsReadMode.Fetch with Double = js.native
    /* 0 */ val Prefetch: typings.typedoc.optionsOptionsMod.OptionsReadMode.Prefetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsOptionsMod.OptionsReadMode with Double] = js.native
  }
  
}

