package typings
package xmldsigjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var Algorithm: java.lang.String
  var Encoding: java.lang.String
  var Id: java.lang.String
  var MimeType: java.lang.String
  var Type: java.lang.String
  var URI: java.lang.String
}

object Anon_Algorithm {
  @scala.inline
  def apply(
    Algorithm: java.lang.String,
    Encoding: java.lang.String,
    Id: java.lang.String,
    MimeType: java.lang.String,
    Type: java.lang.String,
    URI: java.lang.String
  ): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Algorithm")(Algorithm)
    __obj.updateDynamic("Encoding")(Encoding)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("MimeType")(MimeType)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("URI")(URI)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

