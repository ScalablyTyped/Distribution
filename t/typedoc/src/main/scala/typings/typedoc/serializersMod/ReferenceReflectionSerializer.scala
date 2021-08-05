package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "ReferenceReflectionSerializer")
@js.native
class ReferenceReflectionSerializer protected ()
  extends typings.typedoc.serializersReflectionsMod.ReferenceReflectionSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object ReferenceReflectionSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ReferenceReflectionSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ReferenceReflectionSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
