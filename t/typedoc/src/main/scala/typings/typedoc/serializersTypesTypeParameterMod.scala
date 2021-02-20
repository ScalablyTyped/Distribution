package typings.typedoc

import typings.typedoc.anon.PickTypeParameterTypetype
import typings.typedoc.modelsMod.TypeParameterType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/type-parameter", "TypeParameterTypeSerializer")
  @js.native
  class TypeParameterTypeSerializer protected () extends TypeSerializerComponent[TypeParameterType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: TypeParameterType, obj: PickTypeParameterTypetype): typings.typedoc.schemaMod.TypeParameterType = js.native
  }
}
