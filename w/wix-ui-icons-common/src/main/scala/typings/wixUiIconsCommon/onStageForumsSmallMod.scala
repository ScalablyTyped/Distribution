package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.forumsSmallMod.ForumsSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageForumsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/ForumsSmall", JSImport.Default)
  @js.native
  val default: FC[ForumsSmallProps] = js.native
  
  type _To = FC[ForumsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageForumsSmallMod.foo` */
  override def _to: FC[ForumsSmallProps] = default
}
