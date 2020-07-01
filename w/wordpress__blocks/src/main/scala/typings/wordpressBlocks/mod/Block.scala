package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block[T /* <: Record[String, _] */] extends js.Object {
  /**
    * Attributes for the block.
    */
  val attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block with TopLevel[js.Any]
  /**
    * The block category (determines placement in the inserter).
    */
  val category: String
  /**
    * Array of deprecation handlers for the block.
    */
  val deprecated: js.UndefOr[js.Array[BlockDeprecation[T]]] = js.undefined
  /**
    * This is a short description for your block, which can be translated
    * with our translation functions.
    */
  val description: js.UndefOr[String] = js.undefined
  /**
    * Component to render in the editor.
    */
  val edit: js.UndefOr[ComponentType[BlockEditProps[T]]] = js.undefined
  /**
    * Sets attributes on the topmost parent element of the current block.
    */
  var getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ T, Record[String, String | Double | Boolean]]] = js.undefined
  /**
    * Icon for the block.
    */
  val icon: BlockIconNormalized
  /**
    * Searchable keywords for discovery.
    */
  val keywords: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Undocumented, but used in core.
    *
    * @see `@wordpress/block-library/src/paragraph`
    */
  var merge: js.UndefOr[js.Function2[/* attributes */ T, /* attributesToMerge */ T, Partial[T]]] = js.undefined
  /**
    * This is set internally when registering the type.
    */
  val name: String
  /**
    * Setting `parent` lets a block require that it is only available when
    * nested within the specified blocks.
    */
  val parent: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Component to render on the frontend.
    */
  val save: ComponentType[BlockSaveProps[T]]
  /**
    * Block styles.
    *
    * @see `https://wordpress.org/gutenberg/handbook/extensibility/extending-blocks/#block-style-variations`
    */
  val styles: js.UndefOr[js.Array[BlockStyle]] = js.undefined
  /**
    * Optional block extended support features.
    */
  val supports: js.UndefOr[BlockSupports] = js.undefined
  /**
    * This is the display title for your block, which can be translated
    * with our translation functions.
    */
  val title: String
  /**
    * Block transformations.
    */
  val transforms: js.UndefOr[From[T]] = js.undefined
}

object Block {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block with TopLevel[js.Any],
    category: String,
    icon: BlockIconNormalized,
    name: String,
    save: ComponentType[BlockSaveProps[T]],
    title: String,
    deprecated: js.Array[BlockDeprecation[T]] = null,
    description: String = null,
    edit: ComponentType[BlockEditProps[T]] = null,
    getEditWrapperProps: /* attrs */ T => Record[String, String | Double | Boolean] = null,
    keywords: js.Array[String] = null,
    merge: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T] = null,
    parent: js.Array[String] = null,
    styles: js.Array[BlockStyle] = null,
    supports: BlockSupports = null,
    transforms: From[T] = null
  ): Block[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (getEditWrapperProps != null) __obj.updateDynamic("getEditWrapperProps")(js.Any.fromFunction1(getEditWrapperProps))
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (merge != null) __obj.updateDynamic("merge")(js.Any.fromFunction2(merge))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block[T]]
  }
}

