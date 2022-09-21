package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ButtonGroupItemValue")
@js.native
open class ButtonGroupItemValue protected () extends ItemValue {
  def this(value: Any) = this()
  def this(value: Any, text: String) = this()
  def this(value: Any, text: String, typeName: String) = this()
  def this(value: Any, text: Unit, typeName: String) = this()
  
  var iconName: String = js.native
  
  var iconSize: Double = js.native
  
  /*
    * By default item caption is visible.
    * Set it 'false' to hide item caption.
    */
  var showCaption: Boolean = js.native
}
