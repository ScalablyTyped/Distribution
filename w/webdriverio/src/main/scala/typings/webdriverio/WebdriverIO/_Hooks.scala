package typings.webdriverio.WebdriverIO

import typings.std.Error
import typings.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> */
trait _Hooks extends js.Object {
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
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ AnonDuration, Unit]
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
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
}

object _Hooks {
  @scala.inline
  def apply(
    afterCommand: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    afterSuite: /* suite */ Suite => Unit = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Unit = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[_]) => Unit = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    beforeSuite: /* suite */ Suite => Unit = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Unit = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Unit = null
  ): _Hooks = {
    val __obj = js.Dynamic.literal()
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4(afterCommand))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5(afterHook))
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1(afterSuite))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3(afterTest))
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2(beforeCommand))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4(beforeHook))
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1(beforeSuite))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2(beforeTest))
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2(onReload))
    __obj.asInstanceOf[_Hooks]
  }
}

