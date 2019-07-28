package typings.web3.ethTypesMod

import typings.web3.Anon_AbiDefinition
import typings.web3.Anon_Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileResult extends js.Object {
  var code: String
  var developerDoc: Anon_Methods
  var info: Anon_AbiDefinition
  var userDoc: Anon_Methods
}

object CompileResult {
  @scala.inline
  def apply(code: String, developerDoc: Anon_Methods, info: Anon_AbiDefinition, userDoc: Anon_Methods): CompileResult = {
    val __obj = js.Dynamic.literal(code = code, developerDoc = developerDoc, info = info, userDoc = userDoc)
  
    __obj.asInstanceOf[CompileResult]
  }
}

