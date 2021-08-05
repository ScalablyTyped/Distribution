package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.reflectionsMod.ParameterReflection
import typings.typescript.mod.ParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/parameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createParameter")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParameterReflection]]
}
