package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CustomPropertiesCollection")
@js.native
class CustomPropertiesCollection () extends StObject
/* static members */
object CustomPropertiesCollection {
  
  @JSImport("survey-knockout", "CustomPropertiesCollection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(className: String, parentClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(className.asInstanceOf[js.Any], parentClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addProperty(className: String, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperty")(className.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createProperties(obj: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getProperties(className: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(className.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def removeProperty(className: String, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(className.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
