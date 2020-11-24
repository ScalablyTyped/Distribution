package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.TypeContainer
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.modelsTypesMod.TypeParameterType
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/reflections/type-parameter", JSImport.Namespace)
@js.native
object reflectionsTypeParameterMod extends js.Object {
  
  @js.native
  class TypeParameterReflection protected () extends TypeContainer {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: Reflection) = this()
    
    var default: js.UndefOr[Type] = js.native
    
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
  }
}
