package typings.typedoc

import typings.typedoc.anon.Application
import typings.typedoc.anon.Options
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/decorator", JSImport.Namespace)
@js.native
object sourcesDecoratorMod extends js.Object {
  def Option(option: DeclarationOption): js.Function2[/* target */ Application | Options, /* key */ String | Double | js.Symbol, Unit] = js.native
  def addDecoratedOptions(options: typings.typedoc.optionsMod.Options): Unit = js.native
}

