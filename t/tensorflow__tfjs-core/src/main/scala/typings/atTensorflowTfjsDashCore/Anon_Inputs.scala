package typings.atTensorflowTfjsDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.SavedModelTensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inputs extends js.Object {
  var inputs: StringDictionary[SavedModelTensorInfo]
  var outputs: StringDictionary[SavedModelTensorInfo]
}

object Anon_Inputs {
  @scala.inline
  def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): Anon_Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Inputs]
  }
}

