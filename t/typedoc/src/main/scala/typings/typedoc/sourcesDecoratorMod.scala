package typings.typedoc

import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/decorator", JSImport.Namespace)
@js.native
object sourcesDecoratorMod extends js.Object {
  def Option(option: DeclarationOption): js.Function2[
    /* target */ AnonApplication | AnonOptions, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
  def addDecoratedOptions(options: Options): Unit = js.native
}

