package typings
package typedocLib.distLibSerializationSerializersCommentsCommentDashTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
@js.native
class CommentTagSerializer ()
  extends typedocLib.distLibSerializationComponentsMod.SerializerComponent[typedocLib.distLibModelsMod.CommentTag] {
  var serializeGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CommentTagSerializer.serializeGroup */ js.Any = js.native
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_CommentTagSerializer: org.scalablytyped.runtime.Instantiable3[
    /* tagName */ java.lang.String, 
    /* paramName */ js.UndefOr[/* paramName */ java.lang.String], 
    /* text */ js.UndefOr[/* text */ java.lang.String], 
    typedocLib.distLibModelsMod.CommentTag
  ] = js.native
}

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
@js.native
object CommentTagSerializer extends js.Object {
  var PRIORITY: scala.Double = js.native
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

