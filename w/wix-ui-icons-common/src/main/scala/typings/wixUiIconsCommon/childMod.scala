package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsChildMod.ChildProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Child", JSImport.Default)
  @js.native
  val default: FC[ChildProps] = js.native
  
  type _To = FC[ChildProps]
  
  /* This means you don't have to write `default`, but can instead just say `childMod.foo` */
  override def _to: FC[ChildProps] = default
}
