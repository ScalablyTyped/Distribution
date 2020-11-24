package typings.typedoc

import typings.typedoc.modelsMod.Type
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/abstract", JSImport.Namespace)
@js.native
object serializersTypesAbstractMod extends js.Object {
  
  @js.native
  class TypeSerializer () extends TypeSerializerComponent[Type]
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
