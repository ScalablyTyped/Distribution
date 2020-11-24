package typings.typedoc

import typings.std.Partial
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.serializerMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/components", JSImport.Namespace)
@js.native
object serializationComponentsMod extends js.Object {
  
  @js.native
  abstract class ReflectionSerializerComponent[T /* <: Reflection */] () extends SerializerComponent[T]
  
  @js.native
  abstract class SerializerComponent[T] protected () extends js.Object {
    def this(owner: Serializer) = this()
    
    var owner: Serializer = js.native
    
    def priority: Double = js.native
    
    def serializeGroup(instance: js.Any): Boolean = js.native
    
    def supports(item: js.Any): Boolean = js.native
    
    def toObject(item: T): Partial[ModelToObject[T]] = js.native
    def toObject(item: T, obj: js.Object): Partial[ModelToObject[T]] = js.native
  }
  /* static members */
  @js.native
  object SerializerComponent extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  abstract class TypeSerializerComponent[T /* <: Type */] () extends SerializerComponent[T]
}
