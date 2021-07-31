package typings.typedoc

import typings.typedoc.anon.PickIntrinsicTypetype
import typings.typedoc.modelsMod.IntrinsicType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesIntrinsicMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/intrinsic", "IntrinsicTypeSerializer")
  @js.native
  class IntrinsicTypeSerializer protected () extends TypeSerializerComponent[IntrinsicType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IntrinsicType, obj: PickIntrinsicTypetype): typings.typedoc.schemaMod.IntrinsicType = js.native
  }
}
