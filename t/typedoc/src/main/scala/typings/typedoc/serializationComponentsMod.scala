package typings.typedoc

import org.scalablytyped.runtime.Instantiable3
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.libUtilsMod.AbstractComponent
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typedoc.serializerMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", JSImport.Namespace)
@js.native
object serializationComponentsMod extends js.Object {
  @js.native
  abstract class ReflectionSerializerComponent[T /* <: Reflection */] () extends SerializerComponent[T] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_ReflectionSerializerComponent: Instantiable3[
        /* name */ String, 
        /* kind */ ReflectionKind, 
        js.UndefOr[/* parent */ typings.typedoc.abstractMod.Reflection], 
        Reflection
      ] = js.native
  }
  
  @js.native
  abstract class SerializerComponent[T] () extends AbstractComponent[Serializer] {
    var serializeGroupSymbol: js.Any = js.native
    def priority(): Double = js.native
    def serializeGroup(instance: js.Any): Boolean = js.native
    def supports(item: js.Any): Boolean = js.native
    def toObject(item: T): js.Any = js.native
    def toObject(item: T, obj: js.Any): js.Any = js.native
  }
  
  @js.native
  abstract class TypeSerializerComponent[T /* <: Type */] () extends SerializerComponent[T] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_TypeSerializerComponent: TypeofClassType = js.native
  }
  
  /* static members */
  @js.native
  object SerializerComponent extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

