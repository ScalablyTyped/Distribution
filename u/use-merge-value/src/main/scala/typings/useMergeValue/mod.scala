package typings.useMergeValue

import typings.useMergeValue.anon.DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-merge-value/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[T, R](defaultStateValue: T): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
}

