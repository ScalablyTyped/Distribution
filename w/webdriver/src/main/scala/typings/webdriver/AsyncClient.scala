package typings.webdriver

import typings.std.Parameters
import typings.std.ReturnType
import typings.webdriver.WebDriver.Cookie
import typings.webdriver.WebDriver.ProtocolCommandResponse
import typings.webdriver.WebDriver.RectReturn
import typings.webdriver.WebDriver.SessionReturn
import typings.webdriver.WebDriver.SettingsReturn
import typings.webdriver.WebDriver.StatusReturn
import typings.webdriver.WebDriver.StringsReturn
import typings.webdriver.WebDriver.Timeouts
import typings.webdriver.WebDriver.WindowHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof std.Pick<webdriver.WebDriver.Client, std.Exclude<keyof webdriver.WebDriver.Client, keyof webdriver.WebDriver.BaseClient>> ]: (args : std.Parameters<webdriver.WebDriver.Client[K]>): std.Promise<std.ReturnType<webdriver.WebDriver.Client[K]>>} */
@js.native
trait AsyncClient extends js.Object {
  @JSName("_getWindowSize")
  var _getWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("_setWindowSize")
  var _setWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
  ] = js.native
  @JSName("acceptAlert")
  var acceptAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("activateApp")
  var activateApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("activateIME")
  var activateIME_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
  ] = js.native
  @JSName("addCookie")
  var addCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
  ] = js.native
  @JSName("assertPerformance")
  var assertPerformance_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* name */ String, 
        /* metrics */ js.UndefOr[js.Array[String]], 
        ProtocolCommandResponse
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* name */ String, 
          /* metrics */ js.UndefOr[js.Array[String]], 
          ProtocolCommandResponse
        ]
      ]
    ]
  ] = js.native
  @JSName("back")
  var back_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("background")
  var background_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
    js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
  ] = js.native
  @JSName("buttonDown")
  var buttonDown_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ] = js.native
  @JSName("buttonUp")
  var buttonUp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ] = js.native
  @JSName("clearLocalStorage")
  var clearLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("clearMockCalls")
  var clearMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]], 
    js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]]
  ] = js.native
  @JSName("clearSessionStorage")
  var clearSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("closeApp")
  var closeApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("closeWindow")
  var closeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("compareImages")
  var compareImages_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function4[
          /* mode */ String, 
          /* firstImage */ String, 
          /* secondImage */ String, 
          /* options */ js.Object, 
          ProtocolCommandResponse
        ]
      ]
    ]
  ] = js.native
  @JSName("createWindow")
  var createWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, WindowHandle]], 
    js.Promise[ReturnType[js.Function1[/* type */ String, WindowHandle]]]
  ] = js.native
  @JSName("deactivateIME")
  var deactivateIME_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("deleteAllCookies")
  var deleteAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("deleteCookie")
  var deleteCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  ] = js.native
  @JSName("deleteLocalStorageItem")
  var deleteLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  ] = js.native
  @JSName("deleteNetworkConditions")
  var deleteNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("deleteSessionStorageItem")
  var deleteSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  ] = js.native
  @JSName("deleteSession")
  var deleteSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("dismissAlert")
  var dismissAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("driverScript")
  var driverScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* script */ String, 
        /* type */ js.UndefOr[String], 
        /* timeout */ js.UndefOr[Double], 
        ProtocolCommandResponse
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* script */ String, 
          /* type */ js.UndefOr[String], 
          /* timeout */ js.UndefOr[Double], 
          ProtocolCommandResponse
        ]
      ]
    ]
  ] = js.native
  @JSName("elementClear")
  var elementClear_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ] = js.native
  @JSName("elementClick")
  var elementClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ] = js.native
  @JSName("elementEquals")
  var elementEquals_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ]
  ] = js.native
  @JSName("elementHover")
  var elementHover_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ] = js.native
  @JSName("elementSendKeys")
  var elementSendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
  ] = js.native
  @JSName("elementSubmit")
  var elementSubmit_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ] = js.native
  @JSName("endCoverage")
  var endCoverage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
  ] = js.native
  @JSName("executeAsyncScript")
  var executeAsyncScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        _
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
          _
        ]
      ]
    ]
  ] = js.native
  @JSName("executeScript")
  var executeScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        _
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
          _
        ]
      ]
    ]
  ] = js.native
  @JSName("file")
  var file_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* file */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
  ] = js.native
  @JSName("findElementFromElement")
  var findElementFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
      ]
    ]
  ] = js.native
  @JSName("findElement")
  var findElement_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]]
  ] = js.native
  @JSName("findElementsFromElement")
  var findElementsFromElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
      ]
    ]
  ] = js.native
  @JSName("findElements")
  var findElements_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]], 
    js.Promise[
      ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
    ]
  ] = js.native
  @JSName("fingerPrint")
  var fingerPrint_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
  ] = js.native
  @JSName("forward")
  var forward_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("freeze")
  var freeze_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("fullscreenWindow")
  var fullscreenWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ] = js.native
  @JSName("generateTestReport")
  var generateTestReport_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
  ] = js.native
  @JSName("getActiveElement")
  var getActiveElement_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getActiveEngine")
  var getActiveEngine_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getAlertText")
  var getAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getAllCookies")
  var getAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ] = js.native
  @JSName("getApplicationCacheStatus")
  var getApplicationCacheStatus_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ] = js.native
  @JSName("getAvailableEngines")
  var getAvailableEngines_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getClipboard")
  var getClipboard_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
    js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
  ] = js.native
  @JSName("getContext")
  var getContext_Original: js.Function1[
    /* args */ Parameters[js.Function0[String | Null]], 
    js.Promise[ReturnType[js.Function0[String | Null]]]
  ] = js.native
  @JSName("getContexts")
  var getContexts_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getCurrentActivity")
  var getCurrentActivity_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getCurrentPackage")
  var getCurrentPackage_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getDeviceTime")
  var getDeviceTime_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getDisplayDensity")
  var getDisplayDensity_Original: js.Function1[/* args */ Parameters[js.Function0[_]], js.Promise[ReturnType[js.Function0[_]]]] = js.native
  @JSName("getElementAttribute")
  var getElementAttribute_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ] = js.native
  @JSName("getElementCSSValue")
  var getElementCSSValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ]
  ] = js.native
  @JSName("getElementLocationInView")
  var getElementLocationInView_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getElementLocation")
  var getElementLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getElementProperty")
  var getElementProperty_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ] = js.native
  @JSName("getElementRect")
  var getElementRect_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
  ] = js.native
  @JSName("getElementSize")
  var getElementSize_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getElementTagName")
  var getElementTagName_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  ] = js.native
  @JSName("getElementText")
  var getElementText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  ] = js.native
  @JSName("getElementValue")
  var getElementValue_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
  ] = js.native
  @JSName("getEvents")
  var getEvents_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getGeoLocation")
  var getGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getHubConfig")
  var getHubConfig_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getLocalStorageItem")
  var getLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  ] = js.native
  @JSName("getLocalStorageSize")
  var getLocalStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ] = js.native
  @JSName("getLocalStorage")
  var getLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getLogTypes")
  var getLogTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getLogs")
  var getLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
  ] = js.native
  @JSName("getMockCalls")
  var getMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getNamedCookie")
  var getNamedCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Cookie]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]]
  ] = js.native
  @JSName("getNetworkConditions")
  var getNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getNetworkConnection")
  var getNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ] = js.native
  @JSName("getOrientation")
  var getOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getPageIndex")
  var getPageIndex_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getPageLogs")
  var getPageLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getPageSource")
  var getPageSource_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getPerformanceDataTypes")
  var getPerformanceDataTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getPerformanceData")
  var getPerformanceData_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* packageName */ String, 
        /* dataType */ String, 
        /* dataReadTimeout */ js.UndefOr[Double], 
        js.Array[String]
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* packageName */ String, 
          /* dataType */ String, 
          /* dataReadTimeout */ js.UndefOr[Double], 
          js.Array[String]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSessionStorageItem")
  var getSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  ] = js.native
  @JSName("getSessionStorageSize")
  var getSessionStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ] = js.native
  @JSName("getSessionStorage")
  var getSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getSession")
  var getSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getSessions")
  var getSessions_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ] = js.native
  @JSName("getSettings")
  var getSettings_Original: js.Function1[
    /* args */ Parameters[js.Function0[SettingsReturn]], 
    js.Promise[ReturnType[js.Function0[SettingsReturn]]]
  ] = js.native
  @JSName("getStrings")
  var getStrings_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* language */ js.UndefOr[String], 
        /* stringFile */ js.UndefOr[String], 
        StringsReturn
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* language */ js.UndefOr[String], 
          /* stringFile */ js.UndefOr[String], 
          StringsReturn
        ]
      ]
    ]
  ] = js.native
  @JSName("getSystemBars")
  var getSystemBars_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ] = js.native
  @JSName("getTimeouts")
  var getTimeouts_Original: js.Function1[
    /* args */ Parameters[js.Function0[Timeouts]], 
    js.Promise[ReturnType[js.Function0[Timeouts]]]
  ] = js.native
  @JSName("getTitle")
  var getTitle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getUrl")
  var getUrl_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getWindowHandle")
  var getWindowHandle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getWindowHandles")
  var getWindowHandles_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ] = js.native
  @JSName("getWindowPosition")
  var getWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("getWindowRect")
  var getWindowRect_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ] = js.native
  @JSName("gridProxyDetails")
  var gridProxyDetails_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("gridTestSession")
  var gridTestSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
  ] = js.native
  @JSName("gsmCall")
  var gsmCall_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
  ] = js.native
  @JSName("gsmSignal")
  var gsmSignal_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("gsmVoice")
  var gsmVoice_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  ] = js.native
  @JSName("hideKeyboard")
  var hideKeyboard_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* strategy */ js.UndefOr[String], 
        /* key */ js.UndefOr[String], 
        /* keyCode */ js.UndefOr[String], 
        /* keyName */ js.UndefOr[String], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function4[
          /* strategy */ js.UndefOr[String], 
          /* key */ js.UndefOr[String], 
          /* keyCode */ js.UndefOr[String], 
          /* keyName */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("installApp")
  var installApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
  ] = js.native
  @JSName("interceptRequest")
  var interceptRequest_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
  ] = js.native
  @JSName("isAlertOpen")
  var isAlertOpen_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isAppInstalled")
  var isAppInstalled_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
      ]
    ]
  ] = js.native
  @JSName("isAutoReporting")
  var isAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isElementDisplayed")
  var isElementDisplayed_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ] = js.native
  @JSName("isElementEnabled")
  var isElementEnabled_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ] = js.native
  @JSName("isElementSelected")
  var isElementSelected_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ] = js.native
  @JSName("isIMEActivated")
  var isIMEActivated_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isKeyboardShown")
  var isKeyboardShown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isLoading")
  var isLoading_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isLocked")
  var isLocked_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("jankinessCheck")
  var jankinessCheck_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("launchApp")
  var launchApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("launchChromeApp")
  var launchChromeApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
  ] = js.native
  @JSName("lock")
  var lock_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
  ] = js.native
  @JSName("logEvent")
  var logEvent_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
  ] = js.native
  @JSName("longPressKeyCode")
  var longPressKeyCode_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* keycode */ Double, 
          /* metastate */ js.UndefOr[Double], 
          /* flags */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("manageSeleniumHubLifecycle")
  var manageSeleniumHubLifecycle_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
  ] = js.native
  @JSName("maximizeWindow")
  var maximizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ] = js.native
  @JSName("minimizeWindow")
  var minimizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ] = js.native
  @JSName("mockRequest")
  var mockRequest_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
      ]
    ]
  ] = js.native
  @JSName("moveToElement")
  var moveToElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* element */ js.UndefOr[String | Null], 
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* element */ js.UndefOr[String | Null], 
          /* xoffset */ js.UndefOr[Double], 
          /* yoffset */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("multiTouchPerform")
  var multiTouchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ] = js.native
  @JSName("navigateTo")
  var navigateTo_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* url */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
  ] = js.native
  @JSName("newSession")
  var newSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
    js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
  ] = js.native
  @JSName("openNotifications")
  var openNotifications_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("performActions")
  var performActions_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ] = js.native
  @JSName("positionClick")
  var positionClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ] = js.native
  @JSName("positionDoubleClick")
  var positionDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("powerAC")
  var powerAC_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  ] = js.native
  @JSName("powerCapacity")
  var powerCapacity_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
  ] = js.native
  @JSName("pressKeyCode")
  var pressKeyCode_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* keycode */ Double, 
          /* metastate */ js.UndefOr[Double], 
          /* flags */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("pullFile")
  var pullFile_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  ] = js.native
  @JSName("pullFolder")
  var pullFolder_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  ] = js.native
  @JSName("pushFile")
  var pushFile_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
  ] = js.native
  @JSName("queryAppState")
  var queryAppState_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
      ]
    ]
  ] = js.native
  @JSName("receiveAsyncResponse")
  var receiveAsyncResponse_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
  ] = js.native
  @JSName("refresh")
  var refresh_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("releaseActions")
  var releaseActions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("removeApp")
  var removeApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("replaceValue")
  var replaceValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ] = js.native
  @JSName("reset")
  var reset_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("respondMock")
  var respondMock_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
  ] = js.native
  @JSName("resume")
  var resume_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("rotateDevice")
  var rotateDevice_Original: js.Function1[
    /* args */ Parameters[
      js.Function7[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        /* element */ js.UndefOr[String], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function7[
          /* x */ Double, 
          /* y */ Double, 
          /* radius */ Double, 
          /* rotation */ Double, 
          /* touchCount */ Double, 
          /* duration */ Double, 
          /* element */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("sendAlertText")
  var sendAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
  ] = js.native
  @JSName("sendCommandAndGetResult")
  var sendCommandAndGetResult_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, _]], 
    js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, _]]]
  ] = js.native
  @JSName("sendCommand")
  var sendCommand_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
  ] = js.native
  @JSName("sendKeyEvent")
  var sendKeyEvent_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
    js.Promise[
      ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
    ]
  ] = js.native
  @JSName("sendKeys")
  var sendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
    js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
  ] = js.native
  @JSName("sendSms")
  var sendSms_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
  ] = js.native
  @JSName("setAsyncTimeout")
  var setAsyncTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  ] = js.native
  @JSName("setAutoReporting")
  var setAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
    js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
  ] = js.native
  @JSName("setClipboard")
  var setClipboard_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* content */ String, 
        /* contentType */ js.UndefOr[String], 
        /* label */ js.UndefOr[String], 
        String
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* content */ String, 
          /* contentType */ js.UndefOr[String], 
          /* label */ js.UndefOr[String], 
          String
        ]
      ]
    ]
  ] = js.native
  @JSName("setGeoLocation")
  var setGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
  ] = js.native
  @JSName("setImplicitTimeout")
  var setImplicitTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  ] = js.native
  @JSName("setLocalStorage")
  var setLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  ] = js.native
  @JSName("setNetworkConditions")
  var setNetworkConditions_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("setNetworkConnection")
  var setNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
  ] = js.native
  @JSName("setOrientation")
  var setOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
  ] = js.native
  @JSName("setSessionStorage")
  var setSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  ] = js.native
  @JSName("setTimeouts")
  var setTimeouts_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* implicit */ js.UndefOr[Double], 
        /* pageLoad */ js.UndefOr[Double], 
        /* script */ js.UndefOr[Double], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* implicit */ js.UndefOr[Double], 
          /* pageLoad */ js.UndefOr[Double], 
          /* script */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("setValueImmediate")
  var setValueImmediate_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ] = js.native
  @JSName("setWindowPosition")
  var setWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
    js.Promise[
      ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ]
  ] = js.native
  @JSName("setWindowRect")
  var setWindowRect_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* x */ Double | Null, 
        /* y */ Double | Null, 
        /* width */ Double | Null, 
        /* height */ Double | Null, 
        RectReturn
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function4[
          /* x */ Double | Null, 
          /* y */ Double | Null, 
          /* width */ Double | Null, 
          /* height */ Double | Null, 
          RectReturn
        ]
      ]
    ]
  ] = js.native
  @JSName("shake")
  var shake_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("shutdown")
  var shutdown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("startActivity")
  var startActivity_Original: js.Function1[
    /* args */ Parameters[
      js.Function9[
        /* appPackage */ String, 
        /* appActivity */ String, 
        /* appWaitPackage */ js.UndefOr[String], 
        /* appWaitActivity */ js.UndefOr[String], 
        /* intentAction */ js.UndefOr[String], 
        /* intentCategory */ js.UndefOr[String], 
        /* intentFlags */ js.UndefOr[String], 
        /* optionalIntentArguments */ js.UndefOr[String], 
        /* dontStopAppOnReset */ js.UndefOr[String], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function9[
          /* appPackage */ String, 
          /* appActivity */ String, 
          /* appWaitPackage */ js.UndefOr[String], 
          /* appWaitActivity */ js.UndefOr[String], 
          /* intentAction */ js.UndefOr[String], 
          /* intentCategory */ js.UndefOr[String], 
          /* intentFlags */ js.UndefOr[String], 
          /* optionalIntentArguments */ js.UndefOr[String], 
          /* dontStopAppOnReset */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("startRecordingScreen")
  var startRecordingScreen_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
  ] = js.native
  @JSName("status")
  var status_Original: js.Function1[
    /* args */ Parameters[js.Function0[StatusReturn]], 
    js.Promise[ReturnType[js.Function0[StatusReturn]]]
  ] = js.native
  @JSName("stopRecordingScreen")
  var stopRecordingScreen_Original: js.Function1[
    /* args */ Parameters[
      js.Function4[
        /* remotePath */ js.UndefOr[String], 
        /* username */ js.UndefOr[String], 
        /* password */ js.UndefOr[String], 
        /* method */ js.UndefOr[String], 
        String
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function4[
          /* remotePath */ js.UndefOr[String], 
          /* username */ js.UndefOr[String], 
          /* password */ js.UndefOr[String], 
          /* method */ js.UndefOr[String], 
          String
        ]
      ]
    ]
  ] = js.native
  @JSName("switchContext")
  var switchContext_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  ] = js.native
  @JSName("switchToFrame")
  var switchToFrame_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
    js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
  ] = js.native
  @JSName("switchToParentFrame")
  var switchToParentFrame_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("switchToWindow")
  var switchToWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
  ] = js.native
  @JSName("takeElementScreenshot")
  var takeElementScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ]
  ] = js.native
  @JSName("takeHeapSnapshot")
  var takeHeapSnapshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ] = js.native
  @JSName("takeScreenshot")
  var takeScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("terminateApp")
  var terminateApp_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("throttleCPU")
  var throttleCPU_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
  ] = js.native
  @JSName("throttleNetwork")
  var throttleNetwork_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
  ] = js.native
  @JSName("toggleAirplaneMode")
  var toggleAirplaneMode_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("toggleData")
  var toggleData_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("toggleEnrollTouchId")
  var toggleEnrollTouchId_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
    js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
  ] = js.native
  @JSName("toggleLocationServices")
  var toggleLocationServices_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("toggleNetworkSpeed")
  var toggleNetworkSpeed_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("toggleWiFi")
  var toggleWiFi_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("touchClick")
  var touchClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ] = js.native
  @JSName("touchDoubleClick")
  var touchDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ] = js.native
  @JSName("touchDown")
  var touchDown_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ] = js.native
  @JSName("touchFlick")
  var touchFlick_Original: js.Function1[
    /* args */ Parameters[
      js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function6[
          /* xoffset */ js.UndefOr[Double], 
          /* yoffset */ js.UndefOr[Double], 
          /* element */ js.UndefOr[String], 
          /* speed */ js.UndefOr[Double], 
          /* xspeed */ js.UndefOr[Double], 
          /* yspeed */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("touchId")
  var touchId_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
    js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
  ] = js.native
  @JSName("touchLongClick")
  var touchLongClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ] = js.native
  @JSName("touchMove")
  var touchMove_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ] = js.native
  @JSName("touchPerform")
  var touchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ] = js.native
  @JSName("touchPinch")
  var touchPinch_Original: js.Function1[
    /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
    js.Promise[
      ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ]
  ] = js.native
  @JSName("touchScroll")
  var touchScroll_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
      ]
    ]
  ] = js.native
  @JSName("touchUp")
  var touchUp_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("updateSettings")
  var updateSettings_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
  ] = js.native
  def _getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def _setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]] = js.native
  def acceptAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def activateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def activateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* engine */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]] = js.native
  def addCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]] = js.native
  def assertPerformance(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* name */ String, 
        /* metrics */ js.UndefOr[js.Array[String]], 
        ProtocolCommandResponse
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* name */ String, 
        /* metrics */ js.UndefOr[js.Array[String]], 
        ProtocolCommandResponse
      ]
    ]
  ] = js.native
  def back(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def background(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ Double | Null, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]] = js.native
  def buttonDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]] = js.native
  def buttonUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]] = js.native
  def clearLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def clearMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]] = js.native
  def clearSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def closeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def closeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def compareImages(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ]
  ] = js.native
  def createWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, WindowHandle]]
  ): js.Promise[ReturnType[js.Function1[/* type */ String, WindowHandle]]] = js.native
  def deactivateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def deleteAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def deleteCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]] = js.native
  def deleteLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]] = js.native
  def deleteNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def deleteSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def deleteSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]] = js.native
  def dismissAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def driverScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* script */ String, 
        /* type */ js.UndefOr[String], 
        /* timeout */ js.UndefOr[Double], 
        ProtocolCommandResponse
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* script */ String, 
        /* type */ js.UndefOr[String], 
        /* timeout */ js.UndefOr[Double], 
        ProtocolCommandResponse
      ]
    ]
  ] = js.native
  def elementClear(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]] = js.native
  def elementClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]] = js.native
  def elementEquals(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
  ] = js.native
  def elementHover(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]] = js.native
  def elementSendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]] = js.native
  def elementSubmit(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]] = js.native
  def endCoverage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]] = js.native
  def executeAsyncScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        _
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        _
      ]
    ]
  ] = js.native
  def executeScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        _
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        _
      ]
    ]
  ] = js.native
  def file(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* file */ String, String]]] = js.native
  def findElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]] = js.native
  def findElementFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ]
  ] = js.native
  def findElements(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
  ): js.Promise[
    ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
  ] = js.native
  def findElementsFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ]
  ] = js.native
  def fingerPrint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* fingerprintId */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]] = js.native
  def forward(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def freeze(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def fullscreenWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]] = js.native
  def generateTestReport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* group */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]] = js.native
  def getActiveElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getActiveEngine(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]] = js.native
  def getApplicationCacheStatus(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]] = js.native
  def getAvailableEngines(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]]
  ): js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]] = js.native
  def getContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String | Null]]
  ): js.Promise[ReturnType[js.Function0[String | Null]]] = js.native
  def getContexts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getCurrentActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getCurrentPackage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getDeviceTime(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getDisplayDensity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[_]]
  ): js.Promise[ReturnType[js.Function0[_]]] = js.native
  def getElementAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]] = js.native
  def getElementCSSValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
  ] = js.native
  def getElementLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]] = js.native
  def getElementLocationInView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]] = js.native
  def getElementProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]] = js.native
  def getElementRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, RectReturn]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]] = js.native
  def getElementSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]] = js.native
  def getElementTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]] = js.native
  def getElementText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]] = js.native
  def getElementValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String | Null]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]] = js.native
  def getEvents(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]] = js.native
  def getGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def getHubConfig(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def getLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]] = js.native
  def getLocalStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]] = js.native
  def getLogTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]] = js.native
  def getMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]] = js.native
  def getNamedCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Cookie]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]] = js.native
  def getNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def getNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]] = js.native
  def getOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getPageIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getPageLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]] = js.native
  def getPageSource(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getPerformanceData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* packageName */ String, 
        /* dataType */ String, 
        /* dataReadTimeout */ js.UndefOr[Double], 
        js.Array[String]
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* packageName */ String, 
        /* dataType */ String, 
        /* dataReadTimeout */ js.UndefOr[Double], 
        js.Array[String]
      ]
    ]
  ] = js.native
  def getPerformanceDataTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def getSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]] = js.native
  def getSessionStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]] = js.native
  def getSessions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]] = js.native
  def getSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[SettingsReturn]]
  ): js.Promise[ReturnType[js.Function0[SettingsReturn]]] = js.native
  def getStrings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* language */ js.UndefOr[String], 
        /* stringFile */ js.UndefOr[String], 
        StringsReturn
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* language */ js.UndefOr[String], 
        /* stringFile */ js.UndefOr[String], 
        StringsReturn
      ]
    ]
  ] = js.native
  def getSystemBars(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]] = js.native
  def getTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Timeouts]]
  ): js.Promise[ReturnType[js.Function0[Timeouts]]] = js.native
  def getTitle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getUrl(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getWindowHandle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getWindowHandles(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]] = js.native
  def getWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def getWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]] = js.native
  def gridProxyDetails(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]] = js.native
  def gridTestSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]] = js.native
  def gsmCall(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]] = js.native
  def gsmSignal(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def gsmVoice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]] = js.native
  def hideKeyboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* strategy */ js.UndefOr[String], 
        /* key */ js.UndefOr[String], 
        /* keyCode */ js.UndefOr[String], 
        /* keyName */ js.UndefOr[String], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function4[
        /* strategy */ js.UndefOr[String], 
        /* key */ js.UndefOr[String], 
        /* keyCode */ js.UndefOr[String], 
        /* keyName */ js.UndefOr[String], 
        Unit
      ]
    ]
  ] = js.native
  def installApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* appPath */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]] = js.native
  def interceptRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* rule */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]] = js.native
  def isAlertOpen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isAppInstalled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ]
  ] = js.native
  def isAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isElementDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]] = js.native
  def isElementEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]] = js.native
  def isElementSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]] = js.native
  def isIMEActivated(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isKeyboardShown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isLoading(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isLocked(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def jankinessCheck(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def launchApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def launchChromeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]] = js.native
  def lock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]] = js.native
  def logEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]] = js.native
  def longPressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ] = js.native
  def manageSeleniumHubLifecycle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* action */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]] = js.native
  def maximizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]] = js.native
  def minimizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]] = js.native
  def mockRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ]
  ] = js.native
  def moveToElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* element */ js.UndefOr[String | Null], 
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* element */ js.UndefOr[String | Null], 
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ] = js.native
  def multiTouchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]] = js.native
  def navigateTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* url */ String, String]]] = js.native
  def newSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]]
  ): js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]] = js.native
  def openNotifications(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def performActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]] = js.native
  def positionClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]] = js.native
  def positionDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def powerAC(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]] = js.native
  def powerCapacity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* percent */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]] = js.native
  def pressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ] = js.native
  def pullFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]] = js.native
  def pullFolder(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]] = js.native
  def pushFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* path */ String, /* data */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]] = js.native
  def queryAppState(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ]
  ] = js.native
  def receiveAsyncResponse(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* response */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]] = js.native
  def refresh(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def releaseActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def removeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def replaceValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]] = js.native
  def reset(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def respondMock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]] = js.native
  def resume(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def rotateDevice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function7[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        /* element */ js.UndefOr[String], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function7[
        /* x */ Double, 
        /* y */ Double, 
        /* radius */ Double, 
        /* rotation */ Double, 
        /* touchCount */ Double, 
        /* duration */ Double, 
        /* element */ js.UndefOr[String], 
        Unit
      ]
    ]
  ] = js.native
  def sendAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]] = js.native
  def sendCommand(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]] = js.native
  def sendCommandAndGetResult(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, _]]
  ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, _]]] = js.native
  def sendKeyEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
  ): js.Promise[
    ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
  ] = js.native
  def sendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* value */ js.Array[String], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]] = js.native
  def sendSms(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]] = js.native
  def setAsyncTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]] = js.native
  def setAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]]
  ): js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]] = js.native
  def setClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* content */ String, 
        /* contentType */ js.UndefOr[String], 
        /* label */ js.UndefOr[String], 
        String
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* content */ String, 
        /* contentType */ js.UndefOr[String], 
        /* label */ js.UndefOr[String], 
        String
      ]
    ]
  ] = js.native
  def setGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* location */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]] = js.native
  def setImplicitTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]] = js.native
  def setLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]] = js.native
  def setNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def setNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]] = js.native
  def setOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* orientation */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]] = js.native
  def setSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]] = js.native
  def setTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* implicit */ js.UndefOr[Double], 
        /* pageLoad */ js.UndefOr[Double], 
        /* script */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* implicit */ js.UndefOr[Double], 
        /* pageLoad */ js.UndefOr[Double], 
        /* script */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ] = js.native
  def setValueImmediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]] = js.native
  def setWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
  ): js.Promise[
    ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
  ] = js.native
  def setWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* x */ Double | Null, 
        /* y */ Double | Null, 
        /* width */ Double | Null, 
        /* height */ Double | Null, 
        RectReturn
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function4[
        /* x */ Double | Null, 
        /* y */ Double | Null, 
        /* width */ Double | Null, 
        /* height */ Double | Null, 
        RectReturn
      ]
    ]
  ] = js.native
  def shake(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def shutdown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def startActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function9[
        /* appPackage */ String, 
        /* appActivity */ String, 
        /* appWaitPackage */ js.UndefOr[String], 
        /* appWaitActivity */ js.UndefOr[String], 
        /* intentAction */ js.UndefOr[String], 
        /* intentCategory */ js.UndefOr[String], 
        /* intentFlags */ js.UndefOr[String], 
        /* optionalIntentArguments */ js.UndefOr[String], 
        /* dontStopAppOnReset */ js.UndefOr[String], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function9[
        /* appPackage */ String, 
        /* appActivity */ String, 
        /* appWaitPackage */ js.UndefOr[String], 
        /* appWaitActivity */ js.UndefOr[String], 
        /* intentAction */ js.UndefOr[String], 
        /* intentCategory */ js.UndefOr[String], 
        /* intentFlags */ js.UndefOr[String], 
        /* optionalIntentArguments */ js.UndefOr[String], 
        /* dontStopAppOnReset */ js.UndefOr[String], 
        Unit
      ]
    ]
  ] = js.native
  def startRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]] = js.native
  def status(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
  ): js.Promise[ReturnType[js.Function0[StatusReturn]]] = js.native
  def stopRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function4[
        /* remotePath */ js.UndefOr[String], 
        /* username */ js.UndefOr[String], 
        /* password */ js.UndefOr[String], 
        /* method */ js.UndefOr[String], 
        String
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function4[
        /* remotePath */ js.UndefOr[String], 
        /* username */ js.UndefOr[String], 
        /* password */ js.UndefOr[String], 
        /* method */ js.UndefOr[String], 
        String
      ]
    ]
  ] = js.native
  def switchContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]] = js.native
  def switchToFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]] = js.native
  def switchToParentFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def switchToWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* handle */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]] = js.native
  def takeElementScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
  ] = js.native
  def takeHeapSnapshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]] = js.native
  def takeScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def terminateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def throttleCPU(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* rate */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]] = js.native
  def throttleNetwork(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* condition */ String | js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]] = js.native
  def toggleAirplaneMode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def toggleData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def toggleEnrollTouchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]] = js.native
  def toggleLocationServices(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def toggleNetworkSpeed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def toggleWiFi(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def touchClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]] = js.native
  def touchDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]] = js.native
  def touchDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]] = js.native
  def touchFlick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ]
    ]
  ] = js.native
  def touchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* match */ Boolean, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]] = js.native
  def touchLongClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]] = js.native
  def touchMove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]] = js.native
  def touchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]] = js.native
  def touchPinch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
  ): js.Promise[
    ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
  ] = js.native
  def touchScroll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ]
  ] = js.native
  def touchUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]] = js.native
  def unlock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def updateSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<WebDriver.Client[K]> is not an array type */ args: Parameters[js.Function1[/* settings */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]] = js.native
}

