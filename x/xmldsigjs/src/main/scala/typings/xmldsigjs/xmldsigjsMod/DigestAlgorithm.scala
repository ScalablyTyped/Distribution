package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xmldsigjs.xmldsigjsStrings.`SHA-1`
  - typings.xmldsigjs.xmldsigjsStrings.`SHA-256`
  - typings.xmldsigjs.xmldsigjsStrings.`SHA-384`
  - typings.xmldsigjs.xmldsigjsStrings.`SHA-512`
*/
trait DigestAlgorithm extends js.Object

object DigestAlgorithm {
  @scala.inline
  def `SHA-1`: typings.xmldsigjs.xmldsigjsStrings.`SHA-1` = this.cast("SHA-1")
  @scala.inline
  def `SHA-256`: typings.xmldsigjs.xmldsigjsStrings.`SHA-256` = this.cast("SHA-256")
  @scala.inline
  def `SHA-384`: typings.xmldsigjs.xmldsigjsStrings.`SHA-384` = this.cast("SHA-384")
  @scala.inline
  def `SHA-512`: typings.xmldsigjs.xmldsigjsStrings.`SHA-512` = this.cast("SHA-512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

