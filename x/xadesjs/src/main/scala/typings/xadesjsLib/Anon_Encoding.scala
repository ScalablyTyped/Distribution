package typings
package xadesjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var Encoding: java.lang.String
  var Id: java.lang.String
  var ObjectReference: java.lang.String
  var Qualifier: java.lang.String
  var ReferencedData: java.lang.String
  var Target: java.lang.String
  var URI: java.lang.String
  var Uri: java.lang.String
}

object Anon_Encoding {
  @scala.inline
  def apply(
    Encoding: java.lang.String,
    Id: java.lang.String,
    ObjectReference: java.lang.String,
    Qualifier: java.lang.String,
    ReferencedData: java.lang.String,
    Target: java.lang.String,
    URI: java.lang.String,
    Uri: java.lang.String
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Encoding")(Encoding)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("ObjectReference")(ObjectReference)
    __obj.updateDynamic("Qualifier")(Qualifier)
    __obj.updateDynamic("ReferencedData")(ReferencedData)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("Uri")(Uri)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

