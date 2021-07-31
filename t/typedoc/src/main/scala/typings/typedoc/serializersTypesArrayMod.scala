package typings.typedoc

import typings.typedoc.anon.PickArrayTypetype
import typings.typedoc.modelsMod.ArrayType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesArrayMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/array", "ArrayTypeSerializer")
  @js.native
  class ArrayTypeSerializer protected () extends TypeSerializerComponent[ArrayType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: ArrayType, obj: PickArrayTypetype): typings.typedoc.schemaMod.ArrayType = js.native
  }
}
