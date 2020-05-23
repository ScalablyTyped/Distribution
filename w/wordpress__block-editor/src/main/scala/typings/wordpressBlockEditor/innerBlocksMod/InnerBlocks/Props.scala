package typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks

import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.mod.EditorTemplateLock
import typings.wordpressBlocks.templatesMod.TemplateArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A 'render prop' function that can be used to customize the block's appender.
    */
  var renderAppender: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /**
    * The template is defined as a list of block items. Such blocks can have predefined
    * attributes, placeholder, content, etc. Block templates allow specifying a default initial
    * state for an InnerBlocks area.
    *
    * See {@link https://github.com/WordPress/gutenberg/blob/master/docs/designers-developers/developers/block-api/block-templates.md }
    */
  var template: js.UndefOr[TemplateArray] = js.undefined
  /**
    * If `true` when child blocks in the template are inserted the selection is updated.
    * If `false` the selection should not be updated when child blocks specified in the template are inserted.
    * @defaultValue true
    */
  var templateInsertUpdatesSelection: js.UndefOr[Boolean] = js.undefined
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
  var templateLock: js.UndefOr[EditorTemplateLock] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    allowedBlocks: js.Array[String] = null,
    renderAppender: ComponentType[js.Object] = null,
    template: TemplateArray = null,
    templateInsertUpdatesSelection: js.UndefOr[Boolean] = js.undefined,
    templateLock: EditorTemplateLock = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (allowedBlocks != null) __obj.updateDynamic("allowedBlocks")(allowedBlocks.asInstanceOf[js.Any])
    if (renderAppender != null) __obj.updateDynamic("renderAppender")(renderAppender.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(templateInsertUpdatesSelection)) __obj.updateDynamic("templateInsertUpdatesSelection")(templateInsertUpdatesSelection.get.asInstanceOf[js.Any])
    if (templateLock != null) __obj.updateDynamic("templateLock")(templateLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

