package typings.wordpressBlockEditor.componentsMod

import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockControls {
  
  @JSImport("@wordpress/block-editor/components", "BlockControls")
  @js.native
  def apply(props: Props): Element = js.native
  @JSImport("@wordpress/block-editor/components", "BlockControls")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockControls.Slot")
  @js.native
  def Slot: FC[OmitPropsname] = js.native
  @scala.inline
  def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
}
