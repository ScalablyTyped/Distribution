package typings.typedoc

import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources", JSImport.Namespace)
@js.native
object optionsSourcesMod extends js.Object {
  def Option(option: DeclarationOption): js.Function2[
    /* target */ AnonApplication | AnonOptions, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
  def addDecoratedOptions(options: Options): Unit = js.native
  def addTSOptions(container: typings.typedoc.optionsOptionsMod.Options): Unit = js.native
  def addTypeDocOptions(options: Options): Unit = js.native
}

