package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.modelTypesMod.SavedModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputs extends js.Object {
  var inputs: StringDictionary[SavedModelTensorInfo]
  var outputs: StringDictionary[SavedModelTensorInfo]
}

object AnonInputs {
  @scala.inline
  def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): AnonInputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputs]
  }
}

