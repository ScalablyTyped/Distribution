package typings.wordpressBlocks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockSupports extends js.Object {
  /**
    * This property adds block controls which allow to change block's
    * alignment.
    *
    * @defaultValue false
    */
  val align: js.UndefOr[Boolean | js.Array[BlockAlignment]] = js.native
  /**
    * Enable wide alignment (depends on `align`).
    *
    * @defaultValue true
    */
  val alignWide: js.UndefOr[Boolean] = js.native
  /**
    * Anchors let you link directly to a specific block on a page. This
    * property adds a field to define an id for the block and a button to
    * copy the direct link.
    *
    * @defaultValue false
    */
  val anchor: js.UndefOr[Boolean] = js.native
  /**
    * By default, Gutenberg adds a class with the form
    * `.wp-block-your-block-name` to the root element of your saved
    * markup.
    *
    * @defaultValue true
    */
  val className: js.UndefOr[Boolean] = js.native
  /**
    * This property adds a field to define a custom className for the
    * block's wrapper.
    *
    * @defaultValue true
    */
  val customClassName: js.UndefOr[Boolean] = js.native
  /**
    * By default, Gutenberg will allow a block's markup to be edited
    * individually. To disable this behavior, set `html` to `false`
    *
    * @defaultValue true
    */
  val html: js.UndefOr[Boolean] = js.native
  /**
    * By default, all blocks will appear in the Gutenberg inserter. To
    * hide a block so that it can only be inserted programmatically, set
    * to false
    *
    * @defaultValue true
    */
  val inserter: js.UndefOr[Boolean] = js.native
  /**
    * A non-multiple block can be inserted into each post, one time only.
    *
    * @defaultValue true
    */
  val multiple: js.UndefOr[Boolean] = js.native
  /**
    * By default all blocks can be converted to a reusable block.
    *
    * @defaultValue true
    */
  val reusable: js.UndefOr[Boolean] = js.native
}

object BlockSupports {
  @scala.inline
  def apply(): BlockSupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockSupports]
  }
  @scala.inline
  implicit class BlockSupportsOps[Self <: BlockSupports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignVarargs(value: BlockAlignment*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: Boolean | js.Array[BlockAlignment]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignWide(value: Boolean): Self = this.set("alignWide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignWide: Self = this.set("alignWide", js.undefined)
    @scala.inline
    def setAnchor(value: Boolean): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setClassName(value: Boolean): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomClassName(value: Boolean): Self = this.set("customClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomClassName: Self = this.set("customClassName", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setInserter(value: Boolean): Self = this.set("inserter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInserter: Self = this.set("inserter", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setReusable(value: Boolean): Self = this.set("reusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReusable: Self = this.set("reusable", js.undefined)
  }
  
}

