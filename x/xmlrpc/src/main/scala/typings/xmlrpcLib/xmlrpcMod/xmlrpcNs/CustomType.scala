package typings
package xmlrpcLib.xmlrpcMod.xmlrpcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomType extends js.Object {
  var raw: java.lang.String
  var tagName: java.lang.String
  def serialize(xml: js.Any): js.Any
}

object CustomType {
  @scala.inline
  def apply(raw: java.lang.String, serialize: js.Function1[js.Any, js.Any], tagName: java.lang.String): CustomType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("serialize")(serialize)
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[CustomType]
  }
}

