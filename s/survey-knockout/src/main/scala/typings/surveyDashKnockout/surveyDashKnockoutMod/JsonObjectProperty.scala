package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("survey-knockout", "JsonObjectProperty")
@js.native
class JsonObjectProperty protected () extends IObject {
  def this(name: String) = this()
  def this(name: String, isRequired: Boolean) = this()
  var alternativeName: String = js.native
  var baseClassName: String = js.native
  /**
    * Depricated, please use getChoices
    */
  val choices: js.Array[_] = js.native
  var className: String = js.native
  var classNamePart: String = js.native
  var defaultValue: js.Any = js.native
  var defaultValueValue: js.Any = js.native
  val hasChoices: Boolean = js.native
  val hasToUseGetValue: String | (js.Function1[/* obj */ js.Any, _]) = js.native
  val hasToUseSetValue: String | (js.Function3[/* obj */ js.Any, /* value */ js.Any, /* jsonConv */ JsonObject, _]) = js.native
  var isArray: Boolean = js.native
  var isCustom: Boolean = js.native
  var isDynamicChoices: Boolean = js.native
  var isLightSerializable: Boolean = js.native
  var isLocalizable: Boolean = js.native
  var isRequired: Boolean = js.native
  var isSerializable: Boolean = js.native
  var layout: String = js.native
  var name: String = js.native
  var readOnly: Boolean = js.native
  var serializationProperty: String = js.native
  var `type`: String = js.native
  var visible: Boolean = js.native
  def addDependedProperty(name: String): Unit = js.native
  def getBaseValue(): String = js.native
  def getChoices(obj: js.Any): js.Array[_] = js.native
  def getChoices(obj: js.Any, choicesCallback: js.Any): js.Array[_] = js.native
  def getClassName(className: String): String = js.native
  def getDependedProperties(): js.Array[String] = js.native
  def getObjType(objType: String): String = js.native
  def getPropertyValue(obj: js.Any): js.Any = js.native
  def getValue(obj: js.Any): js.Any = js.native
  def isDefaultValue(value: js.Any): Boolean = js.native
  def isVisible(layout: String): Boolean = js.native
  def isVisible(layout: String, obj: js.Any): Boolean = js.native
  def mergeWith(prop: JsonObjectProperty): Unit = js.native
  def onGetValue(obj: js.Any): js.Any = js.native
  def onSetValue(obj: js.Any, value: js.Any, jsonConv: JsonObject): js.Any = js.native
  def setBaseValue(`val`: js.Any): Unit = js.native
  def setChoices(value: js.Array[_], valueFunc: js.Function0[js.Array[_]]): Unit = js.native
  def setValue(obj: js.Any, value: js.Any, jsonConv: JsonObject): Unit = js.native
  def visibleIf(obj: js.Any): Boolean = js.native
}

/* static members */
@JSImport("survey-knockout", "JsonObjectProperty")
@js.native
object JsonObjectProperty extends js.Object {
  def getItemValuesDefaultValue(`val`: js.Any): js.Any = js.native
}

