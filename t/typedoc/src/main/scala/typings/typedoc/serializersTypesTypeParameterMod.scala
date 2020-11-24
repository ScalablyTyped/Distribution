package typings.typedoc

import typings.typedoc.anon.PickTypeParameterTypetype
import typings.typedoc.modelsMod.TypeParameterType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/type-parameter", JSImport.Namespace)
@js.native
object serializersTypesTypeParameterMod extends js.Object {
  
  @js.native
  class TypeParameterTypeSerializer () extends TypeSerializerComponent[TypeParameterType] {
    
    def toObject(`type`: TypeParameterType, obj: PickTypeParameterTypetype): typings.typedoc.schemaMod.TypeParameterType = js.native
  }
}
