package typings.typedoc

import typings.typedoc.anon.PickStringLiteralTypetype
import typings.typedoc.modelsMod.StringLiteralType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesStringLiteralMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/string-literal", "StringLiteralTypeSerializer")
  @js.native
  class StringLiteralTypeSerializer protected () extends TypeSerializerComponent[StringLiteralType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: StringLiteralType, obj: PickStringLiteralTypetype): typings.typedoc.schemaMod.StringLiteralType = js.native
  }
}
