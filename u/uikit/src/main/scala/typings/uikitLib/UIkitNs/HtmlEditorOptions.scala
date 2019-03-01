package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlEditorOptions extends js.Object {
  /**
    * Label string for code mode
    * @default 'Markdown'
    */
  var lblCodeview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label string for preview mode
    * @default 'Preview'
    */
  var lblPreview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Min. browser width when to switch to responsive tab mode when in split mode
    * @default 1000
    */
  var maxsplitsize: js.UndefOr[scala.Double] = js.undefined
  /**
    * View mode
    * Possible values 'split','tab'
    * @default 'split'
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Button list to appear in the toolbar
    * @default [ "bold", "italic", "strike", "link", "picture", ... ]
    */
  var toolbar: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object HtmlEditorOptions {
  @scala.inline
  def apply(
    lblCodeview: java.lang.String = null,
    lblPreview: java.lang.String = null,
    maxsplitsize: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    toolbar: js.Array[java.lang.String] = null
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

