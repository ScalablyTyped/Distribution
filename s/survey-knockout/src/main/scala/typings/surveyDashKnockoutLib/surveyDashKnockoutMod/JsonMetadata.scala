package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "JsonMetadata")
@js.native
class JsonMetadata () extends js.Object {
  def addAlterNativeClassName(name: java.lang.String, alternativeName: java.lang.String): scala.Unit = js.native
  def addClass(name: java.lang.String, properties: js.Array[_]): JsonMetadataClass = js.native
  def addClass(
    name: java.lang.String,
    properties: js.Array[_],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], _]
  ): JsonMetadataClass = js.native
  def addClass(
    name: java.lang.String,
    properties: js.Array[_],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], _],
    parentName: java.lang.String
  ): JsonMetadataClass = js.native
  def addProperties(className: java.lang.String, propertiesInfos: js.Array[_]): scala.Unit = js.native
  def addProperty(className: java.lang.String, propertyInfo: js.Any): scala.Unit = js.native
  def createClass(name: java.lang.String): js.Any = js.native
  def createClass(name: java.lang.String, json: js.Any): js.Any = js.native
  def findClass(name: java.lang.String): JsonMetadataClass = js.native
  def findProperties(className: java.lang.String, propertyNames: js.Array[java.lang.String]): js.Array[JsonObjectProperty] = js.native
  def findProperty(className: java.lang.String, propertyName: java.lang.String): JsonObjectProperty = js.native
  def getChildrenClasses(name: java.lang.String): js.Array[JsonMetadataClass] = js.native
  def getChildrenClasses(name: java.lang.String, canBeCreated: scala.Boolean): js.Array[JsonMetadataClass] = js.native
  def getProperties(className: java.lang.String): js.Array[JsonObjectProperty] = js.native
  def getPropertiesByObj(obj: js.Any): js.Array[JsonObjectProperty] = js.native
  def getRequiredProperties(name: java.lang.String): js.Array[java.lang.String] = js.native
  def isDescendantOf(className: java.lang.String, ancestorClassName: java.lang.String): scala.Boolean = js.native
  def overrideClassCreator(name: java.lang.String, creator: js.Function0[_]): scala.Unit = js.native
  def overrideClassCreatore(name: java.lang.String, creator: js.Function0[_]): scala.Unit = js.native
  def removeClass(name: java.lang.String): scala.Unit = js.native
  def removeProperty(className: java.lang.String, propertyName: java.lang.String): scala.Boolean = js.native
}

