package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<@wordpress/blocks.@wordpress/blocks.Block<T>, 'icon'>> & std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'category' | 'title'> & {  icon ? :@wordpress/blocks.@wordpress/blocks.BlockIcon} */
trait BlockConfiguration[T /* <: Record[String, _] */] extends js.Object {
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any]
  ] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var deprecated: js.UndefOr[js.Array[BlockDeprecation[T]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var edit: js.UndefOr[ComponentType[BlockEditProps[T]]] = js.undefined
  var getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ T, Record[String, String | Double | Boolean]]] = js.undefined
  var icon: js.UndefOr[BlockIcon] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var merge: js.UndefOr[js.Function2[/* attributes */ T, /* attributesToMerge */ T, Partial[T]]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[js.Array[String]] = js.undefined
  var save: js.UndefOr[ComponentType[BlockSaveProps[T]]] = js.undefined
  var styles: js.UndefOr[js.Array[BlockStyle]] = js.undefined
  var supports: js.UndefOr[BlockSupports] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transforms: js.UndefOr[From[T]] = js.undefined
}

object BlockConfiguration {
  @scala.inline
  def apply[T](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any] = null,
    category: String = null,
    deprecated: js.Array[BlockDeprecation[T]] = null,
    description: String = null,
    edit: ComponentType[BlockEditProps[T]] = null,
    getEditWrapperProps: /* attrs */ T => Record[String, String | Double | Boolean] = null,
    icon: BlockIcon = null,
    keywords: js.Array[String] = null,
    merge: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T] = null,
    name: String = null,
    parent: js.Array[String] = null,
    save: ComponentType[BlockSaveProps[T]] = null,
    styles: js.Array[BlockStyle] = null,
    supports: BlockSupports = null,
    title: String = null,
    transforms: From[T] = null
  ): BlockConfiguration[T] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (getEditWrapperProps != null) __obj.updateDynamic("getEditWrapperProps")(js.Any.fromFunction1(getEditWrapperProps))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (merge != null) __obj.updateDynamic("merge")(js.Any.fromFunction2(merge))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockConfiguration[T]]
  }
}

