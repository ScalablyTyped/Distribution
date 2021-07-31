package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<@wordpress/blocks.@wordpress/blocks.Block<T>, 'icon'>> & std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'category' | 'title'> & {  icon :@wordpress/blocks.@wordpress/blocks.BlockIcon | undefined} */
trait BlockConfiguration[T /* <: Record[String, js.Any] */] extends StObject {
  
  var attributes: (js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any]
  ]) & typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any]
  
  var category: js.UndefOr[String] & String
  
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
  
  var title: js.UndefOr[String] & String
  
  var transforms: js.UndefOr[From[T]] = js.undefined
}
object BlockConfiguration {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](
    attributes: (js.UndefOr[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any]
    ]) & typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any],
    category: js.UndefOr[String] & String,
    title: js.UndefOr[String] & String
  ): BlockConfiguration[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockConfiguration[T]]
  }
  
  @scala.inline
  implicit class BlockConfigurationMutableBuilder[Self <: BlockConfiguration[?], T /* <: Record[String, js.Any] */] (val x: Self & BlockConfiguration[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: (js.UndefOr[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any]
        ]) & typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration & TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: js.UndefOr[String] & String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
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
    def setIcon(value: BlockIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
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
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: js.Array[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: String*): Self = StObject.set(x, "parent", js.Array(value :_*))
    
    @scala.inline
    def setSave(value: ComponentType[BlockSaveProps[T]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
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
    def setTitle(value: js.UndefOr[String] & String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: From[T]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
  }
}
