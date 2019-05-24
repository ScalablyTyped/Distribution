package typings
package xmlbuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NData extends js.Object {
  var nData: js.UndefOr[java.lang.String] = js.undefined
  var pubID: js.UndefOr[java.lang.String] = js.undefined
  var sysID: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NData {
  @scala.inline
  def apply(nData: java.lang.String = null, pubID: java.lang.String = null, sysID: java.lang.String = null): Anon_NData = {
    val __obj = js.Dynamic.literal()
    if (nData != null) __obj.updateDynamic("nData")(nData)
    if (pubID != null) __obj.updateDynamic("pubID")(pubID)
    if (sysID != null) __obj.updateDynamic("sysID")(sysID)
    __obj.asInstanceOf[Anon_NData]
  }
}

