package typings.typedoc.serializationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "ReflectionSerializer")
@js.native
class ReflectionSerializer protected ()
  extends typings.typedoc.serializersMod.ReflectionSerializer {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}
/* static members */
object ReflectionSerializer {
  
  @JSImport("typedoc/dist/lib/serialization", "ReflectionSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization", "ReflectionSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
