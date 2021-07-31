package typings.typedoc

import typings.typedoc.anon.TypePickInferredTypetype
import typings.typedoc.modelsMod.InferredType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesInferredMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/inferred", "InferredTypeSerializer")
  @js.native
  class InferredTypeSerializer protected () extends TypeSerializerComponent[InferredType] {
    def this(owner: Serializer) = this()
    
    def toObject(inferred: InferredType, obj: TypePickInferredTypetype): typings.typedoc.schemaMod.InferredType = js.native
  }
}
