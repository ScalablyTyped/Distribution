package typings.typedoc

import typings.typedoc.anon.PickReflectionTypetype
import typings.typedoc.modelsMod.ReflectionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/reflection", JSImport.Namespace)
@js.native
object typesReflectionMod extends js.Object {
  @js.native
  class ReflectionTypeSerializer () extends TypeSerializerComponent[ReflectionType] {
    var visited: js.Any = js.native
    def toObject(reference: ReflectionType, obj: PickReflectionTypetype): typings.typedoc.schemaMod.ReflectionType = js.native
  }
  
}

