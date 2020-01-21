package typings.typedoc

import typings.typedoc.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/decorator", JSImport.Namespace)
@js.native
object sourcesDecoratorMod extends js.Object {
  def Option[K /* <: String */](
    option: AnonName[K] with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyToDeclaration<K> */ js.Any)
  ): js.Function2[
    /* target */ AnonApplication | AnonOptions, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
  def addDecoratedOptions(options: Options): Unit = js.native
}

