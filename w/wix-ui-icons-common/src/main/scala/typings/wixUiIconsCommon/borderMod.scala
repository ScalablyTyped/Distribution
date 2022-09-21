package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Border", JSImport.Default)
  @js.native
  val default: FC[BorderProps] = js.native
  
  type _To = FC[BorderProps]
  
  /* This means you don't have to write `default`, but can instead just say `borderMod.foo` */
  override def _to: FC[BorderProps] = default
}
