package typings.three.propertyBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTrackNameResults extends js.Object {
  var nodeName: String
  var objectIndex: String
  var objectName: String
  var propertyIndex: String
  var propertyName: String
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
}

