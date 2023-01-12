package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRemoteElementBase extends StObject {
  
  var addCommand: js.Function
  
  /**
    * multiremote browser instance names
    */
  var instances: js.Array[String]
  
  var overwriteCommand: js.Function
}
object MultiRemoteElementBase {
  
  inline def apply(addCommand: js.Function, instances: js.Array[String], overwriteCommand: js.Function): MultiRemoteElementBase = {
    val __obj = js.Dynamic.literal(addCommand = addCommand.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], overwriteCommand = overwriteCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiRemoteElementBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRemoteElementBase] (val x: Self) extends AnyVal {
    
    inline def setAddCommand(value: js.Function): Self = StObject.set(x, "addCommand", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setOverwriteCommand(value: js.Function): Self = StObject.set(x, "overwriteCommand", value.asInstanceOf[js.Any])
  }
}
