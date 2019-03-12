package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var url: java.lang.String
}

object SocketConnectParams {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    header: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: RequestMethod = null,
    protocols: js.Array[java.lang.String] = null,
    success: () => scala.Unit = null
  ): SocketConnectParams = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SocketConnectParams]
  }
}

