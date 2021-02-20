package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.DeclarationReflection
import typings.typescript.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/declaration", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  @JSImport("typedoc/dist/lib/converter/factories/declaration", "createDeclaration")
  @js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
}
