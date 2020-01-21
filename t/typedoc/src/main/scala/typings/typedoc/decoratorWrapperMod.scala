package typings.typedoc

import typings.typedoc.abstractMod.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/models/decorator-wrapper", JSImport.Namespace)
@js.native
object decoratorWrapperMod extends js.Object {
  @js.native
  class DecoratorWrapper protected () extends js.Object {
    def this(decorator: Decorator) = this()
    var decorator: Decorator = js.native
  }
  
}

