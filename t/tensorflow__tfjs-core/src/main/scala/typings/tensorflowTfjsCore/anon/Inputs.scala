package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.modelTypesMod.SavedModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inputs extends js.Object {
  var inputs: StringDictionary[SavedModelTensorInfo] = js.native
  var outputs: StringDictionary[SavedModelTensorInfo] = js.native
}

object Inputs {
  @scala.inline
  def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  @scala.inline
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
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
    def setInputs(value: StringDictionary[SavedModelTensorInfo]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(value: StringDictionary[SavedModelTensorInfo]): Self = this.set("outputs", value.asInstanceOf[js.Any])
  }
  
}

