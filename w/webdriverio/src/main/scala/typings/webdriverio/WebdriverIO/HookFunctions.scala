package typings.webdriverio.WebdriverIO

import typings.std.Error
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookFunctions extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.undefined
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ AnonDuration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ AnonDuration, Unit]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
  ] = js.undefined
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.undefined
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  var onComplete: js.UndefOr[
    js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]
  ] = js.undefined
  var onPrepare: js.UndefOr[
    js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
  ] = js.undefined
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
}

object HookFunctions {
  @scala.inline
  def apply(
    after: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit = null,
    afterCommand: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    afterSession: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit = null,
    afterSuite: /* suite */ Suite => Unit = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Unit = null,
    before: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[_]) => Unit = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    beforeSession: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit = null,
    beforeSuite: /* suite */ Suite => Unit = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Unit = null,
    onComplete: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit = null,
    onPrepare: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Unit = null
  ): HookFunctions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4(afterCommand))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5(afterHook))
    if (afterSession != null) __obj.updateDynamic("afterSession")(js.Any.fromFunction3(afterSession))
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1(afterSuite))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3(afterTest))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2(beforeCommand))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4(beforeHook))
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(js.Any.fromFunction3(beforeSession))
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1(beforeSuite))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2(beforeTest))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction4(onComplete))
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(js.Any.fromFunction2(onPrepare))
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2(onReload))
    __obj.asInstanceOf[HookFunctions]
  }
}

