package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.textAreaNumberedListMod.TextAreaNumberedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTextAreaNumberedListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/TextAreaNumberedList", JSImport.Default)
  @js.native
  val default: SFC[TextAreaNumberedListProps] = js.native
  
  type _To = SFC[TextAreaNumberedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTextAreaNumberedListMod.foo` */
  override def _to: SFC[TextAreaNumberedListProps] = default
}
