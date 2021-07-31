package typings.typedoc

import typings.typedoc.anon.PickIntersectionTypetype
import typings.typedoc.modelsMod.IntersectionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntersectionMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/intersection", "IntersectionTypeSerializer")
  @js.native
  class IntersectionTypeSerializer protected () extends TypeSerializerComponent[IntersectionType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IntersectionType, obj: PickIntersectionTypetype): typings.typedoc.schemaMod.IntersectionType = js.native
  }
}
