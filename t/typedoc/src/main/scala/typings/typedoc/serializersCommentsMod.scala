package typings.typedoc

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersCommentsMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentSerializer")
  @js.native
  class CommentSerializer protected ()
    extends typings.typedoc.serializersCommentsCommentMod.CommentSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object CommentSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentTagSerializer")
  @js.native
  class CommentTagSerializer protected ()
    extends typings.typedoc.commentTagMod.CommentTagSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object CommentTagSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentTagSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments", "CommentTagSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
