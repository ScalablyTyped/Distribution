package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionDropdownPopupOptions
  extends StObject
     with IListModel
     with IPopupOptionsBase
object IActionDropdownPopupOptions {
  
  inline def apply(items: Any, onSelectionChanged: (Action, Any) => Unit): IActionDropdownPopupOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onSelectionChanged = js.Any.fromFunction2(onSelectionChanged))
    __obj.asInstanceOf[IActionDropdownPopupOptions]
  }
}
