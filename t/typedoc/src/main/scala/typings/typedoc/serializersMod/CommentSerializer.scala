package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "CommentSerializer")
@js.native
class CommentSerializer protected ()
  extends typings.typedoc.serializersCommentsMod.CommentSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object CommentSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "CommentSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "CommentSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
