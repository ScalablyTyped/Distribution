package typings.workboxStrategies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeRequestCallbackMod {
  type MakeRequestCallback = js.Function1[
    /* options */ typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions, 
    js.Promise[typings.std.Response]
  ]
}
