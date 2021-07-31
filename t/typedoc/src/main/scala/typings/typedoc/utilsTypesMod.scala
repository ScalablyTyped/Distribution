package typings.typedoc

import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration]): js.Array[TypeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeArgumentsWithDefaults")(typeParams.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeNode]]
  @scala.inline
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration], typeArguments: js.Array[TypeNode]): js.Array[TypeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeArgumentsWithDefaults")(typeParams.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any])).asInstanceOf[js.Array[TypeNode]]
  
  @scala.inline
  def getTypeParametersOfType(`type`: Type): js.Array[TypeParameterDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParametersOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeParameterDeclaration]]
}
