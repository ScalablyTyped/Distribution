package typings.wordpressEditPost.mod

import typings.wordpressEditPost.anon.PartialEditorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/edit-post", "initializeEditor")
@js.native
object initializeEditor extends js.Object {
  def apply(id: String, postType: String, postId: String): Unit = js.native
  def apply(id: String, postType: String, postId: String, settings: PartialEditorSettings): Unit = js.native
  def apply(
    id: String,
    postType: String,
    postId: String,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  def apply(id: String, postType: String, postId: Double): Unit = js.native
  def apply(id: String, postType: String, postId: Double, settings: PartialEditorSettings): Unit = js.native
  def apply(
    id: String,
    postType: String,
    postId: Double,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
}

