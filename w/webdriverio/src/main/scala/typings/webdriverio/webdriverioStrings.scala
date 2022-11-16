package typings.webdriverio

import typings.webdriverio.buildTypesMod.ActionTypes
import typings.webdriverio.buildTypesMod.ElementCommandNames
import typings.webdriverio.buildTypesMod.ElementQueryCommands
import typings.webdriverio.buildTypesMod.ElementsQueryCommands
import typings.webdriverio.buildTypesMod.MultiElementCommandNames
import typings.webdriverio.buildTypesMod.SingleElementCommandNames
import typings.webdriverio.buildUtilsInterceptionTypesMod.ErrorCode
import typings.webdriverio.buildUtilsInterceptionTypesMod.MixedContentType
import typings.webdriverio.buildUtilsInterceptionTypesMod.ReferrerPolicy
import typings.webdriverio.buildUtilsInterceptionTypesMod.ResourcePriority
import typings.webdriverio.buildUtilsInterceptionTypesMod.ThrottlePreset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverioStrings {
  
  @js.native
  sealed trait $
    extends StObject
       with ElementCommandNames
       with ElementQueryCommands
       with SingleElementCommandNames
  inline def $: $ = "$".asInstanceOf[$]
  
  @js.native
  sealed trait Aborted
    extends StObject
       with ErrorCode
  inline def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with ErrorCode
  inline def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait AddressUnreachable
    extends StObject
       with ErrorCode
  inline def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @js.native
  sealed trait BlockedByClient
    extends StObject
       with ErrorCode
  inline def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  
  @js.native
  sealed trait BlockedByResponse
    extends StObject
       with ErrorCode
  inline def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  
  @js.native
  sealed trait ConnectionAborted
    extends StObject
       with ErrorCode
  inline def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ErrorCode
  inline def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with ErrorCode
  inline def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with ErrorCode
  inline def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  
  @js.native
  sealed trait ConnectionReset
    extends StObject
       with ErrorCode
  inline def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  
  @js.native
  sealed trait DSL
    extends StObject
       with ThrottlePreset
  inline def DSL: DSL = "DSL".asInstanceOf[DSL]
  
  @js.native
  sealed trait DollarDollar
    extends StObject
       with ElementCommandNames
       with ElementsQueryCommands
       with MultiElementCommandNames
  inline def DollarDollar: DollarDollar = "$$".asInstanceOf[DollarDollar]
  
  @js.native
  sealed trait Failed
    extends StObject
       with ErrorCode
  inline def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait GPRS
    extends StObject
       with ThrottlePreset
  inline def GPRS: GPRS = "GPRS".asInstanceOf[GPRS]
  
  @js.native
  sealed trait Good2G
    extends StObject
       with ThrottlePreset
  inline def Good2G: Good2G = "Good2G".asInstanceOf[Good2G]
  
  @js.native
  sealed trait Good3G
    extends StObject
       with ThrottlePreset
  inline def Good3G: Good3G = "Good3G".asInstanceOf[Good3G]
  
  @js.native
  sealed trait High
    extends StObject
       with ResourcePriority
  inline def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait InternetDisconnected
    extends StObject
       with ErrorCode
  inline def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @js.native
  sealed trait Low
    extends StObject
       with ResourcePriority
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Medium
    extends StObject
       with ResourcePriority
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait NameNotResolved
    extends StObject
       with ErrorCode
  inline def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @js.native
  sealed trait Regular2G
    extends StObject
       with ThrottlePreset
  inline def Regular2G: Regular2G = "Regular2G".asInstanceOf[Regular2G]
  
  @js.native
  sealed trait Regular3G
    extends StObject
       with ThrottlePreset
  inline def Regular3G: Regular3G = "Regular3G".asInstanceOf[Regular3G]
  
  @js.native
  sealed trait Regular4G
    extends StObject
       with ThrottlePreset
  inline def Regular4G: Regular4G = "Regular4G".asInstanceOf[Regular4G]
  
  @js.native
  sealed trait TimedOut
    extends StObject
       with ErrorCode
  inline def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  
  @js.native
  sealed trait VeryHigh
    extends StObject
       with ResourcePriority
  inline def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  
  @js.native
  sealed trait VeryLow
    extends StObject
       with ResourcePriority
  inline def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  
  @js.native
  sealed trait WiFi
    extends StObject
       with ThrottlePreset
  inline def WiFi: WiFi = "WiFi".asInstanceOf[WiFi]
  
  @js.native
  sealed trait _getWindowSize extends StObject
  inline def _getWindowSize: _getWindowSize = "_getWindowSize".asInstanceOf[_getWindowSize]
  
  @js.native
  sealed trait _setWindowSize extends StObject
  inline def _setWindowSize: _setWindowSize = "_setWindowSize".asInstanceOf[_setWindowSize]
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait abbr extends StObject
  inline def abbr: abbr = "abbr".asInstanceOf[abbr]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait acceptAlert extends StObject
  inline def acceptAlert: acceptAlert = "acceptAlert".asInstanceOf[acceptAlert]
  
  @js.native
  sealed trait accessKey extends StObject
  inline def accessKey: accessKey = "accessKey".asInstanceOf[accessKey]
  
  @js.native
  sealed trait accessKeyLabel extends StObject
  inline def accessKeyLabel: accessKeyLabel = "accessKeyLabel".asInstanceOf[accessKeyLabel]
  
  @js.native
  sealed trait activateApp extends StObject
  inline def activateApp: activateApp = "activateApp".asInstanceOf[activateApp]
  
  @js.native
  sealed trait activateIME extends StObject
  inline def activateIME: activateIME = "activateIME".asInstanceOf[activateIME]
  
  @js.native
  sealed trait addCookie extends StObject
  inline def addCookie: addCookie = "addCookie".asInstanceOf[addCookie]
  
  @js.native
  sealed trait addCredential extends StObject
  inline def addCredential: addCredential = "addCredential".asInstanceOf[addCredential]
  
  @js.native
  sealed trait addValue extends StObject
  inline def addValue: addValue = "addValue".asInstanceOf[addValue]
  
  @js.native
  sealed trait addVirtualAuthenticator extends StObject
  inline def addVirtualAuthenticator: addVirtualAuthenticator = "addVirtualAuthenticator".asInstanceOf[addVirtualAuthenticator]
  
  @js.native
  sealed trait address extends StObject
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait animate extends StObject
  inline def animate: animate = "animate".asInstanceOf[animate]
  
  @js.native
  sealed trait animateMotion extends StObject
  inline def animateMotion: animateMotion = "animateMotion".asInstanceOf[animateMotion]
  
  @js.native
  sealed trait animateTransform extends StObject
  inline def animateTransform: animateTransform = "animateTransform".asInstanceOf[animateTransform]
  
  @js.native
  sealed trait animationcancel extends StObject
  inline def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  
  @js.native
  sealed trait animationend extends StObject
  inline def animationend: animationend = "animationend".asInstanceOf[animationend]
  
  @js.native
  sealed trait animationiteration extends StObject
  inline def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  
  @js.native
  sealed trait animationstart extends StObject
  inline def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  
  @js.native
  sealed trait area extends StObject
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait article extends StObject
  inline def article: article = "article".asInstanceOf[article]
  
  @js.native
  sealed trait aside extends StObject
  inline def aside: aside = "aside".asInstanceOf[aside]
  
  @js.native
  sealed trait assertPerformance extends StObject
  inline def assertPerformance: assertPerformance = "assertPerformance".asInstanceOf[assertPerformance]
  
  @js.native
  sealed trait async extends StObject
  inline def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait autocapitalize extends StObject
  inline def autocapitalize: autocapitalize = "autocapitalize".asInstanceOf[autocapitalize]
  
  @js.native
  sealed trait auxclick extends StObject
  inline def auxclick: auxclick = "auxclick".asInstanceOf[auxclick]
  
  @js.native
  sealed trait b extends StObject
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait back extends StObject
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait background extends StObject
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait bdi extends StObject
  inline def bdi: bdi = "bdi".asInstanceOf[bdi]
  
  @js.native
  sealed trait bdo extends StObject
  inline def bdo: bdo = "bdo".asInstanceOf[bdo]
  
  @js.native
  sealed trait beforeinput extends StObject
  inline def beforeinput: beforeinput = "beforeinput".asInstanceOf[beforeinput]
  
  @js.native
  sealed trait blockable
    extends StObject
       with MixedContentType
  inline def blockable: blockable = "blockable".asInstanceOf[blockable]
  
  @js.native
  sealed trait blockquote extends StObject
  inline def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait blur extends StObject
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait body extends StObject
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait boolean extends StObject
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait br extends StObject
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait browser extends StObject
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait button extends StObject
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait buttonDown extends StObject
  inline def buttonDown: buttonDown = "buttonDown".asInstanceOf[buttonDown]
  
  @js.native
  sealed trait buttonUp extends StObject
  inline def buttonUp: buttonUp = "buttonUp".asInstanceOf[buttonUp]
  
  @js.native
  sealed trait call extends StObject
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait cancel extends StObject
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canplay extends StObject
  inline def canplay: canplay = "canplay".asInstanceOf[canplay]
  
  @js.native
  sealed trait canplaythrough extends StObject
  inline def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  
  @js.native
  sealed trait canvas extends StObject
  inline def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait caption extends StObject
  inline def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait circle extends StObject
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait cite extends StObject
  inline def cite: cite = "cite".asInstanceOf[cite]
  
  @js.native
  sealed trait clearLocalStorage extends StObject
  inline def clearLocalStorage: clearLocalStorage = "clearLocalStorage".asInstanceOf[clearLocalStorage]
  
  @js.native
  sealed trait clearMockCalls extends StObject
  inline def clearMockCalls: clearMockCalls = "clearMockCalls".asInstanceOf[clearMockCalls]
  
  @js.native
  sealed trait clearSessionStorage extends StObject
  inline def clearSessionStorage: clearSessionStorage = "clearSessionStorage".asInstanceOf[clearSessionStorage]
  
  @js.native
  sealed trait clearValue extends StObject
  inline def clearValue: clearValue = "clearValue".asInstanceOf[clearValue]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait clipPath extends StObject
  inline def clipPath: clipPath = "clipPath".asInstanceOf[clipPath]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait closeApp extends StObject
  inline def closeApp: closeApp = "closeApp".asInstanceOf[closeApp]
  
  @js.native
  sealed trait closeWindow extends StObject
  inline def closeWindow: closeWindow = "closeWindow".asInstanceOf[closeWindow]
  
  @js.native
  sealed trait code extends StObject
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait col extends StObject
  inline def col: col = "col".asInstanceOf[col]
  
  @js.native
  sealed trait colgroup extends StObject
  inline def colgroup: colgroup = "colgroup".asInstanceOf[colgroup]
  
  @js.native
  sealed trait compareImages extends StObject
  inline def compareImages: compareImages = "compareImages".asInstanceOf[compareImages]
  
  @js.native
  sealed trait compositionend extends StObject
  inline def compositionend: compositionend = "compositionend".asInstanceOf[compositionend]
  
  @js.native
  sealed trait compositionstart extends StObject
  inline def compositionstart: compositionstart = "compositionstart".asInstanceOf[compositionstart]
  
  @js.native
  sealed trait compositionupdate extends StObject
  inline def compositionupdate: compositionupdate = "compositionupdate".asInstanceOf[compositionupdate]
  
  @js.native
  sealed trait contextmenu extends StObject
  inline def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait copy extends StObject
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait createMockSensor extends StObject
  inline def createMockSensor: createMockSensor = "createMockSensor".asInstanceOf[createMockSensor]
  
  @js.native
  sealed trait createWindow extends StObject
  inline def createWindow: createWindow = "createWindow".asInstanceOf[createWindow]
  
  @js.native
  sealed trait cuechange extends StObject
  inline def cuechange: cuechange = "cuechange".asInstanceOf[cuechange]
  
  @js.native
  sealed trait custom$
    extends StObject
       with ElementCommandNames
       with ElementQueryCommands
       with SingleElementCommandNames
  inline def custom$: custom$ = "custom$".asInstanceOf[custom$]
  
  @js.native
  sealed trait customDollarDollar
    extends StObject
       with ElementCommandNames
       with ElementsQueryCommands
       with MultiElementCommandNames
  inline def customDollarDollar: customDollarDollar = "custom$$".asInstanceOf[customDollarDollar]
  
  @js.native
  sealed trait cut extends StObject
  inline def cut: cut = "cut".asInstanceOf[cut]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait datalist extends StObject
  inline def datalist: datalist = "datalist".asInstanceOf[datalist]
  
  @js.native
  sealed trait dblclick extends StObject
  inline def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @js.native
  sealed trait dd extends StObject
  inline def dd: dd = "dd".asInstanceOf[dd]
  
  @js.native
  sealed trait deactivateIME extends StObject
  inline def deactivateIME: deactivateIME = "deactivateIME".asInstanceOf[deactivateIME]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait defs extends StObject
  inline def defs: defs = "defs".asInstanceOf[defs]
  
  @js.native
  sealed trait del extends StObject
  inline def del: del = "del".asInstanceOf[del]
  
  @js.native
  sealed trait deleteAllCookies extends StObject
  inline def deleteAllCookies: deleteAllCookies = "deleteAllCookies".asInstanceOf[deleteAllCookies]
  
  @js.native
  sealed trait deleteCookie extends StObject
  inline def deleteCookie: deleteCookie = "deleteCookie".asInstanceOf[deleteCookie]
  
  @js.native
  sealed trait deleteCookies extends StObject
  inline def deleteCookies: deleteCookies = "deleteCookies".asInstanceOf[deleteCookies]
  
  @js.native
  sealed trait deleteLocalStorageItem extends StObject
  inline def deleteLocalStorageItem: deleteLocalStorageItem = "deleteLocalStorageItem".asInstanceOf[deleteLocalStorageItem]
  
  @js.native
  sealed trait deleteMockSensor extends StObject
  inline def deleteMockSensor: deleteMockSensor = "deleteMockSensor".asInstanceOf[deleteMockSensor]
  
  @js.native
  sealed trait deleteNetworkConditions extends StObject
  inline def deleteNetworkConditions: deleteNetworkConditions = "deleteNetworkConditions".asInstanceOf[deleteNetworkConditions]
  
  @js.native
  sealed trait deleteSession extends StObject
  inline def deleteSession: deleteSession = "deleteSession".asInstanceOf[deleteSession]
  
  @js.native
  sealed trait deleteSessionStorageItem extends StObject
  inline def deleteSessionStorageItem: deleteSessionStorageItem = "deleteSessionStorageItem".asInstanceOf[deleteSessionStorageItem]
  
  @js.native
  sealed trait desc extends StObject
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait details extends StObject
  inline def details: details = "details".asInstanceOf[details]
  
  @js.native
  sealed trait dfn extends StObject
  inline def dfn: dfn = "dfn".asInstanceOf[dfn]
  
  @js.native
  sealed trait dialog extends StObject
  inline def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait dir extends StObject
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait dismissAlert extends StObject
  inline def dismissAlert: dismissAlert = "dismissAlert".asInstanceOf[dismissAlert]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait dl extends StObject
  inline def dl: dl = "dl".asInstanceOf[dl]
  
  @js.native
  sealed trait doubleClick extends StObject
  inline def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait drag extends StObject
  inline def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dragAndDrop extends StObject
  inline def dragAndDrop: dragAndDrop = "dragAndDrop".asInstanceOf[dragAndDrop]
  
  @js.native
  sealed trait dragend extends StObject
  inline def dragend: dragend = "dragend".asInstanceOf[dragend]
  
  @js.native
  sealed trait dragenter extends StObject
  inline def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  
  @js.native
  sealed trait draggable extends StObject
  inline def draggable: draggable = "draggable".asInstanceOf[draggable]
  
  @js.native
  sealed trait dragleave extends StObject
  inline def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  
  @js.native
  sealed trait dragover extends StObject
  inline def dragover: dragover = "dragover".asInstanceOf[dragover]
  
  @js.native
  sealed trait dragstart extends StObject
  inline def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @js.native
  sealed trait driverScript extends StObject
  inline def driverScript: driverScript = "driverScript".asInstanceOf[driverScript]
  
  @js.native
  sealed trait drop extends StObject
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait dt extends StObject
  inline def dt: dt = "dt".asInstanceOf[dt]
  
  @js.native
  sealed trait durationchange extends StObject
  inline def durationchange: durationchange = "durationchange".asInstanceOf[durationchange]
  
  @js.native
  sealed trait element extends StObject
  inline def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait elementClear extends StObject
  inline def elementClear: elementClear = "elementClear".asInstanceOf[elementClear]
  
  @js.native
  sealed trait elementClick extends StObject
  inline def elementClick: elementClick = "elementClick".asInstanceOf[elementClick]
  
  @js.native
  sealed trait elementEquals extends StObject
  inline def elementEquals: elementEquals = "elementEquals".asInstanceOf[elementEquals]
  
  @js.native
  sealed trait elementHover extends StObject
  inline def elementHover: elementHover = "elementHover".asInstanceOf[elementHover]
  
  @js.native
  sealed trait elementSendKeys extends StObject
  inline def elementSendKeys: elementSendKeys = "elementSendKeys".asInstanceOf[elementSendKeys]
  
  @js.native
  sealed trait elementSubmit extends StObject
  inline def elementSubmit: elementSubmit = "elementSubmit".asInstanceOf[elementSubmit]
  
  @js.native
  sealed trait ellipse extends StObject
  inline def ellipse: ellipse = "ellipse".asInstanceOf[ellipse]
  
  @js.native
  sealed trait em extends StObject
  inline def em: em = "em".asInstanceOf[em]
  
  @js.native
  sealed trait embed extends StObject
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait emptied extends StObject
  inline def emptied: emptied = "emptied".asInstanceOf[emptied]
  
  @js.native
  sealed trait endCoverage extends StObject
  inline def endCoverage: endCoverage = "endCoverage".asInstanceOf[endCoverage]
  
  @js.native
  sealed trait ended extends StObject
  inline def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait execute extends StObject
  inline def execute: execute = "execute".asInstanceOf[execute]
  
  @js.native
  sealed trait executeAsync extends StObject
  inline def executeAsync: executeAsync = "executeAsync".asInstanceOf[executeAsync]
  
  @js.native
  sealed trait executeAsyncScript extends StObject
  inline def executeAsyncScript: executeAsyncScript = "executeAsyncScript".asInstanceOf[executeAsyncScript]
  
  @js.native
  sealed trait executeScript extends StObject
  inline def executeScript: executeScript = "executeScript".asInstanceOf[executeScript]
  
  @js.native
  sealed trait feBlend extends StObject
  inline def feBlend: feBlend = "feBlend".asInstanceOf[feBlend]
  
  @js.native
  sealed trait feColorMatrix extends StObject
  inline def feColorMatrix: feColorMatrix = "feColorMatrix".asInstanceOf[feColorMatrix]
  
  @js.native
  sealed trait feComponentTransfer extends StObject
  inline def feComponentTransfer: feComponentTransfer = "feComponentTransfer".asInstanceOf[feComponentTransfer]
  
  @js.native
  sealed trait feComposite extends StObject
  inline def feComposite: feComposite = "feComposite".asInstanceOf[feComposite]
  
  @js.native
  sealed trait feConvolveMatrix extends StObject
  inline def feConvolveMatrix: feConvolveMatrix = "feConvolveMatrix".asInstanceOf[feConvolveMatrix]
  
  @js.native
  sealed trait feDiffuseLighting extends StObject
  inline def feDiffuseLighting: feDiffuseLighting = "feDiffuseLighting".asInstanceOf[feDiffuseLighting]
  
  @js.native
  sealed trait feDisplacementMap extends StObject
  inline def feDisplacementMap: feDisplacementMap = "feDisplacementMap".asInstanceOf[feDisplacementMap]
  
  @js.native
  sealed trait feDistantLight extends StObject
  inline def feDistantLight: feDistantLight = "feDistantLight".asInstanceOf[feDistantLight]
  
  @js.native
  sealed trait feDropShadow extends StObject
  inline def feDropShadow: feDropShadow = "feDropShadow".asInstanceOf[feDropShadow]
  
  @js.native
  sealed trait feFlood extends StObject
  inline def feFlood: feFlood = "feFlood".asInstanceOf[feFlood]
  
  @js.native
  sealed trait feFuncA extends StObject
  inline def feFuncA: feFuncA = "feFuncA".asInstanceOf[feFuncA]
  
  @js.native
  sealed trait feFuncB extends StObject
  inline def feFuncB: feFuncB = "feFuncB".asInstanceOf[feFuncB]
  
  @js.native
  sealed trait feFuncG extends StObject
  inline def feFuncG: feFuncG = "feFuncG".asInstanceOf[feFuncG]
  
  @js.native
  sealed trait feFuncR extends StObject
  inline def feFuncR: feFuncR = "feFuncR".asInstanceOf[feFuncR]
  
  @js.native
  sealed trait feGaussianBlur extends StObject
  inline def feGaussianBlur: feGaussianBlur = "feGaussianBlur".asInstanceOf[feGaussianBlur]
  
  @js.native
  sealed trait feImage extends StObject
  inline def feImage: feImage = "feImage".asInstanceOf[feImage]
  
  @js.native
  sealed trait feMerge extends StObject
  inline def feMerge: feMerge = "feMerge".asInstanceOf[feMerge]
  
  @js.native
  sealed trait feMergeNode extends StObject
  inline def feMergeNode: feMergeNode = "feMergeNode".asInstanceOf[feMergeNode]
  
  @js.native
  sealed trait feMorphology extends StObject
  inline def feMorphology: feMorphology = "feMorphology".asInstanceOf[feMorphology]
  
  @js.native
  sealed trait feOffset extends StObject
  inline def feOffset: feOffset = "feOffset".asInstanceOf[feOffset]
  
  @js.native
  sealed trait fePointLight extends StObject
  inline def fePointLight: fePointLight = "fePointLight".asInstanceOf[fePointLight]
  
  @js.native
  sealed trait feSpecularLighting extends StObject
  inline def feSpecularLighting: feSpecularLighting = "feSpecularLighting".asInstanceOf[feSpecularLighting]
  
  @js.native
  sealed trait feSpotLight extends StObject
  inline def feSpotLight: feSpotLight = "feSpotLight".asInstanceOf[feSpotLight]
  
  @js.native
  sealed trait feTile extends StObject
  inline def feTile: feTile = "feTile".asInstanceOf[feTile]
  
  @js.native
  sealed trait feTurbulence extends StObject
  inline def feTurbulence: feTurbulence = "feTurbulence".asInstanceOf[feTurbulence]
  
  @js.native
  sealed trait fieldset extends StObject
  inline def fieldset: fieldset = "fieldset".asInstanceOf[fieldset]
  
  @js.native
  sealed trait figcaption extends StObject
  inline def figcaption: figcaption = "figcaption".asInstanceOf[figcaption]
  
  @js.native
  sealed trait figure extends StObject
  inline def figure: figure = "figure".asInstanceOf[figure]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filter extends StObject
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait findElement extends StObject
  inline def findElement: findElement = "findElement".asInstanceOf[findElement]
  
  @js.native
  sealed trait findElementFromElement extends StObject
  inline def findElementFromElement: findElementFromElement = "findElementFromElement".asInstanceOf[findElementFromElement]
  
  @js.native
  sealed trait findElementFromShadowRoot extends StObject
  inline def findElementFromShadowRoot: findElementFromShadowRoot = "findElementFromShadowRoot".asInstanceOf[findElementFromShadowRoot]
  
  @js.native
  sealed trait findElements extends StObject
  inline def findElements: findElements = "findElements".asInstanceOf[findElements]
  
  @js.native
  sealed trait findElementsFromElement extends StObject
  inline def findElementsFromElement: findElementsFromElement = "findElementsFromElement".asInstanceOf[findElementsFromElement]
  
  @js.native
  sealed trait findElementsFromShadowRoot extends StObject
  inline def findElementsFromShadowRoot: findElementsFromShadowRoot = "findElementsFromShadowRoot".asInstanceOf[findElementsFromShadowRoot]
  
  @js.native
  sealed trait fingerPrint extends StObject
  inline def fingerPrint: fingerPrint = "fingerPrint".asInstanceOf[fingerPrint]
  
  @js.native
  sealed trait focus extends StObject
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait focusin extends StObject
  inline def focusin: focusin = "focusin".asInstanceOf[focusin]
  
  @js.native
  sealed trait focusout extends StObject
  inline def focusout: focusout = "focusout".asInstanceOf[focusout]
  
  @js.native
  sealed trait footer extends StObject
  inline def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait foreignObject extends StObject
  inline def foreignObject: foreignObject = "foreignObject".asInstanceOf[foreignObject]
  
  @js.native
  sealed trait form extends StObject
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait formdata extends StObject
  inline def formdata: formdata = "formdata".asInstanceOf[formdata]
  
  @js.native
  sealed trait forward extends StObject
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait freeze extends StObject
  inline def freeze: freeze = "freeze".asInstanceOf[freeze]
  
  @js.native
  sealed trait fullscreenWindow extends StObject
  inline def fullscreenWindow: fullscreenWindow = "fullscreenWindow".asInstanceOf[fullscreenWindow]
  
  @js.native
  sealed trait fullscreenchange extends StObject
  inline def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @js.native
  sealed trait fullscreenerror extends StObject
  inline def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @js.native
  sealed trait function extends StObject
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait g extends StObject
  inline def g: g = "g".asInstanceOf[g]
  
  @js.native
  sealed trait generateTestReport extends StObject
  inline def generateTestReport: generateTestReport = "generateTestReport".asInstanceOf[generateTestReport]
  
  @js.native
  sealed trait getActiveElement extends StObject
  inline def getActiveElement: getActiveElement = "getActiveElement".asInstanceOf[getActiveElement]
  
  @js.native
  sealed trait getActiveEngine extends StObject
  inline def getActiveEngine: getActiveEngine = "getActiveEngine".asInstanceOf[getActiveEngine]
  
  @js.native
  sealed trait getAlertText extends StObject
  inline def getAlertText: getAlertText = "getAlertText".asInstanceOf[getAlertText]
  
  @js.native
  sealed trait getAllCookies extends StObject
  inline def getAllCookies: getAllCookies = "getAllCookies".asInstanceOf[getAllCookies]
  
  @js.native
  sealed trait getApplicationCacheStatus extends StObject
  inline def getApplicationCacheStatus: getApplicationCacheStatus = "getApplicationCacheStatus".asInstanceOf[getApplicationCacheStatus]
  
  @js.native
  sealed trait getAttribute extends StObject
  inline def getAttribute: getAttribute = "getAttribute".asInstanceOf[getAttribute]
  
  @js.native
  sealed trait getAvailableEngines extends StObject
  inline def getAvailableEngines: getAvailableEngines = "getAvailableEngines".asInstanceOf[getAvailableEngines]
  
  @js.native
  sealed trait getCSSProperty extends StObject
  inline def getCSSProperty: getCSSProperty = "getCSSProperty".asInstanceOf[getCSSProperty]
  
  @js.native
  sealed trait getCastIssueMessage extends StObject
  inline def getCastIssueMessage: getCastIssueMessage = "getCastIssueMessage".asInstanceOf[getCastIssueMessage]
  
  @js.native
  sealed trait getCastSinks extends StObject
  inline def getCastSinks: getCastSinks = "getCastSinks".asInstanceOf[getCastSinks]
  
  @js.native
  sealed trait getClipboard extends StObject
  inline def getClipboard: getClipboard = "getClipboard".asInstanceOf[getClipboard]
  
  @js.native
  sealed trait getComputedLabel extends StObject
  inline def getComputedLabel: getComputedLabel = "getComputedLabel".asInstanceOf[getComputedLabel]
  
  @js.native
  sealed trait getComputedRole extends StObject
  inline def getComputedRole: getComputedRole = "getComputedRole".asInstanceOf[getComputedRole]
  
  @js.native
  sealed trait getContext extends StObject
  inline def getContext: getContext = "getContext".asInstanceOf[getContext]
  
  @js.native
  sealed trait getContexts extends StObject
  inline def getContexts: getContexts = "getContexts".asInstanceOf[getContexts]
  
  @js.native
  sealed trait getCookies extends StObject
  inline def getCookies: getCookies = "getCookies".asInstanceOf[getCookies]
  
  @js.native
  sealed trait getCredentials extends StObject
  inline def getCredentials: getCredentials = "getCredentials".asInstanceOf[getCredentials]
  
  @js.native
  sealed trait getCurrentActivity extends StObject
  inline def getCurrentActivity: getCurrentActivity = "getCurrentActivity".asInstanceOf[getCurrentActivity]
  
  @js.native
  sealed trait getCurrentPackage extends StObject
  inline def getCurrentPackage: getCurrentPackage = "getCurrentPackage".asInstanceOf[getCurrentPackage]
  
  @js.native
  sealed trait getDeviceTime extends StObject
  inline def getDeviceTime: getDeviceTime = "getDeviceTime".asInstanceOf[getDeviceTime]
  
  @js.native
  sealed trait getDisplayDensity extends StObject
  inline def getDisplayDensity: getDisplayDensity = "getDisplayDensity".asInstanceOf[getDisplayDensity]
  
  @js.native
  sealed trait getElementAttribute extends StObject
  inline def getElementAttribute: getElementAttribute = "getElementAttribute".asInstanceOf[getElementAttribute]
  
  @js.native
  sealed trait getElementCSSValue extends StObject
  inline def getElementCSSValue: getElementCSSValue = "getElementCSSValue".asInstanceOf[getElementCSSValue]
  
  @js.native
  sealed trait getElementComputedLabel extends StObject
  inline def getElementComputedLabel: getElementComputedLabel = "getElementComputedLabel".asInstanceOf[getElementComputedLabel]
  
  @js.native
  sealed trait getElementComputedRole extends StObject
  inline def getElementComputedRole: getElementComputedRole = "getElementComputedRole".asInstanceOf[getElementComputedRole]
  
  @js.native
  sealed trait getElementLocation extends StObject
  inline def getElementLocation: getElementLocation = "getElementLocation".asInstanceOf[getElementLocation]
  
  @js.native
  sealed trait getElementLocationInView extends StObject
  inline def getElementLocationInView: getElementLocationInView = "getElementLocationInView".asInstanceOf[getElementLocationInView]
  
  @js.native
  sealed trait getElementProperty extends StObject
  inline def getElementProperty: getElementProperty = "getElementProperty".asInstanceOf[getElementProperty]
  
  @js.native
  sealed trait getElementRect extends StObject
  inline def getElementRect: getElementRect = "getElementRect".asInstanceOf[getElementRect]
  
  @js.native
  sealed trait getElementShadowRoot extends StObject
  inline def getElementShadowRoot: getElementShadowRoot = "getElementShadowRoot".asInstanceOf[getElementShadowRoot]
  
  @js.native
  sealed trait getElementSize extends StObject
  inline def getElementSize: getElementSize = "getElementSize".asInstanceOf[getElementSize]
  
  @js.native
  sealed trait getElementTagName extends StObject
  inline def getElementTagName: getElementTagName = "getElementTagName".asInstanceOf[getElementTagName]
  
  @js.native
  sealed trait getElementText extends StObject
  inline def getElementText: getElementText = "getElementText".asInstanceOf[getElementText]
  
  @js.native
  sealed trait getElementValue extends StObject
  inline def getElementValue: getElementValue = "getElementValue".asInstanceOf[getElementValue]
  
  @js.native
  sealed trait getEvents extends StObject
  inline def getEvents: getEvents = "getEvents".asInstanceOf[getEvents]
  
  @js.native
  sealed trait getGeoLocation extends StObject
  inline def getGeoLocation: getGeoLocation = "getGeoLocation".asInstanceOf[getGeoLocation]
  
  @js.native
  sealed trait getHTML extends StObject
  inline def getHTML: getHTML = "getHTML".asInstanceOf[getHTML]
  
  @js.native
  sealed trait getHubConfig extends StObject
  inline def getHubConfig: getHubConfig = "getHubConfig".asInstanceOf[getHubConfig]
  
  @js.native
  sealed trait getLocalStorage extends StObject
  inline def getLocalStorage: getLocalStorage = "getLocalStorage".asInstanceOf[getLocalStorage]
  
  @js.native
  sealed trait getLocalStorageItem extends StObject
  inline def getLocalStorageItem: getLocalStorageItem = "getLocalStorageItem".asInstanceOf[getLocalStorageItem]
  
  @js.native
  sealed trait getLocalStorageSize extends StObject
  inline def getLocalStorageSize: getLocalStorageSize = "getLocalStorageSize".asInstanceOf[getLocalStorageSize]
  
  @js.native
  sealed trait getLocation extends StObject
  inline def getLocation: getLocation = "getLocation".asInstanceOf[getLocation]
  
  @js.native
  sealed trait getLogTypes extends StObject
  inline def getLogTypes: getLogTypes = "getLogTypes".asInstanceOf[getLogTypes]
  
  @js.native
  sealed trait getLogs extends StObject
  inline def getLogs: getLogs = "getLogs".asInstanceOf[getLogs]
  
  @js.native
  sealed trait getMockCalls extends StObject
  inline def getMockCalls: getMockCalls = "getMockCalls".asInstanceOf[getMockCalls]
  
  @js.native
  sealed trait getMockSensor extends StObject
  inline def getMockSensor: getMockSensor = "getMockSensor".asInstanceOf[getMockSensor]
  
  @js.native
  sealed trait getNamedCookie extends StObject
  inline def getNamedCookie: getNamedCookie = "getNamedCookie".asInstanceOf[getNamedCookie]
  
  @js.native
  sealed trait getNetworkConditions extends StObject
  inline def getNetworkConditions: getNetworkConditions = "getNetworkConditions".asInstanceOf[getNetworkConditions]
  
  @js.native
  sealed trait getNetworkConnection extends StObject
  inline def getNetworkConnection: getNetworkConnection = "getNetworkConnection".asInstanceOf[getNetworkConnection]
  
  @js.native
  sealed trait getOrientation extends StObject
  inline def getOrientation: getOrientation = "getOrientation".asInstanceOf[getOrientation]
  
  @js.native
  sealed trait getPageIndex extends StObject
  inline def getPageIndex: getPageIndex = "getPageIndex".asInstanceOf[getPageIndex]
  
  @js.native
  sealed trait getPageLogs extends StObject
  inline def getPageLogs: getPageLogs = "getPageLogs".asInstanceOf[getPageLogs]
  
  @js.native
  sealed trait getPageSource extends StObject
  inline def getPageSource: getPageSource = "getPageSource".asInstanceOf[getPageSource]
  
  @js.native
  sealed trait getPerformanceData extends StObject
  inline def getPerformanceData: getPerformanceData = "getPerformanceData".asInstanceOf[getPerformanceData]
  
  @js.native
  sealed trait getPerformanceDataTypes extends StObject
  inline def getPerformanceDataTypes: getPerformanceDataTypes = "getPerformanceDataTypes".asInstanceOf[getPerformanceDataTypes]
  
  @js.native
  sealed trait getProperty extends StObject
  inline def getProperty: getProperty = "getProperty".asInstanceOf[getProperty]
  
  @js.native
  sealed trait getPuppeteer extends StObject
  inline def getPuppeteer: getPuppeteer = "getPuppeteer".asInstanceOf[getPuppeteer]
  
  @js.native
  sealed trait getSession extends StObject
  inline def getSession: getSession = "getSession".asInstanceOf[getSession]
  
  @js.native
  sealed trait getSessionStorage extends StObject
  inline def getSessionStorage: getSessionStorage = "getSessionStorage".asInstanceOf[getSessionStorage]
  
  @js.native
  sealed trait getSessionStorageItem extends StObject
  inline def getSessionStorageItem: getSessionStorageItem = "getSessionStorageItem".asInstanceOf[getSessionStorageItem]
  
  @js.native
  sealed trait getSessionStorageSize extends StObject
  inline def getSessionStorageSize: getSessionStorageSize = "getSessionStorageSize".asInstanceOf[getSessionStorageSize]
  
  @js.native
  sealed trait getSessions extends StObject
  inline def getSessions: getSessions = "getSessions".asInstanceOf[getSessions]
  
  @js.native
  sealed trait getSettings extends StObject
  inline def getSettings: getSettings = "getSettings".asInstanceOf[getSettings]
  
  @js.native
  sealed trait getSize extends StObject
  inline def getSize: getSize = "getSize".asInstanceOf[getSize]
  
  @js.native
  sealed trait getStrings extends StObject
  inline def getStrings: getStrings = "getStrings".asInstanceOf[getStrings]
  
  @js.native
  sealed trait getSystemBars extends StObject
  inline def getSystemBars: getSystemBars = "getSystemBars".asInstanceOf[getSystemBars]
  
  @js.native
  sealed trait getTagName extends StObject
  inline def getTagName: getTagName = "getTagName".asInstanceOf[getTagName]
  
  @js.native
  sealed trait getText extends StObject
  inline def getText: getText = "getText".asInstanceOf[getText]
  
  @js.native
  sealed trait getTimeouts extends StObject
  inline def getTimeouts: getTimeouts = "getTimeouts".asInstanceOf[getTimeouts]
  
  @js.native
  sealed trait getTitle extends StObject
  inline def getTitle: getTitle = "getTitle".asInstanceOf[getTitle]
  
  @js.native
  sealed trait getUrl extends StObject
  inline def getUrl: getUrl = "getUrl".asInstanceOf[getUrl]
  
  @js.native
  sealed trait getValue extends StObject
  inline def getValue: getValue = "getValue".asInstanceOf[getValue]
  
  @js.native
  sealed trait getWindowHandle extends StObject
  inline def getWindowHandle: getWindowHandle = "getWindowHandle".asInstanceOf[getWindowHandle]
  
  @js.native
  sealed trait getWindowHandles extends StObject
  inline def getWindowHandles: getWindowHandles = "getWindowHandles".asInstanceOf[getWindowHandles]
  
  @js.native
  sealed trait getWindowPosition extends StObject
  inline def getWindowPosition: getWindowPosition = "getWindowPosition".asInstanceOf[getWindowPosition]
  
  @js.native
  sealed trait getWindowRect extends StObject
  inline def getWindowRect: getWindowRect = "getWindowRect".asInstanceOf[getWindowRect]
  
  @js.native
  sealed trait getWindowSize extends StObject
  inline def getWindowSize: getWindowSize = "getWindowSize".asInstanceOf[getWindowSize]
  
  @js.native
  sealed trait gotpointercapture extends StObject
  inline def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  
  @js.native
  sealed trait gridProxyDetails extends StObject
  inline def gridProxyDetails: gridProxyDetails = "gridProxyDetails".asInstanceOf[gridProxyDetails]
  
  @js.native
  sealed trait gridTestSession extends StObject
  inline def gridTestSession: gridTestSession = "gridTestSession".asInstanceOf[gridTestSession]
  
  @js.native
  sealed trait gsmCall extends StObject
  inline def gsmCall: gsmCall = "gsmCall".asInstanceOf[gsmCall]
  
  @js.native
  sealed trait gsmSignal extends StObject
  inline def gsmSignal: gsmSignal = "gsmSignal".asInstanceOf[gsmSignal]
  
  @js.native
  sealed trait gsmVoice extends StObject
  inline def gsmVoice: gsmVoice = "gsmVoice".asInstanceOf[gsmVoice]
  
  @js.native
  sealed trait h1 extends StObject
  inline def h1: h1 = "h1".asInstanceOf[h1]
  
  @js.native
  sealed trait h2 extends StObject
  inline def h2: h2 = "h2".asInstanceOf[h2]
  
  @js.native
  sealed trait h3 extends StObject
  inline def h3: h3 = "h3".asInstanceOf[h3]
  
  @js.native
  sealed trait h4 extends StObject
  inline def h4: h4 = "h4".asInstanceOf[h4]
  
  @js.native
  sealed trait h5 extends StObject
  inline def h5: h5 = "h5".asInstanceOf[h5]
  
  @js.native
  sealed trait h6 extends StObject
  inline def h6: h6 = "h6".asInstanceOf[h6]
  
  @js.native
  sealed trait head extends StObject
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait header extends StObject
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait height extends StObject
  inline def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait hgroup extends StObject
  inline def hgroup: hgroup = "hgroup".asInstanceOf[hgroup]
  
  @js.native
  sealed trait hidden extends StObject
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hideKeyboard extends StObject
  inline def hideKeyboard: hideKeyboard = "hideKeyboard".asInstanceOf[hideKeyboard]
  
  @js.native
  sealed trait hr extends StObject
  inline def hr: hr = "hr".asInstanceOf[hr]
  
  @js.native
  sealed trait html extends StObject
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml extends StObject
  inline def httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml = "http://www.w3.org/1999/xhtml".asInstanceOf[httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml]
  
  @js.native
  sealed trait httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg extends StObject
  inline def httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg = "http://www.w3.org/2000/svg".asInstanceOf[httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg]
  
  @js.native
  sealed trait i extends StObject
  inline def i: i = "i".asInstanceOf[i]
  
  @js.native
  sealed trait iframe extends StObject
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image extends StObject
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait img extends StObject
  inline def img: img = "img".asInstanceOf[img]
  
  @js.native
  sealed trait inert extends StObject
  inline def inert: inert = "inert".asInstanceOf[inert]
  
  @js.native
  sealed trait innerText extends StObject
  inline def innerText: innerText = "innerText".asInstanceOf[innerText]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait ins extends StObject
  inline def ins: ins = "ins".asInstanceOf[ins]
  
  @js.native
  sealed trait installApp extends StObject
  inline def installApp: installApp = "installApp".asInstanceOf[installApp]
  
  @js.native
  sealed trait interceptRequest extends StObject
  inline def interceptRequest: interceptRequest = "interceptRequest".asInstanceOf[interceptRequest]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait isAlertOpen extends StObject
  inline def isAlertOpen: isAlertOpen = "isAlertOpen".asInstanceOf[isAlertOpen]
  
  @js.native
  sealed trait isAppInstalled extends StObject
  inline def isAppInstalled: isAppInstalled = "isAppInstalled".asInstanceOf[isAppInstalled]
  
  @js.native
  sealed trait isAutoReporting extends StObject
  inline def isAutoReporting: isAutoReporting = "isAutoReporting".asInstanceOf[isAutoReporting]
  
  @js.native
  sealed trait isClickable extends StObject
  inline def isClickable: isClickable = "isClickable".asInstanceOf[isClickable]
  
  @js.native
  sealed trait isDisplayed extends StObject
  inline def isDisplayed: isDisplayed = "isDisplayed".asInstanceOf[isDisplayed]
  
  @js.native
  sealed trait isDisplayedInViewport extends StObject
  inline def isDisplayedInViewport: isDisplayedInViewport = "isDisplayedInViewport".asInstanceOf[isDisplayedInViewport]
  
  @js.native
  sealed trait isElementDisplayed extends StObject
  inline def isElementDisplayed: isElementDisplayed = "isElementDisplayed".asInstanceOf[isElementDisplayed]
  
  @js.native
  sealed trait isElementEnabled extends StObject
  inline def isElementEnabled: isElementEnabled = "isElementEnabled".asInstanceOf[isElementEnabled]
  
  @js.native
  sealed trait isElementSelected extends StObject
  inline def isElementSelected: isElementSelected = "isElementSelected".asInstanceOf[isElementSelected]
  
  @js.native
  sealed trait isEnabled extends StObject
  inline def isEnabled: isEnabled = "isEnabled".asInstanceOf[isEnabled]
  
  @js.native
  sealed trait isEqual extends StObject
  inline def isEqual: isEqual = "isEqual".asInstanceOf[isEqual]
  
  @js.native
  sealed trait isExisting extends StObject
  inline def isExisting: isExisting = "isExisting".asInstanceOf[isExisting]
  
  @js.native
  sealed trait isFocused extends StObject
  inline def isFocused: isFocused = "isFocused".asInstanceOf[isFocused]
  
  @js.native
  sealed trait isIMEActivated extends StObject
  inline def isIMEActivated: isIMEActivated = "isIMEActivated".asInstanceOf[isIMEActivated]
  
  @js.native
  sealed trait isKeyboardShown extends StObject
  inline def isKeyboardShown: isKeyboardShown = "isKeyboardShown".asInstanceOf[isKeyboardShown]
  
  @js.native
  sealed trait isLoading extends StObject
  inline def isLoading: isLoading = "isLoading".asInstanceOf[isLoading]
  
  @js.native
  sealed trait isLocked extends StObject
  inline def isLocked: isLocked = "isLocked".asInstanceOf[isLocked]
  
  @js.native
  sealed trait isSelected extends StObject
  inline def isSelected: isSelected = "isSelected".asInstanceOf[isSelected]
  
  @js.native
  sealed trait jankinessCheck extends StObject
  inline def jankinessCheck: jankinessCheck = "jankinessCheck".asInstanceOf[jankinessCheck]
  
  @js.native
  sealed trait kbd extends StObject
  inline def kbd: kbd = "kbd".asInstanceOf[kbd]
  
  @js.native
  sealed trait key extends StObject
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait keyDown extends StObject
  inline def keyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  
  @js.native
  sealed trait keyUp extends StObject
  inline def keyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  
  @js.native
  sealed trait keydown_ extends StObject
  inline def keydown_ : keydown_ = "keydown".asInstanceOf[keydown_]
  
  @js.native
  sealed trait keypress extends StObject
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keys extends StObject
  inline def keys: keys = "keys".asInstanceOf[keys]
  
  @js.native
  sealed trait keyup_ extends StObject
  inline def keyup_ : keyup_ = "keyup".asInstanceOf[keyup_]
  
  @js.native
  sealed trait label extends StObject
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait lang extends StObject
  inline def lang: lang = "lang".asInstanceOf[lang]
  
  @js.native
  sealed trait launchApp extends StObject
  inline def launchApp: launchApp = "launchApp".asInstanceOf[launchApp]
  
  @js.native
  sealed trait launchChromeApp extends StObject
  inline def launchChromeApp: launchChromeApp = "launchChromeApp".asInstanceOf[launchChromeApp]
  
  @js.native
  sealed trait legend extends StObject
  inline def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait li extends StObject
  inline def li: li = "li".asInstanceOf[li]
  
  @js.native
  sealed trait line extends StObject
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait linearGradient extends StObject
  inline def linearGradient: linearGradient = "linearGradient".asInstanceOf[linearGradient]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait loadeddata extends StObject
  inline def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  
  @js.native
  sealed trait loadedmetadata extends StObject
  inline def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  
  @js.native
  sealed trait loadstart extends StObject
  inline def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @js.native
  sealed trait local extends StObject
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait lock extends StObject
  inline def lock: lock = "lock".asInstanceOf[lock]
  
  @js.native
  sealed trait logEvent extends StObject
  inline def logEvent: logEvent = "logEvent".asInstanceOf[logEvent]
  
  @js.native
  sealed trait longPress
    extends StObject
       with ActionTypes
  inline def longPress: longPress = "longPress".asInstanceOf[longPress]
  
  @js.native
  sealed trait longPressKeyCode extends StObject
  inline def longPressKeyCode: longPressKeyCode = "longPressKeyCode".asInstanceOf[longPressKeyCode]
  
  @js.native
  sealed trait lostpointercapture extends StObject
  inline def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  
  @js.native
  sealed trait main extends StObject
  inline def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait manageSeleniumHubLifecycle extends StObject
  inline def manageSeleniumHubLifecycle: manageSeleniumHubLifecycle = "manageSeleniumHubLifecycle".asInstanceOf[manageSeleniumHubLifecycle]
  
  @js.native
  sealed trait map extends StObject
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait mark extends StObject
  inline def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait marker extends StObject
  inline def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait mask extends StObject
  inline def mask: mask = "mask".asInstanceOf[mask]
  
  @js.native
  sealed trait maximizeWindow extends StObject
  inline def maximizeWindow: maximizeWindow = "maximizeWindow".asInstanceOf[maximizeWindow]
  
  @js.native
  sealed trait menu extends StObject
  inline def menu: menu = "menu".asInstanceOf[menu]
  
  @js.native
  sealed trait meta extends StObject
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait metadata extends StObject
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait meter extends StObject
  inline def meter: meter = "meter".asInstanceOf[meter]
  
  @js.native
  sealed trait minimizeWindow extends StObject
  inline def minimizeWindow: minimizeWindow = "minimizeWindow".asInstanceOf[minimizeWindow]
  
  @js.native
  sealed trait mock extends StObject
  inline def mock: mock = "mock".asInstanceOf[mock]
  
  @js.native
  sealed trait mockClearAll extends StObject
  inline def mockClearAll: mockClearAll = "mockClearAll".asInstanceOf[mockClearAll]
  
  @js.native
  sealed trait mockRequest extends StObject
  inline def mockRequest: mockRequest = "mockRequest".asInstanceOf[mockRequest]
  
  @js.native
  sealed trait mockRestoreAll extends StObject
  inline def mockRestoreAll: mockRestoreAll = "mockRestoreAll".asInstanceOf[mockRestoreAll]
  
  @js.native
  sealed trait mouse extends StObject
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mousedown extends StObject
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseenter extends StObject
  inline def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  
  @js.native
  sealed trait mouseleave extends StObject
  inline def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  
  @js.native
  sealed trait mousemove extends StObject
  inline def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @js.native
  sealed trait mouseout extends StObject
  inline def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover extends StObject
  inline def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait mouseup extends StObject
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait moveTo
    extends StObject
       with ActionTypes
  inline def moveTo: moveTo = "moveTo".asInstanceOf[moveTo]
  
  @js.native
  sealed trait moveToElement extends StObject
  inline def moveToElement: moveToElement = "moveToElement".asInstanceOf[moveToElement]
  
  @js.native
  sealed trait mpath extends StObject
  inline def mpath: mpath = "mpath".asInstanceOf[mpath]
  
  @js.native
  sealed trait multiTouchPerform extends StObject
  inline def multiTouchPerform: multiTouchPerform = "multiTouchPerform".asInstanceOf[multiTouchPerform]
  
  @js.native
  sealed trait nav extends StObject
  inline def nav: nav = "nav".asInstanceOf[nav]
  
  @js.native
  sealed trait navigateTo extends StObject
  inline def navigateTo: navigateTo = "navigateTo".asInstanceOf[navigateTo]
  
  @js.native
  sealed trait newSession extends StObject
  inline def newSession: newSession = "newSession".asInstanceOf[newSession]
  
  @js.native
  sealed trait newWindow extends StObject
  inline def newWindow: newWindow = "newWindow".asInstanceOf[newWindow]
  
  @js.native
  sealed trait nextElement extends StObject
  inline def nextElement: nextElement = "nextElement".asInstanceOf[nextElement]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait none
    extends StObject
       with MixedContentType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait noscript extends StObject
  inline def noscript: noscript = "noscript".asInstanceOf[noscript]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object` extends StObject
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait offline
    extends StObject
       with ThrottlePreset
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait offsetHeight extends StObject
  inline def offsetHeight: offsetHeight = "offsetHeight".asInstanceOf[offsetHeight]
  
  @js.native
  sealed trait offsetLeft extends StObject
  inline def offsetLeft: offsetLeft = "offsetLeft".asInstanceOf[offsetLeft]
  
  @js.native
  sealed trait offsetParent extends StObject
  inline def offsetParent: offsetParent = "offsetParent".asInstanceOf[offsetParent]
  
  @js.native
  sealed trait offsetTop extends StObject
  inline def offsetTop: offsetTop = "offsetTop".asInstanceOf[offsetTop]
  
  @js.native
  sealed trait offsetWidth extends StObject
  inline def offsetWidth: offsetWidth = "offsetWidth".asInstanceOf[offsetWidth]
  
  @js.native
  sealed trait ol extends StObject
  inline def ol: ol = "ol".asInstanceOf[ol]
  
  @js.native
  sealed trait online
    extends StObject
       with ThrottlePreset
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait openNotifications extends StObject
  inline def openNotifications: openNotifications = "openNotifications".asInstanceOf[openNotifications]
  
  @js.native
  sealed trait optgroup extends StObject
  inline def optgroup: optgroup = "optgroup".asInstanceOf[optgroup]
  
  @js.native
  sealed trait option extends StObject
  inline def option: option = "option".asInstanceOf[option]
  
  @js.native
  sealed trait `optionally-blockable`
    extends StObject
       with MixedContentType
  inline def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  
  @js.native
  sealed trait origin
    extends StObject
       with ReferrerPolicy
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait outerText extends StObject
  inline def outerText: outerText = "outerText".asInstanceOf[outerText]
  
  @js.native
  sealed trait output extends StObject
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait p extends StObject
  inline def p: p = "p".asInstanceOf[p]
  
  @js.native
  sealed trait parentElement extends StObject
  inline def parentElement: parentElement = "parentElement".asInstanceOf[parentElement]
  
  @js.native
  sealed trait paste extends StObject
  inline def paste: paste = "paste".asInstanceOf[paste]
  
  @js.native
  sealed trait path extends StObject
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pattern extends StObject
  inline def pattern: pattern = "pattern".asInstanceOf[pattern]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pen extends StObject
  inline def pen: pen = "pen".asInstanceOf[pen]
  
  @js.native
  sealed trait performActions extends StObject
  inline def performActions: performActions = "performActions".asInstanceOf[performActions]
  
  @js.native
  sealed trait picture extends StObject
  inline def picture: picture = "picture".asInstanceOf[picture]
  
  @js.native
  sealed trait play extends StObject
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait playing extends StObject
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait pointer extends StObject
  inline def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait pointerCancel extends StObject
  inline def pointerCancel: pointerCancel = "pointerCancel".asInstanceOf[pointerCancel]
  
  @js.native
  sealed trait pointerDown extends StObject
  inline def pointerDown: pointerDown = "pointerDown".asInstanceOf[pointerDown]
  
  @js.native
  sealed trait pointerMove extends StObject
  inline def pointerMove: pointerMove = "pointerMove".asInstanceOf[pointerMove]
  
  @js.native
  sealed trait pointerUp extends StObject
  inline def pointerUp: pointerUp = "pointerUp".asInstanceOf[pointerUp]
  
  @js.native
  sealed trait pointercancel_ extends StObject
  inline def pointercancel_ : pointercancel_ = "pointercancel".asInstanceOf[pointercancel_]
  
  @js.native
  sealed trait pointerdown_ extends StObject
  inline def pointerdown_ : pointerdown_ = "pointerdown".asInstanceOf[pointerdown_]
  
  @js.native
  sealed trait pointerenter extends StObject
  inline def pointerenter: pointerenter = "pointerenter".asInstanceOf[pointerenter]
  
  @js.native
  sealed trait pointerleave extends StObject
  inline def pointerleave: pointerleave = "pointerleave".asInstanceOf[pointerleave]
  
  @js.native
  sealed trait pointermove_ extends StObject
  inline def pointermove_ : pointermove_ = "pointermove".asInstanceOf[pointermove_]
  
  @js.native
  sealed trait pointerout extends StObject
  inline def pointerout: pointerout = "pointerout".asInstanceOf[pointerout]
  
  @js.native
  sealed trait pointerover extends StObject
  inline def pointerover: pointerover = "pointerover".asInstanceOf[pointerover]
  
  @js.native
  sealed trait pointerup_ extends StObject
  inline def pointerup_ : pointerup_ = "pointerup".asInstanceOf[pointerup_]
  
  @js.native
  sealed trait polygon extends StObject
  inline def polygon: polygon = "polygon".asInstanceOf[polygon]
  
  @js.native
  sealed trait polyline extends StObject
  inline def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait positionClick extends StObject
  inline def positionClick: positionClick = "positionClick".asInstanceOf[positionClick]
  
  @js.native
  sealed trait positionDoubleClick extends StObject
  inline def positionDoubleClick: positionDoubleClick = "positionDoubleClick".asInstanceOf[positionDoubleClick]
  
  @js.native
  sealed trait powerAC extends StObject
  inline def powerAC: powerAC = "powerAC".asInstanceOf[powerAC]
  
  @js.native
  sealed trait powerCapacity extends StObject
  inline def powerCapacity: powerCapacity = "powerCapacity".asInstanceOf[powerCapacity]
  
  @js.native
  sealed trait pre extends StObject
  inline def pre: pre = "pre".asInstanceOf[pre]
  
  @js.native
  sealed trait press
    extends StObject
       with ActionTypes
  inline def press: press = "press".asInstanceOf[press]
  
  @js.native
  sealed trait pressKeyCode extends StObject
  inline def pressKeyCode: pressKeyCode = "pressKeyCode".asInstanceOf[pressKeyCode]
  
  @js.native
  sealed trait previousElement extends StObject
  inline def previousElement: previousElement = "previousElement".asInstanceOf[previousElement]
  
  @js.native
  sealed trait printPage extends StObject
  inline def printPage: printPage = "printPage".asInstanceOf[printPage]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait pullFile extends StObject
  inline def pullFile: pullFile = "pullFile".asInstanceOf[pullFile]
  
  @js.native
  sealed trait pullFolder extends StObject
  inline def pullFolder: pullFolder = "pullFolder".asInstanceOf[pullFolder]
  
  @js.native
  sealed trait pushFile extends StObject
  inline def pushFile: pushFile = "pushFile".asInstanceOf[pushFile]
  
  @js.native
  sealed trait q extends StObject
  inline def q: q = "q".asInstanceOf[q]
  
  @js.native
  sealed trait queryAppState extends StObject
  inline def queryAppState: queryAppState = "queryAppState".asInstanceOf[queryAppState]
  
  @js.native
  sealed trait queryGrid extends StObject
  inline def queryGrid: queryGrid = "queryGrid".asInstanceOf[queryGrid]
  
  @js.native
  sealed trait radialGradient extends StObject
  inline def radialGradient: radialGradient = "radialGradient".asInstanceOf[radialGradient]
  
  @js.native
  sealed trait ratechange extends StObject
  inline def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  
  @js.native
  sealed trait react$
    extends StObject
       with ElementCommandNames
       with ElementQueryCommands
       with SingleElementCommandNames
  inline def react$: react$ = "react$".asInstanceOf[react$]
  
  @js.native
  sealed trait reactDollarDollar
    extends StObject
       with ElementCommandNames
       with ElementsQueryCommands
       with MultiElementCommandNames
  inline def reactDollarDollar: reactDollarDollar = "react$$".asInstanceOf[reactDollarDollar]
  
  @js.native
  sealed trait receiveAsyncResponse extends StObject
  inline def receiveAsyncResponse: receiveAsyncResponse = "receiveAsyncResponse".asInstanceOf[receiveAsyncResponse]
  
  @js.native
  sealed trait rect extends StObject
  inline def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait refresh extends StObject
  inline def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait release
    extends StObject
       with ActionTypes
  inline def release: release = "release".asInstanceOf[release]
  
  @js.native
  sealed trait releaseActions extends StObject
  inline def releaseActions: releaseActions = "releaseActions".asInstanceOf[releaseActions]
  
  @js.native
  sealed trait reloadSession extends StObject
  inline def reloadSession: reloadSession = "reloadSession".asInstanceOf[reloadSession]
  
  @js.native
  sealed trait removeAllCredentials extends StObject
  inline def removeAllCredentials: removeAllCredentials = "removeAllCredentials".asInstanceOf[removeAllCredentials]
  
  @js.native
  sealed trait removeApp extends StObject
  inline def removeApp: removeApp = "removeApp".asInstanceOf[removeApp]
  
  @js.native
  sealed trait removeCredential extends StObject
  inline def removeCredential: removeCredential = "removeCredential".asInstanceOf[removeCredential]
  
  @js.native
  sealed trait removeVirtualAuthenticator extends StObject
  inline def removeVirtualAuthenticator: removeVirtualAuthenticator = "removeVirtualAuthenticator".asInstanceOf[removeVirtualAuthenticator]
  
  @js.native
  sealed trait replaceValue extends StObject
  inline def replaceValue: replaceValue = "replaceValue".asInstanceOf[replaceValue]
  
  @js.native
  sealed trait reset extends StObject
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait resize extends StObject
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait respondMock extends StObject
  inline def respondMock: respondMock = "respondMock".asInstanceOf[respondMock]
  
  @js.native
  sealed trait resume extends StObject
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait rotateDevice extends StObject
  inline def rotateDevice: rotateDevice = "rotateDevice".asInstanceOf[rotateDevice]
  
  @js.native
  sealed trait rp extends StObject
  inline def rp: rp = "rp".asInstanceOf[rp]
  
  @js.native
  sealed trait rt extends StObject
  inline def rt: rt = "rt".asInstanceOf[rt]
  
  @js.native
  sealed trait ruby extends StObject
  inline def ruby: ruby = "ruby".asInstanceOf[ruby]
  
  @js.native
  sealed trait s extends StObject
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with ReferrerPolicy
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait samp extends StObject
  inline def samp: samp = "samp".asInstanceOf[samp]
  
  @js.native
  sealed trait savePDF extends StObject
  inline def savePDF: savePDF = "savePDF".asInstanceOf[savePDF]
  
  @js.native
  sealed trait saveRecordingScreen extends StObject
  inline def saveRecordingScreen: saveRecordingScreen = "saveRecordingScreen".asInstanceOf[saveRecordingScreen]
  
  @js.native
  sealed trait saveScreenshot extends StObject
  inline def saveScreenshot: saveScreenshot = "saveScreenshot".asInstanceOf[saveScreenshot]
  
  @js.native
  sealed trait script extends StObject
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scroll extends StObject
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait scrollIntoView extends StObject
  inline def scrollIntoView: scrollIntoView = "scrollIntoView".asInstanceOf[scrollIntoView]
  
  @js.native
  sealed trait section extends StObject
  inline def section: section = "section".asInstanceOf[section]
  
  @js.native
  sealed trait securitypolicyviolation extends StObject
  inline def securitypolicyviolation: securitypolicyviolation = "securitypolicyviolation".asInstanceOf[securitypolicyviolation]
  
  @js.native
  sealed trait seeked extends StObject
  inline def seeked: seeked = "seeked".asInstanceOf[seeked]
  
  @js.native
  sealed trait seeking extends StObject
  inline def seeking: seeking = "seeking".asInstanceOf[seeking]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectByAttribute extends StObject
  inline def selectByAttribute: selectByAttribute = "selectByAttribute".asInstanceOf[selectByAttribute]
  
  @js.native
  sealed trait selectByIndex extends StObject
  inline def selectByIndex: selectByIndex = "selectByIndex".asInstanceOf[selectByIndex]
  
  @js.native
  sealed trait selectByVisibleText extends StObject
  inline def selectByVisibleText: selectByVisibleText = "selectByVisibleText".asInstanceOf[selectByVisibleText]
  
  @js.native
  sealed trait selectCastSink extends StObject
  inline def selectCastSink: selectCastSink = "selectCastSink".asInstanceOf[selectCastSink]
  
  @js.native
  sealed trait selectionchange extends StObject
  inline def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  
  @js.native
  sealed trait selectstart extends StObject
  inline def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @js.native
  sealed trait sendAlertText extends StObject
  inline def sendAlertText: sendAlertText = "sendAlertText".asInstanceOf[sendAlertText]
  
  @js.native
  sealed trait sendCommand extends StObject
  inline def sendCommand: sendCommand = "sendCommand".asInstanceOf[sendCommand]
  
  @js.native
  sealed trait sendCommandAndGetResult extends StObject
  inline def sendCommandAndGetResult: sendCommandAndGetResult = "sendCommandAndGetResult".asInstanceOf[sendCommandAndGetResult]
  
  @js.native
  sealed trait sendKeyEvent extends StObject
  inline def sendKeyEvent: sendKeyEvent = "sendKeyEvent".asInstanceOf[sendKeyEvent]
  
  @js.native
  sealed trait sendKeys extends StObject
  inline def sendKeys: sendKeys = "sendKeys".asInstanceOf[sendKeys]
  
  @js.native
  sealed trait sendSms extends StObject
  inline def sendSms: sendSms = "sendSms".asInstanceOf[sendSms]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait setAsyncTimeout extends StObject
  inline def setAsyncTimeout: setAsyncTimeout = "setAsyncTimeout".asInstanceOf[setAsyncTimeout]
  
  @js.native
  sealed trait setAutoReporting extends StObject
  inline def setAutoReporting: setAutoReporting = "setAutoReporting".asInstanceOf[setAutoReporting]
  
  @js.native
  sealed trait setClipboard extends StObject
  inline def setClipboard: setClipboard = "setClipboard".asInstanceOf[setClipboard]
  
  @js.native
  sealed trait setCookies extends StObject
  inline def setCookies: setCookies = "setCookies".asInstanceOf[setCookies]
  
  @js.native
  sealed trait setGeoLocation extends StObject
  inline def setGeoLocation: setGeoLocation = "setGeoLocation".asInstanceOf[setGeoLocation]
  
  @js.native
  sealed trait setImplicitTimeout extends StObject
  inline def setImplicitTimeout: setImplicitTimeout = "setImplicitTimeout".asInstanceOf[setImplicitTimeout]
  
  @js.native
  sealed trait setLocalStorage extends StObject
  inline def setLocalStorage: setLocalStorage = "setLocalStorage".asInstanceOf[setLocalStorage]
  
  @js.native
  sealed trait setNetworkConditions extends StObject
  inline def setNetworkConditions: setNetworkConditions = "setNetworkConditions".asInstanceOf[setNetworkConditions]
  
  @js.native
  sealed trait setNetworkConnection extends StObject
  inline def setNetworkConnection: setNetworkConnection = "setNetworkConnection".asInstanceOf[setNetworkConnection]
  
  @js.native
  sealed trait setOrientation extends StObject
  inline def setOrientation: setOrientation = "setOrientation".asInstanceOf[setOrientation]
  
  @js.native
  sealed trait setPermissions extends StObject
  inline def setPermissions: setPermissions = "setPermissions".asInstanceOf[setPermissions]
  
  @js.native
  sealed trait setSessionStorage extends StObject
  inline def setSessionStorage: setSessionStorage = "setSessionStorage".asInstanceOf[setSessionStorage]
  
  @js.native
  sealed trait setTimeZone extends StObject
  inline def setTimeZone: setTimeZone = "setTimeZone".asInstanceOf[setTimeZone]
  
  @js.native
  sealed trait setTimeout extends StObject
  inline def setTimeout: setTimeout = "setTimeout".asInstanceOf[setTimeout]
  
  @js.native
  sealed trait setTimeouts extends StObject
  inline def setTimeouts: setTimeouts = "setTimeouts".asInstanceOf[setTimeouts]
  
  @js.native
  sealed trait setUserVerified extends StObject
  inline def setUserVerified: setUserVerified = "setUserVerified".asInstanceOf[setUserVerified]
  
  @js.native
  sealed trait setValue extends StObject
  inline def setValue: setValue = "setValue".asInstanceOf[setValue]
  
  @js.native
  sealed trait setValueImmediate extends StObject
  inline def setValueImmediate: setValueImmediate = "setValueImmediate".asInstanceOf[setValueImmediate]
  
  @js.native
  sealed trait setWindowPosition extends StObject
  inline def setWindowPosition: setWindowPosition = "setWindowPosition".asInstanceOf[setWindowPosition]
  
  @js.native
  sealed trait setWindowRect extends StObject
  inline def setWindowRect: setWindowRect = "setWindowRect".asInstanceOf[setWindowRect]
  
  @js.native
  sealed trait setWindowSize extends StObject
  inline def setWindowSize: setWindowSize = "setWindowSize".asInstanceOf[setWindowSize]
  
  @js.native
  sealed trait shadow$
    extends StObject
       with ElementQueryCommands
  inline def shadow$: shadow$ = "shadow$".asInstanceOf[shadow$]
  
  @js.native
  sealed trait shadowDollarDollar
    extends StObject
       with ElementsQueryCommands
  inline def shadowDollarDollar: shadowDollarDollar = "shadow$$".asInstanceOf[shadowDollarDollar]
  
  @js.native
  sealed trait shake extends StObject
  inline def shake: shake = "shake".asInstanceOf[shake]
  
  @js.native
  sealed trait shutdown extends StObject
  inline def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  
  @js.native
  sealed trait slot extends StObject
  inline def slot: slot = "slot".asInstanceOf[slot]
  
  @js.native
  sealed trait slotchange extends StObject
  inline def slotchange: slotchange = "slotchange".asInstanceOf[slotchange]
  
  @js.native
  sealed trait small extends StObject
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait span extends StObject
  inline def span: span = "span".asInstanceOf[span]
  
  @js.native
  sealed trait spellcheck extends StObject
  inline def spellcheck: spellcheck = "spellcheck".asInstanceOf[spellcheck]
  
  @js.native
  sealed trait stalled extends StObject
  inline def stalled: stalled = "stalled".asInstanceOf[stalled]
  
  @js.native
  sealed trait startActivity extends StObject
  inline def startActivity: startActivity = "startActivity".asInstanceOf[startActivity]
  
  @js.native
  sealed trait startCastTabMirroring extends StObject
  inline def startCastTabMirroring: startCastTabMirroring = "startCastTabMirroring".asInstanceOf[startCastTabMirroring]
  
  @js.native
  sealed trait startRecordingScreen extends StObject
  inline def startRecordingScreen: startRecordingScreen = "startRecordingScreen".asInstanceOf[startRecordingScreen]
  
  @js.native
  sealed trait status extends StObject
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stop extends StObject
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stopCasting extends StObject
  inline def stopCasting: stopCasting = "stopCasting".asInstanceOf[stopCasting]
  
  @js.native
  sealed trait stopRecordingScreen extends StObject
  inline def stopRecordingScreen: stopRecordingScreen = "stopRecordingScreen".asInstanceOf[stopRecordingScreen]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait strong extends StObject
  inline def strong: strong = "strong".asInstanceOf[strong]
  
  @js.native
  sealed trait style extends StObject
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait sub extends StObject
  inline def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait submit extends StObject
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait summary extends StObject
  inline def summary: summary = "summary".asInstanceOf[summary]
  
  @js.native
  sealed trait sup extends StObject
  inline def sup: sup = "sup".asInstanceOf[sup]
  
  @js.native
  sealed trait suspend extends StObject
  inline def suspend: suspend = "suspend".asInstanceOf[suspend]
  
  @js.native
  sealed trait svg extends StObject
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait switch extends StObject
  inline def switch: switch = "switch".asInstanceOf[switch]
  
  @js.native
  sealed trait switchContext extends StObject
  inline def switchContext: switchContext = "switchContext".asInstanceOf[switchContext]
  
  @js.native
  sealed trait switchToFrame extends StObject
  inline def switchToFrame: switchToFrame = "switchToFrame".asInstanceOf[switchToFrame]
  
  @js.native
  sealed trait switchToParentFrame extends StObject
  inline def switchToParentFrame: switchToParentFrame = "switchToParentFrame".asInstanceOf[switchToParentFrame]
  
  @js.native
  sealed trait switchToWindow extends StObject
  inline def switchToWindow: switchToWindow = "switchToWindow".asInstanceOf[switchToWindow]
  
  @js.native
  sealed trait switchWindow extends StObject
  inline def switchWindow: switchWindow = "switchWindow".asInstanceOf[switchWindow]
  
  @js.native
  sealed trait symbol extends StObject
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait sync extends StObject
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait tab extends StObject
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait table extends StObject
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait takeElementScreenshot extends StObject
  inline def takeElementScreenshot: takeElementScreenshot = "takeElementScreenshot".asInstanceOf[takeElementScreenshot]
  
  @js.native
  sealed trait takeHeapSnapshot extends StObject
  inline def takeHeapSnapshot: takeHeapSnapshot = "takeHeapSnapshot".asInstanceOf[takeHeapSnapshot]
  
  @js.native
  sealed trait takeScreenshot extends StObject
  inline def takeScreenshot: takeScreenshot = "takeScreenshot".asInstanceOf[takeScreenshot]
  
  @js.native
  sealed trait tap
    extends StObject
       with ActionTypes
  inline def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait tbody extends StObject
  inline def tbody: tbody = "tbody".asInstanceOf[tbody]
  
  @js.native
  sealed trait td extends StObject
  inline def td: td = "td".asInstanceOf[td]
  
  @js.native
  sealed trait template extends StObject
  inline def template: template = "template".asInstanceOf[template]
  
  @js.native
  sealed trait terminateApp extends StObject
  inline def terminateApp: terminateApp = "terminateApp".asInstanceOf[terminateApp]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textPath extends StObject
  inline def textPath: textPath = "textPath".asInstanceOf[textPath]
  
  @js.native
  sealed trait textarea extends StObject
  inline def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait tfoot extends StObject
  inline def tfoot: tfoot = "tfoot".asInstanceOf[tfoot]
  
  @js.native
  sealed trait th extends StObject
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait thead extends StObject
  inline def thead: thead = "thead".asInstanceOf[thead]
  
  @js.native
  sealed trait throttle extends StObject
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait throttleCPU extends StObject
  inline def throttleCPU: throttleCPU = "throttleCPU".asInstanceOf[throttleCPU]
  
  @js.native
  sealed trait throttleNetwork extends StObject
  inline def throttleNetwork: throttleNetwork = "throttleNetwork".asInstanceOf[throttleNetwork]
  
  @js.native
  sealed trait time extends StObject
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeupdate extends StObject
  inline def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @js.native
  sealed trait title extends StObject
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait toggle extends StObject
  inline def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait toggleAirplaneMode extends StObject
  inline def toggleAirplaneMode: toggleAirplaneMode = "toggleAirplaneMode".asInstanceOf[toggleAirplaneMode]
  
  @js.native
  sealed trait toggleData extends StObject
  inline def toggleData: toggleData = "toggleData".asInstanceOf[toggleData]
  
  @js.native
  sealed trait toggleEnrollTouchId extends StObject
  inline def toggleEnrollTouchId: toggleEnrollTouchId = "toggleEnrollTouchId".asInstanceOf[toggleEnrollTouchId]
  
  @js.native
  sealed trait toggleLocationServices extends StObject
  inline def toggleLocationServices: toggleLocationServices = "toggleLocationServices".asInstanceOf[toggleLocationServices]
  
  @js.native
  sealed trait toggleNetworkSpeed extends StObject
  inline def toggleNetworkSpeed: toggleNetworkSpeed = "toggleNetworkSpeed".asInstanceOf[toggleNetworkSpeed]
  
  @js.native
  sealed trait toggleWiFi extends StObject
  inline def toggleWiFi: toggleWiFi = "toggleWiFi".asInstanceOf[toggleWiFi]
  
  @js.native
  sealed trait touch extends StObject
  inline def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchAction extends StObject
  inline def touchAction: touchAction = "touchAction".asInstanceOf[touchAction]
  
  @js.native
  sealed trait touchClick extends StObject
  inline def touchClick: touchClick = "touchClick".asInstanceOf[touchClick]
  
  @js.native
  sealed trait touchDoubleClick extends StObject
  inline def touchDoubleClick: touchDoubleClick = "touchDoubleClick".asInstanceOf[touchDoubleClick]
  
  @js.native
  sealed trait touchDown extends StObject
  inline def touchDown: touchDown = "touchDown".asInstanceOf[touchDown]
  
  @js.native
  sealed trait touchFlick extends StObject
  inline def touchFlick: touchFlick = "touchFlick".asInstanceOf[touchFlick]
  
  @js.native
  sealed trait touchId extends StObject
  inline def touchId: touchId = "touchId".asInstanceOf[touchId]
  
  @js.native
  sealed trait touchLongClick extends StObject
  inline def touchLongClick: touchLongClick = "touchLongClick".asInstanceOf[touchLongClick]
  
  @js.native
  sealed trait touchMove extends StObject
  inline def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @js.native
  sealed trait touchPerform extends StObject
  inline def touchPerform: touchPerform = "touchPerform".asInstanceOf[touchPerform]
  
  @js.native
  sealed trait touchPinch extends StObject
  inline def touchPinch: touchPinch = "touchPinch".asInstanceOf[touchPinch]
  
  @js.native
  sealed trait touchScroll extends StObject
  inline def touchScroll: touchScroll = "touchScroll".asInstanceOf[touchScroll]
  
  @js.native
  sealed trait touchUp extends StObject
  inline def touchUp: touchUp = "touchUp".asInstanceOf[touchUp]
  
  @js.native
  sealed trait touchcancel extends StObject
  inline def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  
  @js.native
  sealed trait touchend extends StObject
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove_ extends StObject
  inline def touchmove_ : touchmove_ = "touchmove".asInstanceOf[touchmove_]
  
  @js.native
  sealed trait touchstart extends StObject
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait tr extends StObject
  inline def tr: tr = "tr".asInstanceOf[tr]
  
  @js.native
  sealed trait track extends StObject
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transitioncancel extends StObject
  inline def transitioncancel: transitioncancel = "transitioncancel".asInstanceOf[transitioncancel]
  
  @js.native
  sealed trait transitionend extends StObject
  inline def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  
  @js.native
  sealed trait transitionrun extends StObject
  inline def transitionrun: transitionrun = "transitionrun".asInstanceOf[transitionrun]
  
  @js.native
  sealed trait transitionstart extends StObject
  inline def transitionstart: transitionstart = "transitionstart".asInstanceOf[transitionstart]
  
  @js.native
  sealed trait translate extends StObject
  inline def translate: translate = "translate".asInstanceOf[translate]
  
  @js.native
  sealed trait tspan extends StObject
  inline def tspan: tspan = "tspan".asInstanceOf[tspan]
  
  @js.native
  sealed trait u extends StObject
  inline def u: u = "u".asInstanceOf[u]
  
  @js.native
  sealed trait ul extends StObject
  inline def ul: ul = "ul".asInstanceOf[ul]
  
  @js.native
  sealed trait unlock extends StObject
  inline def unlock: unlock = "unlock".asInstanceOf[unlock]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with ReferrerPolicy
  inline def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait updateMockSensor extends StObject
  inline def updateMockSensor: updateMockSensor = "updateMockSensor".asInstanceOf[updateMockSensor]
  
  @js.native
  sealed trait updateSettings extends StObject
  inline def updateSettings: updateSettings = "updateSettings".asInstanceOf[updateSettings]
  
  @js.native
  sealed trait uploadFile extends StObject
  inline def uploadFile: uploadFile = "uploadFile".asInstanceOf[uploadFile]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait use extends StObject
  inline def use: use = "use".asInstanceOf[use]
  
  @js.native
  sealed trait `var` extends StObject
  inline def `var`: `var` = "var".asInstanceOf[`var`]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait view extends StObject
  inline def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait volumechange extends StObject
  inline def volumechange: volumechange = "volumechange".asInstanceOf[volumechange]
  
  @js.native
  sealed trait wait
    extends StObject
       with ActionTypes
  
  @js.native
  sealed trait waitForClickable extends StObject
  inline def waitForClickable: waitForClickable = "waitForClickable".asInstanceOf[waitForClickable]
  
  @js.native
  sealed trait waitForDisplayed extends StObject
  inline def waitForDisplayed: waitForDisplayed = "waitForDisplayed".asInstanceOf[waitForDisplayed]
  
  @js.native
  sealed trait waitForEnabled extends StObject
  inline def waitForEnabled: waitForEnabled = "waitForEnabled".asInstanceOf[waitForEnabled]
  
  @js.native
  sealed trait waitForExist extends StObject
  inline def waitForExist: waitForExist = "waitForExist".asInstanceOf[waitForExist]
  
  @js.native
  sealed trait waitUntil extends StObject
  inline def waitUntil: waitUntil = "waitUntil".asInstanceOf[waitUntil]
  
  @js.native
  sealed trait waiting extends StObject
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
  
  @js.native
  sealed trait wbr extends StObject
  inline def wbr: wbr = "wbr".asInstanceOf[wbr]
  
  @js.native
  sealed trait webkitanimationend extends StObject
  inline def webkitanimationend: webkitanimationend = "webkitanimationend".asInstanceOf[webkitanimationend]
  
  @js.native
  sealed trait webkitanimationiteration extends StObject
  inline def webkitanimationiteration: webkitanimationiteration = "webkitanimationiteration".asInstanceOf[webkitanimationiteration]
  
  @js.native
  sealed trait webkitanimationstart extends StObject
  inline def webkitanimationstart: webkitanimationstart = "webkitanimationstart".asInstanceOf[webkitanimationstart]
  
  @js.native
  sealed trait webkittransitionend extends StObject
  inline def webkittransitionend: webkittransitionend = "webkittransitionend".asInstanceOf[webkittransitionend]
  
  @js.native
  sealed trait wheel extends StObject
  inline def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @js.native
  sealed trait width extends StObject
  inline def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait window extends StObject
  inline def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait x extends StObject
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  inline def y: y = "y".asInstanceOf[y]
}
