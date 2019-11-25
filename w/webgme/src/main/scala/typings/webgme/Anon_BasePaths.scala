package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BasePaths extends js.Object {
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

object Anon_BasePaths {
  @scala.inline
  def apply(basePaths: js.Array[String], enable: Boolean, monitorTimeout: Double): Anon_BasePaths = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], monitorTimeout = monitorTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BasePaths]
  }
}

