package typings.twineSugarcube.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeDefinition extends SettingDefinition {
  
  /**
    * The default value for the setting and default state of the control. Leaving it undefined means to use the value of max as the default.
    */
  var default: js.UndefOr[Double] = js.native
  
  /**
    * The maximum value.
    */
  var max: Double = js.native
  
  /**
    * The minimum value.
    */
  var min: Double = js.native
  
  /**
    * Limits the increments to which the value may be set. It must be evenly divisible into the full range — i.e., max - min.
    */
  var step: Double = js.native
}
object RangeDefinition {
  
  @scala.inline
  def apply(label: String, max: Double, min: Double, step: Double): RangeDefinition = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDefinition]
  }
  
  @scala.inline
  implicit class RangeDefinitionOps[Self <: RangeDefinition] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
