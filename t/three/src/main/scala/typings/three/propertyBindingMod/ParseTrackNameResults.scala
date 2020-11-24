package typings.three.propertyBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseTrackNameResults extends js.Object {
  
  var nodeName: String = js.native
  
  var objectIndex: String = js.native
  
  var objectName: String = js.native
  
  var propertyIndex: String = js.native
  
  var propertyName: String = js.native
}
object ParseTrackNameResults {
  
  @scala.inline
  def apply(
    nodeName: String,
    objectIndex: String,
    objectName: String,
    propertyIndex: String,
    propertyName: String
  ): ParseTrackNameResults = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], objectIndex = objectIndex.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], propertyIndex = propertyIndex.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseTrackNameResults]
  }
  
  @scala.inline
  implicit class ParseTrackNameResultsOps[Self <: ParseTrackNameResults] (val x: Self) extends AnyVal {
    
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
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIndex(value: String): Self = this.set("objectIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectName(value: String): Self = this.set("objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIndex(value: String): Self = this.set("propertyIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
}
