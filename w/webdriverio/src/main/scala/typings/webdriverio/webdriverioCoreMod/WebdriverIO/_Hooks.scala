package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Error
import typings.webdriverio.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions, 'onPrepare' | 'onWorkerStart' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> */
@js.native
trait _Hooks extends js.Object {
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.native
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ Duration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var afterTest: js.UndefOr[js.Function3[/* test */ Test, /* context */ js.Any, /* result */ Duration, Unit]] = js.native
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.native
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.native
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.native
}

object _Hooks {
  @scala.inline
  def apply(): _Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Hooks]
  }
  @scala.inline
  implicit class _HooksOps[Self <: _Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCommand(
      value: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit
    ): Self = this.set("afterCommand", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterCommand: Self = this.set("afterCommand", js.undefined)
    @scala.inline
    def setAfterHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ Duration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("afterHook", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterHook: Self = this.set("afterHook", js.undefined)
    @scala.inline
    def setAfterSuite(value: /* suite */ Suite => Unit): Self = this.set("afterSuite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterSuite: Self = this.set("afterSuite", js.undefined)
    @scala.inline
    def setAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ Duration) => Unit): Self = this.set("afterTest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterTest: Self = this.set("afterTest", js.undefined)
    @scala.inline
    def setBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[_]) => Unit): Self = this.set("beforeCommand", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeCommand: Self = this.set("beforeCommand", js.undefined)
    @scala.inline
    def setBeforeHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("beforeHook", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeHook: Self = this.set("beforeHook", js.undefined)
    @scala.inline
    def setBeforeSuite(value: /* suite */ Suite => Unit): Self = this.set("beforeSuite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSuite: Self = this.set("beforeSuite", js.undefined)
    @scala.inline
    def setBeforeTest(value: (/* test */ Test, /* context */ js.Any) => Unit): Self = this.set("beforeTest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeTest: Self = this.set("beforeTest", js.undefined)
    @scala.inline
    def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = this.set("onReload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReload: Self = this.set("onReload", js.undefined)
  }
  
}

