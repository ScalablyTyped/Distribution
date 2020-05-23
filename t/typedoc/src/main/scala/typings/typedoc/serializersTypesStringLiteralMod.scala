package typings.typedoc

import typings.typedoc.anon.PickStringLiteralTypetype
import typings.typedoc.modelsMod.StringLiteralType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/string-literal", JSImport.Namespace)
@js.native
object serializersTypesStringLiteralMod extends js.Object {
  @js.native
  class StringLiteralTypeSerializer () extends TypeSerializerComponent[StringLiteralType] {
    def toObject(`type`: StringLiteralType, obj: PickStringLiteralTypetype): typings.typedoc.schemaMod.StringLiteralType = js.native
  }
  
}

