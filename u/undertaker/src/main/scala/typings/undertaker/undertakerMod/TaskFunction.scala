package typings.undertaker.undertakerMod

import typings.node.NodeJS.Process
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFunction
  extends TaskFunctionBase
     with TaskFunctionParams {
  /* InferMemberOverrides */
  override def apply(T0: /* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit | Duplex | Process | js.Promise[scala.Nothing] | js.Any = js.native
}

