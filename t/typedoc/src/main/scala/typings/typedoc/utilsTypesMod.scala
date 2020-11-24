package typings.typedoc

import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/utils/types", JSImport.Namespace)
@js.native
object utilsTypesMod extends js.Object {
  
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration]): js.Array[TypeNode] = js.native
  def getTypeArgumentsWithDefaults(typeParams: js.Array[TypeParameterDeclaration], typeArguments: js.Array[TypeNode]): js.Array[TypeNode] = js.native
  
  def getTypeParametersOfType(`type`: Type): js.Array[TypeParameterDeclaration] = js.native
}
