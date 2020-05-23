package typings.typedoc

import typings.typedoc.anon.TypePickInferredTypetype
import typings.typedoc.modelsMod.InferredType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/inferred", JSImport.Namespace)
@js.native
object serializersTypesInferredMod extends js.Object {
  @js.native
  class InferredTypeSerializer () extends TypeSerializerComponent[InferredType] {
    def toObject(inferred: InferredType, obj: TypePickInferredTypetype): typings.typedoc.schemaMod.InferredType = js.native
  }
  
}

