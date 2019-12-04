package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsReflectionsMod.ParameterReflection
import typings.typescript.typescriptMod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/parameter", JSImport.Namespace)
@js.native
object distLibConverterFactoriesParameterMod extends js.Object {
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
}

