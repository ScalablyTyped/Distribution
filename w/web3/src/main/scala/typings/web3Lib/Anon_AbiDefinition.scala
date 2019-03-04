package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbiDefinition extends js.Object {
  var abiDefinition: js.Array[web3Lib.ethAbiMod.ABIDefinition]
  var compilerVersion: java.lang.String
  var language: java.lang.String
  var languageVersion: java.lang.String
  var source: java.lang.String
}

object Anon_AbiDefinition {
  @scala.inline
  def apply(
    abiDefinition: js.Array[web3Lib.ethAbiMod.ABIDefinition],
    compilerVersion: java.lang.String,
    language: java.lang.String,
    languageVersion: java.lang.String,
    source: java.lang.String
  ): Anon_AbiDefinition = {
    val __obj = js.Dynamic.literal(abiDefinition = abiDefinition, compilerVersion = compilerVersion, language = language, languageVersion = languageVersion, source = source)
  
    __obj.asInstanceOf[Anon_AbiDefinition]
  }
}

