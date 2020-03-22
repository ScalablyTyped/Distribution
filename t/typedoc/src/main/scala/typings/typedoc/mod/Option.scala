package typings.typedoc.mod

import typings.typedoc.AnonApplication
import typings.typedoc.AnonOptions
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "Option")
@js.native
object Option extends js.Object {
  def apply(option: DeclarationOption): js.Function2[
    /* target */ AnonApplication | AnonOptions, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
}

