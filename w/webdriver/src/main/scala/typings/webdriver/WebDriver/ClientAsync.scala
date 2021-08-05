package typings.webdriver.WebDriver

import typings.std.Parameters
import typings.std.ReturnType
import typings.webdriver.AsyncClient
import typings.webdriver.webdriverStrings.tab
import typings.webdriver.webdriverStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAsync
  extends StObject
     with AsyncClient
     with BaseClient
object ClientAsync {
  
  inline def apply(
    _getWindowSize: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    _setWindowSize: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]],
    acceptAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    activateApp: /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ],
    activateIME: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]],
    addCookie: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]],
    assertPerformance: /* args */ Parameters[
      js.Function2[
        /* name */ String, 
        /* metrics */ js.UndefOr[js.Array[String]], 
        ProtocolCommandResponse
      ]
    ] => js.Promise[
      ReturnType[
        js.Function2[
          /* name */ String, 
          /* metrics */ js.UndefOr[js.Array[String]], 
          ProtocolCommandResponse
        ]
      ]
    ],
    back: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    background: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]],
    buttonDown: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
    buttonUp: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
    capabilities: DesiredCapabilities,
    clearLocalStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    clearMockCalls: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]] => js.Promise[
      ReturnType[js.Function2[/* mockId */ String, /* restore */ js.UndefOr[Boolean], Unit]]
    ],
    clearSessionStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    closeApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    closeWindow: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    compareImages: /* args */ Parameters[
      js.Function4[
        /* mode */ String, 
        /* firstImage */ String, 
        /* secondImage */ String, 
        /* options */ js.Object, 
        ProtocolCommandResponse
      ]
    ] => js.Promise[
      ReturnType[
        js.Function4[
          /* mode */ String, 
          /* firstImage */ String, 
          /* secondImage */ String, 
          /* options */ js.Object, 
          ProtocolCommandResponse
        ]
      ]
    ],
    createWindow: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]],
    deactivateIME: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    deleteAllCookies: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    deleteCookie: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
    deleteLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
    deleteNetworkConditions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    deleteSession: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    deleteSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]],
    dismissAlert: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    driverScript: /* args */ Parameters[
      js.Function3[
        /* script */ String, 
        /* type */ js.UndefOr[String], 
        /* timeout */ js.UndefOr[Double], 
        ProtocolCommandResponse
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* script */ String, 
          /* type */ js.UndefOr[String], 
          /* timeout */ js.UndefOr[Double], 
          ProtocolCommandResponse
        ]
      ]
    ],
    elementClear: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
    elementClick: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
    elementEquals: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ],
    elementHover: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
    elementSendKeys: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]],
    elementSubmit: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]],
    endCoverage: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]],
    executeAsyncScript: /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        js.Any
      ]
    ] => js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
          js.Any
        ]
      ]
    ],
    executeScript: /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        js.Any
      ]
    ] => js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
          js.Any
        ]
      ]
    ],
    file: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]],
    findElement: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, String]] => js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]],
    findElementFromElement: /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ] => js.Promise[
      ReturnType[
        js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
      ]
    ],
    findElements: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]] => js.Promise[
      ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
    ],
    findElementsFromElement: /* args */ Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ] => js.Promise[
      ReturnType[
        js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
      ]
    ],
    fingerPrint: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]],
    forward: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    freeze: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    fullscreenWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
    generateTestReport: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]],
    getActiveElement: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getActiveEngine: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getAlertText: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getAllCookies: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
    getApplicationCacheStatus: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
    getAvailableEngines: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getClipboard: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]],
    getContext: /* args */ Parameters[js.Function0[String | Null]] => js.Promise[ReturnType[js.Function0[String | Null]]],
    getContexts: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getCurrentActivity: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getCurrentPackage: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getDeviceTime: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getDisplayDensity: /* args */ Parameters[js.Function0[js.Any]] => js.Promise[ReturnType[js.Function0[js.Any]]],
    getElementAttribute: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
    getElementCSSValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ],
    getElementLocation: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
    getElementLocationInView: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
    getElementProperty: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]],
    getElementRect: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]],
    getElementSize: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]],
    getElementTagName: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
    getElementText: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]],
    getElementValue: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]],
    getEvents: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]],
    getGeoLocation: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    getHubConfig: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    getLocalStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getLocalStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
    getLocalStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
    getLogTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getLogs: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]],
    getMockCalls: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]],
    getNamedCookie: /* args */ Parameters[js.Function1[/* name */ String, Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, Cookie]]],
    getNetworkConditions: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    getNetworkConnection: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
    getOrientation: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getPageIndex: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getPageLogs: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]],
    getPageSource: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getPerformanceData: /* args */ Parameters[
      js.Function3[
        /* packageName */ String, 
        /* dataType */ String, 
        /* dataReadTimeout */ js.UndefOr[Double], 
        js.Array[String]
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* packageName */ String, 
          /* dataType */ String, 
          /* dataReadTimeout */ js.UndefOr[Double], 
          js.Array[String]
        ]
      ]
    ],
    getPerformanceDataTypes: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getSession: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    getSessionStorage: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getSessionStorageItem: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]],
    getSessionStorageSize: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]],
    getSessions: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
    getSettings: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]],
    getStrings: /* args */ Parameters[
      js.Function2[
        /* language */ js.UndefOr[String], 
        /* stringFile */ js.UndefOr[String], 
        StringsReturn
      ]
    ] => js.Promise[
      ReturnType[
        js.Function2[
          /* language */ js.UndefOr[String], 
          /* stringFile */ js.UndefOr[String], 
          StringsReturn
        ]
      ]
    ],
    getSystemBars: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]],
    getTimeouts: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]],
    getTitle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getUrl: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getWindowHandle: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    getWindowHandles: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]],
    getWindowPosition: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    getWindowRect: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
    gridProxyDetails: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]],
    gridTestSession: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]],
    gsmCall: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]],
    gsmSignal: /* args */ Parameters[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
      ]
    ],
    gsmVoice: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
    hideKeyboard: /* args */ Parameters[
      js.Function4[
        /* strategy */ js.UndefOr[String], 
        /* key */ js.UndefOr[String], 
        /* keyCode */ js.UndefOr[String], 
        /* keyName */ js.UndefOr[String], 
        Unit
      ]
    ] => js.Promise[
      ReturnType[
        js.Function4[
          /* strategy */ js.UndefOr[String], 
          /* key */ js.UndefOr[String], 
          /* keyCode */ js.UndefOr[String], 
          /* keyName */ js.UndefOr[String], 
          Unit
        ]
      ]
    ],
    installApp: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]],
    interceptRequest: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]],
    isAlertOpen: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isAndroid: Boolean,
    isAppInstalled: /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
      ]
    ],
    isAutoReporting: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isElementDisplayed: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
    isElementEnabled: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
    isElementSelected: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]],
    isIMEActivated: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isIOS: Boolean,
    isKeyboardShown: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isLoading: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isLocked: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isMobile: Boolean,
    jankinessCheck: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    launchApp: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    launchChromeApp: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]],
    lock: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]],
    logEvent: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]],
    longPressKeyCode: /* args */ Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* keycode */ Double, 
          /* metastate */ js.UndefOr[Double], 
          /* flags */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ],
    manageSeleniumHubLifecycle: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]],
    maximizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
    minimizeWindow: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]],
    mockRequest: /* args */ Parameters[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
      ]
    ],
    moveToElement: /* args */ Parameters[
      js.Function3[
        /* element */ js.UndefOr[String | Null], 
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* element */ js.UndefOr[String | Null], 
          /* xoffset */ js.UndefOr[Double], 
          /* yoffset */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ],
    multiTouchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
    navigateTo: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]],
    newSession: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]],
    openNotifications: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    performActions: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
    positionClick: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]],
    positionDoubleClick: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    powerAC: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]],
    powerCapacity: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]],
    pressKeyCode: /* args */ Parameters[
      js.Function3[
        /* keycode */ Double, 
        /* metastate */ js.UndefOr[Double], 
        /* flags */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* keycode */ Double, 
          /* metastate */ js.UndefOr[Double], 
          /* flags */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ],
    printPage: /* args */ Parameters[
      js.Function11[
        /* orientation */ js.UndefOr[String], 
        /* scale */ js.UndefOr[Double], 
        /* background */ js.UndefOr[Boolean], 
        /* width */ js.UndefOr[Double], 
        /* height */ js.UndefOr[Double], 
        /* top */ js.UndefOr[Double], 
        /* bottom */ js.UndefOr[Double], 
        /* left */ js.UndefOr[Double], 
        /* right */ js.UndefOr[Double], 
        /* shrinkToFit */ js.UndefOr[Boolean], 
        /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
        String
      ]
    ] => js.Promise[
      ReturnType[
        js.Function11[
          /* orientation */ js.UndefOr[String], 
          /* scale */ js.UndefOr[Double], 
          /* background */ js.UndefOr[Boolean], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          /* top */ js.UndefOr[Double], 
          /* bottom */ js.UndefOr[Double], 
          /* left */ js.UndefOr[Double], 
          /* right */ js.UndefOr[Double], 
          /* shrinkToFit */ js.UndefOr[Boolean], 
          /* pageRanges */ js.UndefOr[js.Array[js.Object]], 
          String
        ]
      ]
    ],
    pullFile: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]],
    pullFolder: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]],
    pushFile: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]],
    queryAppState: /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
      ]
    ],
    receiveAsyncResponse: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]],
    refresh: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    releaseActions: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    removeApp: /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ],
    replaceValue: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
    requestedCapabilities: DesiredCapabilities,
    reset: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    respondMock: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]],
    resume: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    rotateDevice: /* args */ Parameters[
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
    ] => js.Promise[
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
    ],
    sendAlertText: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]],
    sendCommand: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]],
    sendCommandAndGetResult: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]]],
    sendKeyEvent: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
      ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
    ],
    sendKeys: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]],
    sendSms: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]],
    sessionId: String,
    setAsyncTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
    setAutoReporting: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]],
    setClipboard: /* args */ Parameters[
      js.Function3[
        /* content */ String, 
        /* contentType */ js.UndefOr[String], 
        /* label */ js.UndefOr[String], 
        String
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* content */ String, 
          /* contentType */ js.UndefOr[String], 
          /* label */ js.UndefOr[String], 
          String
        ]
      ]
    ],
    setGeoLocation: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]],
    setImplicitTimeout: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]],
    setLocalStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
    setNetworkConditions: /* args */ Parameters[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
      ]
    ],
    setNetworkConnection: /* args */ Parameters[js.Function1[/* type */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]],
    setOrientation: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]],
    setSessionStorage: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]],
    setTimeouts: /* args */ Parameters[
      js.Function3[
        /* implicit */ js.UndefOr[Double], 
        /* pageLoad */ js.UndefOr[Double], 
        /* script */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Promise[
      ReturnType[
        js.Function3[
          /* implicit */ js.UndefOr[Double], 
          /* pageLoad */ js.UndefOr[Double], 
          /* script */ js.UndefOr[Double], 
          Unit
        ]
      ]
    ],
    setValueImmediate: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]],
    setWindowPosition: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
      ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ],
    setWindowRect: /* args */ Parameters[
      js.Function4[
        /* x */ Double | Null, 
        /* y */ Double | Null, 
        /* width */ Double | Null, 
        /* height */ Double | Null, 
        RectReturn
      ]
    ] => js.Promise[
      ReturnType[
        js.Function4[
          /* x */ Double | Null, 
          /* y */ Double | Null, 
          /* width */ Double | Null, 
          /* height */ Double | Null, 
          RectReturn
        ]
      ]
    ],
    shake: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    shutdown: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    startActivity: /* args */ Parameters[
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
    ] => js.Promise[
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
    ],
    startRecordingScreen: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]],
    status: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]],
    stopRecordingScreen: /* args */ Parameters[
      js.Function4[
        /* remotePath */ js.UndefOr[String], 
        /* username */ js.UndefOr[String], 
        /* password */ js.UndefOr[String], 
        /* method */ js.UndefOr[String], 
        String
      ]
    ] => js.Promise[
      ReturnType[
        js.Function4[
          /* remotePath */ js.UndefOr[String], 
          /* username */ js.UndefOr[String], 
          /* password */ js.UndefOr[String], 
          /* method */ js.UndefOr[String], 
          String
        ]
      ]
    ],
    switchContext: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]],
    switchToFrame: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]],
    switchToParentFrame: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    switchToWindow: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]],
    takeElementScreenshot: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ],
    takeHeapSnapshot: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]],
    takeScreenshot: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]],
    terminateApp: /* args */ Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
      ]
    ],
    throttleCPU: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]],
    throttleNetwork: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]],
    toggleAirplaneMode: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    toggleData: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    toggleEnrollTouchId: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]],
    toggleLocationServices: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    toggleNetworkSpeed: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    toggleWiFi: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    touchClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
    touchDoubleClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
    touchDown: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
    touchFlick: /* args */ Parameters[
      js.Function6[
        /* xoffset */ js.UndefOr[Double], 
        /* yoffset */ js.UndefOr[Double], 
        /* element */ js.UndefOr[String], 
        /* speed */ js.UndefOr[Double], 
        /* xspeed */ js.UndefOr[Double], 
        /* yspeed */ js.UndefOr[Double], 
        Unit
      ]
    ] => js.Promise[
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
    ],
    touchId: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]],
    touchLongClick: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]],
    touchMove: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
    touchPerform: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]],
    touchPinch: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
      ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ],
    touchScroll: /* args */ Parameters[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ] => js.Promise[
      ReturnType[
        js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
      ]
    ],
    touchUp: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]],
    unlock: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    updateSettings: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
  ): ClientAsync = {
    val __obj = js.Dynamic.literal(_getWindowSize = js.Any.fromFunction1(_getWindowSize), _setWindowSize = js.Any.fromFunction1(_setWindowSize), acceptAlert = js.Any.fromFunction1(acceptAlert), activateApp = js.Any.fromFunction1(activateApp), activateIME = js.Any.fromFunction1(activateIME), addCookie = js.Any.fromFunction1(addCookie), assertPerformance = js.Any.fromFunction1(assertPerformance), back = js.Any.fromFunction1(back), background = js.Any.fromFunction1(background), buttonDown = js.Any.fromFunction1(buttonDown), buttonUp = js.Any.fromFunction1(buttonUp), capabilities = capabilities.asInstanceOf[js.Any], clearLocalStorage = js.Any.fromFunction1(clearLocalStorage), clearMockCalls = js.Any.fromFunction1(clearMockCalls), clearSessionStorage = js.Any.fromFunction1(clearSessionStorage), closeApp = js.Any.fromFunction1(closeApp), closeWindow = js.Any.fromFunction1(closeWindow), compareImages = js.Any.fromFunction1(compareImages), createWindow = js.Any.fromFunction1(createWindow), deactivateIME = js.Any.fromFunction1(deactivateIME), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteLocalStorageItem = js.Any.fromFunction1(deleteLocalStorageItem), deleteNetworkConditions = js.Any.fromFunction1(deleteNetworkConditions), deleteSession = js.Any.fromFunction1(deleteSession), deleteSessionStorageItem = js.Any.fromFunction1(deleteSessionStorageItem), dismissAlert = js.Any.fromFunction1(dismissAlert), driverScript = js.Any.fromFunction1(driverScript), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementEquals = js.Any.fromFunction1(elementEquals), elementHover = js.Any.fromFunction1(elementHover), elementSendKeys = js.Any.fromFunction1(elementSendKeys), elementSubmit = js.Any.fromFunction1(elementSubmit), endCoverage = js.Any.fromFunction1(endCoverage), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), file = js.Any.fromFunction1(file), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), fingerPrint = js.Any.fromFunction1(fingerPrint), forward = js.Any.fromFunction1(forward), freeze = js.Any.fromFunction1(freeze), fullscreenWindow = js.Any.fromFunction1(fullscreenWindow), generateTestReport = js.Any.fromFunction1(generateTestReport), getActiveElement = js.Any.fromFunction1(getActiveElement), getActiveEngine = js.Any.fromFunction1(getActiveEngine), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getApplicationCacheStatus = js.Any.fromFunction1(getApplicationCacheStatus), getAvailableEngines = js.Any.fromFunction1(getAvailableEngines), getClipboard = js.Any.fromFunction1(getClipboard), getContext = js.Any.fromFunction1(getContext), getContexts = js.Any.fromFunction1(getContexts), getCurrentActivity = js.Any.fromFunction1(getCurrentActivity), getCurrentPackage = js.Any.fromFunction1(getCurrentPackage), getDeviceTime = js.Any.fromFunction1(getDeviceTime), getDisplayDensity = js.Any.fromFunction1(getDisplayDensity), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementLocationInView = js.Any.fromFunction1(getElementLocationInView), getElementProperty = js.Any.fromFunction1(getElementProperty), getElementRect = js.Any.fromFunction1(getElementRect), getElementSize = js.Any.fromFunction1(getElementSize), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getElementValue = js.Any.fromFunction1(getElementValue), getEvents = js.Any.fromFunction1(getEvents), getGeoLocation = js.Any.fromFunction1(getGeoLocation), getHubConfig = js.Any.fromFunction1(getHubConfig), getLocalStorage = js.Any.fromFunction1(getLocalStorage), getLocalStorageItem = js.Any.fromFunction1(getLocalStorageItem), getLocalStorageSize = js.Any.fromFunction1(getLocalStorageSize), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getMockCalls = js.Any.fromFunction1(getMockCalls), getNamedCookie = js.Any.fromFunction1(getNamedCookie), getNetworkConditions = js.Any.fromFunction1(getNetworkConditions), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), getOrientation = js.Any.fromFunction1(getOrientation), getPageIndex = js.Any.fromFunction1(getPageIndex), getPageLogs = js.Any.fromFunction1(getPageLogs), getPageSource = js.Any.fromFunction1(getPageSource), getPerformanceData = js.Any.fromFunction1(getPerformanceData), getPerformanceDataTypes = js.Any.fromFunction1(getPerformanceDataTypes), getSession = js.Any.fromFunction1(getSession), getSessionStorage = js.Any.fromFunction1(getSessionStorage), getSessionStorageItem = js.Any.fromFunction1(getSessionStorageItem), getSessionStorageSize = js.Any.fromFunction1(getSessionStorageSize), getSessions = js.Any.fromFunction1(getSessions), getSettings = js.Any.fromFunction1(getSettings), getStrings = js.Any.fromFunction1(getStrings), getSystemBars = js.Any.fromFunction1(getSystemBars), getTimeouts = js.Any.fromFunction1(getTimeouts), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowPosition = js.Any.fromFunction1(getWindowPosition), getWindowRect = js.Any.fromFunction1(getWindowRect), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), gsmCall = js.Any.fromFunction1(gsmCall), gsmSignal = js.Any.fromFunction1(gsmSignal), gsmVoice = js.Any.fromFunction1(gsmVoice), hideKeyboard = js.Any.fromFunction1(hideKeyboard), installApp = js.Any.fromFunction1(installApp), interceptRequest = js.Any.fromFunction1(interceptRequest), isAlertOpen = js.Any.fromFunction1(isAlertOpen), isAndroid = isAndroid.asInstanceOf[js.Any], isAppInstalled = js.Any.fromFunction1(isAppInstalled), isAutoReporting = js.Any.fromFunction1(isAutoReporting), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), isIMEActivated = js.Any.fromFunction1(isIMEActivated), isIOS = isIOS.asInstanceOf[js.Any], isKeyboardShown = js.Any.fromFunction1(isKeyboardShown), isLoading = js.Any.fromFunction1(isLoading), isLocked = js.Any.fromFunction1(isLocked), isMobile = isMobile.asInstanceOf[js.Any], jankinessCheck = js.Any.fromFunction1(jankinessCheck), launchApp = js.Any.fromFunction1(launchApp), launchChromeApp = js.Any.fromFunction1(launchChromeApp), lock = js.Any.fromFunction1(lock), logEvent = js.Any.fromFunction1(logEvent), longPressKeyCode = js.Any.fromFunction1(longPressKeyCode), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), maximizeWindow = js.Any.fromFunction1(maximizeWindow), minimizeWindow = js.Any.fromFunction1(minimizeWindow), mockRequest = js.Any.fromFunction1(mockRequest), moveToElement = js.Any.fromFunction1(moveToElement), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), openNotifications = js.Any.fromFunction1(openNotifications), performActions = js.Any.fromFunction1(performActions), positionClick = js.Any.fromFunction1(positionClick), positionDoubleClick = js.Any.fromFunction1(positionDoubleClick), powerAC = js.Any.fromFunction1(powerAC), powerCapacity = js.Any.fromFunction1(powerCapacity), pressKeyCode = js.Any.fromFunction1(pressKeyCode), printPage = js.Any.fromFunction1(printPage), pullFile = js.Any.fromFunction1(pullFile), pullFolder = js.Any.fromFunction1(pullFolder), pushFile = js.Any.fromFunction1(pushFile), queryAppState = js.Any.fromFunction1(queryAppState), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), refresh = js.Any.fromFunction1(refresh), releaseActions = js.Any.fromFunction1(releaseActions), removeApp = js.Any.fromFunction1(removeApp), replaceValue = js.Any.fromFunction1(replaceValue), requestedCapabilities = requestedCapabilities.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), respondMock = js.Any.fromFunction1(respondMock), resume = js.Any.fromFunction1(resume), rotateDevice = js.Any.fromFunction1(rotateDevice), sendAlertText = js.Any.fromFunction1(sendAlertText), sendCommand = js.Any.fromFunction1(sendCommand), sendCommandAndGetResult = js.Any.fromFunction1(sendCommandAndGetResult), sendKeyEvent = js.Any.fromFunction1(sendKeyEvent), sendKeys = js.Any.fromFunction1(sendKeys), sendSms = js.Any.fromFunction1(sendSms), sessionId = sessionId.asInstanceOf[js.Any], setAsyncTimeout = js.Any.fromFunction1(setAsyncTimeout), setAutoReporting = js.Any.fromFunction1(setAutoReporting), setClipboard = js.Any.fromFunction1(setClipboard), setGeoLocation = js.Any.fromFunction1(setGeoLocation), setImplicitTimeout = js.Any.fromFunction1(setImplicitTimeout), setLocalStorage = js.Any.fromFunction1(setLocalStorage), setNetworkConditions = js.Any.fromFunction1(setNetworkConditions), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), setOrientation = js.Any.fromFunction1(setOrientation), setSessionStorage = js.Any.fromFunction1(setSessionStorage), setTimeouts = js.Any.fromFunction1(setTimeouts), setValueImmediate = js.Any.fromFunction1(setValueImmediate), setWindowPosition = js.Any.fromFunction1(setWindowPosition), setWindowRect = js.Any.fromFunction1(setWindowRect), shake = js.Any.fromFunction1(shake), shutdown = js.Any.fromFunction1(shutdown), startActivity = js.Any.fromFunction1(startActivity), startRecordingScreen = js.Any.fromFunction1(startRecordingScreen), status = js.Any.fromFunction1(status), stopRecordingScreen = js.Any.fromFunction1(stopRecordingScreen), switchContext = js.Any.fromFunction1(switchContext), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeHeapSnapshot = js.Any.fromFunction1(takeHeapSnapshot), takeScreenshot = js.Any.fromFunction1(takeScreenshot), terminateApp = js.Any.fromFunction1(terminateApp), throttleCPU = js.Any.fromFunction1(throttleCPU), throttleNetwork = js.Any.fromFunction1(throttleNetwork), toggleAirplaneMode = js.Any.fromFunction1(toggleAirplaneMode), toggleData = js.Any.fromFunction1(toggleData), toggleEnrollTouchId = js.Any.fromFunction1(toggleEnrollTouchId), toggleLocationServices = js.Any.fromFunction1(toggleLocationServices), toggleNetworkSpeed = js.Any.fromFunction1(toggleNetworkSpeed), toggleWiFi = js.Any.fromFunction1(toggleWiFi), touchClick = js.Any.fromFunction1(touchClick), touchDoubleClick = js.Any.fromFunction1(touchDoubleClick), touchDown = js.Any.fromFunction1(touchDown), touchFlick = js.Any.fromFunction1(touchFlick), touchId = js.Any.fromFunction1(touchId), touchLongClick = js.Any.fromFunction1(touchLongClick), touchMove = js.Any.fromFunction1(touchMove), touchPerform = js.Any.fromFunction1(touchPerform), touchPinch = js.Any.fromFunction1(touchPinch), touchScroll = js.Any.fromFunction1(touchScroll), touchUp = js.Any.fromFunction1(touchUp), unlock = js.Any.fromFunction1(unlock), updateSettings = js.Any.fromFunction1(updateSettings))
    __obj.asInstanceOf[ClientAsync]
  }
}
