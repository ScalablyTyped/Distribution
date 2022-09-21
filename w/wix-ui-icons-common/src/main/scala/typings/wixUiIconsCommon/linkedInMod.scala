package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLinkedInMod.LinkedInProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedInMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/LinkedIn", JSImport.Default)
  @js.native
  val default: FC[LinkedInProps] = js.native
  
  type _To = FC[LinkedInProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkedInMod.foo` */
  override def _to: FC[LinkedInProps] = default
}
