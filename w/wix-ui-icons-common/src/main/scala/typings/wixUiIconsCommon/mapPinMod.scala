package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMapPinMod.MapPinProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapPinMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MapPin", JSImport.Default)
  @js.native
  val default: FC[MapPinProps] = js.native
  
  type _To = FC[MapPinProps]
  
  /* This means you don't have to write `default`, but can instead just say `mapPinMod.foo` */
  override def _to: FC[MapPinProps] = default
}
