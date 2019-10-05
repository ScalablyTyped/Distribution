package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.TypeContainer
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.distLibModelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/type-parameter", JSImport.Namespace)
@js.native
object distLibModelsReflectionsTypeDashParameterMod extends js.Object {
  @js.native
  class TypeParameterReflection protected () extends TypeContainer {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: Reflection) = this()
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
  }
  
}

