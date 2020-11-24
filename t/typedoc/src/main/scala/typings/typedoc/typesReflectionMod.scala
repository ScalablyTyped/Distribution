package typings.typedoc

import typings.typedoc.anon.PickReflectionTypetype
import typings.typedoc.modelsMod.ReflectionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/reflection", JSImport.Namespace)
@js.native
object typesReflectionMod extends js.Object {
  
  @js.native
  class ReflectionTypeSerializer () extends TypeSerializerComponent[ReflectionType] {
    
    def toObject(reference: ReflectionType, obj: PickReflectionTypetype): typings.typedoc.schemaMod.ReflectionType = js.native
    
    var visited: js.Any = js.native
  }
}
