package typings.webdriver.typesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.webdriver.webdriverStrings.tab
import typings.webdriver.webdriverStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof std.Pick<webdriver.webdriver/build/types.Client, std.Exclude<keyof webdriver.webdriver/build/types.Client, keyof webdriver.webdriver/build/types.BaseClient>> ]: (args : std.Parameters<webdriver.webdriver/build/types.Client[K]>): std.Promise<std.ReturnType<webdriver.webdriver/build/types.Client[K]>>} */
trait AsyncClient extends StObject {
  
  def _getWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("_getWindowSize")
  var _getWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def _setWindowSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
  @JSName("_setWindowSize")
  var _setWindowSize_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
  ]
  
  def acceptAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("acceptAlert")
  var acceptAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def activateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def activateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* engine */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
  @JSName("activateIME")
  var activateIME_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* engine */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
  ]
  
  def addCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* cookie */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
  @JSName("addCookie")
  var addCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
  ]
  
  def assertPerformance(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def back(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("back")
  var back_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def background(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ Double | Null, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
  @JSName("background")
  var background_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]], 
    js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
  ]
  
  def buttonDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  @JSName("buttonDown")
  var buttonDown_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ]
  
  def buttonUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  @JSName("buttonUp")
  var buttonUp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ]
  
  def clearLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("clearLocalStorage")
  var clearLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def clearMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]]
  @JSName("clearMockCalls")
  var clearMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]], 
    js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]]
  ]
  
  def clearSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("clearSessionStorage")
  var clearSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def closeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("closeApp")
  var closeApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def closeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("closeWindow")
  var closeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def compareImages(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def createWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ tab | window, WindowHandle]]
  ): js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
  @JSName("createWindow")
  var createWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]], 
    js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
  ]
  
  def deactivateIME(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("deactivateIME")
  var deactivateIME_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def deleteAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("deleteAllCookies")
  var deleteAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def deleteCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  @JSName("deleteCookie")
  var deleteCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  ]
  
  def deleteLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  @JSName("deleteLocalStorageItem")
  var deleteLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  ]
  
  def deleteNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("deleteNetworkConditions")
  var deleteNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def deleteSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  
  def deleteSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  @JSName("deleteSessionStorageItem")
  var deleteSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
  ]
  
  @JSName("deleteSession")
  var deleteSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def dismissAlert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("dismissAlert")
  var dismissAlert_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def driverScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def elementClear(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  @JSName("elementClear")
  var elementClear_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ]
  
  def elementClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  @JSName("elementClick")
  var elementClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ]
  
  def elementEquals(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
  ]
  @JSName("elementEquals")
  var elementEquals_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
    ]
  ]
  
  def elementHover(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  @JSName("elementHover")
  var elementHover_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ]
  
  def elementSendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
  @JSName("elementSendKeys")
  var elementSendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
  ]
  
  def elementSubmit(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  @JSName("elementSubmit")
  var elementSubmit_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
  ]
  
  def endCoverage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
  @JSName("endCoverage")
  var endCoverage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
  ]
  
  def executeAsyncScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        js.Any
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        js.Any
      ]
    ]
  ]
  @JSName("executeAsyncScript")
  var executeAsyncScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
        js.Any
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.Array[js.UndefOr[String | js.Object | Double | Boolean]], 
          js.Any
        ]
      ]
    ]
  ]
  
  def executeScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        js.Any
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        js.Any
      ]
    ]
  ]
  @JSName("executeScript")
  var executeScript_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* script */ String, 
        /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
        js.Any
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* script */ String, 
          /* args */ js.UndefOr[js.Array[js.UndefOr[String | js.Object | Double | Boolean]]], 
          js.Any
        ]
      ]
    ]
  ]
  
  def file(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* file */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
  @JSName("file")
  var file_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* file */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
  ]
  
  def findElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]]
  
  def findElementFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
    ]
  ]
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
  ]
  
  @JSName("findElement")
  var findElement_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]]
  ]
  
  def findElements(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
  ): js.Promise[
    ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
  ]
  
  def findElementsFromElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
    ]
  ]
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
  ]
  
  @JSName("findElements")
  var findElements_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]], 
    js.Promise[
      ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
    ]
  ]
  
  def fingerPrint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* fingerprintId */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
  @JSName("fingerPrint")
  var fingerPrint_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
  ]
  
  def forward(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("forward")
  var forward_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def freeze(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("freeze")
  var freeze_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def fullscreenWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]]
  @JSName("fullscreenWindow")
  var fullscreenWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ]
  
  def generateTestReport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* message */ String, /* group */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
  @JSName("generateTestReport")
  var generateTestReport_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
  ]
  
  def getActiveElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getActiveElement")
  var getActiveElement_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getActiveEngine(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getActiveEngine")
  var getActiveEngine_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getAlertText")
  var getAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getAllCookies(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  @JSName("getAllCookies")
  var getAllCookies_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ]
  
  def getApplicationCacheStatus(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]]
  @JSName("getApplicationCacheStatus")
  var getApplicationCacheStatus_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ]
  
  def getAvailableEngines(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  @JSName("getAvailableEngines")
  var getAvailableEngines_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  def getClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]]
  ): js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
  @JSName("getClipboard")
  var getClipboard_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]], 
    js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
  ]
  
  def getContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String | Null]]
  ): js.Promise[ReturnType[js.Function0[String | Null]]]
  @JSName("getContext")
  var getContext_Original: js.Function1[
    /* args */ Parameters[js.Function0[String | Null]], 
    js.Promise[ReturnType[js.Function0[String | Null]]]
  ]
  
  def getContexts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  @JSName("getContexts")
  var getContexts_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  def getCurrentActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getCurrentActivity")
  var getCurrentActivity_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getCurrentPackage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getCurrentPackage")
  var getCurrentPackage_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getDeviceTime(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getDeviceTime")
  var getDeviceTime_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getDisplayDensity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Any]]
  ): js.Promise[ReturnType[js.Function0[js.Any]]]
  @JSName("getDisplayDensity")
  var getDisplayDensity_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Any]], 
    js.Promise[ReturnType[js.Function0[js.Any]]]
  ]
  
  def getElementAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  @JSName("getElementAttribute")
  var getElementAttribute_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ]
  
  def getElementCSSValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
  ]
  @JSName("getElementCSSValue")
  var getElementCSSValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
    ]
  ]
  
  def getElementLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  
  def getElementLocationInView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  @JSName("getElementLocationInView")
  var getElementLocationInView_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  
  @JSName("getElementLocation")
  var getElementLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  
  def getElementProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* name */ String, String]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  @JSName("getElementProperty")
  var getElementProperty_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
  ]
  
  def getElementRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, RectReturn]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
  @JSName("getElementRect")
  var getElementRect_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
  ]
  
  def getElementSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  @JSName("getElementSize")
  var getElementSize_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
  ]
  
  def getElementTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  @JSName("getElementTagName")
  var getElementTagName_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  ]
  
  def getElementText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  @JSName("getElementText")
  var getElementText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
  ]
  
  def getElementValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, String | Null]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
  @JSName("getElementValue")
  var getElementValue_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
  ]
  
  def getEvents(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
  @JSName("getEvents")
  var getEvents_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
  ]
  
  def getGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("getGeoLocation")
  var getGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def getHubConfig(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("getHubConfig")
  var getHubConfig_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def getLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  
  def getLocalStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  @JSName("getLocalStorageItem")
  var getLocalStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  ]
  
  def getLocalStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]]
  @JSName("getLocalStorageSize")
  var getLocalStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ]
  
  @JSName("getLocalStorage")
  var getLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  def getLogTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  @JSName("getLogTypes")
  var getLogTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  def getLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
  @JSName("getLogs")
  var getLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
  ]
  
  def getMockCalls(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
  @JSName("getMockCalls")
  var getMockCalls_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
  ]
  
  def getNamedCookie(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]]]
  @JSName("getNamedCookie")
  var getNamedCookie_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]]]
  ]
  
  def getNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("getNetworkConditions")
  var getNetworkConditions_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def getNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]]
  @JSName("getNetworkConnection")
  var getNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ]
  
  def getOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getOrientation")
  var getOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getPageIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getPageIndex")
  var getPageIndex_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getPageLogs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
  @JSName("getPageLogs")
  var getPageLogs_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
  ]
  
  def getPageSource(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getPageSource")
  var getPageSource_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getPerformanceData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
  
  def getPerformanceDataTypes(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  @JSName("getPerformanceDataTypes")
  var getPerformanceDataTypes_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
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
  ]
  
  def getSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  
  def getSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  
  def getSessionStorageItem(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* key */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  @JSName("getSessionStorageItem")
  var getSessionStorageItem_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* key */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
  ]
  
  def getSessionStorageSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Double]]
  ): js.Promise[ReturnType[js.Function0[Double]]]
  @JSName("getSessionStorageSize")
  var getSessionStorageSize_Original: js.Function1[
    /* args */ Parameters[js.Function0[Double]], 
    js.Promise[ReturnType[js.Function0[Double]]]
  ]
  
  @JSName("getSessionStorage")
  var getSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  @JSName("getSession")
  var getSession_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def getSessions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  @JSName("getSessions")
  var getSessions_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ]
  
  def getSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[SettingsReturn]]
  ): js.Promise[ReturnType[js.Function0[SettingsReturn]]]
  @JSName("getSettings")
  var getSettings_Original: js.Function1[
    /* args */ Parameters[js.Function0[SettingsReturn]], 
    js.Promise[ReturnType[js.Function0[SettingsReturn]]]
  ]
  
  def getStrings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def getSystemBars(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[js.Object]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  @JSName("getSystemBars")
  var getSystemBars_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[js.Object]]], 
    js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
  ]
  
  def getTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Timeouts]]
  ): js.Promise[ReturnType[js.Function0[Timeouts]]]
  @JSName("getTimeouts")
  var getTimeouts_Original: js.Function1[
    /* args */ Parameters[js.Function0[Timeouts]], 
    js.Promise[ReturnType[js.Function0[Timeouts]]]
  ]
  
  def getTitle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getTitle")
  var getTitle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getUrl(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getUrl")
  var getUrl_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getWindowHandle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("getWindowHandle")
  var getWindowHandle_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def getWindowHandles(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[js.Array[String]]]
  ): js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  @JSName("getWindowHandles")
  var getWindowHandles_Original: js.Function1[
    /* args */ Parameters[js.Function0[js.Array[String]]], 
    js.Promise[ReturnType[js.Function0[js.Array[String]]]]
  ]
  
  def getWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("getWindowPosition")
  var getWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def getWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]]
  @JSName("getWindowRect")
  var getWindowRect_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ]
  
  def gridProxyDetails(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
  @JSName("gridProxyDetails")
  var gridProxyDetails_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
  ]
  
  def gridTestSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
  @JSName("gridTestSession")
  var gridTestSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
  ]
  
  def gsmCall(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
  @JSName("gsmCall")
  var gsmCall_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
  ]
  
  def gsmSignal(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def gsmVoice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  @JSName("gsmVoice")
  var gsmVoice_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  ]
  
  def hideKeyboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def installApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* appPath */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
  @JSName("installApp")
  var installApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* appPath */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
  ]
  
  def interceptRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* rule */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
  @JSName("interceptRequest")
  var interceptRequest_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
  ]
  
  def isAlertOpen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isAlertOpen")
  var isAlertOpen_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def isAppInstalled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
    ]
  ]
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
  ]
  
  def isAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isAutoReporting")
  var isAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def isElementDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  @JSName("isElementDisplayed")
  var isElementDisplayed_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ]
  
  def isElementEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  @JSName("isElementEnabled")
  var isElementEnabled_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ]
  
  def isElementSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* elementId */ String, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  @JSName("isElementSelected")
  var isElementSelected_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
  ]
  
  def isIMEActivated(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isIMEActivated")
  var isIMEActivated_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def isKeyboardShown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isKeyboardShown")
  var isKeyboardShown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def isLoading(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isLoading")
  var isLoading_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def isLocked(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]]
  @JSName("isLocked")
  var isLocked_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ]
  
  def jankinessCheck(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("jankinessCheck")
  var jankinessCheck_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def launchApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("launchApp")
  var launchApp_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def launchChromeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
  @JSName("launchChromeApp")
  var launchChromeApp_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
  ]
  
  def lock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
  @JSName("lock")
  var lock_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
  ]
  
  def logEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
  @JSName("logEvent")
  var logEvent_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
  ]
  
  def longPressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def manageSeleniumHubLifecycle(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* action */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
  @JSName("manageSeleniumHubLifecycle")
  var manageSeleniumHubLifecycle_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* action */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
  ]
  
  def maximizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]]
  @JSName("maximizeWindow")
  var maximizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ]
  
  def minimizeWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[RectReturn]]
  ): js.Promise[ReturnType[js.Function0[RectReturn]]]
  @JSName("minimizeWindow")
  var minimizeWindow_Original: js.Function1[
    /* args */ Parameters[js.Function0[RectReturn]], 
    js.Promise[ReturnType[js.Function0[RectReturn]]]
  ]
  
  def mockRequest(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
    ]
  ]
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
  ]
  
  def moveToElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def multiTouchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  @JSName("multiTouchPerform")
  var multiTouchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ]
  
  def navigateTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* url */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
  @JSName("navigateTo")
  var navigateTo_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* url */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
  ]
  
  def newSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]]
  ): js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
  @JSName("newSession")
  var newSession_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]], 
    js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
  ]
  
  def openNotifications(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("openNotifications")
  var openNotifications_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def performActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  @JSName("performActions")
  var performActions_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ]
  
  def positionClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  @JSName("positionClick")
  var positionClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]], 
    js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
  ]
  
  def positionDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("positionDoubleClick")
  var positionDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def powerAC(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* state */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  @JSName("powerAC")
  var powerAC_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* state */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
  ]
  
  def powerCapacity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* percent */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
  @JSName("powerCapacity")
  var powerCapacity_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* percent */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
  ]
  
  def pressKeyCode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def printPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ): js.Promise[
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
  ]
  @JSName("printPage")
  var printPage_Original: js.Function1[
    /* args */ Parameters[
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
    ], 
    js.Promise[
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
    ]
  ]
  
  def pullFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  @JSName("pullFile")
  var pullFile_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  ]
  
  def pullFolder(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* path */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  @JSName("pullFolder")
  var pullFolder_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* path */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
  ]
  
  def pushFile(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* path */ String, /* data */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
  @JSName("pushFile")
  var pushFile_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
  ]
  
  def queryAppState(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
    ]
  ]
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
  ]
  
  def receiveAsyncResponse(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* response */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
  @JSName("receiveAsyncResponse")
  var receiveAsyncResponse_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
  ]
  
  def refresh(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("refresh")
  var refresh_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def releaseActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("releaseActions")
  var releaseActions_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def removeApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def replaceValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  @JSName("replaceValue")
  var replaceValue_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ]
  
  def reset(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("reset")
  var reset_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def respondMock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
  @JSName("respondMock")
  var respondMock_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
  ]
  
  def resume(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("resume")
  var resume_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def rotateDevice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def sendAlertText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
  @JSName("sendAlertText")
  var sendAlertText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
  ]
  
  def sendCommand(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
  
  def sendCommandAndGetResult(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]]
  ): js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]]]
  @JSName("sendCommandAndGetResult")
  var sendCommandAndGetResult_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]], 
    js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]]]
  ]
  
  @JSName("sendCommand")
  var sendCommand_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
  ]
  
  def sendKeyEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
  ): js.Promise[
    ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
  ]
  @JSName("sendKeyEvent")
  var sendKeyEvent_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]], 
    js.Promise[
      ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
    ]
  ]
  
  def sendKeys(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* value */ js.Array[String], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
  @JSName("sendKeys")
  var sendKeys_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]], 
    js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
  ]
  
  def sendSms(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
  @JSName("sendSms")
  var sendSms_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
  ]
  
  def setAsyncTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  @JSName("setAsyncTimeout")
  var setAsyncTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  ]
  
  def setAutoReporting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]]
  ): js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
  @JSName("setAutoReporting")
  var setAutoReporting_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]], 
    js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
  ]
  
  def setClipboard(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def setGeoLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* location */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
  @JSName("setGeoLocation")
  var setGeoLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
  ]
  
  def setImplicitTimeout(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* ms */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  @JSName("setImplicitTimeout")
  var setImplicitTimeout_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* ms */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
  ]
  
  def setLocalStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  @JSName("setLocalStorage")
  var setLocalStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  ]
  
  def setNetworkConditions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def setNetworkConnection(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* type */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
  @JSName("setNetworkConnection")
  var setNetworkConnection_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* type */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
  ]
  
  def setOrientation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* orientation */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
  @JSName("setOrientation")
  var setOrientation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* orientation */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
  ]
  
  def setSessionStorage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* key */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  @JSName("setSessionStorage")
  var setSessionStorage_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
  ]
  
  def setTimeouts(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def setValueImmediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  @JSName("setValueImmediate")
  var setValueImmediate_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
  ]
  
  def setWindowPosition(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
  ): js.Promise[
    ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
  ]
  @JSName("setWindowPosition")
  var setWindowPosition_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]], 
    js.Promise[
      ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
    ]
  ]
  
  def setWindowRect(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def shake(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("shake")
  var shake_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def shutdown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("shutdown")
  var shutdown_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def startActivity(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def startRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
  @JSName("startRecordingScreen")
  var startRecordingScreen_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
  ]
  
  def status(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[StatusReturn]]
  ): js.Promise[ReturnType[js.Function0[StatusReturn]]]
  @JSName("status")
  var status_Original: js.Function1[
    /* args */ Parameters[js.Function0[StatusReturn]], 
    js.Promise[ReturnType[js.Function0[StatusReturn]]]
  ]
  
  def stopRecordingScreen(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def switchContext(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* name */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  @JSName("switchContext")
  var switchContext_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* name */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
  ]
  
  def switchToFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
  @JSName("switchToFrame")
  var switchToFrame_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]], 
    js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
  ]
  
  def switchToParentFrame(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("switchToParentFrame")
  var switchToParentFrame_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def switchToWindow(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* handle */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
  @JSName("switchToWindow")
  var switchToWindow_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* handle */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
  ]
  
  def takeElementScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
  ): js.Promise[
    ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
  ]
  @JSName("takeElementScreenshot")
  var takeElementScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]], 
    js.Promise[
      ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
    ]
  ]
  
  def takeHeapSnapshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[ProtocolCommandResponse]]
  ): js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  @JSName("takeHeapSnapshot")
  var takeHeapSnapshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[ProtocolCommandResponse]], 
    js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
  ]
  
  def takeScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]]
  @JSName("takeScreenshot")
  var takeScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ]
  
  def terminateApp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def throttleCPU(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* rate */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
  @JSName("throttleCPU")
  var throttleCPU_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* rate */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
  ]
  
  def throttleNetwork(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* condition */ String | js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
  @JSName("throttleNetwork")
  var throttleNetwork_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
  ]
  
  def toggleAirplaneMode(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("toggleAirplaneMode")
  var toggleAirplaneMode_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def toggleData(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("toggleData")
  var toggleData_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def toggleEnrollTouchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
  @JSName("toggleEnrollTouchId")
  var toggleEnrollTouchId_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]], 
    js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
  ]
  
  def toggleLocationServices(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("toggleLocationServices")
  var toggleLocationServices_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def toggleNetworkSpeed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("toggleNetworkSpeed")
  var toggleNetworkSpeed_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def toggleWiFi(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("toggleWiFi")
  var toggleWiFi_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def touchClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  @JSName("touchClick")
  var touchClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ]
  
  def touchDoubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  @JSName("touchDoubleClick")
  var touchDoubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ]
  
  def touchDown(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  @JSName("touchDown")
  var touchDown_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ]
  
  def touchFlick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
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
  ]
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
  ]
  
  def touchId(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* match */ Boolean, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
  @JSName("touchId")
  var touchId_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]], 
    js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
  ]
  
  def touchLongClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* element */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  @JSName("touchLongClick")
  var touchLongClick_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* element */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
  ]
  
  def touchMove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  @JSName("touchMove")
  var touchMove_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ]
  
  def touchPerform(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  @JSName("touchPerform")
  var touchPerform_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]], 
    js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
  ]
  
  def touchPinch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
  ): js.Promise[
    ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
  ]
  @JSName("touchPinch")
  var touchPinch_Original: js.Function1[
    /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]], 
    js.Promise[
      ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
    ]
  ]
  
  def touchScroll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
    ]
  ]
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
  ]
  
  def touchUp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  @JSName("touchUp")
  var touchUp_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]], 
    js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
  ]
  
  def unlock(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]]
  @JSName("unlock")
  var unlock_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ]
  
  def updateSettings(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Client[K]> is not an array type */ args: Parameters[js.Function1[/* settings */ js.Object, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
  @JSName("updateSettings")
  var updateSettings_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]], 
    js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
  ]
}
object AsyncClient {
  
  @scala.inline
  def apply(
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
    clearLocalStorage: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]],
    clearMockCalls: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]],
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
    getNamedCookie: /* args */ Parameters[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]]],
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
    isKeyboardShown: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isLoading: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
    isLocked: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]],
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
  ): AsyncClient = {
    val __obj = js.Dynamic.literal(_getWindowSize = js.Any.fromFunction1(_getWindowSize), _setWindowSize = js.Any.fromFunction1(_setWindowSize), acceptAlert = js.Any.fromFunction1(acceptAlert), activateApp = js.Any.fromFunction1(activateApp), activateIME = js.Any.fromFunction1(activateIME), addCookie = js.Any.fromFunction1(addCookie), assertPerformance = js.Any.fromFunction1(assertPerformance), back = js.Any.fromFunction1(back), background = js.Any.fromFunction1(background), buttonDown = js.Any.fromFunction1(buttonDown), buttonUp = js.Any.fromFunction1(buttonUp), clearLocalStorage = js.Any.fromFunction1(clearLocalStorage), clearMockCalls = js.Any.fromFunction1(clearMockCalls), clearSessionStorage = js.Any.fromFunction1(clearSessionStorage), closeApp = js.Any.fromFunction1(closeApp), closeWindow = js.Any.fromFunction1(closeWindow), compareImages = js.Any.fromFunction1(compareImages), createWindow = js.Any.fromFunction1(createWindow), deactivateIME = js.Any.fromFunction1(deactivateIME), deleteAllCookies = js.Any.fromFunction1(deleteAllCookies), deleteCookie = js.Any.fromFunction1(deleteCookie), deleteLocalStorageItem = js.Any.fromFunction1(deleteLocalStorageItem), deleteNetworkConditions = js.Any.fromFunction1(deleteNetworkConditions), deleteSession = js.Any.fromFunction1(deleteSession), deleteSessionStorageItem = js.Any.fromFunction1(deleteSessionStorageItem), dismissAlert = js.Any.fromFunction1(dismissAlert), driverScript = js.Any.fromFunction1(driverScript), elementClear = js.Any.fromFunction1(elementClear), elementClick = js.Any.fromFunction1(elementClick), elementEquals = js.Any.fromFunction1(elementEquals), elementHover = js.Any.fromFunction1(elementHover), elementSendKeys = js.Any.fromFunction1(elementSendKeys), elementSubmit = js.Any.fromFunction1(elementSubmit), endCoverage = js.Any.fromFunction1(endCoverage), executeAsyncScript = js.Any.fromFunction1(executeAsyncScript), executeScript = js.Any.fromFunction1(executeScript), file = js.Any.fromFunction1(file), findElement = js.Any.fromFunction1(findElement), findElementFromElement = js.Any.fromFunction1(findElementFromElement), findElements = js.Any.fromFunction1(findElements), findElementsFromElement = js.Any.fromFunction1(findElementsFromElement), fingerPrint = js.Any.fromFunction1(fingerPrint), forward = js.Any.fromFunction1(forward), freeze = js.Any.fromFunction1(freeze), fullscreenWindow = js.Any.fromFunction1(fullscreenWindow), generateTestReport = js.Any.fromFunction1(generateTestReport), getActiveElement = js.Any.fromFunction1(getActiveElement), getActiveEngine = js.Any.fromFunction1(getActiveEngine), getAlertText = js.Any.fromFunction1(getAlertText), getAllCookies = js.Any.fromFunction1(getAllCookies), getApplicationCacheStatus = js.Any.fromFunction1(getApplicationCacheStatus), getAvailableEngines = js.Any.fromFunction1(getAvailableEngines), getClipboard = js.Any.fromFunction1(getClipboard), getContext = js.Any.fromFunction1(getContext), getContexts = js.Any.fromFunction1(getContexts), getCurrentActivity = js.Any.fromFunction1(getCurrentActivity), getCurrentPackage = js.Any.fromFunction1(getCurrentPackage), getDeviceTime = js.Any.fromFunction1(getDeviceTime), getDisplayDensity = js.Any.fromFunction1(getDisplayDensity), getElementAttribute = js.Any.fromFunction1(getElementAttribute), getElementCSSValue = js.Any.fromFunction1(getElementCSSValue), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementLocationInView = js.Any.fromFunction1(getElementLocationInView), getElementProperty = js.Any.fromFunction1(getElementProperty), getElementRect = js.Any.fromFunction1(getElementRect), getElementSize = js.Any.fromFunction1(getElementSize), getElementTagName = js.Any.fromFunction1(getElementTagName), getElementText = js.Any.fromFunction1(getElementText), getElementValue = js.Any.fromFunction1(getElementValue), getEvents = js.Any.fromFunction1(getEvents), getGeoLocation = js.Any.fromFunction1(getGeoLocation), getHubConfig = js.Any.fromFunction1(getHubConfig), getLocalStorage = js.Any.fromFunction1(getLocalStorage), getLocalStorageItem = js.Any.fromFunction1(getLocalStorageItem), getLocalStorageSize = js.Any.fromFunction1(getLocalStorageSize), getLogTypes = js.Any.fromFunction1(getLogTypes), getLogs = js.Any.fromFunction1(getLogs), getMockCalls = js.Any.fromFunction1(getMockCalls), getNamedCookie = js.Any.fromFunction1(getNamedCookie), getNetworkConditions = js.Any.fromFunction1(getNetworkConditions), getNetworkConnection = js.Any.fromFunction1(getNetworkConnection), getOrientation = js.Any.fromFunction1(getOrientation), getPageIndex = js.Any.fromFunction1(getPageIndex), getPageLogs = js.Any.fromFunction1(getPageLogs), getPageSource = js.Any.fromFunction1(getPageSource), getPerformanceData = js.Any.fromFunction1(getPerformanceData), getPerformanceDataTypes = js.Any.fromFunction1(getPerformanceDataTypes), getSession = js.Any.fromFunction1(getSession), getSessionStorage = js.Any.fromFunction1(getSessionStorage), getSessionStorageItem = js.Any.fromFunction1(getSessionStorageItem), getSessionStorageSize = js.Any.fromFunction1(getSessionStorageSize), getSessions = js.Any.fromFunction1(getSessions), getSettings = js.Any.fromFunction1(getSettings), getStrings = js.Any.fromFunction1(getStrings), getSystemBars = js.Any.fromFunction1(getSystemBars), getTimeouts = js.Any.fromFunction1(getTimeouts), getTitle = js.Any.fromFunction1(getTitle), getUrl = js.Any.fromFunction1(getUrl), getWindowHandle = js.Any.fromFunction1(getWindowHandle), getWindowHandles = js.Any.fromFunction1(getWindowHandles), getWindowPosition = js.Any.fromFunction1(getWindowPosition), getWindowRect = js.Any.fromFunction1(getWindowRect), gridProxyDetails = js.Any.fromFunction1(gridProxyDetails), gridTestSession = js.Any.fromFunction1(gridTestSession), gsmCall = js.Any.fromFunction1(gsmCall), gsmSignal = js.Any.fromFunction1(gsmSignal), gsmVoice = js.Any.fromFunction1(gsmVoice), hideKeyboard = js.Any.fromFunction1(hideKeyboard), installApp = js.Any.fromFunction1(installApp), interceptRequest = js.Any.fromFunction1(interceptRequest), isAlertOpen = js.Any.fromFunction1(isAlertOpen), isAppInstalled = js.Any.fromFunction1(isAppInstalled), isAutoReporting = js.Any.fromFunction1(isAutoReporting), isElementDisplayed = js.Any.fromFunction1(isElementDisplayed), isElementEnabled = js.Any.fromFunction1(isElementEnabled), isElementSelected = js.Any.fromFunction1(isElementSelected), isIMEActivated = js.Any.fromFunction1(isIMEActivated), isKeyboardShown = js.Any.fromFunction1(isKeyboardShown), isLoading = js.Any.fromFunction1(isLoading), isLocked = js.Any.fromFunction1(isLocked), jankinessCheck = js.Any.fromFunction1(jankinessCheck), launchApp = js.Any.fromFunction1(launchApp), launchChromeApp = js.Any.fromFunction1(launchChromeApp), lock = js.Any.fromFunction1(lock), logEvent = js.Any.fromFunction1(logEvent), longPressKeyCode = js.Any.fromFunction1(longPressKeyCode), manageSeleniumHubLifecycle = js.Any.fromFunction1(manageSeleniumHubLifecycle), maximizeWindow = js.Any.fromFunction1(maximizeWindow), minimizeWindow = js.Any.fromFunction1(minimizeWindow), mockRequest = js.Any.fromFunction1(mockRequest), moveToElement = js.Any.fromFunction1(moveToElement), multiTouchPerform = js.Any.fromFunction1(multiTouchPerform), navigateTo = js.Any.fromFunction1(navigateTo), newSession = js.Any.fromFunction1(newSession), openNotifications = js.Any.fromFunction1(openNotifications), performActions = js.Any.fromFunction1(performActions), positionClick = js.Any.fromFunction1(positionClick), positionDoubleClick = js.Any.fromFunction1(positionDoubleClick), powerAC = js.Any.fromFunction1(powerAC), powerCapacity = js.Any.fromFunction1(powerCapacity), pressKeyCode = js.Any.fromFunction1(pressKeyCode), printPage = js.Any.fromFunction1(printPage), pullFile = js.Any.fromFunction1(pullFile), pullFolder = js.Any.fromFunction1(pullFolder), pushFile = js.Any.fromFunction1(pushFile), queryAppState = js.Any.fromFunction1(queryAppState), receiveAsyncResponse = js.Any.fromFunction1(receiveAsyncResponse), refresh = js.Any.fromFunction1(refresh), releaseActions = js.Any.fromFunction1(releaseActions), removeApp = js.Any.fromFunction1(removeApp), replaceValue = js.Any.fromFunction1(replaceValue), reset = js.Any.fromFunction1(reset), respondMock = js.Any.fromFunction1(respondMock), resume = js.Any.fromFunction1(resume), rotateDevice = js.Any.fromFunction1(rotateDevice), sendAlertText = js.Any.fromFunction1(sendAlertText), sendCommand = js.Any.fromFunction1(sendCommand), sendCommandAndGetResult = js.Any.fromFunction1(sendCommandAndGetResult), sendKeyEvent = js.Any.fromFunction1(sendKeyEvent), sendKeys = js.Any.fromFunction1(sendKeys), sendSms = js.Any.fromFunction1(sendSms), setAsyncTimeout = js.Any.fromFunction1(setAsyncTimeout), setAutoReporting = js.Any.fromFunction1(setAutoReporting), setClipboard = js.Any.fromFunction1(setClipboard), setGeoLocation = js.Any.fromFunction1(setGeoLocation), setImplicitTimeout = js.Any.fromFunction1(setImplicitTimeout), setLocalStorage = js.Any.fromFunction1(setLocalStorage), setNetworkConditions = js.Any.fromFunction1(setNetworkConditions), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), setOrientation = js.Any.fromFunction1(setOrientation), setSessionStorage = js.Any.fromFunction1(setSessionStorage), setTimeouts = js.Any.fromFunction1(setTimeouts), setValueImmediate = js.Any.fromFunction1(setValueImmediate), setWindowPosition = js.Any.fromFunction1(setWindowPosition), setWindowRect = js.Any.fromFunction1(setWindowRect), shake = js.Any.fromFunction1(shake), shutdown = js.Any.fromFunction1(shutdown), startActivity = js.Any.fromFunction1(startActivity), startRecordingScreen = js.Any.fromFunction1(startRecordingScreen), status = js.Any.fromFunction1(status), stopRecordingScreen = js.Any.fromFunction1(stopRecordingScreen), switchContext = js.Any.fromFunction1(switchContext), switchToFrame = js.Any.fromFunction1(switchToFrame), switchToParentFrame = js.Any.fromFunction1(switchToParentFrame), switchToWindow = js.Any.fromFunction1(switchToWindow), takeElementScreenshot = js.Any.fromFunction1(takeElementScreenshot), takeHeapSnapshot = js.Any.fromFunction1(takeHeapSnapshot), takeScreenshot = js.Any.fromFunction1(takeScreenshot), terminateApp = js.Any.fromFunction1(terminateApp), throttleCPU = js.Any.fromFunction1(throttleCPU), throttleNetwork = js.Any.fromFunction1(throttleNetwork), toggleAirplaneMode = js.Any.fromFunction1(toggleAirplaneMode), toggleData = js.Any.fromFunction1(toggleData), toggleEnrollTouchId = js.Any.fromFunction1(toggleEnrollTouchId), toggleLocationServices = js.Any.fromFunction1(toggleLocationServices), toggleNetworkSpeed = js.Any.fromFunction1(toggleNetworkSpeed), toggleWiFi = js.Any.fromFunction1(toggleWiFi), touchClick = js.Any.fromFunction1(touchClick), touchDoubleClick = js.Any.fromFunction1(touchDoubleClick), touchDown = js.Any.fromFunction1(touchDown), touchFlick = js.Any.fromFunction1(touchFlick), touchId = js.Any.fromFunction1(touchId), touchLongClick = js.Any.fromFunction1(touchLongClick), touchMove = js.Any.fromFunction1(touchMove), touchPerform = js.Any.fromFunction1(touchPerform), touchPinch = js.Any.fromFunction1(touchPinch), touchScroll = js.Any.fromFunction1(touchScroll), touchUp = js.Any.fromFunction1(touchUp), unlock = js.Any.fromFunction1(unlock), updateSettings = js.Any.fromFunction1(updateSettings))
    __obj.asInstanceOf[AsyncClient]
  }
  
  @scala.inline
  implicit class AsyncClientMutableBuilder[Self <: AsyncClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "acceptAlert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateApp(
      value: /* args */ Parameters[
          js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "activateApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateIME(
      value: /* args */ Parameters[js.Function1[/* engine */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* engine */ String, Unit]]]
    ): Self = StObject.set(x, "activateIME", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCookie(
      value: /* args */ Parameters[js.Function1[/* cookie */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* cookie */ js.Object, Unit]]]
    ): Self = StObject.set(x, "addCookie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssertPerformance(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "assertPerformance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBack(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackground(
      value: /* args */ Parameters[js.Function1[/* seconds */ Double | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ Double | Null, Unit]]]
    ): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
    
    @scala.inline
    def setButtonDown(
      value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    ): Self = StObject.set(x, "buttonDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setButtonUp(
      value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    ): Self = StObject.set(x, "buttonUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearLocalStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearLocalStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearMockCalls(
      value: /* args */ Parameters[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* restore */ Boolean, Unit]]]
    ): Self = StObject.set(x, "clearMockCalls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearSessionStorage(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "clearSessionStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseWindow(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "closeWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareImages(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "compareImages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWindow(
      value: /* args */ Parameters[js.Function1[/* type */ tab | window, WindowHandle]] => js.Promise[ReturnType[js.Function1[/* type */ tab | window, WindowHandle]]]
    ): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivateIME(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deactivateIME", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteAllCookies(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteAllCookies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteCookie(
      value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    ): Self = StObject.set(x, "deleteCookie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteLocalStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    ): Self = StObject.set(x, "deleteLocalStorageItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteNetworkConditions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteNetworkConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteSession(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteSessionStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* key */ String, Unit]]]
    ): Self = StObject.set(x, "deleteSessionStorageItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDismissAlert(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "dismissAlert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDriverScript(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "driverScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementClear(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    ): Self = StObject.set(x, "elementClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementClick(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    ): Self = StObject.set(x, "elementClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementEquals(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* otherElementId */ String, Boolean]]
        ]
    ): Self = StObject.set(x, "elementEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementHover(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    ): Self = StObject.set(x, "elementHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementSendKeys(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* text */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* text */ String, Unit]]]
    ): Self = StObject.set(x, "elementSendKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementSubmit(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Unit]]]
    ): Self = StObject.set(x, "elementSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndCoverage(
      value: /* args */ Parameters[js.Function2[/* intent */ String, /* path */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* intent */ String, /* path */ String, Unit]]]
    ): Self = StObject.set(x, "endCoverage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteAsyncScript(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "executeAsyncScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteScript(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "executeScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFile(
      value: /* args */ Parameters[js.Function1[/* file */ String, String]] => js.Promise[ReturnType[js.Function1[/* file */ String, String]]]
    ): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindElement(
      value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, String]] => js.Promise[ReturnType[js.Function2[/* using */ String, /* value */ String, String]]]
    ): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindElementFromElement(
      value: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, String]
          ]
        ]
    ): Self = StObject.set(x, "findElementFromElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindElements(
      value: /* args */ Parameters[js.Function2[/* using */ String, /* value */ String, js.Array[String]]] => js.Promise[
          ReturnType[js.Function2[/* using */ String, /* value */ String, js.Array[String]]]
        ]
    ): Self = StObject.set(x, "findElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindElementsFromElement(
      value: /* args */ Parameters[
          js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* elementId */ String, /* using */ String, /* value */ String, js.Array[String]]
          ]
        ]
    ): Self = StObject.set(x, "findElementsFromElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFingerPrint(
      value: /* args */ Parameters[js.Function1[/* fingerprintId */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* fingerprintId */ Double, Unit]]]
    ): Self = StObject.set(x, "fingerPrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForward(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFreeze(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFullscreenWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
    ): Self = StObject.set(x, "fullscreenWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateTestReport(
      value: /* args */ Parameters[js.Function2[/* message */ String, /* group */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* message */ String, /* group */ String, Unit]]]
    ): Self = StObject.set(x, "generateTestReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActiveElement(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActiveEngine(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getActiveEngine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAlertText(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getAlertText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllCookies(
      value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    ): Self = StObject.set(x, "getAllCookies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetApplicationCacheStatus(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getApplicationCacheStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAvailableEngines(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getAvailableEngines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClipboard(
      value: /* args */ Parameters[js.Function1[/* contentType */ js.UndefOr[String], String]] => js.Promise[ReturnType[js.Function1[/* contentType */ js.UndefOr[String], String]]]
    ): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContext(
      value: /* args */ Parameters[js.Function0[String | Null]] => js.Promise[ReturnType[js.Function0[String | Null]]]
    ): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContexts(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getContexts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentActivity(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentActivity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentPackage(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getCurrentPackage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeviceTime(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getDeviceTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayDensity(value: /* args */ Parameters[js.Function0[js.Any]] => js.Promise[ReturnType[js.Function0[js.Any]]]): Self = StObject.set(x, "getDisplayDensity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementAttribute(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ): Self = StObject.set(x, "getElementAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementCSSValue(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* propertyName */ String, String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* propertyName */ String, String]]
        ]
    ): Self = StObject.set(x, "getElementCSSValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementLocation(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementLocationInView(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getElementLocationInView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementProperty(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* name */ String, String]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* name */ String, String]]]
    ): Self = StObject.set(x, "getElementProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementRect(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, RectReturn]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, RectReturn]]]
    ): Self = StObject.set(x, "getElementRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementSize(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementTagName(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    ): Self = StObject.set(x, "getElementTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementText(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String]]]
    ): Self = StObject.set(x, "getElementText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementValue(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, String | Null]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, String | Null]]]
    ): Self = StObject.set(x, "getElementValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEvents(
      value: /* args */ Parameters[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ js.Array[String], ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGeoLocation(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getGeoLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHubConfig(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getHubConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalStorage(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    ): Self = StObject.set(x, "getLocalStorageItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getLocalStorageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLogTypes(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getLogTypes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLogs(
      value: /* args */ Parameters[js.Function1[/* type */ String, js.Array[js.Object]]] => js.Promise[ReturnType[js.Function1[/* type */ String, js.Array[js.Object]]]]
    ): Self = StObject.set(x, "getLogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMockCalls(
      value: /* args */ Parameters[js.Function1[/* mockId */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* mockId */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getMockCalls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedCookie(
      value: /* args */ Parameters[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]] => js.Promise[ReturnType[js.Function1[/* name */ String, typings.webdriver.WebDriver.Cookie]]]
    ): Self = StObject.set(x, "getNamedCookie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNetworkConditions(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getNetworkConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNetworkConnection(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOrientation(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageIndex(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageLogs(
      value: /* args */ Parameters[js.Function1[/* type */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* type */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getPageLogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageSource(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getPageSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPerformanceData(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "getPerformanceData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPerformanceDataTypes(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getPerformanceDataTypes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSession(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionStorage(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getSessionStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionStorageItem(
      value: /* args */ Parameters[js.Function1[/* key */ String, String]] => js.Promise[ReturnType[js.Function1[/* key */ String, String]]]
    ): Self = StObject.set(x, "getSessionStorageItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionStorageSize(value: /* args */ Parameters[js.Function0[Double]] => js.Promise[ReturnType[js.Function0[Double]]]): Self = StObject.set(x, "getSessionStorageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessions(
      value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    ): Self = StObject.set(x, "getSessions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSettings(
      value: /* args */ Parameters[js.Function0[SettingsReturn]] => js.Promise[ReturnType[js.Function0[SettingsReturn]]]
    ): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStrings(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "getStrings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSystemBars(
      value: /* args */ Parameters[js.Function0[js.Array[js.Object]]] => js.Promise[ReturnType[js.Function0[js.Array[js.Object]]]]
    ): Self = StObject.set(x, "getSystemBars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTimeouts(
      value: /* args */ Parameters[js.Function0[Timeouts]] => js.Promise[ReturnType[js.Function0[Timeouts]]]
    ): Self = StObject.set(x, "getTimeouts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTitle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUrl(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowHandle(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowHandles(
      value: /* args */ Parameters[js.Function0[js.Array[String]]] => js.Promise[ReturnType[js.Function0[js.Array[String]]]]
    ): Self = StObject.set(x, "getWindowHandles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowPosition(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "getWindowPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowRect(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
    ): Self = StObject.set(x, "getWindowRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGridProxyDetails(
      value: /* args */ Parameters[js.Function1[/* id */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* id */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "gridProxyDetails", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGridTestSession(
      value: /* args */ Parameters[js.Function1[/* session */ String, ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function1[/* session */ String, ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "gridTestSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGsmCall(
      value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* action */ String, Unit]]]
    ): Self = StObject.set(x, "gsmCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGsmSignal(
      value: /* args */ Parameters[
          js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* signalStrength */ String, /* signalStrengh */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "gsmSignal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGsmVoice(
      value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    ): Self = StObject.set(x, "gsmVoice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideKeyboard(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "hideKeyboard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstallApp(
      value: /* args */ Parameters[js.Function1[/* appPath */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* appPath */ String, Unit]]]
    ): Self = StObject.set(x, "installApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterceptRequest(
      value: /* args */ Parameters[js.Function1[/* rule */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* rule */ js.Object, Unit]]]
    ): Self = StObject.set(x, "interceptRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAlertOpen(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isAlertOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAppInstalled(
      value: /* args */ Parameters[
          js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Boolean]
          ]
        ]
    ): Self = StObject.set(x, "isAppInstalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAutoReporting(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isAutoReporting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementDisplayed(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    ): Self = StObject.set(x, "isElementDisplayed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementEnabled(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    ): Self = StObject.set(x, "isElementEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementSelected(
      value: /* args */ Parameters[js.Function1[/* elementId */ String, Boolean]] => js.Promise[ReturnType[js.Function1[/* elementId */ String, Boolean]]]
    ): Self = StObject.set(x, "isElementSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIMEActivated(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isIMEActivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsKeyboardShown(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isKeyboardShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoading(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLocked(
      value: /* args */ Parameters[js.Function0[Boolean]] => js.Promise[ReturnType[js.Function0[Boolean]]]
    ): Self = StObject.set(x, "isLocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJankinessCheck(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "jankinessCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLaunchApp(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "launchApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLaunchChromeApp(
      value: /* args */ Parameters[js.Function1[/* id */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ String, Unit]]]
    ): Self = StObject.set(x, "launchChromeApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLock(
      value: /* args */ Parameters[js.Function1[/* seconds */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* seconds */ js.UndefOr[Double], Unit]]]
    ): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogEvent(
      value: /* args */ Parameters[js.Function2[/* vendor */ String, /* event */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* vendor */ String, /* event */ String, Unit]]]
    ): Self = StObject.set(x, "logEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLongPressKeyCode(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "longPressKeyCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setManageSeleniumHubLifecycle(
      value: /* args */ Parameters[js.Function1[/* action */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* action */ String, Unit]]]
    ): Self = StObject.set(x, "manageSeleniumHubLifecycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaximizeWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
    ): Self = StObject.set(x, "maximizeWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinimizeWindow(
      value: /* args */ Parameters[js.Function0[RectReturn]] => js.Promise[ReturnType[js.Function0[RectReturn]]]
    ): Self = StObject.set(x, "minimizeWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMockRequest(
      value: /* args */ Parameters[
          js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* url */ String, /* filterOptions */ js.UndefOr[js.Object], ProtocolCommandResponse]
          ]
        ]
    ): Self = StObject.set(x, "mockRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveToElement(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "moveToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiTouchPerform(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    ): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateTo(
      value: /* args */ Parameters[js.Function1[/* url */ String, String]] => js.Promise[ReturnType[js.Function1[/* url */ String, String]]]
    ): Self = StObject.set(x, "navigateTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewSession(
      value: /* args */ Parameters[js.Function1[/* capabilities */ js.Object, SessionReturn]] => js.Promise[ReturnType[js.Function1[/* capabilities */ js.Object, SessionReturn]]]
    ): Self = StObject.set(x, "newSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenNotifications(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "openNotifications", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPerformActions(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    ): Self = StObject.set(x, "performActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionClick(
      value: /* args */ Parameters[js.Function1[/* button */ js.UndefOr[Double], Unit]] => js.Promise[ReturnType[js.Function1[/* button */ js.UndefOr[Double], Unit]]]
    ): Self = StObject.set(x, "positionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionDoubleClick(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "positionDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerAC(
      value: /* args */ Parameters[js.Function1[/* state */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* state */ String, Unit]]]
    ): Self = StObject.set(x, "powerAC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerCapacity(
      value: /* args */ Parameters[js.Function1[/* percent */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* percent */ Double, Unit]]]
    ): Self = StObject.set(x, "powerCapacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPressKeyCode(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "pressKeyCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrintPage(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullFile(
      value: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
    ): Self = StObject.set(x, "pullFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullFolder(
      value: /* args */ Parameters[js.Function1[/* path */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* path */ String, Unit]]]
    ): Self = StObject.set(x, "pullFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushFile(
      value: /* args */ Parameters[js.Function2[/* path */ String, /* data */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* path */ String, /* data */ String, Unit]]]
    ): Self = StObject.set(x, "pushFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryAppState(
      value: /* args */ Parameters[
          js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Double]
          ]
        ]
    ): Self = StObject.set(x, "queryAppState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceiveAsyncResponse(
      value: /* args */ Parameters[js.Function1[/* response */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* response */ js.Object, Unit]]]
    ): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseActions(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "releaseActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveApp(
      value: /* args */ Parameters[
          js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceValue(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ): Self = StObject.set(x, "replaceValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespondMock(
      value: /* args */ Parameters[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* mockId */ String, /* payload */ js.Object, Unit]]]
    ): Self = StObject.set(x, "respondMock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResume(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateDevice(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "rotateDevice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendAlertText(
      value: /* args */ Parameters[js.Function1[/* text */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
    ): Self = StObject.set(x, "sendAlertText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendCommand(
      value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, Unit]]]
    ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendCommandAndGetResult(
      value: /* args */ Parameters[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]] => js.Promise[ReturnType[js.Function2[/* cmd */ String, /* params */ js.Object, js.Any]]]
    ): Self = StObject.set(x, "sendCommandAndGetResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendKeyEvent(
      value: /* args */ Parameters[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]] => js.Promise[
          ReturnType[js.Function2[/* keycode */ String, /* metastate */ js.UndefOr[String], Unit]]
        ]
    ): Self = StObject.set(x, "sendKeyEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendKeys(
      value: /* args */ Parameters[js.Function1[/* value */ js.Array[String], Unit]] => js.Promise[ReturnType[js.Function1[/* value */ js.Array[String], Unit]]]
    ): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendSms(
      value: /* args */ Parameters[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* phoneNumber */ String, /* message */ String, Unit]]]
    ): Self = StObject.set(x, "sendSms", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAsyncTimeout(
      value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    ): Self = StObject.set(x, "setAsyncTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoReporting(
      value: /* args */ Parameters[js.Function1[/* enabled */ Boolean, js.Object | Null]] => js.Promise[ReturnType[js.Function1[/* enabled */ Boolean, js.Object | Null]]]
    ): Self = StObject.set(x, "setAutoReporting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClipboard(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "setClipboard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGeoLocation(
      value: /* args */ Parameters[js.Function1[/* location */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* location */ js.Object, Unit]]]
    ): Self = StObject.set(x, "setGeoLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImplicitTimeout(
      value: /* args */ Parameters[js.Function1[/* ms */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* ms */ Double, Unit]]]
    ): Self = StObject.set(x, "setImplicitTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocalStorage(
      value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    ): Self = StObject.set(x, "setLocalStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNetworkConditions(
      value: /* args */ Parameters[
          js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* network_conditions */ js.Object, /* network_name */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "setNetworkConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNetworkConnection(
      value: /* args */ Parameters[js.Function1[/* type */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* type */ Double, Unit]]]
    ): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientation(
      value: /* args */ Parameters[js.Function1[/* orientation */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* orientation */ String, Unit]]]
    ): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSessionStorage(
      value: /* args */ Parameters[js.Function2[/* key */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* key */ String, /* value */ String, Unit]]]
    ): Self = StObject.set(x, "setSessionStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeouts(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "setTimeouts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueImmediate(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* value */ String, Unit]] => js.Promise[ReturnType[js.Function2[/* elementId */ String, /* value */ String, Unit]]]
    ): Self = StObject.set(x, "setValueImmediate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWindowPosition(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]] => js.Promise[
          ReturnType[js.Function2[/* x */ Double, /* y */ Double, ProtocolCommandResponse]]
        ]
    ): Self = StObject.set(x, "setWindowPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWindowRect(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "setWindowRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShake(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShutdown(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartActivity(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "startActivity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartRecordingScreen(
      value: /* args */ Parameters[js.Function1[/* options */ js.UndefOr[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]]
    ): Self = StObject.set(x, "startRecordingScreen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(
      value: /* args */ Parameters[js.Function0[StatusReturn]] => js.Promise[ReturnType[js.Function0[StatusReturn]]]
    ): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopRecordingScreen(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "stopRecordingScreen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchContext(
      value: /* args */ Parameters[js.Function1[/* name */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* name */ String, Unit]]]
    ): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchToFrame(
      value: /* args */ Parameters[js.Function1[/* id */ Double | js.Object | Null, Unit]] => js.Promise[ReturnType[js.Function1[/* id */ Double | js.Object | Null, Unit]]]
    ): Self = StObject.set(x, "switchToFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchToParentFrame(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "switchToParentFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchToWindow(
      value: /* args */ Parameters[js.Function1[/* handle */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* handle */ String, Unit]]]
    ): Self = StObject.set(x, "switchToWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakeElementScreenshot(
      value: /* args */ Parameters[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]] => js.Promise[
          ReturnType[js.Function2[/* elementId */ String, /* scroll */ js.UndefOr[Boolean], String]]
        ]
    ): Self = StObject.set(x, "takeElementScreenshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakeHeapSnapshot(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "takeHeapSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakeScreenshot(value: /* args */ Parameters[js.Function0[String]] => js.Promise[ReturnType[js.Function0[String]]]): Self = StObject.set(x, "takeScreenshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminateApp(
      value: /* args */ Parameters[
          js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function2[/* appId */ js.UndefOr[String], /* bundleId */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "terminateApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrottleCPU(
      value: /* args */ Parameters[js.Function1[/* rate */ Double, Unit]] => js.Promise[ReturnType[js.Function1[/* rate */ Double, Unit]]]
    ): Self = StObject.set(x, "throttleCPU", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrottleNetwork(
      value: /* args */ Parameters[js.Function1[/* condition */ String | js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* condition */ String | js.Object, Unit]]]
    ): Self = StObject.set(x, "throttleNetwork", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleAirplaneMode(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleAirplaneMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleData(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleEnrollTouchId(
      value: /* args */ Parameters[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] => js.Promise[ReturnType[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]]]
    ): Self = StObject.set(x, "toggleEnrollTouchId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleLocationServices(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleLocationServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleNetworkSpeed(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleNetworkSpeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleWiFi(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "toggleWiFi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    ): Self = StObject.set(x, "touchClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchDoubleClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    ): Self = StObject.set(x, "touchDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchDown(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    ): Self = StObject.set(x, "touchDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchFlick(
      value: /* args */ Parameters[
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
        ]
    ): Self = StObject.set(x, "touchFlick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchId(
      value: /* args */ Parameters[js.Function1[/* match */ Boolean, Unit]] => js.Promise[ReturnType[js.Function1[/* match */ Boolean, Unit]]]
    ): Self = StObject.set(x, "touchId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchLongClick(
      value: /* args */ Parameters[js.Function1[/* element */ String, Unit]] => js.Promise[ReturnType[js.Function1[/* element */ String, Unit]]]
    ): Self = StObject.set(x, "touchLongClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchMove(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    ): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchPerform(
      value: /* args */ Parameters[js.Function1[/* actions */ js.Array[js.Object], Unit]] => js.Promise[ReturnType[js.Function1[/* actions */ js.Array[js.Object], Unit]]]
    ): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchPinch(
      value: /* args */ Parameters[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]] => js.Promise[
          ReturnType[js.Function3[/* x */ Double, /* y */ Double, /* scale */ Double, Unit]]
        ]
    ): Self = StObject.set(x, "touchPinch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchScroll(
      value: /* args */ Parameters[
          js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
        ] => js.Promise[
          ReturnType[
            js.Function3[/* xoffset */ Double, /* yoffset */ Double, /* element */ js.UndefOr[String], Unit]
          ]
        ]
    ): Self = StObject.set(x, "touchScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchUp(
      value: /* args */ Parameters[js.Function2[/* x */ Double, /* y */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* x */ Double, /* y */ Double, Unit]]]
    ): Self = StObject.set(x, "touchUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlock(value: /* args */ Parameters[js.Function0[Unit]] => js.Promise[ReturnType[js.Function0[Unit]]]): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSettings(
      value: /* args */ Parameters[js.Function1[/* settings */ js.Object, Unit]] => js.Promise[ReturnType[js.Function1[/* settings */ js.Object, Unit]]]
    ): Self = StObject.set(x, "updateSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getWindowSize(
      value: /* args */ Parameters[js.Function0[ProtocolCommandResponse]] => js.Promise[ReturnType[js.Function0[ProtocolCommandResponse]]]
    ): Self = StObject.set(x, "_getWindowSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setWindowSize(
      value: /* args */ Parameters[js.Function2[/* width */ Double, /* height */ Double, Unit]] => js.Promise[ReturnType[js.Function2[/* width */ Double, /* height */ Double, Unit]]]
    ): Self = StObject.set(x, "_setWindowSize", js.Any.fromFunction1(value))
  }
}
