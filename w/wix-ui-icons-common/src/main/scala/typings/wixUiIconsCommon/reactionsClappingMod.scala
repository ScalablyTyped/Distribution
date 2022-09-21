package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.clappingMod.ClappingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsClappingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Clapping", JSImport.Default)
  @js.native
  val default: FC[ClappingProps] = js.native
  
  type _To = FC[ClappingProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsClappingMod.foo` */
  override def _to: FC[ClappingProps] = default
}
