package typings
package xmlcreateLib.libNodesXmlDtdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDtdOptions extends js.Object {
  /**
    * The name of the DTD.
    */
  var name: java.lang.String
  /**
    * The public identifier of the DTD, excluding quotation marks. If a public
    * identifier is provided, a system identifier must be provided as well.
    * By default, no public identifier is included.
    */
  var pubId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The system identifier of the DTD, excluding quotation marks. By default,
    * no system identifier is included.
    */
  var sysId: js.UndefOr[java.lang.String] = js.undefined
}

object IXmlDtdOptions {
  @scala.inline
  def apply(name: java.lang.String, pubId: java.lang.String = null, sysId: java.lang.String = null): IXmlDtdOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (pubId != null) __obj.updateDynamic("pubId")(pubId)
    if (sysId != null) __obj.updateDynamic("sysId")(sysId)
    __obj.asInstanceOf[IXmlDtdOptions]
  }
}

