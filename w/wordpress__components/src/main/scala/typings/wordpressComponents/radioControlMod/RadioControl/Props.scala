package typings.wordpressComponents.radioControlMod.RadioControl

import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[T] extends ControlProps {
  
  /**
    * A function that receives the value of the new option that is being
    * selected as input.
    */
  def onChange(): Unit = js.native
  def onChange(value: T): Unit = js.native
  
  var options: js.UndefOr[js.Array[Option[T]]] = js.native
  
  /**
    * The value property of the currently selected option.
    */
  var selected: js.UndefOr[T] = js.native
}
