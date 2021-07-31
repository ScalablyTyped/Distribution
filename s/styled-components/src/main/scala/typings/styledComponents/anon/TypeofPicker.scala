package typings.styledComponents.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentType
import typings.reactNative.mod.Picker
import typings.reactNative.mod.PickerItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPicker
  extends StObject
     with Instantiable1[/* props */ ReadonlyPickerProps, Picker] {
  
  var Item: ComponentType[PickerItemProps] = js.native
  
  /**
    * On Android, display the options in a dialog.
    */
  var MODE_DIALOG: String = js.native
  
  /**
    * On Android, display the options in a dropdown (this is the default).
    */
  var MODE_DROPDOWN: String = js.native
}
