package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.upperCaseMod.UpperCaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUpperCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/UpperCase", JSImport.Default)
  @js.native
  val default: SFC[UpperCaseProps] = js.native
  
  type _To = SFC[UpperCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUpperCaseMod.foo` */
  override def _to: SFC[UpperCaseProps] = default
}
