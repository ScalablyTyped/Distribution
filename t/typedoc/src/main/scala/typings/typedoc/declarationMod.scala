package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.DeclarationReflection
import typings.typescript.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeclaration")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DeclarationReflection]]
  inline def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeclaration")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DeclarationReflection]]
}
