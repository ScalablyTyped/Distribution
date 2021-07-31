package typings.webdriverio

import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ActionTypes
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ErrorCode
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.LocationParam
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.MixedContentType
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ReferrerPolicy
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ResourcePriority
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.SizeParam
import typings.webdriverio.webdriverioCoreMod.WebdriverIO.ThrottlePreset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverioStrings {
  
  @js.native
  sealed trait `-remote-debugging-port` extends StObject
  @scala.inline
  def `-remote-debugging-port`: `-remote-debugging-port` = "-remote-debugging-port".asInstanceOf[`-remote-debugging-port`]
  
  @js.native
  sealed trait Aborted
    extends StObject
       with ErrorCode
  @scala.inline
  def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with ErrorCode
  @scala.inline
  def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait AddressUnreachable
    extends StObject
       with ErrorCode
  @scala.inline
  def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @js.native
  sealed trait BlockedByClient
    extends StObject
       with ErrorCode
  @scala.inline
  def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  
  @js.native
  sealed trait BlockedByResponse
    extends StObject
       with ErrorCode
  @scala.inline
  def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  
  @js.native
  sealed trait ConnectionAborted
    extends StObject
       with ErrorCode
  @scala.inline
  def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ErrorCode
  @scala.inline
  def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with ErrorCode
  @scala.inline
  def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with ErrorCode
  @scala.inline
  def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  
  @js.native
  sealed trait ConnectionReset
    extends StObject
       with ErrorCode
  @scala.inline
  def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  
  @js.native
  sealed trait DSL
    extends StObject
       with ThrottlePreset
  @scala.inline
  def DSL: DSL = "DSL".asInstanceOf[DSL]
  
  @js.native
  sealed trait ELEMENT extends StObject
  @scala.inline
  def ELEMENT: ELEMENT = "ELEMENT".asInstanceOf[ELEMENT]
  
  @js.native
  sealed trait Failed
    extends StObject
       with ErrorCode
  @scala.inline
  def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait GPRS
    extends StObject
       with ThrottlePreset
  @scala.inline
  def GPRS: GPRS = "GPRS".asInstanceOf[GPRS]
  
  @js.native
  sealed trait Good2G
    extends StObject
       with ThrottlePreset
  @scala.inline
  def Good2G: Good2G = "Good2G".asInstanceOf[Good2G]
  
  @js.native
  sealed trait Good3G
    extends StObject
       with ThrottlePreset
  @scala.inline
  def Good3G: Good3G = "Good3G".asInstanceOf[Good3G]
  
  @js.native
  sealed trait High
    extends StObject
       with ResourcePriority
  @scala.inline
  def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait InternetDisconnected
    extends StObject
       with ErrorCode
  @scala.inline
  def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @js.native
  sealed trait Low
    extends StObject
       with ResourcePriority
  @scala.inline
  def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Medium
    extends StObject
       with ResourcePriority
  @scala.inline
  def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait NameNotResolved
    extends StObject
       with ErrorCode
  @scala.inline
  def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @js.native
  sealed trait Regular2G
    extends StObject
       with ThrottlePreset
  @scala.inline
  def Regular2G: Regular2G = "Regular2G".asInstanceOf[Regular2G]
  
  @js.native
  sealed trait Regular3G
    extends StObject
       with ThrottlePreset
  @scala.inline
  def Regular3G: Regular3G = "Regular3G".asInstanceOf[Regular3G]
  
  @js.native
  sealed trait Regular4G
    extends StObject
       with ThrottlePreset
  @scala.inline
  def Regular4G: Regular4G = "Regular4G".asInstanceOf[Regular4G]
  
  @js.native
  sealed trait TimedOut
    extends StObject
       with ErrorCode
  @scala.inline
  def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  
  @js.native
  sealed trait VeryHigh
    extends StObject
       with ResourcePriority
  @scala.inline
  def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  
  @js.native
  sealed trait VeryLow
    extends StObject
       with ResourcePriority
  @scala.inline
  def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  
  @js.native
  sealed trait WiFi
    extends StObject
       with ThrottlePreset
  @scala.inline
  def WiFi: WiFi = "WiFi".asInstanceOf[WiFi]
  
  @js.native
  sealed trait blockable
    extends StObject
       with MixedContentType
  @scala.inline
  def blockable: blockable = "blockable".asInstanceOf[blockable]
  
  @js.native
  sealed trait disconnected extends StObject
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait `element-6066-11e4-a52e-4f735466cecf` extends StObject
  @scala.inline
  def `element-6066-11e4-a52e-4f735466cecf`: `element-6066-11e4-a52e-4f735466cecf` = "element-6066-11e4-a52e-4f735466cecf".asInstanceOf[`element-6066-11e4-a52e-4f735466cecf`]
  
  @js.native
  sealed trait elementId extends StObject
  @scala.inline
  def elementId: elementId = "elementId".asInstanceOf[elementId]
  
  @js.native
  sealed trait height
    extends StObject
       with SizeParam
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait index extends StObject
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait isMultiremote extends StObject
  @scala.inline
  def isMultiremote: isMultiremote = "isMultiremote".asInstanceOf[isMultiremote]
  
  @js.native
  sealed trait longPress
    extends StObject
       with ActionTypes
  @scala.inline
  def longPress: longPress = "longPress".asInstanceOf[longPress]
  
  @js.native
  sealed trait moveTo
    extends StObject
       with ActionTypes
  @scala.inline
  def moveTo: moveTo = "moveTo".asInstanceOf[moveTo]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait none
    extends StObject
       with MixedContentType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait offline
    extends StObject
       with ThrottlePreset
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait online
    extends StObject
       with ThrottlePreset
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait `optionally-blockable`
    extends StObject
       with MixedContentType
  @scala.inline
  def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  
  @js.native
  sealed trait origin
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait parent extends StObject
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait press
    extends StObject
       with ActionTypes
  @scala.inline
  def press: press = "press".asInstanceOf[press]
  
  @js.native
  sealed trait release
    extends StObject
       with ActionTypes
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait selector extends StObject
  @scala.inline
  def selector: selector = "selector".asInstanceOf[selector]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait tap
    extends StObject
       with ActionTypes
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait wait
    extends StObject
       with ActionTypes
  
  @js.native
  sealed trait width
    extends StObject
       with SizeParam
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x
    extends StObject
       with LocationParam
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y
    extends StObject
       with LocationParam
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
