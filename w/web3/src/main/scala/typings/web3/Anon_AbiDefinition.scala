package typings.web3

import typings.web3.ethAbiMod.ABIDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbiDefinition extends js.Object {
  var abiDefinition: js.Array[ABIDefinition]
  var compilerVersion: String
  var language: String
  var languageVersion: String
  var source: String
}

object Anon_AbiDefinition {
  @scala.inline
  def apply(
    abiDefinition: js.Array[ABIDefinition],
    compilerVersion: String,
    language: String,
    languageVersion: String,
    source: String
  ): Anon_AbiDefinition = {
    val __obj = js.Dynamic.literal(abiDefinition = abiDefinition, compilerVersion = compilerVersion, language = language, languageVersion = languageVersion, source = source)
  
    __obj.asInstanceOf[Anon_AbiDefinition]
  }
}

