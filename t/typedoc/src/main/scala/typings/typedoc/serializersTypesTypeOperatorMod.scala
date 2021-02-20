package typings.typedoc

import typings.typedoc.anon.PickTypeOperatorTypetype
import typings.typedoc.modelsMod.TypeOperatorType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTypeOperatorMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/type-operator", "TypeOperatorTypeSerializer")
  @js.native
  class TypeOperatorTypeSerializer protected () extends TypeSerializerComponent[TypeOperatorType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: TypeOperatorType, obj: PickTypeOperatorTypetype): typings.typedoc.schemaMod.TypeOperatorType = js.native
  }
}
