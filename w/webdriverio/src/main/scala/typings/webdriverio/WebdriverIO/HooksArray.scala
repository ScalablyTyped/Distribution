package typings.webdriverio.WebdriverIO

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof std.Pick<webdriverio.WebdriverIO.HookFunctions, 'onPrepare' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.WebdriverIO.HookFunctions[K]>} */
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
  ] = js.undefined
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
  ] = js.undefined
  var before: js.UndefOr[
    (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ])
  ] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  var onPrepare: js.UndefOr[
    (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ])
  ] = js.undefined
}

object HooksArray {
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
    before: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
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
    ]) = null
  ): HooksArray = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksArray]
  }
}

