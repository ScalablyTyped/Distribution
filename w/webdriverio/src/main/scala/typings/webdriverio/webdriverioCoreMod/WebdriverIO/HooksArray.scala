package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof std.Pick<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions, 'onPrepare' | 'onWorkerStart' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions[K]>} */
@js.native
trait HooksArray extends js.Object {
  var after: js.UndefOr[
    (js.Function3[
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
    ])
  ] = js.native
  var afterSession: js.UndefOr[
    (js.Function3[
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
    ])
  ] = js.native
  var before: js.UndefOr[
    (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ])
  ] = js.native
  var beforeSession: js.UndefOr[
    (js.Function3[
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
    ])
  ] = js.native
  var onComplete: js.UndefOr[
    (js.Function4[
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
    ])
  ] = js.native
  var onPrepare: js.UndefOr[
    (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ])
  ] = js.native
  var onWorkerStart: js.UndefOr[
    (js.Function5[
      /* cid */ String, 
      /* caps */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      /* args */ Config, 
      /* execArgv */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ Config, 
          /* execArgv */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
}

object HooksArray {
  @scala.inline
  def apply(): HooksArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksArray]
  }
  @scala.inline
  implicit class HooksArrayOps[Self <: HooksArray] (val x: Self) extends AnyVal {
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
    def setAfterVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* result */ Double, 
            /* capabilities */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfterFunction3(
      value: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    @scala.inline
    def setAfter(
      value: (js.Function3[
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
        ])
    ): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterSessionVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* config */ Config, 
            /* capabilities */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("afterSession", js.Array(value :_*))
    @scala.inline
    def setAfterSessionFunction3(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("afterSession", js.Any.fromFunction3(value))
    @scala.inline
    def setAfterSession(
      value: (js.Function3[
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
        ])
    ): Self = this.set("afterSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSession: Self = this.set("afterSession", js.undefined)
    @scala.inline
    def setBeforeVarargs(
      value: (js.UndefOr[
          js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
        ])*
    ): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBeforeFunction2(value: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def setBefore(
      value: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
          js.UndefOr[
            js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
          ]
        ])
    ): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBeforeSessionVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* config */ Config, 
            /* capabilities */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("beforeSession", js.Array(value :_*))
    @scala.inline
    def setBeforeSessionFunction3(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("beforeSession", js.Any.fromFunction3(value))
    @scala.inline
    def setBeforeSession(
      value: (js.Function3[
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
        ])
    ): Self = this.set("beforeSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSession: Self = this.set("beforeSession", js.undefined)
    @scala.inline
    def setOnCompleteVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* exitCode */ Double, 
            /* config */ Config, 
            /* capabilities */ DesiredCapabilities, 
            /* results */ Results, 
            Unit
          ]
        ])*
    ): Self = this.set("onComplete", js.Array(value :_*))
    @scala.inline
    def setOnCompleteFunction4(
      value: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit
    ): Self = this.set("onComplete", js.Any.fromFunction4(value))
    @scala.inline
    def setOnComplete(
      value: (js.Function4[
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
        ])
    ): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnPrepareVarargs(
      value: (js.UndefOr[
          js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
        ])*
    ): Self = this.set("onPrepare", js.Array(value :_*))
    @scala.inline
    def setOnPrepareFunction2(value: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit): Self = this.set("onPrepare", js.Any.fromFunction2(value))
    @scala.inline
    def setOnPrepare(
      value: (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
          js.UndefOr[
            js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
          ]
        ])
    ): Self = this.set("onPrepare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPrepare: Self = this.set("onPrepare", js.undefined)
    @scala.inline
    def setOnWorkerStartFunction5(
      value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], /* args */ Config, /* execArgv */ js.Array[String]) => Unit
    ): Self = this.set("onWorkerStart", js.Any.fromFunction5(value))
    @scala.inline
    def setOnWorkerStartVarargs(
      value: (js.UndefOr[
          js.Function5[
            /* cid */ String, 
            /* caps */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            /* args */ Config, 
            /* execArgv */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("onWorkerStart", js.Array(value :_*))
    @scala.inline
    def setOnWorkerStart(
      value: (js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ Config, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function5[
              /* cid */ String, 
              /* caps */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              /* args */ Config, 
              /* execArgv */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = this.set("onWorkerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWorkerStart: Self = this.set("onWorkerStart", js.undefined)
  }
  
}

