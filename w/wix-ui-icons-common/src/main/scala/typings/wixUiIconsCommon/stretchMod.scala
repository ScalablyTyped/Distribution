package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsStretchMod.StretchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stretchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Stretch", JSImport.Default)
  @js.native
  val default: FC[StretchProps] = js.native
  
  type _To = FC[StretchProps]
  
  /* This means you don't have to write `default`, but can instead just say `stretchMod.foo` */
  override def _to: FC[StretchProps] = default
}
