package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ItemValue")
@js.native
class ItemValue protected ()
  extends Base
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(value: js.Any) = this()
  def this(value: js.Any, text: java.lang.String) = this()
  def this(value: js.Any, text: java.lang.String, typeName: java.lang.String) = this()
  val hasText: scala.Boolean = js.native
  val isEnabled: js.Any = js.native
  val isVisible: scala.Boolean = js.native
  var locOwner: ILocalizableOwner = js.native
  val locText: LocalizableString = js.native
  var text: java.lang.String = js.native
  var value: js.Any = js.native
  var visibleIf: java.lang.String = js.native
  /* protected */ def getConditionRunner(isVisible: scala.Boolean): ConditionRunner = js.native
  def getData(): js.Any = js.native
  def onCreating(): js.Any = js.native
  def setData(value: js.Any): scala.Unit = js.native
  def setIsEnabled(`val`: scala.Boolean): scala.Unit = js.native
  def setIsVisible(`val`: scala.Boolean): scala.Unit = js.native
  def setLocText(locText: LocalizableString): scala.Unit = js.native
}

@JSImport("survey-knockout", "ItemValue")
@js.native
object ItemValue extends js.Object {
  var Separator: java.lang.String = js.native
  def createArray(locOwner: surveyDashKnockoutLib.surveyDashKnockoutMod.ILocalizableOwner): js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue] = js.native
  def getData(items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue]): js.Any = js.native
  def getItemByValue(items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue], `val`: js.Any): surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue = js.native
  def getTextOrHtmlByValue(items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue], `val`: js.Any): java.lang.String = js.native
  def locStrsChanged(items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue]): scala.Unit = js.native
  def runConditionsForItems(
    items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue],
    filteredItems: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue],
    runner: surveyDashKnockoutLib.surveyDashKnockoutMod.ConditionRunner,
    values: js.Any,
    properties: js.Any
  ): scala.Boolean = js.native
  def runEnabledConditionsForItems(
    items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue],
    runner: surveyDashKnockoutLib.surveyDashKnockoutMod.ConditionRunner,
    values: js.Any,
    properties: js.Any
  ): scala.Boolean = js.native
  def setData(items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue], values: js.Array[_]): scala.Unit = js.native
  def setupArray(
    items: js.Array[surveyDashKnockoutLib.surveyDashKnockoutMod.ItemValue],
    locOwner: surveyDashKnockoutLib.surveyDashKnockoutMod.ILocalizableOwner
  ): scala.Unit = js.native
}

