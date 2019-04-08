package typings
package undertakerLib.undertakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UndertakerNs {
  type Task = java.lang.String | TaskFunction
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit | nodeLib.streamMod.Duplex | nodeLib.NodeJSNs.Process | js.Promise[scala.Nothing] | js.Any
  ]
}
