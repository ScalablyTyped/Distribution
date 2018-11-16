package typings
package tapableLib.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tapable", "HookMap")
@js.native
class HookMap[T1, T2, T3] protected () extends js.Object {
  def this(fn: js.Function0[Hook[_, _, _, _, _]]) = this()
  def `for`(key: js.Any): Hook[T1, T2, T3, _, _] = js.native
  def get(key: js.Any): js.UndefOr[Hook[T1, T2, T3, _, _]] = js.native
  def intercept(interceptor: HookMapInterceptor[T1, T2, T3]): scala.Unit = js.native
  def tap(
    key: js.Any,
    name: java.lang.String,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, _]
  ): scala.Unit = js.native
  def tap(
    key: js.Any,
    name: Tap,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, _]
  ): scala.Unit = js.native
  def tapAsync(
    key: js.Any,
    name: java.lang.String,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  def tapAsync(
    key: js.Any,
    name: Tap,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  def tapPromise(
    key: js.Any,
    name: java.lang.String,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, stdLib.Promise[_]]
  ): scala.Unit = js.native
  def tapPromise(
    key: js.Any,
    name: Tap,
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */js.Any, stdLib.Promise[_]]
  ): scala.Unit = js.native
}

