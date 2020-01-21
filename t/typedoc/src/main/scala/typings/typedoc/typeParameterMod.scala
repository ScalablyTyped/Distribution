package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.TypeParameterType
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/type-parameter", JSImport.Namespace)
@js.native
object typeParameterMod extends js.Object {
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}

