package typings
package typedocLib.distLibSerializationSerializersCommentsCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", "CommentSerializer")
@js.native
class CommentSerializer ()
  extends typedocLib.distLibSerializationComponentsMod.SerializerComponent[typedocLib.distLibModelsMod.Comment] {
  var serializeGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CommentSerializer.serializeGroup */ js.Any = js.native
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_CommentSerializer: org.scalablytyped.runtime.Instantiable2[
    /* shortText */ js.UndefOr[/* shortText */ java.lang.String], 
    /* text */ js.UndefOr[/* text */ java.lang.String], 
    typedocLib.distLibModelsMod.Comment
  ] = js.native
}

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", "CommentSerializer")
@js.native
object CommentSerializer extends js.Object {
  var PRIORITY: scala.Double = js.native
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

