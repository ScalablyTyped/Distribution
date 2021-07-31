package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block[T /* <: Record[String, js.Any] */] extends StObject {
  
  /**
    * Attributes for the block.
    */
  val attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block & TopLevel[js.Any]
  
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
  def apply[T /* <: Record[String, js.Any] */](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Block & TopLevel[js.Any],
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
  implicit class BlockMutableBuilder[Self <: Block[?], T /* <: Record[String, js.Any] */] (val x: Self & Block[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Block & TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated(value: js.Array[BlockDeprecation[T]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDeprecatedVarargs(value: BlockDeprecation[T]*): Self = StObject.set(x, "deprecated", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEdit(value: ComponentType[BlockEditProps[T]]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setGetEditWrapperProps(value: /* attrs */ T => Record[String, String | Double | Boolean]): Self = StObject.set(x, "getEditWrapperProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEditWrapperPropsUndefined: Self = StObject.set(x, "getEditWrapperProps", js.undefined)
    
    @scala.inline
    def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setMerge(value: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T]): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Array[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: String*): Self = StObject.set(x, "parent", js.Array(value :_*))
    
    @scala.inline
    def setSave(value: ComponentType[BlockSaveProps[T]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[BlockStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: BlockStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setSupports(value: BlockSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: From[T]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
  }
}
