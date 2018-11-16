package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----设置

trait AuthSetting extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var scope: weixinDashAppLib.weixinDashAppLibStrings.scopeDOTuserInfo | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTuserLocation | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTaddress | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTinvoiceTitle | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTwerun | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTrecord | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTwritePhotosAlbum
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, scala.Unit]] = js.undefined
}

