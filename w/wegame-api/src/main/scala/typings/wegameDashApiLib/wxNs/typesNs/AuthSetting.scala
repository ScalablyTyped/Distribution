package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --设置

trait AuthSetting extends js.Object {
  /**
               * 通讯地址，对应接口 wx.chooseAddress
               */
  var `scope.address`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 摄像头 wx.camera
               */
  var `scope.camera`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 发票抬头，对应接口 wx.chooseInvoiceTitle
               */
  var `scope.invoiceTitle`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 录音功能，对应接口 wx.startRecord
               */
  var `scope.record`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 用户信息，对应接口 wx.getUserInfo
               */
  var `scope.userInfo`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 地理位置，对应接口 wx.getLocation wx.chooseLocation
               */
  var `scope.userLocation`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 微信运动步数，对应接口 wx.getWeRunData
               */
  var `scope.werun`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum
               */
  var `scope.writePhotosAlbum`: js.UndefOr[scala.Boolean] = js.undefined
}

