package typings.typedoc

import typings.typedoc.anon.PartialDecorator
import typings.typedoc.decoratorWrapperMod.DecoratorWrapper
import typings.typedoc.schemaMod.Decorator
import typings.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", JSImport.Namespace)
@js.native
object decoratorMod extends js.Object {
  @js.native
  class DecoratorContainerSerializer () extends SerializerComponent[DecoratorWrapper] {
    def toObject(hasDecorator: DecoratorWrapper, obj: PartialDecorator): Decorator = js.native
  }
  
  /* static members */
  @js.native
  object DecoratorContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

