package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonMetadata")
@js.native
open class JsonMetadata () extends StObject {
  
  def addAlterNativeClassName(name: String, alternativeName: String): Unit = js.native
  
  def addClass(name: String, properties: Any): JsonMetadataClass = js.native
  def addClass(name: String, properties: Any, creator: js.Function1[/* json */ js.UndefOr[Any], Any]): JsonMetadataClass = js.native
  def addClass(
    name: String,
    properties: Any,
    creator: js.Function1[/* json */ js.UndefOr[Any], Any],
    parentName: String
  ): JsonMetadataClass = js.native
  def addClass(name: String, properties: Any, creator: Unit, parentName: String): JsonMetadataClass = js.native
  
  def addProperties(className: String, propertiesInfos: Any): Unit = js.native
  
  def addProperty(className: String, propertyInfo: Any): JsonObjectProperty = js.native
  
  var alternativeNames: Any = js.native
  
  var childrenClasses: Any = js.native
  
  var classHashProperties: Any = js.native
  
  var classProperties: Any = js.native
  
  var classes: Any = js.native
  
  def createClass(name: String): Any = js.native
  def createClass(name: String, json: Any): Any = js.native
  
  def findClass(name: String): JsonMetadataClass = js.native
  
  def findProperties(className: String, propertyNames: Any): js.Array[JsonObjectProperty] = js.native
  
  def findProperty(className: String, propertyName: String): JsonObjectProperty = js.native
  
  def generateSchema(): Any = js.native
  def generateSchema(className: String): Any = js.native
  
  def getAllClasses(): js.Array[Any] = js.native
  
  def getAllPropertiesByName(propertyName: String): js.Array[JsonObjectProperty] = js.native
  
  def getChildrenClasses(name: String): js.Array[JsonMetadataClass] = js.native
  def getChildrenClasses(name: String, canBeCreated: Boolean): js.Array[JsonMetadataClass] = js.native
  
  def getDynamicPropertiesByObj(obj: Any): js.Array[JsonObjectProperty] = js.native
  def getDynamicPropertiesByObj(obj: Any, dynamicType: String): js.Array[JsonObjectProperty] = js.native
  
  def getObjPropertyValue(obj: Any, name: String): Any = js.native
  
  def getOriginalProperty(obj: Base, propName: String): JsonObjectProperty = js.native
  
  def getProperties(className: String): js.Array[JsonObjectProperty] = js.native
  
  def getPropertiesByObj(obj: Any): js.Array[JsonObjectProperty] = js.native
  
  def getProperty(className: String, propertyName: String): JsonObjectProperty = js.native
  
  def getRequiredProperties(name: String): js.Array[Any] = js.native
  
  def hasOriginalProperty(obj: Base, propName: String): Boolean = js.native
  
  def isDescendantOf(className: String, ancestorClassName: String): Boolean = js.native
  
  def onSerializingProperty(obj: Base, prop: JsonObjectProperty, value: Any, json: Any): Boolean = js.native
  
  def overrideClassCreator(name: String, creator: Any): Unit = js.native
  
  def overrideClassCreatore(name: String, creator: Any): Unit = js.native
  
  def removeClass(name: String): Unit = js.native
  
  def removeProperty(className: String, propertyName: String): Boolean = js.native
  
  def setObjPropertyValue(obj: Any, name: String, `val`: Any): Unit = js.native
}
