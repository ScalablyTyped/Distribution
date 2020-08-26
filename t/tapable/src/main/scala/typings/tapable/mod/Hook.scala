package typings.tapable.mod

import typings.tapable.tapableStrings.async
import typings.tapable.tapableStrings.promise
import typings.tapable.tapableStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tapable", "Hook")
@js.native
class Hook[TArg1, TArg2, TArg3, TTabResult, THookResult] () extends js.Object {
  def this(tapArgumentNames: js.Array[String]) = this()
  var interceptors: js.Array[HookInterceptor] = js.native
  var taps: js.Array[Tap[TapType, TArg1, TArg2, TArg3, THookResult]] = js.native
  def call(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def call(arg1: TArg1, arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def call(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): THookResult = js.native
  def call(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def call(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def call(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def call(arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): THookResult = js.native
  def call(
    arg1: js.UndefOr[scala.Nothing],
    arg2: js.UndefOr[scala.Nothing],
    arg3: js.UndefOr[scala.Nothing],
    args: js.Any*
  ): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def callAsync(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def callAsync(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): THookResult = js.native
  def callAsync(arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): THookResult = js.native
  def callAsync(
    arg1: js.UndefOr[scala.Nothing],
    arg2: js.UndefOr[scala.Nothing],
    arg3: js.UndefOr[scala.Nothing],
    args: js.Any*
  ): THookResult = js.native
  def compile(options: HookCompileOptions): js.Function = js.native
  def intercept(interceptor: HookInterceptor): Unit = js.native
  def isUsed(): Boolean = js.native
  def promise(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1, arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1, arg2: js.UndefOr[scala.Nothing], arg3: js.UndefOr[scala.Nothing], args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: js.UndefOr[scala.Nothing], arg2: TArg2, arg3: js.UndefOr[scala.Nothing], args: js.Any*): js.Promise[THookResult] = js.native
  def promise(arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
  def promise(
    arg1: js.UndefOr[scala.Nothing],
    arg2: js.UndefOr[scala.Nothing],
    arg3: js.UndefOr[scala.Nothing],
    args: js.Any*
  ): js.Promise[THookResult] = js.native
  def tap(
    name: String,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
  ): Unit = js.native
  def tapAsync(
    name: String,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  @JSName("tapAsync")
  def tapAsync_async(
    name: TapOptions[async, TArg1, TArg2, TArg3, TTabResult],
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def tapPromise(
    name: String,
    fn: js.Function4[
      /* arg1 */ TArg1, 
      /* arg2 */ TArg2, 
      /* arg3 */ TArg3, 
      /* repeated */ js.Any, 
      js.Promise[TTabResult]
    ]
  ): Unit = js.native
  @JSName("tapPromise")
  def tapPromise_promise(
    name: TapOptions[promise, TArg1, TArg2, TArg3, TTabResult],
    fn: js.Function4[
      /* arg1 */ TArg1, 
      /* arg2 */ TArg2, 
      /* arg3 */ TArg3, 
      /* repeated */ js.Any, 
      js.Promise[TTabResult]
    ]
  ): Unit = js.native
  @JSName("tap")
  def tap_sync(
    name: TapOptions[sync, TArg1, TArg2, TArg3, TTabResult],
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
  ): Unit = js.native
}

