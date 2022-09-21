package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBlogNewMod.BlogNewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blogNewMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/BlogNew", JSImport.Default)
  @js.native
  val default: FC[BlogNewProps] = js.native
  
  type _To = FC[BlogNewProps]
  
  /* This means you don't have to write `default`, but can instead just say `blogNewMod.foo` */
  override def _to: FC[BlogNewProps] = default
}
