package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionPanelDynamicImplementor")
@js.native
class QuestionPanelDynamicImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  val buttonAddCss: String = js.native
  val buttonNextCss: js.Any = js.native
  val buttonPrevCss: js.Any = js.native
  var koAddPanelClick: js.Any = js.native
  var koButtonAddCss: js.Any = js.native
  var koButtonNextCss: js.Any = js.native
  var koButtonPrevCss: js.Any = js.native
  var koCanAddPanel: js.Any = js.native
  var koCanRemovePanel: js.Any = js.native
  var koIsList: js.Any = js.native
  var koIsNextButton: js.Any = js.native
  var koIsPrevButton: js.Any = js.native
  var koIsProgressBottom: js.Any = js.native
  var koIsProgressTop: js.Any = js.native
  var koIsRange: js.Any = js.native
  var koNextPanelClick: js.Any = js.native
  var koPanel: js.Any = js.native
  var koPrevPanelClick: js.Any = js.native
  var koProgress: js.Any = js.native
  var koProgressText: js.Any = js.native
  var koRangeMax: js.Any = js.native
  var koRangeValue: js.Any = js.native
  var koRecalc: js.Any = js.native
  var koRemovePanelClick: js.Any = js.native
  val progress: String = js.native
  /* protected */ def addPanel(): Unit = js.native
  /* protected */ def onCurrentIndexChanged(): Unit = js.native
  /* protected */ def onPanelCountChanged(): Unit = js.native
  /* protected */ def onRenderModeChanged(): Unit = js.native
  /* protected */ def removePanel(`val`: js.Any): Unit = js.native
}

