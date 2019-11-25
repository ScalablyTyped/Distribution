package typings.xmlDashCrypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanonicalizationAlgorithm extends js.Object {
  var canonicalizationAlgorithm: js.UndefOr[String] = js.undefined
  var idAttribute: js.UndefOr[String] = js.undefined
  var implicitTransforms: js.UndefOr[js.Array[String]] = js.undefined
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
}

object Anon_CanonicalizationAlgorithm {
  @scala.inline
  def apply(
    canonicalizationAlgorithm: String = null,
    idAttribute: String = null,
    implicitTransforms: js.Array[String] = null,
    signatureAlgorithm: String = null
  ): Anon_CanonicalizationAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (canonicalizationAlgorithm != null) __obj.updateDynamic("canonicalizationAlgorithm")(canonicalizationAlgorithm.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (implicitTransforms != null) __obj.updateDynamic("implicitTransforms")(implicitTransforms.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanonicalizationAlgorithm]
  }
}

