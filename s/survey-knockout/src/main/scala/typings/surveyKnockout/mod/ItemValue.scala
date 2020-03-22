package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ItemValue")
@js.native
class ItemValue protected ()
  extends Base
     with /* index */ StringDictionary[js.Any] {
  def this(value: js.Any) = this()
  def this(value: js.Any, text: String) = this()
  def this(value: js.Any, text: String, typeName: String) = this()
  val calculatedText: String = js.native
  val hasText: Boolean = js.native
  val isEnabled: js.Any = js.native
  val isVisible: Boolean = js.native
  var locOwner: ILocalizableOwner = js.native
  val locText: LocalizableString = js.native
  var text: String = js.native
  var value: js.Any = js.native
  var visibleIf: String = js.native
  /* protected */ def getConditionRunner(isVisible: Boolean): ConditionRunner = js.native
  def getData(): js.Any = js.native
  def getLocale(): String = js.native
  def onCreating(): js.Any = js.native
  def setData(value: js.Any): Unit = js.native
  def setIsEnabled(`val`: Boolean): Unit = js.native
  def setIsVisible(`val`: Boolean): Unit = js.native
  def setLocText(locText: LocalizableString): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "ItemValue")
@js.native
object ItemValue extends js.Object {
  var Separator: String = js.native
  def createArray(locOwner: ILocalizableOwner): js.Array[ItemValue] = js.native
  def getData(items: js.Array[ItemValue]): js.Any = js.native
  def getItemByValue(items: js.Array[ItemValue], `val`: js.Any): ItemValue = js.native
  def getTextOrHtmlByValue(items: js.Array[ItemValue], `val`: js.Any): String = js.native
  def locStrsChanged(items: js.Array[ItemValue]): Unit = js.native
  def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any
  ): Boolean = js.native
  def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any,
    useItemExpression: Boolean
  ): Boolean = js.native
  def runEnabledConditionsForItems(items: js.Array[ItemValue], runner: ConditionRunner, values: js.Any, properties: js.Any): Boolean = js.native
  def setData(items: js.Array[ItemValue], values: js.Array[_]): Unit = js.native
  def setupArray(items: js.Array[ItemValue], locOwner: ILocalizableOwner): Unit = js.native
}

