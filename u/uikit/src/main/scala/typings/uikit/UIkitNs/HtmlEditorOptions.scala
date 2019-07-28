package typings.uikit.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlEditorOptions extends js.Object {
  /**
    * Label string for code mode
    * @default 'Markdown'
    */
  var lblCodeview: js.UndefOr[String] = js.undefined
  /**
    * Label string for preview mode
    * @default 'Preview'
    */
  var lblPreview: js.UndefOr[String] = js.undefined
  /**
    * Min. browser width when to switch to responsive tab mode when in split mode
    * @default 1000
    */
  var maxsplitsize: js.UndefOr[Double] = js.undefined
  /**
    * View mode
    * Possible values 'split','tab'
    * @default 'split'
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * Button list to appear in the toolbar
    * @default [ "bold", "italic", "strike", "link", "picture", ... ]
    */
  var toolbar: js.UndefOr[js.Array[String]] = js.undefined
}

object HtmlEditorOptions {
  @scala.inline
  def apply(
    lblCodeview: String = null,
    lblPreview: String = null,
    maxsplitsize: Int | Double = null,
    mode: String = null,
    toolbar: js.Array[String] = null
  ): HtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (lblCodeview != null) __obj.updateDynamic("lblCodeview")(lblCodeview)
    if (lblPreview != null) __obj.updateDynamic("lblPreview")(lblPreview)
    if (maxsplitsize != null) __obj.updateDynamic("maxsplitsize")(maxsplitsize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[HtmlEditorOptions]
  }
}

