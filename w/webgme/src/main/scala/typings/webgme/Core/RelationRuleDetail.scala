package typings.webgme.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationRuleDetail extends js.Object {
  
  /** 
    * The maximum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no maximum rule that applies) 
    */
  var max: js.UndefOr[Double] = js.native
  
  /** 
    * The minimum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no minimum rule that applies) 
    */
  var min: js.UndefOr[Double] = js.native
}
object RelationRuleDetail {
  
  @scala.inline
  def apply(): RelationRuleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationRuleDetail]
  }
  
  @scala.inline
  implicit class RelationRuleDetailOps[Self <: RelationRuleDetail] (val x: Self) extends AnyVal {
    
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
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
