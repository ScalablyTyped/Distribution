package typings.typedoc

import org.scalablytyped.runtime.Instantiable1
import typings.typedoc.distLibModelsReflectionsAbstractMod.Decorator
import typings.typedoc.distLibSerializationComponentsMod.SerializerComponent
import typings.typedoc.distLibSerializationSerializersModelsDecoratorDashWrapperMod.DecoratorWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", JSImport.Namespace)
@js.native
object distLibSerializationSerializersDecoratorMod extends js.Object {
  @js.native
  class DecoratorContainerSerializer () extends SerializerComponent[DecoratorWrapper] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_DecoratorContainerSerializer: Instantiable1[/* decorator */ Decorator, DecoratorWrapper] = js.native
  }
  
  /* static members */
  @js.native
  object DecoratorContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

