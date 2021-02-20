package typings.typedoc

import typings.typedoc.abstractMod.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorWrapperMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/models/decorator-wrapper", "DecoratorWrapper")
  @js.native
  class DecoratorWrapper protected () extends StObject {
    def this(decorator: Decorator) = this()
    
    var decorator: Decorator = js.native
  }
}
