package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.bookingsLargeMod.BookingsLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemBookingsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/BookingsLarge", JSImport.Default)
  @js.native
  val default: FC[BookingsLargeProps] = js.native
  
  type _To = FC[BookingsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemBookingsLargeMod.foo` */
  override def _to: FC[BookingsLargeProps] = default
}
