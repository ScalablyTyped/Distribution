package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/comments/tag", JSImport.Namespace)
@js.native
object tagMod extends js.Object {
  @js.native
  class CommentTag protected () extends js.Object {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: js.UndefOr[scala.Nothing], text: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
    var paramName: String = js.native
    var tagName: String = js.native
    var text: String = js.native
  }
  
}

