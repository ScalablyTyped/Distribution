package typings.webdriverio.WebdriverIO

import typings.std.Error
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks
  extends HooksArray
     with _Hooks

object Hooks {
  @scala.inline
  def apply(
    after: (js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    afterCommand: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    afterSession: (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    afterSuite: /* suite */ Suite => Unit = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Unit = null,
    before: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[_]) => Unit = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    beforeSession: (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    beforeSuite: /* suite */ Suite => Unit = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Unit = null,
    onComplete: (js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]
      ]
    ]) = null,
    onPrepare: (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ]) = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Unit = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4(afterCommand))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5(afterHook))
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession.asInstanceOf[js.Any])
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1(afterSuite))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3(afterTest))
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2(beforeCommand))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4(beforeHook))
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession.asInstanceOf[js.Any])
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1(beforeSuite))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2(beforeTest))
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare.asInstanceOf[js.Any])
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2(onReload))
    __obj.asInstanceOf[Hooks]
  }
}

