package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.reflectionsMod.ParameterReflection
import typings.typescript.mod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/parameter", JSImport.Namespace)
@js.native
object parameterMod extends js.Object {
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
}

