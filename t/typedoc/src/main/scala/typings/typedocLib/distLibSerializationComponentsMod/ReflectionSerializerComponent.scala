package typings
package typedocLib.distLibSerializationComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
@js.native
abstract class ReflectionSerializerComponent[T /* <: typedocLib.distLibModelsMod.Reflection */] () extends SerializerComponent[T] {
  var serializeGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReflectionSerializerComponent.serializeGroup */ js.Any = js.native
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_ReflectionSerializerComponent: org.scalablytyped.runtime.Instantiable3[
    /* parent */ js.UndefOr[/* parent */ typedocLib.distLibModelsReflectionsAbstractMod.Reflection], 
    /* name */ js.UndefOr[/* name */ java.lang.String], 
    /* kind */ js.UndefOr[/* kind */ typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind], 
    typedocLib.distLibModelsMod.Reflection
  ] = js.native
}

@JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
@js.native
object ReflectionSerializerComponent extends js.Object {
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

