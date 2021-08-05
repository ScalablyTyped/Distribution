package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.TypeParameterType
import typings.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeParameterMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/type-parameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParameter")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TypeParameterType]]
}
