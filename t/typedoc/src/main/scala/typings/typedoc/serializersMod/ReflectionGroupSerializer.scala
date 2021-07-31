package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "ReflectionGroupSerializer")
@js.native
class ReflectionGroupSerializer protected ()
  extends typings.typedoc.serializersReflectionGroupMod.ReflectionGroupSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object ReflectionGroupSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ReflectionGroupSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ReflectionGroupSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
