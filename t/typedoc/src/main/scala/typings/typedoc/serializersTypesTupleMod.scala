package typings.typedoc

import typings.typedoc.anon.PickNamedTupleMemberTypet
import typings.typedoc.anon.PickTupleTypetype
import typings.typedoc.modelsMod.TupleType
import typings.typedoc.schemaMod.NamedTupleMemberType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import typings.typedoc.typesTupleMod.NamedTupleMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTupleMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", "NamedTupleMemberTypeSerializer")
  @js.native
  class NamedTupleMemberTypeSerializer protected () extends TypeSerializerComponent[NamedTupleMember] {
    def this(owner: Serializer) = this()
    
    def toObject(tuple: NamedTupleMember, obj: PickNamedTupleMemberTypet): NamedTupleMemberType = js.native
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", "TupleTypeSerializer")
  @js.native
  class TupleTypeSerializer protected () extends TypeSerializerComponent[TupleType] {
    def this(owner: Serializer) = this()
    
    def toObject(tuple: TupleType, obj: PickTupleTypetype): typings.typedoc.schemaMod.TupleType = js.native
  }
}
