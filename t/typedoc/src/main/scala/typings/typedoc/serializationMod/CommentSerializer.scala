package typings.typedoc.serializationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "CommentSerializer")
@js.native
class CommentSerializer protected ()
  extends typings.typedoc.serializersMod.CommentSerializer {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}
/* static members */
object CommentSerializer {
  
  @JSImport("typedoc/dist/lib/serialization", "CommentSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization", "CommentSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
