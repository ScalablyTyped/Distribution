package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBloggerMod.BloggerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloggerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Blogger", JSImport.Default)
  @js.native
  val default: FC[BloggerProps] = js.native
  
  type _To = FC[BloggerProps]
  
  /* This means you don't have to write `default`, but can instead just say `bloggerMod.foo` */
  override def _to: FC[BloggerProps] = default
}
