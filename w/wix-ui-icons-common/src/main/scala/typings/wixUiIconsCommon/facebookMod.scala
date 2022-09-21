package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFacebookMod.FacebookProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Facebook", JSImport.Default)
  @js.native
  val default: FC[FacebookProps] = js.native
  
  type _To = FC[FacebookProps]
  
  /* This means you don't have to write `default`, but can instead just say `facebookMod.foo` */
  override def _to: FC[FacebookProps] = default
}
