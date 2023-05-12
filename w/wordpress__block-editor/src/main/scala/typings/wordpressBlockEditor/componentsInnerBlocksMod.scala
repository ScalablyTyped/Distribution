package typings.wordpressBlockEditor

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.anon.Ref
import typings.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props
import typings.wordpressBlockEditor.componentsUseBlockPropsMod.Merged
import typings.wordpressBlockEditor.componentsUseBlockPropsMod.Reserved
import typings.wordpressBlockEditor.mod.EditorTemplateLock
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInnerBlocksMod {
  
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components/inner-blocks", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.ButtonBlockAppender")
    @js.native
    def ButtonBlockAppender: ComponentType[Children] = js.native
    inline def ButtonBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.Content")
    @js.native
    def Content: ComponentType[Children] = js.native
    inline def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ComponentType[Children] = js.native
    inline def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components/inner-blocks", "useInnerBlocksProps")
  @js.native
  val useInnerBlocksProps: UseInnerBlocksProps_ = js.native
  
  object InnerBlocks {
    
    trait Props extends StObject {
      
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
      var template: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateArray */ Any
          ] = js.undefined
      
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
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
        
        inline def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
        
        inline def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value*))
        
        inline def setRenderAppender(value: ComponentType[js.Object]): Self = StObject.set(x, "renderAppender", value.asInstanceOf[js.Any])
        
        inline def setRenderAppenderUndefined: Self = StObject.set(x, "renderAppender", js.undefined)
        
        inline def setTemplate(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateArray */ Any
        ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateInsertUpdatesSelection(value: Boolean): Self = StObject.set(x, "templateInsertUpdatesSelection", value.asInstanceOf[js.Any])
        
        inline def setTemplateInsertUpdatesSelectionUndefined: Self = StObject.set(x, "templateInsertUpdatesSelection", js.undefined)
        
        inline def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
        
        inline def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      }
    }
  }
  
  @js.native
  trait UseInnerBlocksProps_ extends StObject {
    
    def apply[Props /* <: Record[String, Any] */](): (Omit[Props, ref]) & Merged & Reserved = js.native
    def apply[Props /* <: Record[String, Any] */](props: Props & Ref): (Omit[Props, ref]) & Merged & Reserved = js.native
    def apply[Props /* <: Record[String, Any] */](
      props: Props & Ref,
      options: typings.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props
    ): (Omit[Props, ref]) & Merged & Reserved = js.native
    def apply[Props /* <: Record[String, Any] */](props: Unit, options: typings.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props): (Omit[Props, ref]) & Merged & Reserved = js.native
    
    def save(): Record[String, Any] = js.native
    def save(props: Record[String, Any]): Record[String, Any] = js.native
  }
}
