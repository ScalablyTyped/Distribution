package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFullWidthStripMod.FullWidthStripProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullWidthStripMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FullWidthStrip", JSImport.Default)
  @js.native
  val default: FC[FullWidthStripProps] = js.native
  
  type _To = FC[FullWidthStripProps]
  
  /* This means you don't have to write `default`, but can instead just say `fullWidthStripMod.foo` */
  override def _to: FC[FullWidthStripProps] = default
}
