package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CustomPropertiesCollection")
@js.native
open class CustomPropertiesCollection () extends StObject
/* static members */
object CustomPropertiesCollection {
  
  @JSImport("survey-knockout", "CustomPropertiesCollection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(className: String, parentClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(className.asInstanceOf[js.Any], parentClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addProperty(className: String, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperty")(className.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createProperties(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getProperties(className: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(className.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  @JSImport("survey-knockout", "CustomPropertiesCollection.parentClasses")
  @js.native
  def parentClasses: Any = js.native
  inline def parentClasses_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentClasses")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "CustomPropertiesCollection.properties")
  @js.native
  def properties: IObject = js.native
  inline def properties_=(x: IObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
  
  inline def removeAllProperties(className: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllProperties")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeProperty(className: String, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(className.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
