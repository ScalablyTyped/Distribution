package typings
package xadesjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNames extends js.Object {
  var AttributeNames: Anon_Encoding
  var DefaultPrefix: java.lang.String
  var ElementNames: Anon_AllDataObjectsTimeStamp
  var NamespaceURI: java.lang.String
  var SignedPropertiesType: java.lang.String
}

object Anon_AttributeNames {
  @scala.inline
  def apply(
    AttributeNames: Anon_Encoding,
    DefaultPrefix: java.lang.String,
    ElementNames: Anon_AllDataObjectsTimeStamp,
    NamespaceURI: java.lang.String,
    SignedPropertiesType: java.lang.String
  ): Anon_AttributeNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttributeNames")(AttributeNames)
    __obj.updateDynamic("DefaultPrefix")(DefaultPrefix)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("NamespaceURI")(NamespaceURI)
    __obj.updateDynamic("SignedPropertiesType")(SignedPropertiesType)
    __obj.asInstanceOf[Anon_AttributeNames]
  }
}

