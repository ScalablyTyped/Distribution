package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrix")
@js.native
class QuestionMatrix protected () extends QuestionMatrixModel {
  def this(name: String) = this()
  var koVisibleColumns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ko.ObservableArray<any> */ js.Any = js.native
  var koVisibleRows: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ko.ObservableArray<MatrixRowModel> */ js.Any = js.native
  def getItemCss(row: js.Any, column: js.Any): String = js.native
}

