package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typescript.mod.Type
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/type-parameter", JSImport.Namespace)
@js.native
object typesTypeParameterMod extends js.Object {
  
  @js.native
  class TypeParameterConverter () extends TypeNodeConverter[Type, TypeReferenceNode]
}
