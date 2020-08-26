package typings.webdriverio

import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ActionTypes
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ErrorCode
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.LocationParam
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.MixedContentType
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ReferrerPolicy
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ResourcePriority
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.SizeParam
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ThrottlePreset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webdriverioStrings {
  @js.native
  sealed trait Aborted extends ErrorCode
  
  @js.native
  sealed trait AccessDenied extends ErrorCode
  
  @js.native
  sealed trait AddressUnreachable extends ErrorCode
  
  @js.native
  sealed trait BlockedByClient extends ErrorCode
  
  @js.native
  sealed trait BlockedByResponse extends ErrorCode
  
  @js.native
  sealed trait ConnectionAborted extends ErrorCode
  
  @js.native
  sealed trait ConnectionClosed extends ErrorCode
  
  @js.native
  sealed trait ConnectionFailed extends ErrorCode
  
  @js.native
  sealed trait ConnectionRefused extends ErrorCode
  
  @js.native
  sealed trait ConnectionReset extends ErrorCode
  
  @js.native
  sealed trait DSL extends ThrottlePreset
  
  @js.native
  sealed trait Failed extends ErrorCode
  
  @js.native
  sealed trait GPRS extends ThrottlePreset
  
  @js.native
  sealed trait Good2G extends ThrottlePreset
  
  @js.native
  sealed trait Good3G extends ThrottlePreset
  
  @js.native
  sealed trait High extends ResourcePriority
  
  @js.native
  sealed trait InternetDisconnected extends ErrorCode
  
  @js.native
  sealed trait Low extends ResourcePriority
  
  @js.native
  sealed trait Medium extends ResourcePriority
  
  @js.native
  sealed trait NameNotResolved extends ErrorCode
  
  @js.native
  sealed trait Regular2G extends ThrottlePreset
  
  @js.native
  sealed trait Regular3G extends ThrottlePreset
  
  @js.native
  sealed trait Regular4G extends ThrottlePreset
  
  @js.native
  sealed trait TimedOut extends ErrorCode
  
  @js.native
  sealed trait VeryHigh extends ResourcePriority
  
  @js.native
  sealed trait VeryLow extends ResourcePriority
  
  @js.native
  sealed trait WiFi extends ThrottlePreset
  
  @js.native
  sealed trait blockable extends MixedContentType
  
  @js.native
  sealed trait height extends SizeParam
  
  @js.native
  sealed trait longPress extends ActionTypes
  
  @js.native
  sealed trait moveTo extends ActionTypes
  
  @js.native
  sealed trait `no-referrer` extends ReferrerPolicy
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends ReferrerPolicy
  
  @js.native
  sealed trait none extends MixedContentType
  
  @js.native
  sealed trait offline extends ThrottlePreset
  
  @js.native
  sealed trait online extends ThrottlePreset
  
  @js.native
  sealed trait `optionally-blockable` extends MixedContentType
  
  @js.native
  sealed trait origin extends ReferrerPolicy
  
  @js.native
  sealed trait `origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait press extends ActionTypes
  
  @js.native
  sealed trait release extends ActionTypes
  
  @js.native
  sealed trait `same-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait `strict-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait tap extends ActionTypes
  
  @js.native
  sealed trait `unsafe-url` extends ReferrerPolicy
  
  @js.native
  sealed trait wait extends ActionTypes
  
  @js.native
  sealed trait width extends SizeParam
  
  @js.native
  sealed trait x extends LocationParam
  
  @js.native
  sealed trait y extends LocationParam
  
  @scala.inline
  def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  @scala.inline
  def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  @scala.inline
  def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  @scala.inline
  def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  @scala.inline
  def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  @scala.inline
  def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  @scala.inline
  def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  @scala.inline
  def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  @scala.inline
  def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  @scala.inline
  def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  @scala.inline
  def DSL: DSL = "DSL".asInstanceOf[DSL]
  @scala.inline
  def Failed: Failed = "Failed".asInstanceOf[Failed]
  @scala.inline
  def GPRS: GPRS = "GPRS".asInstanceOf[GPRS]
  @scala.inline
  def Good2G: Good2G = "Good2G".asInstanceOf[Good2G]
  @scala.inline
  def Good3G: Good3G = "Good3G".asInstanceOf[Good3G]
  @scala.inline
  def High: High = "High".asInstanceOf[High]
  @scala.inline
  def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  @scala.inline
  def Low: Low = "Low".asInstanceOf[Low]
  @scala.inline
  def Medium: Medium = "Medium".asInstanceOf[Medium]
  @scala.inline
  def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  @scala.inline
  def Regular2G: Regular2G = "Regular2G".asInstanceOf[Regular2G]
  @scala.inline
  def Regular3G: Regular3G = "Regular3G".asInstanceOf[Regular3G]
  @scala.inline
  def Regular4G: Regular4G = "Regular4G".asInstanceOf[Regular4G]
  @scala.inline
  def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  @scala.inline
  def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  @scala.inline
  def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  @scala.inline
  def WiFi: WiFi = "WiFi".asInstanceOf[WiFi]
  @scala.inline
  def blockable: blockable = "blockable".asInstanceOf[blockable]
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  @scala.inline
  def longPress: longPress = "longPress".asInstanceOf[longPress]
  @scala.inline
  def moveTo: moveTo = "moveTo".asInstanceOf[moveTo]
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  @scala.inline
  def press: press = "press".asInstanceOf[press]
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}

