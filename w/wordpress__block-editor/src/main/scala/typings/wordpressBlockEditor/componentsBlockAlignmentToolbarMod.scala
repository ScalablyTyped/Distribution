package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockAlignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockAlignmentToolbar {
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressBlockEditor.wordpressBlockEditorStrings.center
      - typings.wordpressBlockEditor.wordpressBlockEditorStrings.full
      - typings.wordpressBlockEditor.wordpressBlockEditorStrings.left
      - typings.wordpressBlockEditor.wordpressBlockEditorStrings.right
      - typings.wordpressBlockEditor.wordpressBlockEditorStrings.wide
    */
    trait Control extends StObject
    object Control {
      
      inline def center: typings.wordpressBlockEditor.wordpressBlockEditorStrings.center = "center".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.center]
      
      inline def full: typings.wordpressBlockEditor.wordpressBlockEditorStrings.full = "full".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.full]
      
      inline def left: typings.wordpressBlockEditor.wordpressBlockEditorStrings.left = "left".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.left]
      
      inline def right: typings.wordpressBlockEditor.wordpressBlockEditorStrings.right = "right".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.right]
      
      inline def wide: typings.wordpressBlockEditor.wordpressBlockEditorStrings.wide = "wide".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.wide]
    }
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var controls: js.UndefOr[js.Array[Control]] = js.native
      
      var isCollapsed: js.UndefOr[Boolean] = js.native
      
      def onChange(): Unit = js.native
      def onChange(newValue: Control): Unit = js.native
      
      var value: js.UndefOr[Control] = js.native
    }
  }
}
