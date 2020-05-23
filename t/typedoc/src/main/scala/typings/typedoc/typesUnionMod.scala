package typings.typedoc

import typings.typedoc.anon.PickUnionTypetype
import typings.typedoc.modelsMod.UnionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/union", JSImport.Namespace)
@js.native
object typesUnionMod extends js.Object {
  @js.native
  class UnionTypeSerializer () extends TypeSerializerComponent[UnionType] {
    def toObject(`type`: UnionType, obj: PickUnionTypetype): typings.typedoc.schemaMod.UnionType = js.native
  }
  
}

