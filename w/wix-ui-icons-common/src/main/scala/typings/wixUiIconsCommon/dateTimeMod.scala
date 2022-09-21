package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDateTimeMod.DateTimeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DateTime", JSImport.Default)
  @js.native
  val default: FC[DateTimeProps] = js.native
  
  type _To = FC[DateTimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateTimeMod.foo` */
  override def _to: FC[DateTimeProps] = default
}
