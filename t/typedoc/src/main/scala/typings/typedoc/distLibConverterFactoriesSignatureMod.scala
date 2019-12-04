package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typescript.typescriptMod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/signature", JSImport.Namespace)
@js.native
object distLibConverterFactoriesSignatureMod extends js.Object {
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
}

