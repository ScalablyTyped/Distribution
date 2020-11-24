package typings.stylableWebpackPlugin.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalcResult extends js.Object {
  
  var cssDependencies: js.Array[StylableModule] = js.native
  
  var depth: Double = js.native
}
object CalcResult {
  
  @scala.inline
  def apply(cssDependencies: js.Array[StylableModule], depth: Double): CalcResult = {
    val __obj = js.Dynamic.literal(cssDependencies = cssDependencies.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalcResult]
  }
  
  @scala.inline
  implicit class CalcResultOps[Self <: CalcResult] (val x: Self) extends AnyVal {
    
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
    def setCssDependenciesVarargs(value: StylableModule*): Self = this.set("cssDependencies", js.Array(value :_*))
    
    @scala.inline
    def setCssDependencies(value: js.Array[StylableModule]): Self = this.set("cssDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
  }
}
