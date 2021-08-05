package typings.weappApi

import typings.weappApi.mod.wx.CameraDevice
import typings.weappApi.mod.wx.ImageSizeType
import typings.weappApi.mod.wx.ImageSourceType
import typings.weappApi.mod.wx.LineCapType
import typings.weappApi.mod.wx.LineJoinType
import typings.weappApi.mod.wx.Scope
import typings.weappApi.mod.wx.TimingFunction
import typings.weappApi.mod.wx.VideoSourceType
import typings.weappApi.mod.wx.envVersion
import typings.weappApi.mod.wx.icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weappApiStrings {
  
  @js.native
  sealed trait `2g` extends StObject
  inline def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  
  @js.native
  sealed trait `3g` extends StObject
  inline def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  
  @js.native
  sealed trait `4g` extends StObject
  inline def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  
  @js.native
  sealed trait MD5 extends StObject
  inline def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait address
    extends StObject
       with Scope
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait album
    extends StObject
       with ImageSourceType
       with VideoSourceType
  inline def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait back
    extends StObject
       with CameraDevice
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait bevel
    extends StObject
       with LineJoinType
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait butt
    extends StObject
       with LineCapType
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait camera
    extends StObject
       with ImageSourceType
       with Scope
       with VideoSourceType
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait compressed
    extends StObject
       with ImageSizeType
  inline def compressed: compressed = "compressed".asInstanceOf[compressed]
  
  @js.native
  sealed trait develop
    extends StObject
       with envVersion
  inline def develop: develop = "develop".asInstanceOf[develop]
  
  @js.native
  sealed trait ease
    extends StObject
       with TimingFunction
  inline def ease: ease = "ease".asInstanceOf[ease]
  
  @js.native
  sealed trait `ease-in`
    extends StObject
       with TimingFunction
  inline def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  
  @js.native
  sealed trait `ease-in-out`
    extends StObject
       with TimingFunction
  inline def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  
  @js.native
  sealed trait `ease-out`
    extends StObject
       with TimingFunction
  inline def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  
  @js.native
  sealed trait easeIn extends StObject
  inline def easeIn: easeIn = "easeIn".asInstanceOf[easeIn]
  
  @js.native
  sealed trait easeInOut extends StObject
  inline def easeInOut: easeInOut = "easeInOut".asInstanceOf[easeInOut]
  
  @js.native
  sealed trait easeOut extends StObject
  inline def easeOut: easeOut = "easeOut".asInstanceOf[easeOut]
  
  @js.native
  sealed trait front
    extends StObject
       with CameraDevice
  inline def front: front = "front".asInstanceOf[front]
  
  @js.native
  sealed trait gcj02 extends StObject
  inline def gcj02: gcj02 = "gcj02".asInstanceOf[gcj02]
  
  @js.native
  sealed trait invoice
    extends StObject
       with Scope
  inline def invoice: invoice = "invoice".asInstanceOf[invoice]
  
  @js.native
  sealed trait invoiceTitle
    extends StObject
       with Scope
  inline def invoiceTitle: invoiceTitle = "invoiceTitle".asInstanceOf[invoiceTitle]
  
  @js.native
  sealed trait linear
    extends StObject
       with TimingFunction
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait loading
    extends StObject
       with icon
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait miter
    extends StObject
       with LineJoinType
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait none
    extends StObject
       with icon
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait original
    extends StObject
       with ImageSizeType
  inline def original: original = "original".asInstanceOf[original]
  
  @js.native
  sealed trait record
    extends StObject
       with Scope
  inline def record: record = "record".asInstanceOf[record]
  
  @js.native
  sealed trait release
    extends StObject
       with envVersion
  inline def release: release = "release".asInstanceOf[release]
  
  @js.native
  sealed trait round
    extends StObject
       with LineCapType
       with LineJoinType
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait square
    extends StObject
       with LineCapType
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait `step-end`
    extends StObject
       with TimingFunction
  inline def `step-end`: `step-end` = "step-end".asInstanceOf[`step-end`]
  
  @js.native
  sealed trait `step-start`
    extends StObject
       with TimingFunction
  inline def `step-start`: `step-start` = "step-start".asInstanceOf[`step-start`]
  
  @js.native
  sealed trait success
    extends StObject
       with icon
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait trial
    extends StObject
       with envVersion
  inline def trial: trial = "trial".asInstanceOf[trial]
  
  @js.native
  sealed trait userInfo
    extends StObject
       with Scope
  inline def userInfo: userInfo = "userInfo".asInstanceOf[userInfo]
  
  @js.native
  sealed trait userLocation
    extends StObject
       with Scope
  inline def userLocation: userLocation = "userLocation".asInstanceOf[userLocation]
  
  @js.native
  sealed trait werun
    extends StObject
       with Scope
  inline def werun: werun = "werun".asInstanceOf[werun]
  
  @js.native
  sealed trait wgs84 extends StObject
  inline def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  
  @js.native
  sealed trait wifi extends StObject
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait writePhotosAlbum
    extends StObject
       with Scope
  inline def writePhotosAlbum: writePhotosAlbum = "writePhotosAlbum".asInstanceOf[writePhotosAlbum]
}
