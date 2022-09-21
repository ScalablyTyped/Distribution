package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.forumsLargeMod.ForumsLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemForumsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ForumsLarge", JSImport.Default)
  @js.native
  val default: FC[ForumsLargeProps] = js.native
  
  type _To = FC[ForumsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemForumsLargeMod.foo` */
  override def _to: FC[ForumsLargeProps] = default
}
