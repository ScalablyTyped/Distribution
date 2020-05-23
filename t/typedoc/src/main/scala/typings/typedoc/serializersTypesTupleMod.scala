package typings.typedoc

import typings.typedoc.anon.PickTupleTypetype
import typings.typedoc.modelsMod.TupleType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", JSImport.Namespace)
@js.native
object serializersTypesTupleMod extends js.Object {
  @js.native
  class TupleTypeSerializer () extends TypeSerializerComponent[TupleType] {
    def toObject(tuple: TupleType, obj: PickTupleTypetype): typings.typedoc.schemaMod.TupleType = js.native
  }
  
}

