package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends _ColorValueRef {
  
  var count: js.UndefOr[Double] = js.native
  
  var gradient: typings.vegaTypings.encodeMod.Field = js.native
  
  var start: js.UndefOr[js.Array[Double]] = js.native
  
  var stop: js.UndefOr[js.Array[Double]] = js.native
}
object Count {
  
  @scala.inline
  def apply(gradient: typings.vegaTypings.encodeMod.Field): Count = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setGradient(value: typings.vegaTypings.encodeMod.Field): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setStartVarargs(value: Double*): Self = this.set("start", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: js.Array[Double]): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStopVarargs(value: Double*): Self = this.set("stop", js.Array(value :_*))
    
    @scala.inline
    def setStop(value: js.Array[Double]): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
