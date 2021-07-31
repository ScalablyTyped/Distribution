package typings.typedoc

import typings.typedoc.anon.PickReferenceTypetypePart
import typings.typedoc.modelsMod.ReferenceType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesReferenceMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/reference", "ReferenceTypeSerializer")
  @js.native
  class ReferenceTypeSerializer protected () extends TypeSerializerComponent[ReferenceType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: ReferenceType, obj: PickReferenceTypetypePart): typings.typedoc.schemaMod.ReferenceType = js.native
  }
}
