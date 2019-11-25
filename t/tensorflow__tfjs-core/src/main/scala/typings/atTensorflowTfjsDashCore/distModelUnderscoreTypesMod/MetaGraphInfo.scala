package typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGraphInfo extends js.Object {
  var signatureDefs: SignatureDefInfo
  var tags: js.Array[String]
}

object MetaGraphInfo {
  @scala.inline
  def apply(signatureDefs: SignatureDefInfo, tags: js.Array[String]): MetaGraphInfo = {
    val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaGraphInfo]
  }
}

