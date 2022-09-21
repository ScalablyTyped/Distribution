package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSeoMod.SeoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object seoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Seo", JSImport.Default)
  @js.native
  val default: FC[SeoProps] = js.native
  
  type _To = FC[SeoProps]
  
  /* This means you don't have to write `default`, but can instead just say `seoMod.foo` */
  override def _to: FC[SeoProps] = default
}
