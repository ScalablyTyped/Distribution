package typings.weappDashApi

import typings.weappDashApi.weappDashApiMod.wxNs.CameraDevice
import typings.weappDashApi.weappDashApiMod.wxNs.ImageSizeType
import typings.weappDashApi.weappDashApiMod.wxNs.ImageSourceType
import typings.weappDashApi.weappDashApiMod.wxNs.LineCapType
import typings.weappDashApi.weappDashApiMod.wxNs.LineJoinType
import typings.weappDashApi.weappDashApiMod.wxNs.Scope
import typings.weappDashApi.weappDashApiMod.wxNs.TimingFunction
import typings.weappDashApi.weappDashApiMod.wxNs.VideoSourceType
import typings.weappDashApi.weappDashApiMod.wxNs.envVersion
import typings.weappDashApi.weappDashApiMod.wxNs.icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object weappDashApiStrings {
  @js.native
  sealed trait `2g` extends js.Object
  
  @js.native
  sealed trait `3g` extends js.Object
  
  @js.native
  sealed trait `4g` extends js.Object
  
  @js.native
  sealed trait MD5 extends js.Object
  
  @js.native
  sealed trait address extends Scope
  
  @js.native
  sealed trait album
    extends ImageSourceType
       with VideoSourceType
  
  @js.native
  sealed trait back extends CameraDevice
  
  @js.native
  sealed trait bevel extends LineJoinType
  
  @js.native
  sealed trait butt extends LineCapType
  
  @js.native
  sealed trait camera
    extends ImageSourceType
       with Scope
       with VideoSourceType
  
  @js.native
  sealed trait compressed extends ImageSizeType
  
  @js.native
  sealed trait develop extends envVersion
  
  @js.native
  sealed trait ease extends TimingFunction
  
  @js.native
  sealed trait `ease-in` extends TimingFunction
  
  @js.native
  sealed trait `ease-in-out` extends TimingFunction
  
  @js.native
  sealed trait `ease-out` extends TimingFunction
  
  @js.native
  sealed trait easeIn extends js.Object
  
  @js.native
  sealed trait easeInOut extends js.Object
  
  @js.native
  sealed trait easeOut extends js.Object
  
  @js.native
  sealed trait front extends CameraDevice
  
  @js.native
  sealed trait gcj02 extends js.Object
  
  @js.native
  sealed trait invoice extends Scope
  
  @js.native
  sealed trait invoiceTitle extends Scope
  
  @js.native
  sealed trait linear extends TimingFunction
  
  @js.native
  sealed trait loading extends icon
  
  @js.native
  sealed trait miter extends LineJoinType
  
  @js.native
  sealed trait none extends icon
  
  @js.native
  sealed trait original extends ImageSizeType
  
  @js.native
  sealed trait record extends Scope
  
  @js.native
  sealed trait release extends envVersion
  
  @js.native
  sealed trait round
    extends LineCapType
       with LineJoinType
  
  @js.native
  sealed trait square extends LineCapType
  
  @js.native
  sealed trait `step-end` extends TimingFunction
  
  @js.native
  sealed trait `step-start` extends TimingFunction
  
  @js.native
  sealed trait success extends icon
  
  @js.native
  sealed trait trial extends envVersion
  
  @js.native
  sealed trait userInfo extends Scope
  
  @js.native
  sealed trait userLocation extends Scope
  
  @js.native
  sealed trait werun extends Scope
  
  @js.native
  sealed trait wgs84 extends js.Object
  
  @js.native
  sealed trait wifi extends js.Object
  
  @js.native
  sealed trait writePhotosAlbum extends Scope
  
  @scala.inline
  def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  @scala.inline
  def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  @scala.inline
  def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  @scala.inline
  def MD5: MD5 = "MD5".asInstanceOf[MD5]
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  @scala.inline
  def camera: camera = "camera".asInstanceOf[camera]
  @scala.inline
  def compressed: compressed = "compressed".asInstanceOf[compressed]
  @scala.inline
  def develop: develop = "develop".asInstanceOf[develop]
  @scala.inline
  def ease: ease = "ease".asInstanceOf[ease]
  @scala.inline
  def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  @scala.inline
  def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  @scala.inline
  def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  @scala.inline
  def easeIn: easeIn = "easeIn".asInstanceOf[easeIn]
  @scala.inline
  def easeInOut: easeInOut = "easeInOut".asInstanceOf[easeInOut]
  @scala.inline
  def easeOut: easeOut = "easeOut".asInstanceOf[easeOut]
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  @scala.inline
  def gcj02: gcj02 = "gcj02".asInstanceOf[gcj02]
  @scala.inline
  def invoice: invoice = "invoice".asInstanceOf[invoice]
  @scala.inline
  def invoiceTitle: invoiceTitle = "invoiceTitle".asInstanceOf[invoiceTitle]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def original: original = "original".asInstanceOf[original]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def `step-end`: `step-end` = "step-end".asInstanceOf[`step-end`]
  @scala.inline
  def `step-start`: `step-start` = "step-start".asInstanceOf[`step-start`]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def trial: trial = "trial".asInstanceOf[trial]
  @scala.inline
  def userInfo: userInfo = "userInfo".asInstanceOf[userInfo]
  @scala.inline
  def userLocation: userLocation = "userLocation".asInstanceOf[userLocation]
  @scala.inline
  def werun: werun = "werun".asInstanceOf[werun]
  @scala.inline
  def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
  @scala.inline
  def writePhotosAlbum: writePhotosAlbum = "writePhotosAlbum".asInstanceOf[writePhotosAlbum]
}

