package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def diff(actual: java.lang.String, expected: java.lang.String): java.lang.String = js.native
  def prompt[T](questions: yeomanDashEnvironmentLib.yeomanDashEnvironmentMod.AdapterNs.Questions[T]): js.Promise[T] = js.native
  def prompt[T1, T2](
    questions: yeomanDashEnvironmentLib.yeomanDashEnvironmentMod.AdapterNs.Questions[T1],
    cb: js.Function1[/* res */ T1, T2]
  ): js.Promise[T2] = js.native
}

