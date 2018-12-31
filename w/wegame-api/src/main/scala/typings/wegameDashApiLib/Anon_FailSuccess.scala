package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[java.lang.String]
  /**
    * 群分享对应的 shareTicket
    */
  var shareTicket: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ Anon_Data, scala.Unit]] = js.undefined
}

