package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileResult extends js.Object {
  var code: java.lang.String
  var developerDoc: web3Lib.Anon_Methods
  var info: web3Lib.Anon_AbiDefinition
  var userDoc: web3Lib.Anon_Methods
}

object CompileResult {
  @scala.inline
  def apply(
    code: java.lang.String,
    developerDoc: web3Lib.Anon_Methods,
    info: web3Lib.Anon_AbiDefinition,
    userDoc: web3Lib.Anon_Methods
  ): CompileResult = {
    val __obj = js.Dynamic.literal(code = code, developerDoc = developerDoc, info = info, userDoc = userDoc)
  
    __obj.asInstanceOf[CompileResult]
  }
}

