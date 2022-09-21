package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.priceMod.PriceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStagePriceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Price", JSImport.Default)
  @js.native
  val default: FC[PriceProps] = js.native
  
  type _To = FC[PriceProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStagePriceMod.foo` */
  override def _to: FC[PriceProps] = default
}
