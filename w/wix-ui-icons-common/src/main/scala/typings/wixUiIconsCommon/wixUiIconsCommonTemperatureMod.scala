package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.temperatureMod.TemperatureProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonTemperatureMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Temperature", JSImport.Default)
  @js.native
  val default: FC[TemperatureProps] = js.native
  
  type _To = FC[TemperatureProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonTemperatureMod.foo` */
  override def _to: FC[TemperatureProps] = default
}
