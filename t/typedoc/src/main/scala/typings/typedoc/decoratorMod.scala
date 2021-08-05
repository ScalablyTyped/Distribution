package typings.typedoc

import typings.typedoc.anon.PartialDecorator
import typings.typedoc.decoratorWrapperMod.DecoratorWrapper
import typings.typedoc.schemaMod.Decorator
import typings.typedoc.serializationComponentsMod.SerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
  @js.native
  class DecoratorContainerSerializer protected () extends SerializerComponent[DecoratorWrapper] {
    def this(owner: Serializer) = this()
    
    def toObject(hasDecorator: DecoratorWrapper, obj: PartialDecorator): Decorator = js.native
  }
  /* static members */
  object DecoratorContainerSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
