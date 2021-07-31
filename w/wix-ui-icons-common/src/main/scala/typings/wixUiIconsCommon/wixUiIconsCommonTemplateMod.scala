package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.templateMod.TemplateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonTemplateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Template", JSImport.Default)
  @js.native
  val default: SFC[TemplateProps] = js.native
  
  type _To = SFC[TemplateProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonTemplateMod.foo` */
  override def _to: SFC[TemplateProps] = default
}
