package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseCardConfig extends js.Object {
  /**
           * 卡券Id
           */
  var cardId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 卡券签名
           */
  var cardSign: java.lang.String
  /**
           * 卡券类型
           */
  var cardType: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 卡券签名随机串
           */
  var nonceStr: java.lang.String
  /**
           * 门店Id
           */
  var shopId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 签名方式，默认'SHA1'
           */
  var signType: java.lang.String
  /**
           * var cardList= res.cardList; 用户选中的卡券列表信息
           */
  var success: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_CardList, scala.Unit]] = js.undefined
  /**
           * 卡券签名时间戳
           */
  var timestamp: scala.Double
}

