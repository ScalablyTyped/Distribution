package typings.xmldsigjs.typesPkijsMod

import typings.xmldsigjs.Anon_AlgorithmUsages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "getAlgorithmParameters")
@js.native
object getAlgorithmParameters extends js.Object {
  /**
    * Get default algorithm parameters for each kind of operation
    * 
    * @param {string} algorithmName Algorithm name to get common parameters for
    * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
    * @returns {{ algorithm: Algorithm; usages: string[]; }}
    */
  def apply(algorithmName: String, operation: String): Anon_AlgorithmUsages = js.native
}

