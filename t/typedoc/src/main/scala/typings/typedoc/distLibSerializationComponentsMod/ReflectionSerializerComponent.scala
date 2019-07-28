package typings.typedoc.distLibSerializationComponentsMod

import org.scalablytyped.runtime.Instantiable3
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
@js.native
abstract class ReflectionSerializerComponent[T /* <: Reflection */] () extends SerializerComponent[T] {
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_ReflectionSerializerComponent: Instantiable3[
    /* name */ String, 
    /* kind */ ReflectionKind, 
    js.UndefOr[/* parent */ typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection], 
    Reflection
  ] = js.native
}

