package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.SignatureReflection
import typings.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignature")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[SignatureReflection]
}
