package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block[T /* <: Record[String, _] */] extends js.Object {
  
  /**
    * Attributes for the block.
    */
  val attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block with TopLevel[js.Any] = js.native
  
  /**
    * The block category (determines placement in the inserter).
    */
  val category: String = js.native
  
  /**
    * Array of deprecation handlers for the block.
    */
  val deprecated: js.UndefOr[js.Array[BlockDeprecation[T]]] = js.native
  
  /**
    * This is a short description for your block, which can be translated
    * with our translation functions.
    */
  val description: js.UndefOr[String] = js.native
  
  /**
    * Component to render in the editor.
    */
  val edit: js.UndefOr[ComponentType[BlockEditProps[T]]] = js.native
  
  /**
    * Sets attributes on the topmost parent element of the current block.
    */
  var getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ T, Record[String, String | Double | Boolean]]] = js.native
  
  /**
    * Icon for the block.
    */
  val icon: BlockIconNormalized = js.native
  
  /**
    * Searchable keywords for discovery.
    */
  val keywords: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Undocumented, but used in core.
    *
    * @see `@wordpress/block-library/src/paragraph`
    */
  var merge: js.UndefOr[js.Function2[/* attributes */ T, /* attributesToMerge */ T, Partial[T]]] = js.native
  
  /**
    * This is set internally when registering the type.
    */
  val name: String = js.native
  
  /**
    * Setting `parent` lets a block require that it is only available when
    * nested within the specified blocks.
    */
  val parent: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Component to render on the frontend.
    */
  val save: ComponentType[BlockSaveProps[T]] = js.native
  
  /**
    * Block styles.
    *
    * @see `https://wordpress.org/gutenberg/handbook/extensibility/extending-blocks/#block-style-variations`
    */
  val styles: js.UndefOr[js.Array[BlockStyle]] = js.native
  
  /**
    * Optional block extended support features.
    */
  val supports: js.UndefOr[BlockSupports] = js.native
  
  /**
    * This is the display title for your block, which can be translated
    * with our translation functions.
    */
  val title: String = js.native
  
  /**
    * Block transformations.
    */
  val transforms: js.UndefOr[From[T]] = js.native
}
object Block {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block with TopLevel[js.Any],
    category: String,
    icon: BlockIconNormalized,
    name: String,
    save: ComponentType[BlockSaveProps[T]],
    title: String
  ): Block[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block[T]]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block[_], T /* <: Record[String, _] */] (val x: Self with Block[T]) extends AnyVal {
    
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
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Block with TopLevel[js.Any]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: BlockIconNormalized): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: ComponentType[BlockSaveProps[T]]): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedVarargs(value: BlockDeprecation[T]*): Self = this.set("deprecated", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: js.Array[BlockDeprecation[T]]): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEdit(value: ComponentType[BlockEditProps[T]]): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setGetEditWrapperProps(value: /* attrs */ T => Record[String, String | Double | Boolean]): Self = this.set("getEditWrapperProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEditWrapperProps: Self = this.set("getEditWrapperProps", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setMerge(value: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T]): Self = this.set("merge", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: String*): Self = this.set("parent", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: js.Array[String]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: BlockStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[BlockStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSupports(value: BlockSupports): Self = this.set("supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
    
    @scala.inline
    def setTransforms(value: From[T]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
}
