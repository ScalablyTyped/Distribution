package typings
package whenLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when/node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn0[T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn0[T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn1[_, T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn1[_, T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[_, _, T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[_, _, T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn3[_, _, _, T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn3[_, _, _, T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn4[_, _, _, _, T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn4[_, _, _, _, T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn5[_, _, _, _, _, T], args: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  @JSName("apply")
  def apply[T](fn: whenLib.WhenNs.underscoreNs.NodeFn5[_, _, _, _, _, T], args: stdLib.IArguments): whenLib.WhenNs.Promise[T] = js.native
  def bindCallback[TArg](
    arg: whenLib.WhenNs.Promise[TArg],
    callback: js.Function2[/* err */ js.Any, /* arg */ TArg, scala.Unit]
  ): whenLib.WhenNs.Promise[TArg] = js.native
  def call[T](fn: whenLib.WhenNs.underscoreNs.NodeFn0[T]): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, T](fn: whenLib.WhenNs.underscoreNs.NodeFn1[A1, T], arg1: A1): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, T](fn: whenLib.WhenNs.underscoreNs.NodeFn1[A1, T], arg1: whenLib.WhenNs.Promise[A1]): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[A1, A2, T], arg1: A1, arg2: A2): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[A1, A2, T], arg1: A1, arg2: whenLib.WhenNs.Promise[A2]): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[A1, A2, T], arg1: whenLib.WhenNs.Promise[A1], arg2: A2): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn2[A1, A2, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: A3): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def call[A1, A2, A3, A4, A5, T](
    fn: whenLib.WhenNs.underscoreNs.NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1 | whenLib.WhenNs.Promise[A1],
    arg2: A2 | whenLib.WhenNs.Promise[A2],
    arg3: A3 | whenLib.WhenNs.Promise[A3],
    arg4: A4 | whenLib.WhenNs.Promise[A4],
    arg5: A5 | whenLib.WhenNs.Promise[A5]
  ): whenLib.WhenNs.Promise[T] = js.native
  def createCallback[TArg](resolver: Resolver[TArg]): js.Function2[/* err */ js.Any, /* arg */ TArg, scala.Unit] = js.native
  def lift[T](fn: whenLib.WhenNs.underscoreNs.NodeFn0[T]): whenLib.WhenNs.underscoreNs.LiftedFn0[T] = js.native
  def lift[A1, T](fn: whenLib.WhenNs.underscoreNs.NodeFn1[A1, T]): whenLib.WhenNs.underscoreNs.LiftedFn1[A1, T] = js.native
  def lift[A1, A2, T](fn: whenLib.WhenNs.underscoreNs.NodeFn2[A1, A2, T]): whenLib.WhenNs.underscoreNs.LiftedFn2[A1, A2, T] = js.native
  def lift[A1, A2, A3, T](fn: whenLib.WhenNs.underscoreNs.NodeFn3[A1, A2, A3, T]): whenLib.WhenNs.underscoreNs.LiftedFn3[A1, A2, A3, T] = js.native
  def lift[A1, A2, A3, A4, T](fn: whenLib.WhenNs.underscoreNs.NodeFn4[A1, A2, A3, A4, T]): whenLib.WhenNs.underscoreNs.LiftedFn4[A1, A2, A3, A4, T] = js.native
  def lift[A1, A2, A3, A4, A5, T](fn: whenLib.WhenNs.underscoreNs.NodeFn5[A1, A2, A3, A4, A5, T]): whenLib.WhenNs.underscoreNs.LiftedFn5[A1, A2, A3, A4, A5, T] = js.native
  def liftAll(srcApi: js.Any): js.Any = js.native
  def liftAll(
    srcApi: js.Any,
    transform: js.Function3[/* destApi */ js.Any, /* liftedFunc */ js.Function, /* name */ java.lang.String, _]
  ): js.Any = js.native
  def liftAll(
    srcApi: js.Any,
    transform: js.Function3[/* destApi */ js.Any, /* liftedFunc */ js.Function, /* name */ java.lang.String, _],
    destApi: js.Any
  ): js.Any = js.native
  def liftCallback[TArg](callback: js.Function2[/* err */ js.Any, /* arg */ TArg, scala.Unit]): js.Function1[/* value */ whenLib.WhenNs.Promise[TArg], whenLib.WhenNs.Promise[TArg]] = js.native
}

