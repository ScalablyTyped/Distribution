package typings.typedoc

import typings.std.Partial
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationComponentsMod {
  
  @JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
  @js.native
  abstract class ReflectionSerializerComponent[T /* <: Reflection */] protected () extends SerializerComponent[T] {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
  @js.native
  abstract class SerializerComponent[T] protected () extends StObject {
    def this(owner: Serializer) = this()
    
    var owner: Serializer = js.native
    
    def priority: Double = js.native
    
    def serializeGroup(instance: js.Any): Boolean = js.native
    
    def supports(item: js.Any): Boolean = js.native
    
    def toObject(item: T): Partial[ModelToObject[T]] = js.native
    def toObject(item: T, obj: js.Object): Partial[ModelToObject[T]] = js.native
  }
  /* static members */
  object SerializerComponent {
    
    @JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/components", "TypeSerializerComponent")
  @js.native
  abstract class TypeSerializerComponent[T /* <: Type */] protected () extends SerializerComponent[T] {
    def this(owner: Serializer) = this()
  }
}
