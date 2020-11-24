package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultTransformationDetails extends js.Object {
  
  var resultTemplate: String = js.native
}
object ResultTransformationDetails {
  
  @scala.inline
  def apply(resultTemplate: String): ResultTransformationDetails = {
    val __obj = js.Dynamic.literal(resultTemplate = resultTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTransformationDetails]
  }
  
  @scala.inline
  implicit class ResultTransformationDetailsOps[Self <: ResultTransformationDetails] (val x: Self) extends AnyVal {
    
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
    def setResultTemplate(value: String): Self = this.set("resultTemplate", value.asInstanceOf[js.Any])
  }
}
