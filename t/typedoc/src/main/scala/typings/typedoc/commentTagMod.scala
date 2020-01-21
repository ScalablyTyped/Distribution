package typings.typedoc

import org.scalablytyped.runtime.Instantiable3
import typings.typedoc.modelsMod.CommentTag
import typings.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", JSImport.Namespace)
@js.native
object commentTagMod extends js.Object {
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
  @js.native
  object CommentTagSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

