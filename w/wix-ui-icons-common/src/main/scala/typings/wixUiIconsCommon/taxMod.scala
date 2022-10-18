package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsTaxMod.TaxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Tax", JSImport.Default)
  @js.native
  val default: FC[TaxProps] = js.native
  
  type _To = FC[TaxProps]
  
  /* This means you don't have to write `default`, but can instead just say `taxMod.foo` */
  override def _to: FC[TaxProps] = default
}
