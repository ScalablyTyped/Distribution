package typings.typedoc

import typings.typedoc.anon.PickUnknownTypetype
import typings.typedoc.modelsMod.UnknownType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesUnknownMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/unknown", "UnknownTypeSerializer")
  @js.native
  class UnknownTypeSerializer protected () extends TypeSerializerComponent[UnknownType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: UnknownType, obj: PickUnknownTypetype): typings.typedoc.schemaMod.UnknownType = js.native
  }
}
