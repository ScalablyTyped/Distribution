package typings.typedoc.distLibSerializationSerializersCommentsCommentDashTagMod

import org.scalablytyped.runtime.Instantiable3
import typings.typedoc.distLibModelsMod.CommentTag
import typings.typedoc.distLibSerializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
@js.native
class CommentTagSerializer () extends SerializerComponent[CommentTag] {
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_CommentTagSerializer: Instantiable3[
    /* tagName */ String, 
    js.UndefOr[/* paramName */ String], 
    js.UndefOr[/* text */ String], 
    CommentTag
  ] = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
@js.native
object CommentTagSerializer extends js.Object {
  var PRIORITY: Double = js.native
}

