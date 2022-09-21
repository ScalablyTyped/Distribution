package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMapPinBoldMod.MapPinBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapPinBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MapPinBold", JSImport.Default)
  @js.native
  val default: FC[MapPinBoldProps] = js.native
  
  type _To = FC[MapPinBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `mapPinBoldMod.foo` */
  override def _to: FC[MapPinBoldProps] = default
}
