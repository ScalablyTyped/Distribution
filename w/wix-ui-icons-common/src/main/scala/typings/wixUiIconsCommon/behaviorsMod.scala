package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBehaviorsMod.BehaviorsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Behaviors", JSImport.Default)
  @js.native
  val default: FC[BehaviorsProps] = js.native
  
  type _To = FC[BehaviorsProps]
  
  /* This means you don't have to write `default`, but can instead just say `behaviorsMod.foo` */
  override def _to: FC[BehaviorsProps] = default
}
