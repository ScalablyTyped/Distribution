package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonMetadata")
@js.native
class JsonMetadata () extends StObject {
  
  def addAlterNativeClassName(name: String, alternativeName: String): Unit = js.native
  
  def addClass(name: String, properties: js.Array[js.Any]): JsonMetadataClass = js.native
  def addClass(
    name: String,
    properties: js.Array[js.Any],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], js.Any]
  ): JsonMetadataClass = js.native
  def addClass(
    name: String,
    properties: js.Array[js.Any],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], js.Any],
    parentName: String
  ): JsonMetadataClass = js.native
  def addClass(name: String, properties: js.Array[js.Any], creator: Unit, parentName: String): JsonMetadataClass = js.native
  
  def addProperties(className: String, propertiesInfos: js.Array[js.Any]): Unit = js.native
  
  def addProperty(className: String, propertyInfo: js.Any): JsonObjectProperty = js.native
  
  def createClass(name: String): js.Any = js.native
  def createClass(name: String, json: js.Any): js.Any = js.native
  
  def findClass(name: String): JsonMetadataClass = js.native
  
  def findProperties(className: String, propertyNames: js.Array[String]): js.Array[JsonObjectProperty] = js.native
  
  def findProperty(className: String, propertyName: String): JsonObjectProperty = js.native
  
  def generateSchema(): js.Any = js.native
  def generateSchema(className: String): js.Any = js.native
  
  def getAllClasses(): js.Array[String] = js.native
  
  def getAllPropertiesByName(propertyName: String): js.Array[JsonObjectProperty] = js.native
  
  def getChildrenClasses(name: String): js.Array[JsonMetadataClass] = js.native
  def getChildrenClasses(name: String, canBeCreated: Boolean): js.Array[JsonMetadataClass] = js.native
  
  def getDynamicPropertiesByObj(obj: js.Any): js.Array[JsonObjectProperty] = js.native
  def getDynamicPropertiesByObj(obj: js.Any, dynamicType: String): js.Array[JsonObjectProperty] = js.native
  
  def getProperties(className: String): js.Array[JsonObjectProperty] = js.native
  
  def getPropertiesByObj(obj: js.Any): js.Array[JsonObjectProperty] = js.native
  
  def getRequiredProperties(name: String): js.Array[String] = js.native
  
  def isDescendantOf(className: String, ancestorClassName: String): Boolean = js.native
  
  def overrideClassCreator(name: String, creator: js.Function0[js.Any]): Unit = js.native
  
  def overrideClassCreatore(name: String, creator: js.Function0[js.Any]): Unit = js.native
  
  def removeClass(name: String): Unit = js.native
  
  def removeProperty(className: String, propertyName: String): Boolean = js.native
}
