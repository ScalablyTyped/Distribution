package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typescript.typescriptMod.Declaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/declaration", JSImport.Namespace)
@js.native
object distLibConverterFactoriesDeclarationMod extends js.Object {
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
}

