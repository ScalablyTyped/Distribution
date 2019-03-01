package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* result */ scala.Double, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ java.lang.String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[nodeLib.Error], 
      scala.Unit
    ]
  ] = js.undefined
  var afterFeature: js.UndefOr[js.Function1[/* feature */ java.lang.String, scala.Unit]] = js.undefined
  var afterHook: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterScenario: js.UndefOr[js.Function1[/* scenario */ js.Any, scala.Unit]] = js.undefined
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var afterStep: js.UndefOr[js.Function1[/* stepResult */ js.Any, scala.Unit]] = js.undefined
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, scala.Unit]] = js.undefined
  var afterTest: js.UndefOr[js.Function1[/* test */ Test, scala.Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCommand: js.UndefOr[
    js.Function2[/* commandName */ java.lang.String, /* args */ js.Array[_], scala.Unit]
  ] = js.undefined
  // cucumber specific hooks
  var beforeFeature: js.UndefOr[js.Function1[/* feature */ java.lang.String, scala.Unit]] = js.undefined
  var beforeHook: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeScenario: js.UndefOr[js.Function1[/* scenario */ java.lang.String, scala.Unit]] = js.undefined
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeStep: js.UndefOr[js.Function1[/* step */ java.lang.String, scala.Unit]] = js.undefined
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, scala.Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function1[/* test */ Test, scala.Unit]] = js.undefined
  var onComplete: js.UndefOr[
    js.Function4[
      /* exitCode */ scala.Double, 
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* results */ Results, 
      scala.Unit
    ]
  ] = js.undefined
  var onPrepare: js.UndefOr[
    js.Function2[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      scala.Unit
    ]
  ] = js.undefined
  var onReload: js.UndefOr[
    js.Function2[/* oldSessionId */ java.lang.String, /* newSessionId */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    after: js.Function3[
      /* result */ scala.Double, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    afterCommand: js.Function4[
      /* commandName */ java.lang.String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[nodeLib.Error], 
      scala.Unit
    ] = null,
    afterFeature: js.Function1[/* feature */ java.lang.String, scala.Unit] = null,
    afterHook: js.Function0[scala.Unit] = null,
    afterScenario: js.Function1[/* scenario */ js.Any, scala.Unit] = null,
    afterSession: js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    afterStep: js.Function1[/* stepResult */ js.Any, scala.Unit] = null,
    afterSuite: js.Function1[/* suite */ Suite, scala.Unit] = null,
    afterTest: js.Function1[/* test */ Test, scala.Unit] = null,
    before: js.Function2[
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    beforeCommand: js.Function2[/* commandName */ java.lang.String, /* args */ js.Array[_], scala.Unit] = null,
    beforeFeature: js.Function1[/* feature */ java.lang.String, scala.Unit] = null,
    beforeHook: js.Function0[scala.Unit] = null,
    beforeScenario: js.Function1[/* scenario */ java.lang.String, scala.Unit] = null,
    beforeSession: js.Function3[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    beforeStep: js.Function1[/* step */ java.lang.String, scala.Unit] = null,
    beforeSuite: js.Function1[/* suite */ Suite, scala.Unit] = null,
    beforeTest: js.Function1[/* test */ Test, scala.Unit] = null,
    onComplete: js.Function4[
      /* exitCode */ scala.Double, 
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      /* results */ Results, 
      scala.Unit
    ] = null,
    onPrepare: js.Function2[
      /* config */ Config, 
      /* capabilities */ webdriverLib.WebDriverNs.DesiredCapabilities, 
      scala.Unit
    ] = null,
    onReload: js.Function2[/* oldSessionId */ java.lang.String, /* newSessionId */ java.lang.String, scala.Unit] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(afterCommand)
    if (afterFeature != null) __obj.updateDynamic("afterFeature")(afterFeature)
    if (afterHook != null) __obj.updateDynamic("afterHook")(afterHook)
    if (afterScenario != null) __obj.updateDynamic("afterScenario")(afterScenario)
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession)
    if (afterStep != null) __obj.updateDynamic("afterStep")(afterStep)
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(afterSuite)
    if (afterTest != null) __obj.updateDynamic("afterTest")(afterTest)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(beforeCommand)
    if (beforeFeature != null) __obj.updateDynamic("beforeFeature")(beforeFeature)
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(beforeHook)
    if (beforeScenario != null) __obj.updateDynamic("beforeScenario")(beforeScenario)
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession)
    if (beforeStep != null) __obj.updateDynamic("beforeStep")(beforeStep)
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(beforeSuite)
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(beforeTest)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare)
    if (onReload != null) __obj.updateDynamic("onReload")(onReload)
    __obj.asInstanceOf[Hooks]
  }
}

