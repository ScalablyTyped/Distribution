package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.modelTypesMod.ModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outputs extends js.Object {
  var inputs: StringDictionary[ModelTensorInfo]
  var outputs: StringDictionary[ModelTensorInfo]
}

object Outputs {
  @scala.inline
  def apply(inputs: StringDictionary[ModelTensorInfo], outputs: StringDictionary[ModelTensorInfo]): Outputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
}

