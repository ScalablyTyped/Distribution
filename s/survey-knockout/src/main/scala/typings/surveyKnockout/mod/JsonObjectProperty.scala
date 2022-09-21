package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonObjectProperty")
@js.native
open class JsonObjectProperty protected ()
  extends StObject
     with IObject {
  def this(classInfo: JsonMetadataClass, name: String) = this()
  def this(classInfo: JsonMetadataClass, name: String, isRequired: Boolean) = this()
  
  def addDependedProperty(name: String): Unit = js.native
  
  var alternativeName: String = js.native
  
  var baseClassName: String = js.native
  
  var baseValue: Any = js.native
  
  var category: String = js.native
  
  var categoryIndex: Double = js.native
  
  /*
    * Depricated, please use getChoices
    */
  def choices: Any = js.native
  
  var choicesValue: Any = js.native
  
  def choicesfunc(obj: Any, choicesCallback: Any): Any = js.native
  
  def classInfo: JsonMetadataClass = js.native
  
  var classInfoValue: JsonMetadataClass = js.native
  
  var className: String = js.native
  
  var classNamePart: String = js.native
  
  def dataList: Any = js.native
  
  var dataListValue: Any = js.native
  
  def dataList_=(`val`: Any): Unit = js.native
  
  def defaultValue: Any = js.native
  
  var defaultValueValue: Any = js.native
  
  def defaultValue_=(`val`: Any): Unit = js.native
  
  var dependedProperties: Any = js.native
  
  var displayName: String = js.native
  
  def getBaseValue(): String = js.native
  
  def getChoices(obj: Any): js.Array[Any] = js.native
  def getChoices(obj: Any, choicesCallback: Any): js.Array[Any] = js.native
  
  def getClassName(className: String): String = js.native
  
  def getDependedProperties(): js.Array[Any] = js.native
  
  def getObjType(objType: String): Any = js.native
  
  def getPropertyValue(obj: Any): Any = js.native
  
  def getValue(obj: Any): Any = js.native
  
  def hasChoices: Boolean = js.native
  
  def hasToUseGetValue: Any = js.native
  
  def hasToUseSetValue: Any = js.native
  
  def id: Double = js.native
  
  var idValue: Double = js.native
  
  var isArray: Boolean = js.native
  
  var isBindable: Boolean = js.native
  
  var isCustom: Boolean = js.native
  
  def isDefaultValue(value: Any): Boolean = js.native
  
  var isDynamicChoices: Boolean = js.native
  
  var isLightSerializable: Boolean = js.native
  
  def isLocalizable: Boolean = js.native
  
  var isLocalizableValue: Boolean = js.native
  
  def isLocalizable_=(`val`: Boolean): Unit = js.native
  
  def isRequired: Boolean = js.native
  
  var isRequiredValue: Boolean = js.native
  
  def isRequired_=(`val`: Boolean): Unit = js.native
  
  var isSerializable: Boolean = js.native
  
  def isUnique: Boolean = js.native
  
  var isUniqueValue: Boolean = js.native
  
  def isUnique_=(`val`: Boolean): Unit = js.native
  
  def isVisible(layout: String): Boolean = js.native
  def isVisible(layout: String, obj: Any): Boolean = js.native
  
  var layout: String = js.native
  
  var maxLength: Double = js.native
  
  var maxValue: Any = js.native
  
  def mergeWith(prop: JsonObjectProperty): Unit = js.native
  
  var minValue: Any = js.native
  
  var name: String = js.native
  
  var nextToProperty: String = js.native
  
  def onExecuteExpression(obj: Any, res: Any): Any = js.native
  
  def onGetValue(obj: Any): Any = js.native
  
  def onPropertyEditorUpdate(obj: Any, propEditor: Any): Any = js.native
  
  def onSetValue(obj: Any, value: Any, jsonConv: JsonObject): Any = js.native
  
  def onSettingValue(obj: Any, value: Any): Any = js.native
  
  def readOnly: Boolean = js.native
  
  var readOnlyValue: Boolean = js.native
  
  def readOnly_=(`val`: Boolean): Unit = js.native
  
  def schemaType(): String = js.native
  
  var serializationProperty: String = js.native
  
  def setBaseValue(`val`: Any): Unit = js.native
  
  def setChoices(value: Any): Unit = js.native
  def setChoices(value: Any, valueFunc: js.Function1[/* obj */ Any, Any]): Unit = js.native
  
  def setValue(obj: Any, value: Any, jsonConv: JsonObject): Unit = js.native
  
  def settingValue(obj: Any, value: Any): Any = js.native
  
  var showMode: String = js.native
  
  def `type`: String = js.native
  
  var typeValue: String = js.native
  
  def type_=(`val`: String): Unit = js.native
  
  def uniquePropertyName: String = js.native
  def uniquePropertyName_=(`val`: String): Unit = js.native
  
  var uniquePropertyValue: String = js.native
  
  def visible: Boolean = js.native
  
  def visibleIf(obj: Any): Boolean = js.native
  
  var visibleIndex: Double = js.native
  
  var visibleValue: Boolean = js.native
  
  def visible_=(`val`: Boolean): Unit = js.native
}
/* static members */
object JsonObjectProperty {
  
  @JSImport("survey-knockout", "JsonObjectProperty")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "JsonObjectProperty.Index")
  @js.native
  def Index: Double = js.native
  inline def Index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Index")(x.asInstanceOf[js.Any])
  
  inline def getItemValuesDefaultValue(`val`: Any, `type`: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemValuesDefaultValue")(`val`.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("survey-knockout", "JsonObjectProperty.mergableValues")
  @js.native
  def mergableValues: Any = js.native
  inline def mergableValues_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergableValues")(x.asInstanceOf[js.Any])
}
