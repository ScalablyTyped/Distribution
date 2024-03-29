package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePaths extends StObject {
  
  /**
    * Array of paths to custom add-ons. 
    * If you have an add-on at C:/SomeAddOns/MyAddOn/MyAddOn.js 
    * the path to append would be C:/SomeAddOns or a relative path 
    * (from the current working directory). 
    * N.B. this will also expose any other add-on in that directory, 
    * e.g. C:/SomeAddOns/MyOtherAddOn/MyOtherAddOn.js.
    *    config.addOn.basePaths = ['./src/addon/core'];
    */
  var basePaths: js.Array[String]
  
  /**
    * If true enables add-ons.
    *    config.addOn.enable = false;
    */
  var enable: Boolean
  
  /**
    * In milliseconds, the waiting time before add-ons 
    * (or the monitoring of such) is stopped after 
    * the last client leaves a branch.
    *    config.addOn.monitorTimeout = 5000;
    */
  var monitorTimeout: Double
}
object BasePaths {
  
  inline def apply(basePaths: js.Array[String], enable: Boolean, monitorTimeout: Double): BasePaths = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], monitorTimeout = monitorTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePaths] (val x: Self) extends AnyVal {
    
    inline def setBasePaths(value: js.Array[String]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
    
    inline def setBasePathsVarargs(value: String*): Self = StObject.set(x, "basePaths", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setMonitorTimeout(value: Double): Self = StObject.set(x, "monitorTimeout", value.asInstanceOf[js.Any])
  }
}
