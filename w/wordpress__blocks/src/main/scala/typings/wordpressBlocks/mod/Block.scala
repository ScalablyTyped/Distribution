package typings.wordpressBlocks.mod

import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.ReadonlyPartialBlockinner
import typings.wordpressBlocks.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block[T /* <: Record[String, Any] */] extends StObject {
  
  /**
    * The version of the Block API used by the block.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#api-version}
    */
  val apiVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Attributes for the block.
    */
  val attributes: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
  
  /**
    * The block category (determines placement in the inserter).
    */
  val category: String
  
  /**
    * Array of deprecation handlers for the block.
    */
  val deprecated: js.UndefOr[js.Array[BlockDeprecation[T, Record[String, Any]]]] = js.undefined
  
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
    * Block type editor script definition.
    * It will only be enqueued in the context of the editor.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#editor-script}
    */
  val editorScript: js.UndefOr[String] = js.undefined
  
  /**
    * Block type editor style definition.
    * It will only be enqueued in the context of the editor.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#editor-style}
    */
  val editorStyle: js.UndefOr[String] = js.undefined
  
  /**
    * It provides structured example data for the block.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#example}
    */
  val example: js.UndefOr[ReadonlyPartialBlockinner] = js.undefined
  
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
    * Context provided for available access by descendants of blocks of this
    * type, in the form of an object which maps a context name to one of the
    * block’s own attribute.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#provides-context}
    */
  val providesContext: js.UndefOr[Record[String, /* keyof T */ String]] = js.undefined
  
  /**
    * Component to render on the frontend.
    */
  val save: ComponentType[BlockSaveProps[T]]
  
  /**
    * Block type frontend script definition.
    * It will be enqueued both in the editor and when viewing the content on
    * the front of the site.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#script}
    */
  val script: js.UndefOr[String] = js.undefined
  
  /**
    * Block type editor style definition.
    * It will only be enqueued in the context of the editor.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#style}
    */
  val style: js.UndefOr[String] = js.undefined
  
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
    * The gettext text domain of the plugin/block.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#text-domain}
    */
  val textdomain: js.UndefOr[String] = js.undefined
  
  /**
    * This is the display title for your block, which can be translated
    * with our translation functions.
    */
  val title: String
  
  /**
    * Block transformations.
    */
  val transforms: js.UndefOr[To[T]] = js.undefined
  
  /**
    * Array of the names of context values to inherit from an ancestor
    * provider.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#context}
    */
  val usesContext: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The current version number of the block, such as 1.0 or 1.0.3.
    *
    * @see {@link https://developer.wordpress.org/block-editor/reference-guides/block-api/block-metadata/#version}
    */
  val version: js.UndefOr[String] = js.undefined
}
object Block {
  
  inline def apply[T /* <: Record[String, Any] */](
    attributes: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any,
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
  implicit open class MutableBuilder[Self <: Block[?], T /* <: Record[String, Any] */] (val x: Self & Block[T]) extends AnyVal {
    
    inline def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
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
    
    inline def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setMerge(value: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T]): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Array[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: String*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProvidesContext(value: Record[String, /* keyof T */ String]): Self = StObject.set(x, "providesContext", value.asInstanceOf[js.Any])
    
    inline def setProvidesContextUndefined: Self = StObject.set(x, "providesContext", js.undefined)
    
    inline def setSave(value: ComponentType[BlockSaveProps[T]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
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
    
    inline def setTransforms(value: To[T]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setUsesContext(value: js.Array[String]): Self = StObject.set(x, "usesContext", value.asInstanceOf[js.Any])
    
    inline def setUsesContextUndefined: Self = StObject.set(x, "usesContext", js.undefined)
    
    inline def setUsesContextVarargs(value: String*): Self = StObject.set(x, "usesContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
