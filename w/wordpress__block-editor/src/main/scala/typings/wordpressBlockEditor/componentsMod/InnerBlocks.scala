package typings.wordpressBlockEditor.componentsMod

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerBlocks {
  
  inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor/components", "InnerBlocks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
    * default Block is inserted.
    */
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.ButtonBlockerAppender")
  @js.native
  def ButtonBlockerAppender: ComponentType[Children] = js.native
  inline def ButtonBlockerAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockerAppender")(x.asInstanceOf[js.Any])
  
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.Content")
  @js.native
  def Content: ComponentType[Children] = js.native
  inline def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /**
    * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
    * is the `paragraph` block.
    */
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.DefaultBlockAppender")
  @js.native
  def DefaultBlockAppender: ComponentType[Children] = js.native
  inline def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
}
