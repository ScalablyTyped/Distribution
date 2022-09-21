package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ItemValue")
@js.native
open class ItemValue protected ()
  extends Base
     with ILocalizableOwner
     with IShortcutText {
  def this(value: Any) = this()
  def this(value: Any, text: String) = this()
  def this(value: Any, text: String, typeName: String) = this()
  def this(value: Any, text: Unit, typeName: String) = this()
  
  var _locOwner: ILocalizableOwner = js.native
  
  def calculatedText: String = js.native
  
  var enableConditionRunner: ConditionRunner = js.native
  
  def enableIf: String = js.native
  def enableIf_=(`val`: String): Unit = js.native
  
  /* protected */ def getConditionRunner(isVisible: Boolean): ConditionRunner = js.native
  
  def getData(): Any = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def hasText: Boolean = js.native
  
  def isEnabled: Any = js.native
  
  def isVisible: Any = js.native
  
  def locOwner: ILocalizableOwner = js.native
  def locOwner_=(`val`: ILocalizableOwner): Unit = js.native
  
  def locText: LocalizableString = js.native
  
  var locTextValue: LocalizableString = js.native
  
  def onCreating(): Any = js.native
  
  var originalItem: Any = js.native
  
  var ownerPropertyName: String = js.native
  
  def pureText: String = js.native
  def pureText_=(`val`: String): Unit = js.native
  
  def setData(value: Any): Unit = js.native
  
  def setIsEnabled(`val`: Boolean): Unit = js.native
  
  def setIsVisible(`val`: Boolean): Unit = js.native
  
  def setLocText(locText: LocalizableString): Unit = js.native
  
  /* CompleteClass */
  var shortcutText: String = js.native
  @JSName("shortcutText")
  def shortcutText_MItemValue: String = js.native
  
  def text: String = js.native
  def text_=(`val`: String): Unit = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
  
  var visibleConditionRunner: ConditionRunner = js.native
  
  def visibleIf: String = js.native
  def visibleIf_=(`val`: String): Unit = js.native
}
/* static members */
object ItemValue {
  
  @JSImport("survey-knockout", "ItemValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getData(items: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(items.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getItemByValue(items: Any, `val`: Any): ItemValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemByValue")(items.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[ItemValue]
  
  inline def getTextOrHtmlByValue(items: Any, `val`: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextOrHtmlByValue")(items.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def locStrsChanged(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locStrsChanged")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runConditionsForItems(items: Any, filteredItems: Any, runner: ConditionRunner, values: Any, properties: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runConditionsForItems(
    items: Any,
    filteredItems: Any,
    runner: ConditionRunner,
    values: Any,
    properties: Any,
    useItemExpression: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], useItemExpression.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runConditionsForItems(
    items: Any,
    filteredItems: Any,
    runner: ConditionRunner,
    values: Any,
    properties: Any,
    useItemExpression: Boolean,
    onItemCallBack: js.Function2[/* item */ this.type, /* val */ Boolean, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], useItemExpression.asInstanceOf[js.Any], onItemCallBack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runConditionsForItems(
    items: Any,
    filteredItems: Any,
    runner: ConditionRunner,
    values: Any,
    properties: Any,
    useItemExpression: Unit,
    onItemCallBack: js.Function2[/* item */ this.type, /* val */ Boolean, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runConditionsForItems")(items.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], useItemExpression.asInstanceOf[js.Any], onItemCallBack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runEnabledConditionsForItems(items: Any, runner: ConditionRunner, values: Any, properties: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runEnabledConditionsForItems")(items.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def runEnabledConditionsForItems(
    items: Any,
    runner: ConditionRunner,
    values: Any,
    properties: Any,
    onItemCallBack: js.Function2[/* item */ this.type, /* val */ Boolean, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runEnabledConditionsForItems")(items.asInstanceOf[js.Any], runner.asInstanceOf[js.Any], values.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], onItemCallBack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /*
    * Resets the input array and fills it with values from the values array
    */
  inline def setData(items: Any, values: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(items.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setData(items: Any, values: Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(items.asInstanceOf[js.Any], values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
