package typings.webdriverio

import typings.node.Buffer
import typings.std.Parameters
import typings.std.ReturnType
import typings.webdriverio.WebdriverIO.AddValueOptions
import typings.webdriverio.WebdriverIO.CSSProperty
import typings.webdriverio.WebdriverIO.ClickOptions
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import typings.webdriverio.WebdriverIO.LocationParam
import typings.webdriverio.WebdriverIO.SizeParam
import typings.webdriverio.WebdriverIO.WaitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element commands wrapper with Promise
/* Inlined {[ K in keyof webdriverio.ElementPromise ]: (args : std.Parameters<webdriverio.ElementPromise[K]>): std.Promise<std.ReturnType<webdriverio.ElementPromise[K]>>} & webdriverio.AsyncSelectors */
@js.native
trait ElementAsync extends js.Object {
  @JSName("$")
  var $_Original: _empty = js.native
  @JSName("$$")
  var DollarDollar_Original: $ = js.native
  @JSName("addValue")
  var addValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* value */ String | Double | Boolean | js.Object | js.Array[_], 
          /* options */ js.UndefOr[AddValueOptions], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("clearValue")
  var clearValue_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("click")
  var click_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* options */ js.UndefOr[ClickOptions], Unit]], 
    js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[ClickOptions], Unit]]]
  ] = js.native
  @JSName("custom$")
  var custom$_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]], 
    js.Promise[
      ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
    ]
  ] = js.native
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]], 
    js.Promise[
      ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
    ]
  ] = js.native
  @JSName("doubleClick")
  var doubleClick_Original: js.Function1[
    /* args */ Parameters[js.Function0[Unit]], 
    js.Promise[ReturnType[js.Function0[Unit]]]
  ] = js.native
  @JSName("getAttribute")
  var getAttribute_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* attributeName */ String, String]], 
    js.Promise[ReturnType[js.Function1[/* attributeName */ String, String]]]
  ] = js.native
  @JSName("getCSSProperty")
  var getCSSProperty_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* cssProperty */ String, CSSProperty]], 
    js.Promise[ReturnType[js.Function1[/* cssProperty */ String, CSSProperty]]]
  ] = js.native
  @JSName("getHTML")
  var getHTML_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], String]], 
    js.Promise[ReturnType[js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], String]]]
  ] = js.native
  @JSName("getLocation")
  var getLocation_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* prop */ LocationParam, Double]], 
    js.Promise[ReturnType[js.Function1[/* prop */ LocationParam, Double]]]
  ] = js.native
  @JSName("getProperty")
  var getProperty_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* property */ String, js.Object | String | Boolean | Double]], 
    js.Promise[
      ReturnType[js.Function1[/* property */ String, js.Object | String | Boolean | Double]]
    ]
  ] = js.native
  @JSName("getSize")
  var getSize_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* prop */ SizeParam, Double]], 
    js.Promise[ReturnType[js.Function1[/* prop */ SizeParam, Double]]]
  ] = js.native
  @JSName("getTagName")
  var getTagName_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getText")
  var getText_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("getValue")
  var getValue_Original: js.Function1[
    /* args */ Parameters[js.Function0[String]], 
    js.Promise[ReturnType[js.Function0[String]]]
  ] = js.native
  @JSName("isClickable")
  var isClickable_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isDisplayedInViewport")
  var isDisplayedInViewport_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isDisplayed")
  var isDisplayed_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isEnabled")
  var isEnabled_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isEqual")
  var isEqual_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* el */ Element, Boolean]], 
    js.Promise[ReturnType[js.Function1[/* el */ Element, Boolean]]]
  ] = js.native
  @JSName("isExisting")
  var isExisting_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isFocused")
  var isFocused_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("isSelected")
  var isSelected_Original: js.Function1[
    /* args */ Parameters[js.Function0[Boolean]], 
    js.Promise[ReturnType[js.Function0[Boolean]]]
  ] = js.native
  @JSName("moveTo")
  var moveTo_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[/* xoffset */ js.UndefOr[Double], /* yoffset */ js.UndefOr[Double], Unit]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[/* xoffset */ js.UndefOr[Double], /* yoffset */ js.UndefOr[Double], Unit]
      ]
    ]
  ] = js.native
  @JSName("react$")
  var react$_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* selector */ String, 
          /* props */ js.UndefOr[js.Object], 
          /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
          Element
        ]
      ]
    ]
  ] = js.native
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* selector */ String, 
          /* props */ js.UndefOr[js.Object], 
          /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
          ElementArray
        ]
      ]
    ]
  ] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* filename */ String, Buffer]], 
    js.Promise[ReturnType[js.Function1[/* filename */ String, Buffer]]]
  ] = js.native
  @JSName("scrollIntoView")
  var scrollIntoView_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* scrollIntoViewOptions */ js.UndefOr[js.Object | Boolean], Unit]], 
    js.Promise[
      ReturnType[js.Function1[/* scrollIntoViewOptions */ js.UndefOr[js.Object | Boolean], Unit]]
    ]
  ] = js.native
  @JSName("selectByAttribute")
  var selectByAttribute_Original: js.Function1[
    /* args */ Parameters[js.Function2[/* attribute */ String, /* value */ String, Unit]], 
    js.Promise[ReturnType[js.Function2[/* attribute */ String, /* value */ String, Unit]]]
  ] = js.native
  @JSName("selectByIndex")
  var selectByIndex_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* index */ Double, Unit]], 
    js.Promise[ReturnType[js.Function1[/* index */ Double, Unit]]]
  ] = js.native
  @JSName("selectByVisibleText")
  var selectByVisibleText_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* text */ String, Unit]], 
    js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]]
  ] = js.native
  @JSName("setValue")
  var setValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function2[
          /* value */ String | Double | Boolean | js.Object | js.Array[_], 
          /* options */ js.UndefOr[AddValueOptions], 
          Unit
        ]
      ]
    ]
  ] = js.native
  @JSName("shadow$")
  var shadow$_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* selector */ String | js.Function, Element]], 
    js.Promise[ReturnType[js.Function1[/* selector */ String | js.Function, Element]]]
  ] = js.native
  @JSName("shadow$$")
  var shadowDollarDollar_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* selector */ String | js.Function, ElementArray]], 
    js.Promise[ReturnType[js.Function1[/* selector */ String | js.Function, ElementArray]]]
  ] = js.native
  @JSName("waitForClickable")
  var waitForClickable_Original: js.Function1[
    /* args */ Parameters[js.Function1[/* options */ js.UndefOr[WaitForOptions], Boolean]], 
    js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[WaitForOptions], Boolean]]]
  ] = js.native
  @JSName("waitForDisplayed")
  var waitForDisplayed_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* ms */ js.UndefOr[Double], 
          /* reverse */ js.UndefOr[Boolean], 
          /* error */ js.UndefOr[String], 
          Boolean
        ]
      ]
    ]
  ] = js.native
  @JSName("waitForEnabled")
  var waitForEnabled_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* ms */ js.UndefOr[Double], 
          /* reverse */ js.UndefOr[Boolean], 
          /* error */ js.UndefOr[String], 
          Boolean
        ]
      ]
    ]
  ] = js.native
  @JSName("waitForExist")
  var waitForExist_Original: js.Function1[
    /* args */ Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ], 
    js.Promise[
      ReturnType[
        js.Function3[
          /* ms */ js.UndefOr[Double], 
          /* reverse */ js.UndefOr[Boolean], 
          /* error */ js.UndefOr[String], 
          Boolean
        ]
      ]
    ]
  ] = js.native
  @JSName("$")
  def $(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] = js.native
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] = js.native
  def addValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ]
  ] = js.native
  def clearValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def click(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[ClickOptions], Unit]]
  ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[ClickOptions], Unit]]] = js.native
  @JSName("custom$")
  def custom$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
  ): js.Promise[
    ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, Element]]
  ] = js.native
  @JSName("custom$$")
  def customDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
  ): js.Promise[
    ReturnType[js.Function2[/* strategyName */ String, /* strategyArguments */ _, ElementArray]]
  ] = js.native
  def doubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Unit]]
  ): js.Promise[ReturnType[js.Function0[Unit]]] = js.native
  def getAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* attributeName */ String, String]]
  ): js.Promise[ReturnType[js.Function1[/* attributeName */ String, String]]] = js.native
  def getCSSProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* cssProperty */ String, CSSProperty]]
  ): js.Promise[ReturnType[js.Function1[/* cssProperty */ String, CSSProperty]]] = js.native
  def getHTML(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], String]]
  ): js.Promise[ReturnType[js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], String]]] = js.native
  def getLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* prop */ LocationParam, Double]]
  ): js.Promise[ReturnType[js.Function1[/* prop */ LocationParam, Double]]] = js.native
  def getProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* property */ String, js.Object | String | Boolean | Double]]
  ): js.Promise[
    ReturnType[js.Function1[/* property */ String, js.Object | String | Boolean | Double]]
  ] = js.native
  def getSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* prop */ SizeParam, Double]]
  ): js.Promise[ReturnType[js.Function1[/* prop */ SizeParam, Double]]] = js.native
  def getTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def getValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[String]]
  ): js.Promise[ReturnType[js.Function0[String]]] = js.native
  def isClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isDisplayedInViewport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isEqual(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* el */ Element, Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* el */ Element, Boolean]]] = js.native
  def isExisting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isFocused(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def isSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function0[Boolean]]
  ): js.Promise[ReturnType[js.Function0[Boolean]]] = js.native
  def moveTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function2[/* xoffset */ js.UndefOr[Double], /* yoffset */ js.UndefOr[Double], Unit]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[/* xoffset */ js.UndefOr[Double], /* yoffset */ js.UndefOr[Double], Unit]
    ]
  ] = js.native
  @JSName("react$")
  def react$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        Element
      ]
    ]
  ] = js.native
  @JSName("react$$")
  def reactDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* selector */ String, 
        /* props */ js.UndefOr[js.Object], 
        /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
        ElementArray
      ]
    ]
  ] = js.native
  def saveScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* filename */ String, Buffer]]
  ): js.Promise[ReturnType[js.Function1[/* filename */ String, Buffer]]] = js.native
  def scrollIntoView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* scrollIntoViewOptions */ js.UndefOr[js.Object | Boolean], Unit]]
  ): js.Promise[
    ReturnType[js.Function1[/* scrollIntoViewOptions */ js.UndefOr[js.Object | Boolean], Unit]]
  ] = js.native
  def selectByAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function2[/* attribute */ String, /* value */ String, Unit]]
  ): js.Promise[ReturnType[js.Function2[/* attribute */ String, /* value */ String, Unit]]] = js.native
  def selectByIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* index */ Double, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* index */ Double, Unit]]] = js.native
  def selectByVisibleText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* text */ String, Unit]]
  ): js.Promise[ReturnType[js.Function1[/* text */ String, Unit]]] = js.native
  def setValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function2[
        /* value */ String | Double | Boolean | js.Object | js.Array[_], 
        /* options */ js.UndefOr[AddValueOptions], 
        Unit
      ]
    ]
  ] = js.native
  @JSName("shadow$")
  def shadow$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* selector */ String | js.Function, Element]]
  ): js.Promise[ReturnType[js.Function1[/* selector */ String | js.Function, Element]]] = js.native
  @JSName("shadow$$")
  def shadowDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* selector */ String | js.Function, ElementArray]]
  ): js.Promise[ReturnType[js.Function1[/* selector */ String | js.Function, ElementArray]]] = js.native
  def waitForClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[js.Function1[/* options */ js.UndefOr[WaitForOptions], Boolean]]
  ): js.Promise[ReturnType[js.Function1[/* options */ js.UndefOr[WaitForOptions], Boolean]]] = js.native
  def waitForDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ] = js.native
  def waitForEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ] = js.native
  def waitForExist(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementPromise[K]> is not an array type */ args: Parameters[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ): js.Promise[
    ReturnType[
      js.Function3[
        /* ms */ js.UndefOr[Double], 
        /* reverse */ js.UndefOr[Boolean], 
        /* error */ js.UndefOr[String], 
        Boolean
      ]
    ]
  ] = js.native
}

