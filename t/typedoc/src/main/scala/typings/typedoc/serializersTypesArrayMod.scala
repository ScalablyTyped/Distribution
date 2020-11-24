package typings.typedoc

import typings.typedoc.anon.PickArrayTypetype
import typings.typedoc.modelsMod.ArrayType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/array", JSImport.Namespace)
@js.native
object serializersTypesArrayMod extends js.Object {
  
  @js.native
  class ArrayTypeSerializer () extends TypeSerializerComponent[ArrayType] {
    
    def toObject(`type`: ArrayType, obj: PickArrayTypetype): typings.typedoc.schemaMod.ArrayType = js.native
  }
}
