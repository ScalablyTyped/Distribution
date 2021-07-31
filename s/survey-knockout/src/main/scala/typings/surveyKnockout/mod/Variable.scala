package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Variable")
@js.native
class Variable protected () extends Const {
  def this(variableName: String) = this()
  
  val variable: String = js.native
}
/* static members */
object Variable {
  
  @JSImport("survey-knockout", "Variable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Variable.DisableConversionChar")
  @js.native
  def DisableConversionChar: String = js.native
  @scala.inline
  def DisableConversionChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisableConversionChar")(x.asInstanceOf[js.Any])
}
