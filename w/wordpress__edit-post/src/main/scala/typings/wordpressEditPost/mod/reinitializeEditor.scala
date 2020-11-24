package typings.wordpressEditPost.mod

import typings.std.Element
import typings.wordpressEditPost.anon.PartialEditorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/edit-post", "reinitializeEditor")
@js.native
object reinitializeEditor extends js.Object {
  
  def apply(postType: String, postId: String, target: Element): Unit = js.native
  def apply(
    postType: String,
    postId: String,
    target: Element,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  def apply(postType: String, postId: String, target: Element, settings: PartialEditorSettings): Unit = js.native
  def apply(
    postType: String,
    postId: String,
    target: Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  def apply(postType: String, postId: Double, target: Element): Unit = js.native
  def apply(
    postType: String,
    postId: Double,
    target: Element,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  def apply(postType: String, postId: Double, target: Element, settings: PartialEditorSettings): Unit = js.native
  def apply(
    postType: String,
    postId: Double,
    target: Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
}
