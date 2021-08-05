package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "DecoratorContainerSerializer")
@js.native
class DecoratorContainerSerializer protected ()
  extends typings.typedoc.decoratorMod.DecoratorContainerSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object DecoratorContainerSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "DecoratorContainerSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "DecoratorContainerSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
