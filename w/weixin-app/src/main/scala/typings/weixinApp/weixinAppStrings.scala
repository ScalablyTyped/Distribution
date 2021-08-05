package typings.weixinApp

import typings.weixinApp.wx.AuthModes
import typings.weixinApp.wx.CameraDevice
import typings.weixinApp.wx.EventType
import typings.weixinApp.wx.ImageSizeType
import typings.weixinApp.wx.ImageSourceType
import typings.weixinApp.wx.LineCapType
import typings.weixinApp.wx.LineJoinType
import typings.weixinApp.wx.PaymentSignType
import typings.weixinApp.wx.Scope
import typings.weixinApp.wx.TimingFunction
import typings.weixinApp.wx.TouchEventType
import typings.weixinApp.wx.TransitionEventType
import typings.weixinApp.wx.VideoSourceType
import typings.weixinApp.wx.networkType
import typings.weixinApp.wx.scanType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weixinAppStrings {
  
  @js.native
  sealed trait `2g`
    extends StObject
       with networkType
  inline def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  
  @js.native
  sealed trait `3g`
    extends StObject
       with networkType
  inline def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  
  @js.native
  sealed trait `4g`
    extends StObject
       with networkType
  inline def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  
  @js.native
  sealed trait CONNECT extends StObject
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait Component extends StObject
  inline def Component: Component = "Component".asInstanceOf[Component]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends StObject
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait `HMAC-SHA256`
    extends StObject
       with PaymentSignType
  inline def `HMAC-SHA256`: `HMAC-SHA256` = "HMAC-SHA256".asInstanceOf[`HMAC-SHA256`]
  
  @js.native
  sealed trait MD5
    extends StObject
       with PaymentSignType
  inline def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait Numbersign000000 extends StObject
  inline def Numbersign000000: Numbersign000000 = "#000000".asInstanceOf[Numbersign000000]
  
  @js.native
  sealed trait Numbersignffffff extends StObject
  inline def Numbersignffffff: Numbersignffffff = "#ffffff".asInstanceOf[Numbersignffffff]
  
  @js.native
  sealed trait OPTIONS extends StObject
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait RecordPropsDefinition extends StObject
  inline def RecordPropsDefinition: RecordPropsDefinition = "RecordPropsDefinition".asInstanceOf[RecordPropsDefinition]
  
  @js.native
  sealed trait TRACE extends StObject
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait album
    extends StObject
       with ImageSourceType
       with VideoSourceType
  inline def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait ancestor extends StObject
  inline def ancestor: ancestor = "ancestor".asInstanceOf[ancestor]
  
  @js.native
  sealed trait animationend
    extends StObject
       with EventType
       with TransitionEventType
  inline def animationend: animationend = "animationend".asInstanceOf[animationend]
  
  @js.native
  sealed trait animationiteration
    extends StObject
       with EventType
       with TransitionEventType
  inline def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  
  @js.native
  sealed trait animationstart
    extends StObject
       with EventType
       with TransitionEventType
  inline def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  
  @js.native
  sealed trait back
    extends StObject
       with CameraDevice
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait barCode
    extends StObject
       with scanType
  inline def barCode: barCode = "barCode".asInstanceOf[barCode]
  
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
  sealed trait button extends StObject
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait camera
    extends StObject
       with ImageSourceType
       with VideoSourceType
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait center extends StObject
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait child extends StObject
  inline def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait compressed
    extends StObject
       with ImageSizeType
  inline def compressed: compressed = "compressed".asInstanceOf[compressed]
  
  @js.native
  sealed trait descendant extends StObject
  inline def descendant: descendant = "descendant".asInstanceOf[descendant]
  
  @js.native
  sealed trait doc extends StObject
  inline def doc: doc = "doc".asInstanceOf[doc]
  
  @js.native
  sealed trait docx extends StObject
  inline def docx: docx = "docx".asInstanceOf[docx]
  
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
  sealed trait facial
    extends StObject
       with AuthModes
  inline def facial: facial = "facial".asInstanceOf[facial]
  
  @js.native
  sealed trait fingerPrint
    extends StObject
       with AuthModes
  inline def fingerPrint: fingerPrint = "fingerPrint".asInstanceOf[fingerPrint]
  
  @js.native
  sealed trait form
    extends StObject
       with EventType
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait front
    extends StObject
       with CameraDevice
  inline def front: front = "front".asInstanceOf[front]
  
  @js.native
  sealed trait gcj02 extends StObject
  inline def gcj02: gcj02 = "gcj02".asInstanceOf[gcj02]
  
  @js.native
  sealed trait input
    extends StObject
       with EventType
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait linear
    extends StObject
       with TimingFunction
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait longpress
    extends StObject
       with EventType
  inline def longpress: longpress = "longpress".asInstanceOf[longpress]
  
  @js.native
  sealed trait menu extends StObject
  inline def menu: menu = "menu".asInstanceOf[menu]
  
  @js.native
  sealed trait miter
    extends StObject
       with LineJoinType
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait none
    extends StObject
       with networkType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait ok extends StObject
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait original
    extends StObject
       with ImageSizeType
  inline def original: original = "original".asInstanceOf[original]
  
  @js.native
  sealed trait parent extends StObject
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait pdf extends StObject
  inline def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @js.native
  sealed trait ppt extends StObject
  inline def ppt: ppt = "ppt".asInstanceOf[ppt]
  
  @js.native
  sealed trait pptx extends StObject
  inline def pptx: pptx = "pptx".asInstanceOf[pptx]
  
  @js.native
  sealed trait qrCode
    extends StObject
       with scanType
  inline def qrCode: qrCode = "qrCode".asInstanceOf[qrCode]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait round
    extends StObject
       with LineCapType
       with LineJoinType
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait scopeDotaddress
    extends StObject
       with Scope
  inline def scopeDotaddress: scopeDotaddress = "scope.address".asInstanceOf[scopeDotaddress]
  
  @js.native
  sealed trait scopeDotcamera
    extends StObject
       with Scope
  inline def scopeDotcamera: scopeDotcamera = "scope.camera".asInstanceOf[scopeDotcamera]
  
  @js.native
  sealed trait scopeDotinvoice
    extends StObject
       with Scope
  inline def scopeDotinvoice: scopeDotinvoice = "scope.invoice".asInstanceOf[scopeDotinvoice]
  
  @js.native
  sealed trait scopeDotinvoiceTitle
    extends StObject
       with Scope
  inline def scopeDotinvoiceTitle: scopeDotinvoiceTitle = "scope.invoiceTitle".asInstanceOf[scopeDotinvoiceTitle]
  
  @js.native
  sealed trait scopeDotrecord
    extends StObject
       with Scope
  inline def scopeDotrecord: scopeDotrecord = "scope.record".asInstanceOf[scopeDotrecord]
  
  @js.native
  sealed trait scopeDotuserInfo
    extends StObject
       with Scope
  inline def scopeDotuserInfo: scopeDotuserInfo = "scope.userInfo".asInstanceOf[scopeDotuserInfo]
  
  @js.native
  sealed trait scopeDotuserLocation
    extends StObject
       with Scope
  inline def scopeDotuserLocation: scopeDotuserLocation = "scope.userLocation".asInstanceOf[scopeDotuserLocation]
  
  @js.native
  sealed trait scopeDotuserLocationBackground
    extends StObject
       with Scope
  inline def scopeDotuserLocationBackground: scopeDotuserLocationBackground = "scope.userLocationBackground".asInstanceOf[scopeDotuserLocationBackground]
  
  @js.native
  sealed trait scopeDotwerun
    extends StObject
       with Scope
  inline def scopeDotwerun: scopeDotwerun = "scope.werun".asInstanceOf[scopeDotwerun]
  
  @js.native
  sealed trait scopeDotwritePhotosAlbum
    extends StObject
       with Scope
  inline def scopeDotwritePhotosAlbum: scopeDotwritePhotosAlbum = "scope.writePhotosAlbum".asInstanceOf[scopeDotwritePhotosAlbum]
  
  @js.native
  sealed trait scroll
    extends StObject
       with EventType
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait speech
    extends StObject
       with AuthModes
  inline def speech: speech = "speech".asInstanceOf[speech]
  
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
  sealed trait submit
    extends StObject
       with EventType
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait tap
    extends StObject
       with EventType
       with TouchEventType
  inline def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait touchcancel
    extends StObject
       with EventType
       with TouchEventType
  inline def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  
  @js.native
  sealed trait touchend
    extends StObject
       with EventType
       with TouchEventType
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchforcechange
    extends StObject
       with EventType
       with TouchEventType
  inline def touchforcechange: touchforcechange = "touchforcechange".asInstanceOf[touchforcechange]
  
  @js.native
  sealed trait touchmove
    extends StObject
       with EventType
       with TouchEventType
  inline def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchstart
    extends StObject
       with EventType
       with TouchEventType
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait transitionend
    extends StObject
       with EventType
       with TransitionEventType
  inline def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  
  @js.native
  sealed trait unknown
    extends StObject
       with networkType
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait wgs84 extends StObject
  inline def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  
  @js.native
  sealed trait wifi
    extends StObject
       with networkType
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait xls extends StObject
  inline def xls: xls = "xls".asInstanceOf[xls]
  
  @js.native
  sealed trait xlsx extends StObject
  inline def xlsx: xlsx = "xlsx".asInstanceOf[xlsx]
}
