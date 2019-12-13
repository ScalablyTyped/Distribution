package typings.useDashMergeDashValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-merge-value/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def default[T, R](defaultStateValue: T): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: T, option: Anon_DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T], option: Anon_DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
}

