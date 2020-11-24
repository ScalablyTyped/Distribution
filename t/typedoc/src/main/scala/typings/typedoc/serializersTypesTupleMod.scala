package typings.typedoc

import typings.typedoc.anon.PickNamedTupleMemberTypet
import typings.typedoc.anon.PickTupleTypetype
import typings.typedoc.modelsMod.TupleType
import typings.typedoc.schemaMod.NamedTupleMemberType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.typesTupleMod.NamedTupleMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", JSImport.Namespace)
@js.native
object serializersTypesTupleMod extends js.Object {
  
  @js.native
  class NamedTupleMemberTypeSerializer () extends TypeSerializerComponent[NamedTupleMember] {
    
    def toObject(tuple: NamedTupleMember, obj: PickNamedTupleMemberTypet): NamedTupleMemberType = js.native
  }
  
  @js.native
  class TupleTypeSerializer () extends TypeSerializerComponent[TupleType] {
    
    def toObject(tuple: TupleType, obj: PickTupleTypetype): typings.typedoc.schemaMod.TupleType = js.native
  }
}
