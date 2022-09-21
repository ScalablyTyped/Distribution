package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAddElementsMod.AddElementsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addElementsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AddElements", JSImport.Default)
  @js.native
  val default: FC[AddElementsProps] = js.native
  
  type _To = FC[AddElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `addElementsMod.foo` */
  override def _to: FC[AddElementsProps] = default
}
