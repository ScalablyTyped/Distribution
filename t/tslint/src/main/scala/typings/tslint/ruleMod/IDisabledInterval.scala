package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisabledInterval extends js.Object {
  
  var endPosition: Double = js.native
  
  var startPosition: Double = js.native
}
object IDisabledInterval {
  
  @scala.inline
  def apply(endPosition: Double, startPosition: Double): IDisabledInterval = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisabledInterval]
  }
  
  @scala.inline
  implicit class IDisabledIntervalOps[Self <: IDisabledInterval] (val x: Self) extends AnyVal {
    
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
    def setEndPosition(value: Double): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
  }
}
