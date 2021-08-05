package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("survey-knockout", "ItemValue")
@js.native
class ItemValue protected () extends Base {
  def this(value: js.Any) = this()
  def this(value: js.Any, text: String) = this()
  def this(value: js.Any, text: String, typeName: String) = this()
  def this(value: js.Any, text: Unit, typeName: String) = this()
  
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
  
  /* protected */ var typeName: String = js.native
  
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
  inline def Separator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
  
  inline def createArray(locOwner: ILocalizableOwner): js.Array[ItemValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createArray")(locOwner.asInstanceOf[js.Any]).asInstanceOf[js.Array[ItemValue]]
  
  inline def getData(items: js.Array[ItemValue]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(items.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getItemByValue(items: js.Array[ItemValue], `val`: js.Any): ItemValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemByValue")(items.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[ItemValue]
  
  inline def getTextOrHtmlByValue(items: js.Array[ItemValue], `val`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextOrHtmlByValue")(items.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def locStrsChanged(items: js.Array[ItemValue]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locStrsChanged")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runConditionsForItems(
    items: js.Array[ItemValue],
    filteredItems: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any,
    useItemExpression: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], useItemExpression.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runEnabledConditionsForItems(items: js.Array[ItemValue], runner: ConditionRunner, values: js.Any, properties: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runEnabledConditionsForItems")(items.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runEnabledConditionsForItems(
    items: js.Array[ItemValue],
    runner: ConditionRunner,
    values: js.Any,
    properties: js.Any,
    onItemCallBack: js.Function1[/* item */ this.type, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runEnabledConditionsForItems")(items.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], onItemCallBack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setData(items: js.Array[ItemValue], values: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(items.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupArray(items: js.Array[ItemValue], locOwner: ILocalizableOwner): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupArray")(items.asInstanceOf[js.Any], locOwner.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
