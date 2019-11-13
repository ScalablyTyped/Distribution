package typings.atTensorflowTfjsDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.ModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputsKey extends js.Object {
  var inputs: StringDictionary[ModelTensorInfo]
  var outputs: StringDictionary[ModelTensorInfo]
}

object Anon_InputsKey {
  @scala.inline
  def apply(inputs: StringDictionary[ModelTensorInfo], outputs: StringDictionary[ModelTensorInfo]): Anon_InputsKey = {
    val __obj = js.Dynamic.literal(inputs = inputs, outputs = outputs)
  
    __obj.asInstanceOf[Anon_InputsKey]
  }
}

