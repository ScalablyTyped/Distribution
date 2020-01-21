package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.SignatureReflection
import typings.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/signature", JSImport.Namespace)
@js.native
object signatureMod extends js.Object {
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
}

