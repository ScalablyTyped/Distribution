package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("survey-knockout", "JsonObjectProperty")
@js.native
class JsonObjectProperty protected () extends IObject {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, isRequired: scala.Boolean) = this()
  var alternativeName: java.lang.String = js.native
  var baseClassName: java.lang.String = js.native
  /**
    * Depricated, please use getChoices
    */
  val choices: js.Array[_] = js.native
  var className: java.lang.String = js.native
  var classNamePart: java.lang.String = js.native
  var defaultValue: js.Any = js.native
  var defaultValueValue: js.Any = js.native
  val hasChoices: scala.Boolean = js.native
  val hasToUseGetValue: java.lang.String | (js.Function1[/* obj */ js.Any, _]) = js.native
  val hasToUseSetValue: java.lang.String | (js.Function3[/* obj */ js.Any, /* value */ js.Any, /* jsonConv */ JsonObject, _]) = js.native
  var isArray: scala.Boolean = js.native
  var isDynamicChoices: scala.Boolean = js.native
  var isLocalizable: scala.Boolean = js.native
  var isRequired: scala.Boolean = js.native
  var isSerializable: scala.Boolean = js.native
  var layout: java.lang.String = js.native
  var name: java.lang.String = js.native
  var readOnly: scala.Boolean = js.native
  var serializationProperty: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  def getBaseValue(): java.lang.String = js.native
  def getChoices(obj: js.Any): js.Array[_] = js.native
  def getClassName(className: java.lang.String): java.lang.String = js.native
  def getObjType(objType: java.lang.String): java.lang.String = js.native
  def getPropertyValue(obj: js.Any): js.Any = js.native
  def getValue(obj: js.Any): js.Any = js.native
  def isDefaultValue(value: js.Any): scala.Boolean = js.native
  def isVisible(layout: java.lang.String): scala.Boolean = js.native
  def mergeWith(prop: JsonObjectProperty): scala.Unit = js.native
  def onGetValue(obj: js.Any): js.Any = js.native
  def onSetValue(obj: js.Any, value: js.Any, jsonConv: JsonObject): js.Any = js.native
  def setBaseValue(`val`: js.Any): scala.Unit = js.native
  def setChoices(value: js.Array[_], valueFunc: js.Function0[js.Array[_]]): scala.Unit = js.native
  def setValue(obj: js.Any, value: js.Any, jsonConv: JsonObject): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "JsonObjectProperty")
@js.native
object JsonObjectProperty extends js.Object {
  def getItemValuesDefaultValue(`val`: js.Any): js.Any = js.native
}

