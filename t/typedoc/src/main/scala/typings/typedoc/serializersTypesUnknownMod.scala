package typings.typedoc

import typings.typedoc.anon.PickUnknownTypetype
import typings.typedoc.modelsMod.UnknownType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/unknown", JSImport.Namespace)
@js.native
object serializersTypesUnknownMod extends js.Object {
  
  @js.native
  class UnknownTypeSerializer () extends TypeSerializerComponent[UnknownType] {
    
    def toObject(`type`: UnknownType, obj: PickUnknownTypetype): typings.typedoc.schemaMod.UnknownType = js.native
  }
}
