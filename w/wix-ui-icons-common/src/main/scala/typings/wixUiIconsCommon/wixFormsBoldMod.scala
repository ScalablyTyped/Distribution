package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixFormsBoldMod.WixFormsBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixFormsBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixFormsBold", JSImport.Default)
  @js.native
  val default: FC[WixFormsBoldProps] = js.native
  
  type _To = FC[WixFormsBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixFormsBoldMod.foo` */
  override def _to: FC[WixFormsBoldProps] = default
}
