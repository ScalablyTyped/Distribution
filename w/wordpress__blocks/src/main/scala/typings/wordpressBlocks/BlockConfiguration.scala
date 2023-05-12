package typings.wordpressBlocks

import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.ReadonlyPartialBlockinner
import typings.wordpressBlocks.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<@wordpress/blocks.Block<T>, 'icon'>> & std.Pick<@wordpress/blocks.Block<T>, 'attributes' | 'category' | 'title'> & {  icon :@wordpress/blocks.BlockIcon | undefined} */
trait BlockConfiguration[T /* <: Record[String, Any] */] extends StObject {
  
  var ancestor: js.UndefOr[js.Array[String]] = js.undefined
  
  var apiVersion: js.UndefOr[Double] = js.undefined
  
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof T ]: @wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
  ] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var deprecated: js.UndefOr[js.Array[BlockDeprecation[T, Record[String, Any]]]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var edit: js.UndefOr[ComponentType[BlockEditProps[T]]] = js.undefined
  
  var editorScript: js.UndefOr[String] = js.undefined
  
  var editorStyle: js.UndefOr[String] = js.undefined
  
  var example: js.UndefOr[ReadonlyPartialBlockinner] = js.undefined
  
  var getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ T, Record[String, String | Double | Boolean]]] = js.undefined
  
  var icon: js.UndefOr[BlockIcon] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var merge: js.UndefOr[js.Function2[/* attributes */ T, /* attributesToMerge */ T, Partial[T]]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[js.Array[String]] = js.undefined
  
  var providesContext: js.UndefOr[Record[String, /* keyof T */ String]] = js.undefined
  
  var save: js.UndefOr[ComponentType[BlockSaveProps[T]]] = js.undefined
  
  var script: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[js.Array[BlockStyle]] = js.undefined
  
  var supports: js.UndefOr[BlockSupports] = js.undefined
  
  var textdomain: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transforms: js.UndefOr[To[T]] = js.undefined
  
  var usesContext: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object BlockConfiguration {
  
  inline def apply[T /* <: Record[String, Any] */](): BlockConfiguration[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockConfiguration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockConfiguration[?], T /* <: Record[String, Any] */] (val x: Self & BlockConfiguration[T]) extends AnyVal {
    
    inline def setAncestor(value: js.Array[String]): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    inline def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    inline def setAncestorVarargs(value: String*): Self = StObject.set(x, "ancestor", js.Array(value*))
    
    inline def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof T ]: @wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDeprecated(value: js.Array[BlockDeprecation[T, Record[String, Any]]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDeprecatedVarargs(value: (BlockDeprecation[T, Record[String, Any]])*): Self = StObject.set(x, "deprecated", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdit(value: ComponentType[BlockEditProps[T]]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditorScript(value: String): Self = StObject.set(x, "editorScript", value.asInstanceOf[js.Any])
    
    inline def setEditorScriptUndefined: Self = StObject.set(x, "editorScript", js.undefined)
    
    inline def setEditorStyle(value: String): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
    
    inline def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
    
    inline def setExample(value: ReadonlyPartialBlockinner): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setGetEditWrapperProps(value: /* attrs */ T => Record[String, String | Double | Boolean]): Self = StObject.set(x, "getEditWrapperProps", js.Any.fromFunction1(value))
    
    inline def setGetEditWrapperPropsUndefined: Self = StObject.set(x, "getEditWrapperProps", js.undefined)
    
    inline def setIcon(value: BlockIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setMerge(value: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T]): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: js.Array[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: String*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProvidesContext(value: Record[String, /* keyof T */ String]): Self = StObject.set(x, "providesContext", value.asInstanceOf[js.Any])
    
    inline def setProvidesContextUndefined: Self = StObject.set(x, "providesContext", js.undefined)
    
    inline def setSave(value: ComponentType[BlockSaveProps[T]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: js.Array[BlockStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: BlockStyle*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setSupports(value: BlockSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    
    inline def setTextdomain(value: String): Self = StObject.set(x, "textdomain", value.asInstanceOf[js.Any])
    
    inline def setTextdomainUndefined: Self = StObject.set(x, "textdomain", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransforms(value: To[T]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setUsesContext(value: js.Array[String]): Self = StObject.set(x, "usesContext", value.asInstanceOf[js.Any])
    
    inline def setUsesContextUndefined: Self = StObject.set(x, "usesContext", js.undefined)
    
    inline def setUsesContextVarargs(value: String*): Self = StObject.set(x, "usesContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
