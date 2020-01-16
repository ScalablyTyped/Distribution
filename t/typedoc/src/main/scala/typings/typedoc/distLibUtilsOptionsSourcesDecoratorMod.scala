package typings.typedoc

import typings.typedoc.distLibUtilsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/decorator", JSImport.Namespace)
@js.native
object distLibUtilsOptionsSourcesDecoratorMod extends js.Object {
  def Option[K /* <: String */](
    option: Anon_Name[K] with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyToDeclaration<K> */ js.Any)
  ): js.Function2[
    /* target */ Anon_Application | Anon_Options, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
  def addDecoratedOptions(options: Options): Unit = js.native
}

