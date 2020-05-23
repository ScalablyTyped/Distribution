package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.modelTypesMod.SavedModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inputs extends js.Object {
  var inputs: StringDictionary[SavedModelTensorInfo]
  var outputs: StringDictionary[SavedModelTensorInfo]
}

object Inputs {
  @scala.inline
  def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
}

