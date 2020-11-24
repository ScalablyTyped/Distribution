package typings.winrt.Windows.ApplicationModel.Resources.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndexedResourceQualifier extends js.Object {
  
  var qualifierName: String = js.native
  
  var qualifierValue: String = js.native
}
object IIndexedResourceQualifier {
  
  @scala.inline
  def apply(qualifierName: String, qualifierValue: String): IIndexedResourceQualifier = {
    val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexedResourceQualifier]
  }
  
  @scala.inline
  implicit class IIndexedResourceQualifierOps[Self <: IIndexedResourceQualifier] (val x: Self) extends AnyVal {
    
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
    def setQualifierName(value: String): Self = this.set("qualifierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierValue(value: String): Self = this.set("qualifierValue", value.asInstanceOf[js.Any])
  }
}
