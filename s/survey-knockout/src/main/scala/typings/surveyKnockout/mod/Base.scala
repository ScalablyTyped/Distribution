package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Base")
@js.native
open class Base () extends StObject {
  
  /* protected */ def AddLocStringToUsedLocales(locStr: LocalizableString, locales: Any): Unit = js.native
  
  /* protected */ def addEvent[T](): EventBase[T] = js.native
  
  def addExpressionProperty(name: String, onExecute: js.Function2[/* obj */ this.type, /* res */ Any, Unit]): Unit = js.native
  def addExpressionProperty(
    name: String,
    onExecute: js.Function2[/* obj */ this.type, /* res */ Any, Unit],
    canRun: js.Function1[/* obj */ this.type, Boolean]
  ): Unit = js.native
  
  def addUsedLocales(locales: Any): Unit = js.native
  
  var arraysInfo: Any = js.native
  
  def bindings: Bindings = js.native
  
  var bindingsValue: Bindings = js.native
  
  /* protected */ def canRunConditions(): Boolean = js.native
  
  def checkBindings(valueName: String, value: Any): Unit = js.native
  
  /* protected */ def clearPropertyValue(name: String): Unit = js.native
  
  /* protected */ def copyCssClasses(dest: Any, source: Any): Unit = js.native
  
  def createArrayCoreHandler(propertiesHash: Any, name: String): Any = js.native
  
  def createCustomLocalizableObj(name: String): Unit = js.native
  
  /* protected */ def createItemValues(name: String): js.Array[Any] = js.native
  
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Boolean): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Boolean, defaultStr: String): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Boolean, defaultStr: Boolean): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Unit, defaultStr: String): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Unit, defaultStr: Boolean): LocalizableString = js.native
  
  /* protected */ def createNewArray(name: String): js.Array[Any] = js.native
  /* protected */ def createNewArray(name: String, onPush: Any): js.Array[Any] = js.native
  /* protected */ def createNewArray(name: String, onPush: Any, onRemove: Any): js.Array[Any] = js.native
  /* protected */ def createNewArray(name: String, onPush: Unit, onRemove: Any): js.Array[Any] = js.native
  
  /* protected */ def createNewArrayCore(name: String): js.Array[Any] = js.native
  
  def dispose(): Unit = js.native
  
  def endLoadingFromJson(): Unit = js.native
  
  /* protected */ def ensureArray(name: String): Any = js.native
  /* protected */ def ensureArray(name: String, onPush: Any): Any = js.native
  /* protected */ def ensureArray(name: String, onPush: Any, onRemove: Any): Any = js.native
  /* protected */ def ensureArray(name: String, onPush: Unit, onRemove: Any): Any = js.native
  
  var eventList: Any = js.native
  
  var expressionInfo: Any = js.native
  
  /*
    * Assigns a new configuration to the current SurveyJS object. This configuration is taken from a passed JSON object.
    * 
    * The JSON object should contain only serializable properties of this SurveyJS object. Event handlers and properties that do not belong to the SurveyJS object are ignored.
    */
  def fromJSON(json: Any): Unit = js.native
  
  def geValueFromHash(): Any = js.native
  
  def getDataFilteredProperties(): Any = js.native
  
  def getDataFilteredValues(): Any = js.native
  
  def getElementsInDesign(): js.Array[IElement] = js.native
  def getElementsInDesign(includeHidden: Boolean): js.Array[IElement] = js.native
  
  /* protected */ def getIsLoadingFromJson(): Boolean = js.native
  
  /* protected */ def getItemValueType(): String = js.native
  
  def getLocale(): String = js.native
  
  def getLocalizableString(name: String): LocalizableString = js.native
  
  def getLocalizableStringText(name: String): String = js.native
  def getLocalizableStringText(name: String, defaultStr: String): String = js.native
  
  def getLocalizationFormatString(strName: String, args: Any): String = js.native
  
  def getLocalizationString(strName: String): String = js.native
  
  def getProgressInfo(): IProgressInfo = js.native
  
  /*
    * Returns a `JsonObjectProperty` object with metadata about a serializable property that belongs to the current SurveyJS object.
    * 
    * If the property is not found, this method returns `null`.
    */
  def getPropertyByName(propName: String): JsonObjectProperty = js.native
  
  /*
    * Returns the value of a property with a specified name.
    * 
    * If the property is not found or does not have a value, this method returns either `undefined`, `defaultValue` specified in the property configuration, or a value passed as the `defaultValue` parameter.
    */
  def getPropertyValue(name: String): Any = js.native
  def getPropertyValue(name: String, defaultValue: Any): Any = js.native
  
  /* protected */ def getPropertyValueCore(propertiesHash: Any, name: String): Any = js.native
  
  def getPropertyValueCoreHandler(propertiesHash: Any, name: String): Any = js.native
  
  /* protected */ def getSearchableItemValueKeys(keys: Any): Unit = js.native
  
  /* protected */ def getSearchableLocKeys(keys: Any): Unit = js.native
  
  def getSurvey(): ISurvey = js.native
  def getSurvey(isLive: Boolean): ISurvey = js.native
  
  def getTemplate(): String = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  def getType(): String = js.native
  
  /*
    * Returns `true` if the object is included in a survey.
    * 
    * This property may return `false`, for example, when you [create a survey model dynamically](https://surveyjs.io/form-library/documentation/design-survey-create-a-simple-survey#create-or-change-a-survey-model-dynamically).
    */
  def inSurvey: Boolean = js.native
  
  var isCreating: Boolean = js.native
  
  /*
    * Use this method to find out if the current object is of a given `typeName` or inherited from it.
    */
  def isDescendantOf(typeName: String): Boolean = js.native
  
  /*
    * Returns `true` if the survey is being designed in Survey Creator.
    */
  def isDesignMode: Boolean = js.native
  
  def isDisposed: Boolean = js.native
  
  var isDisposedValue: Boolean = js.native
  
  def isEditingSurveyElement: Boolean = js.native
  
  /* protected */ def isInternal: Boolean = js.native
  
  /*
    * Returns `true` if the object configuration is being loaded from JSON.
    */
  def isLoadingFromJson: Boolean = js.native
  
  /* protected */ var isLoadingFromJsonValue: Boolean = js.native
  
  /* protected */ def isPropertyEmpty(value: Any): Boolean = js.native
  
  def isPropertyVisible(propName: String): Boolean = js.native
  
  /* protected */ def isTwoValueEquals(x: Any, y: Any): Boolean = js.native
  /* protected */ def isTwoValueEquals(x: Any, y: Any, caseInSensitive: Boolean): Boolean = js.native
  /* protected */ def isTwoValueEquals(x: Any, y: Any, caseInSensitive: Boolean, trimString: Boolean): Boolean = js.native
  /* protected */ def isTwoValueEquals(x: Any, y: Any, caseInSensitive: Unit, trimString: Boolean): Boolean = js.native
  
  /*
    * Returns `true` if a passed `value` is an empty string, array, or object or if it equals to `undefined` or `null`.
    */
  def isValueEmpty(value: Any): Boolean = js.native
  def isValueEmpty(value: Any, trimString: Boolean): Boolean = js.native
  
  def itemValuePropertyChanged(item: ItemValue, name: String, oldValue: Any, newValue: Any): Unit = js.native
  
  def iteratePropertiesHash(func: js.Function2[/* hash */ Any, /* key */ Any, Unit]): Unit = js.native
  
  var loadingOwner: Base = js.native
  
  def locStrsChanged(): Unit = js.native
  
  def localeChanged(): Unit = js.native
  
  var localizableStrings: Any = js.native
  
  /* protected */ def onBaseCreating(): Unit = js.native
  
  def onBindingChanged(oldValue: Any, newValue: Any): Unit = js.native
  
  /*
    * An event that is raised when an [ItemValue](https://surveyjs.io/form-library/documentation/itemvalue) property is changed.
    * 
    * Parameters:
    * 
    * - `sender` - A SurveyJS object whose property contains an array of `ItemValue` objects.
    * - `options.obj` - An `ItemValue` object.
    * - `options.propertyName` - The name of the property to which an array of `ItemValue` objects is assigned (for example, `"choices"` or `"rows"`).
    * - `options.name` - The name of the changed property: `"text"` or `"value"`.
    * - `options.newValue` - A new value for the property.
    */
  var onItemValuePropertyChanged: Event[js.Function2[/* sender */ this.type, /* options */ Any, Any], Any] = js.native
  
  var onPropChangeFunctions: Any = js.native
  
  /*
    * An event that is raised when a property of this SurveyJS object has changed.
    * 
    * Parameters:
    * 
    * - `sender` - A SurveyJS object whose property has changed.
    * - `options.name` - The name of the changed property.
    * - `options.oldValue` - An old value of the property. If the property is an array, `oldValue` contains the same array as `newValue` does.
    * - `options.newValue` - A new value for the property.
    */
  var onPropertyChanged: EventBase[Base] = js.native
  
  /* protected */ def onPropertyValueChanged(name: String, oldValue: Any, newValue: Any): Unit = js.native
  
  def onPropertyValueChangedCallback(name: String, oldValue: Any, newValue: Any, sender: Base, arrayChanges: ArrayChanges): Unit = js.native
  
  def onSurveyLoad(): Unit = js.native
  
  var propertyHash: Any = js.native
  
  /* protected */ def propertyValueChanged(name: String, oldValue: Any, newValue: Any): Unit = js.native
  /* protected */ def propertyValueChanged(name: String, oldValue: Any, newValue: Any, arrayChanges: Unit, target: Base): Unit = js.native
  /* protected */ def propertyValueChanged(name: String, oldValue: Any, newValue: Any, arrayChanges: ArrayChanges): Unit = js.native
  /* protected */ def propertyValueChanged(name: String, oldValue: Any, newValue: Any, arrayChanges: ArrayChanges, target: Base): Unit = js.native
  
  def registerFunctionOnPropertiesValueChanged(names: Any, func: Any): Unit = js.native
  def registerFunctionOnPropertiesValueChanged(names: Any, func: Any, key: String): Unit = js.native
  
  def registerFunctionOnPropertyValueChanged(name: String, func: Any): Unit = js.native
  def registerFunctionOnPropertyValueChanged(name: String, func: Any, key: String): Unit = js.native
  
  /*
    * Registers a function to call when a property value changes.
    */
  def registerPropertyChangedHandlers(propertyNames: Any, handler: Any): Unit = js.native
  def registerPropertyChangedHandlers(propertyNames: Any, handler: Any, key: String): Unit = js.native
  
  /* protected */ def runConditionCore(values: Any, properties: Any): Unit = js.native
  
  def searchText(text: String, founded: Any): Unit = js.native
  
  /* protected */ def setArray(name: String, src: Any, dest: Any, isItemValues: Boolean, onPush: Any): Unit = js.native
  
  /* protected */ def setArrayPropertyDirectly(name: String, `val`: Any): Unit = js.native
  /* protected */ def setArrayPropertyDirectly(name: String, `val`: Any, sendNotification: Boolean): Unit = js.native
  
  def setLocalizableStringText(name: String, value: String): Unit = js.native
  
  /*
    * Assigns a new value to a specified property.
    */
  def setPropertyValue(name: String, `val`: Any): Unit = js.native
  
  /* protected */ def setPropertyValueCore(propertiesHash: Any, name: String, `val`: Any): Unit = js.native
  
  def setPropertyValueCoreHandler(propertiesHash: Any, name: String, `val`: Any): Unit = js.native
  
  /* protected */ def setPropertyValueDirectly(name: String, `val`: Any): Unit = js.native
  
  def startLoadingFromJson(): Unit = js.native
  def startLoadingFromJson(json: Any): Unit = js.native
  
  var surveyChangedCallback: Any = js.native
  
  /*
    * Returns a JSON object that corresponds to the current SurveyJS object.
    */
  def toJSON(): Any = js.native
  
  /* protected */ def trimValue(value: Any): Any = js.native
  
  def unRegisterFunctionOnPropertiesValueChanged(names: Any): Unit = js.native
  def unRegisterFunctionOnPropertiesValueChanged(names: Any, key: String): Unit = js.native
  
  def unRegisterFunctionOnPropertyValueChanged(name: String): Unit = js.native
  def unRegisterFunctionOnPropertyValueChanged(name: String, key: String): Unit = js.native
  
  /*
    * Unregisters value change event handlers for the specified properties.
    */
  def unregisterPropertyChangedHandlers(propertyNames: Any): Unit = js.native
  def unregisterPropertyChangedHandlers(propertyNames: Any, key: String): Unit = js.native
  
  /* protected */ def updateBindingValue(valueName: String, value: Any): Unit = js.native
  
  /* protected */ def updateBindings(propertyName: String, value: Any): Unit = js.native
}
/* static members */
object Base {
  
  @JSImport("survey-knockout", "Base")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createItemValue(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createItemValue")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createItemValue(item: Any, `type`: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createItemValue")(item.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createProgressInfo(): IProgressInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgressInfo")().asInstanceOf[IProgressInfo]
  
  @JSImport("survey-knockout", "Base.currentDependencis")
  @js.native
  def currentDependencis: Dependencies = js.native
  inline def currentDependencis_=(x: Dependencies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentDependencis")(x.asInstanceOf[js.Any])
  
  inline def finishCollectDependencies(): Dependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("finishCollectDependencies")().asInstanceOf[Dependencies]
  
  inline def itemValueLocStrChanged(arr: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("itemValueLocStrChanged")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startCollectDependencies(updater: Any, target: Base, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCollectDependencies")(updater.asInstanceOf[js.Any], target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
