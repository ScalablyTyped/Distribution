package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Hooks extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* result */ scala.Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ java.lang.String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[nodeLib.Error], 
      js.UndefOr[js.Promise[_]]
    ]
  ] = js.undefined
  var afterFeature: js.UndefOr[js.Function1[/* feature */ java.lang.String, js.Promise[_] | scala.Unit]] = js.undefined
  var afterHook: js.UndefOr[js.Function0[js.Promise[_] | scala.Unit]] = js.undefined
  var afterScenario: js.UndefOr[js.Function1[/* scenario */ js.Any, js.Promise[_] | scala.Unit]] = js.undefined
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Options, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
  var afterStep: js.UndefOr[js.Function1[/* stepResult */ js.Any, js.Promise[_] | scala.Unit]] = js.undefined
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, js.Promise[_] | scala.Unit]] = js.undefined
  var afterTest: js.UndefOr[js.Function1[/* test */ Test, js.Promise[_] | scala.Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      js.UndefOr[js.Promise[_]]
    ]
  ] = js.undefined
  var beforeCommand: js.UndefOr[
    js.Function2[
      /* commandName */ java.lang.String, 
      /* args */ js.Array[_], 
      js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
  // cucumber specific hooks
  var beforeFeature: js.UndefOr[js.Function1[/* feature */ java.lang.String, js.Promise[_] | scala.Unit]] = js.undefined
  var beforeHook: js.UndefOr[js.Function0[js.Promise[_] | scala.Unit]] = js.undefined
  var beforeScenario: js.UndefOr[js.Function1[/* scenario */ java.lang.String, js.Promise[_] | scala.Unit]] = js.undefined
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Options, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[java.lang.String], 
      js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
  var beforeStep: js.UndefOr[js.Function1[/* step */ java.lang.String, js.Promise[_] | scala.Unit]] = js.undefined
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, js.Promise[_] | scala.Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function1[/* test */ Test, js.Promise[_] | scala.Unit]] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* exitCode */ scala.Double, js.Promise[_] | scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ nodeLib.Error, js.Promise[_] | scala.Unit]] = js.undefined
  var onPrepare: js.UndefOr[
    js.Function2[
      /* config */ Options, 
      /* capabilities */ DesiredCapabilities, 
      js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
}

