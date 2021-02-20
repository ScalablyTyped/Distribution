package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ItemValue")
@js.native
class ItemValue protected ()
  extends Base
     with /* index */ StringDictionary[js.Any] {
  def this(value: js.Any) = this()
  def this(value: js.Any, text: String) = this()
  def this(value: js.Any, text: js.UndefOr[scala.Nothing], typeName: String) = this()
  def this(value: js.Any, text: String, typeName: String) = this()
  
  val calculatedText: String = js.native
  
  /* protected */ def getConditionRunner(isVisible: Boolean): ConditionRunner = js.native
  
  def getData(): js.Any = js.native
  
  def getLocale(): String = js.native
  
  val hasText: Boolean = js.native
  
  val isEnabled: js.Any = js.native
  
  val isVisible: Boolean = js.native
  
  var locOwner: ILocalizableOwner = js.native
  
  val locText: LocalizableString = js.native
  
  def onCreating(): js.Any = js.native
  
  var originalItem: js.Any = js.native
  
  var ownerPropertyName: String = js.native
  
  def setData(value: js.Any): Unit = js.native
  
  def setIsEnabled(`val`: Boolean): Unit = js.native
  
  def setIsVisible(`val`: Boolean): Unit = js.native
  
  def setLocText(locText: LocalizableString): Unit = js.native
  
  var text: String = js.native
  
  var typeName: String = js.native
  
  var value: js.Any = js.native
  
  var visibleIf: String = js.native
}
/* static members */
object ItemValue {
  
  @JSImport("survey-knockout", "ItemValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ItemValue.Separator")
  @js.native
  def Separator: String = js.native
  @scala.inline
  def Separator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "ItemValue.createArray")
  @js.native
  def createArray(locOwner: ILocalizableOwner): js.Array[ItemValue] = js.native
  
  @JSImport("survey-knockout", "ItemValue.getData")
  @js.native
  def getData(items: js.Array[ItemValue]): js.Any = js.native
  
  @JSImport("survey-knockout", "ItemValue.getItemByValue")
  @js.native
  def getItemByValue(items: js.Array[ItemValue], `val`: js.Any): ItemValue = js.native
  
  @JSImport("survey-knockout", "ItemValue.getTextOrHtmlByValue")
  @js.native
  def getTextOrHtmlByValue(items: js.Array[ItemValue], `val`: js.Any): String = js.native
  
  @JSImport("survey-knockout", "ItemValue.locStrsChanged")
  @js.native
  def locStrsChanged(items: js.Array[ItemValue]): Unit = js.native
  
  @JSImport("survey-knockout", "ItemValue.runConditionsForItems")
  @js.native
  def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any
  ): Boolean = js.native
  @JSImport("survey-knockout", "ItemValue.runConditionsForItems")
  @js.native
  def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any,
    useItemExpression: Boolean
  ): Boolean = js.native
  
  @JSImport("survey-knockout", "ItemValue.runEnabledConditionsForItems")
  @js.native
  def runEnabledConditionsForItems(items: js.Array[ItemValue], runner: ConditionRunner, values: js.Any, properties: js.Any): Boolean = js.native
  @JSImport("survey-knockout", "ItemValue.runEnabledConditionsForItems")
  @js.native
  def runEnabledConditionsForItems(
    items: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any,
    onItemCallBack: js.Function1[/* item */ this.type, Boolean]
  ): Boolean = js.native
  
  @JSImport("survey-knockout", "ItemValue.setData")
  @js.native
  def setData(items: js.Array[ItemValue], values: js.Array[_]): Unit = js.native
  
  @JSImport("survey-knockout", "ItemValue.setupArray")
  @js.native
  def setupArray(items: js.Array[ItemValue], locOwner: ILocalizableOwner): Unit = js.native
}
