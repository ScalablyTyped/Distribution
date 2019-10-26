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
    val __obj = js.Dynamic.literal(signatureDefs = signatureDefs, tags = tags)
  
    __obj.asInstanceOf[MetaGraphInfo]
  }
}

