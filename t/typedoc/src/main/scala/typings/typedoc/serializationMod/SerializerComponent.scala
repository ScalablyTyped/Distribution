package typings.typedoc.serializationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "SerializerComponent")
@js.native
abstract class SerializerComponent[T] protected ()
  extends typings.typedoc.serializationComponentsMod.SerializerComponent[T] {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}
/* static members */
object SerializerComponent {
  
  @JSImport("typedoc/dist/lib/serialization", "SerializerComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization", "SerializerComponent.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
