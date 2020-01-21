package typings.xmldsigjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xmldsigjs.xmldsigjsStrings.enveloped
  - typings.xmldsigjs.xmldsigjsStrings.c14n
  - typings.xmldsigjs.xmldsigjsStrings.`exc-c14n`
  - typings.xmldsigjs.xmldsigjsStrings.`c14n-com`
  - typings.xmldsigjs.xmldsigjsStrings.`exc-c14n-com`
  - typings.xmldsigjs.xmldsigjsStrings.base64
*/
trait OptionsSignTransform extends js.Object

object OptionsSignTransform {
  @scala.inline
  def base64: typings.xmldsigjs.xmldsigjsStrings.base64 = this.cast("base64")
  @scala.inline
  def c14n: typings.xmldsigjs.xmldsigjsStrings.c14n = this.cast("c14n")
  @scala.inline
  def `c14n-com`: typings.xmldsigjs.xmldsigjsStrings.`c14n-com` = this.cast("c14n-com")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enveloped: typings.xmldsigjs.xmldsigjsStrings.enveloped = this.cast("enveloped")
  @scala.inline
  def `exc-c14n`: typings.xmldsigjs.xmldsigjsStrings.`exc-c14n` = this.cast("exc-c14n")
  @scala.inline
  def `exc-c14n-com`: typings.xmldsigjs.xmldsigjsStrings.`exc-c14n-com` = this.cast("exc-c14n-com")
}

