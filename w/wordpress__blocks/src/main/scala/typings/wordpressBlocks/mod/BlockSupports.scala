package typings.wordpressBlocks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockSupports extends js.Object {
  /**
    * This property adds block controls which allow to change block's
    * alignment.
    *
    * @defaultValue false
    */
  val align: js.UndefOr[Boolean | js.Array[BlockAlignment]] = js.undefined
  /**
    * Enable wide alignment (depends on `align`).
    *
    * @defaultValue true
    */
  val alignWide: js.UndefOr[Boolean] = js.undefined
  /**
    * Anchors let you link directly to a specific block on a page. This
    * property adds a field to define an id for the block and a button to
    * copy the direct link.
    *
    * @defaultValue false
    */
  val anchor: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, Gutenberg adds a class with the form
    * `.wp-block-your-block-name` to the root element of your saved
    * markup.
    *
    * @defaultValue true
    */
  val className: js.UndefOr[Boolean] = js.undefined
  /**
    * This property adds a field to define a custom className for the
    * block's wrapper.
    *
    * @defaultValue true
    */
  val customClassName: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, Gutenberg will allow a block's markup to be edited
    * individually. To disable this behavior, set `html` to `false`
    *
    * @defaultValue true
    */
  val html: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, all blocks will appear in the Gutenberg inserter. To
    * hide a block so that it can only be inserted programmatically, set
    * to false
    *
    * @defaultValue true
    */
  val inserter: js.UndefOr[Boolean] = js.undefined
  /**
    * A non-multiple block can be inserted into each post, one time only.
    *
    * @defaultValue true
    */
  val multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * By default all blocks can be converted to a reusable block.
    *
    * @defaultValue true
    */
  val reusable: js.UndefOr[Boolean] = js.undefined
}

object BlockSupports {
  @scala.inline
  def apply(
    align: Boolean | js.Array[BlockAlignment] = null,
    alignWide: js.UndefOr[Boolean] = js.undefined,
    anchor: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[Boolean] = js.undefined,
    customClassName: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    inserter: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    reusable: js.UndefOr[Boolean] = js.undefined
  ): BlockSupports = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWide)) __obj.updateDynamic("alignWide")(alignWide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.get.asInstanceOf[js.Any])
    if (!js.isUndefined(customClassName)) __obj.updateDynamic("customClassName")(customClassName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inserter)) __obj.updateDynamic("inserter")(inserter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reusable)) __obj.updateDynamic("reusable")(reusable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSupports]
  }
}

