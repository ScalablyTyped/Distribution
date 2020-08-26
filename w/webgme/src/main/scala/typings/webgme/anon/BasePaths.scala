package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePaths extends js.Object {
  /**
    * Array of paths to custom add-ons. 
    * If you have an add-on at C:/SomeAddOns/MyAddOn/MyAddOn.js 
    * the path to append would be C:/SomeAddOns or a relative path 
    * (from the current working directory). 
    * N.B. this will also expose any other add-on in that directory, 
    * e.g. C:/SomeAddOns/MyOtherAddOn/MyOtherAddOn.js.
    *    config.addOn.basePaths = ['./src/addon/core'];
    */
  var basePaths: js.Array[String] = js.native
  /**
    * If true enables add-ons.
    *    config.addOn.enable = false;
    */
  var enable: Boolean = js.native
  /**
    * In milliseconds, the waiting time before add-ons 
    * (or the monitoring of such) is stopped after 
    * the last client leaves a branch.
    *    config.addOn.monitorTimeout = 5000;
    */
  var monitorTimeout: Double = js.native
}

object BasePaths {
  @scala.inline
  def apply(basePaths: js.Array[String], enable: Boolean, monitorTimeout: Double): BasePaths = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], monitorTimeout = monitorTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePaths]
  }
  @scala.inline
  implicit class BasePathsOps[Self <: BasePaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBasePathsVarargs(value: String*): Self = this.set("basePaths", js.Array(value :_*))
    @scala.inline
    def setBasePaths(value: js.Array[String]): Self = this.set("basePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitorTimeout(value: Double): Self = this.set("monitorTimeout", value.asInstanceOf[js.Any])
  }
  
}

