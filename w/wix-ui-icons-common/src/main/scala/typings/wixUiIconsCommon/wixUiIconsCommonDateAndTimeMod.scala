package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.dateAndTimeMod.DateAndTimeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonDateAndTimeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/DateAndTime", JSImport.Default)
  @js.native
  val default: FC[DateAndTimeProps] = js.native
  
  type _To = FC[DateAndTimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonDateAndTimeMod.foo` */
  override def _to: FC[DateAndTimeProps] = default
}
