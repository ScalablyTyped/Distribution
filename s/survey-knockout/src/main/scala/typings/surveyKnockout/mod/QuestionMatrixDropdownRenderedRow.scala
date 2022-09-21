package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Datasvdroptargetmatrixrow
import typings.surveyKnockout.anon.DatasvdroptargetmatrixrowString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedRow")
@js.native
open class QuestionMatrixDropdownRenderedRow protected () extends Base {
  def this(cssClasses: Any) = this()
  def this(cssClasses: Any, isDetailRow: Boolean) = this()
  
  def attributes: Datasvdroptargetmatrixrow | DatasvdroptargetmatrixrowString = js.native
  
  var cells: Any = js.native
  
  def className: String = js.native
  
  var cssClasses: Any = js.native
  
  def id: Double = js.native
  
  var idValue: Double = js.native
  
  var isAdditionalClasses: Boolean = js.native
  
  var isDetailRow: Boolean = js.native
  
  var isGhostRow: Boolean = js.native
  
  var row: MatrixDropdownRowModelBase = js.native
}
/* static members */
object QuestionMatrixDropdownRenderedRow {
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownRenderedRow")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownRenderedRow.counter")
  @js.native
  def counter: Double = js.native
  inline def counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counter")(x.asInstanceOf[js.Any])
}
