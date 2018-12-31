package typings
package typedocLib.distLibSerializationSerializersDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
@js.native
class DecoratorContainerSerializer ()
  extends typedocLib.distLibSerializationComponentsMod.SerializerComponent[
      typedocLib.distLibSerializationSerializersModelsDecoratorDashWrapperMod.DecoratorWrapper
    ] {
  var serializeGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DecoratorContainerSerializer.serializeGroup */ js.Any = js.native
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_DecoratorContainerSerializer: org.scalablytyped.runtime.Instantiable1[
    /* decorator */ typedocLib.distLibModelsReflectionsAbstractMod.Decorator, 
    typedocLib.distLibSerializationSerializersModelsDecoratorDashWrapperMod.DecoratorWrapper
  ] = js.native
}

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
@js.native
object DecoratorContainerSerializer extends js.Object {
  var PRIORITY: scala.Double = js.native
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

