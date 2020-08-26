package typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks

import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.mod.EditorTemplateLock
import typings.wordpressBlocks.templatesMod.TemplateArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
  /**
    * A 'render prop' function that can be used to customize the block's appender.
    */
  var renderAppender: js.UndefOr[ComponentType[js.Object]] = js.native
  /**
    * The template is defined as a list of block items. Such blocks can have predefined
    * attributes, placeholder, content, etc. Block templates allow specifying a default initial
    * state for an InnerBlocks area.
    *
    * See {@link https://github.com/WordPress/gutenberg/blob/master/docs/designers-developers/developers/block-api/block-templates.md }
    */
  var template: js.UndefOr[TemplateArray] = js.native
  /**
    * If `true` when child blocks in the template are inserted the selection is updated.
    * If `false` the selection should not be updated when child blocks specified in the template are inserted.
    * @defaultValue true
    */
  var templateInsertUpdatesSelection: js.UndefOr[Boolean] = js.native
  /**
    * Template locking allows locking the `InnerBlocks` area for the current template.
    *
    * - `'all'` — prevents all operations. It is not possible to insert new blocks. Move existing blocks or delete them.
    * - `'insert'` — prevents inserting or removing blocks, but allows moving existing ones.
    * - `false` — prevents locking from being applied to an `InnerBlocks` area even if a parent block contains locking.
    *
    * If locking is not set in an `InnerBlocks` area: the locking of the parent `InnerBlocks` area is used.
    *
    * If the block is a top level block: the locking of the Custom Post Type is used.
    */
  var templateLock: js.UndefOr[EditorTemplateLock] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAllowedBlocksVarargs(value: String*): Self = this.set("allowedBlocks", js.Array(value :_*))
    @scala.inline
    def setAllowedBlocks(value: js.Array[String]): Self = this.set("allowedBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedBlocks: Self = this.set("allowedBlocks", js.undefined)
    @scala.inline
    def setRenderAppender(value: ComponentType[js.Object]): Self = this.set("renderAppender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAppender: Self = this.set("renderAppender", js.undefined)
    @scala.inline
    def setTemplate(value: TemplateArray): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateInsertUpdatesSelection(value: Boolean): Self = this.set("templateInsertUpdatesSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateInsertUpdatesSelection: Self = this.set("templateInsertUpdatesSelection", js.undefined)
    @scala.inline
    def setTemplateLock(value: EditorTemplateLock): Self = this.set("templateLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLock: Self = this.set("templateLock", js.undefined)
  }
  
}

