package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Variable")
@js.native
open class Variable protected () extends Const {
  def this(variableName: String) = this()
  
  var useValueAsItIs: Boolean = js.native
  
  var valueInfo: Any = js.native
  
  def variable: String = js.native
}
