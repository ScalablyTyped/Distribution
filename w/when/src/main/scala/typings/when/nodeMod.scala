package typings.when

import typings.std.IArguments
import typings.when.When.Promise_
import typings.when.When._underscore.LiftedFn0
import typings.when.When._underscore.LiftedFn1
import typings.when.When._underscore.LiftedFn2
import typings.when.When._underscore.LiftedFn3
import typings.when.When._underscore.LiftedFn4
import typings.when.When._underscore.LiftedFn5
import typings.when.When._underscore.NodeFn0
import typings.when.When._underscore.NodeFn1
import typings.when.When._underscore.NodeFn2
import typings.when.When._underscore.NodeFn3
import typings.when.When._underscore.NodeFn4
import typings.when.When._underscore.NodeFn5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  trait Resolver[T] extends js.Object {
    def reject(reason: js.Any): Unit = js.native
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    def resolve(value: Promise_[T]): Unit = js.native
  }
  
  @JSName("apply")
  def apply[T](fn: NodeFn0[T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn0[T], args: IArguments): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn1[_, T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn1[_, T], args: IArguments): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn2[_, _, T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn2[_, _, T], args: IArguments): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn3[_, _, _, T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn3[_, _, _, T], args: IArguments): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn4[_, _, _, _, T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn4[_, _, _, _, T], args: IArguments): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn5[_, _, _, _, _, T], args: js.Array[_]): Promise_[T] = js.native
  @JSName("apply")
  def apply[T](fn: NodeFn5[_, _, _, _, _, T], args: IArguments): Promise_[T] = js.native
  def bindCallback[TArg](arg: Promise_[TArg], callback: js.Function2[/* err */ js.Any, /* arg */ TArg, Unit]): Promise_[TArg] = js.native
  def call[T](fn: NodeFn0[T]): Promise_[T] = js.native
  def call[A1, T](fn: NodeFn1[A1, T], arg1: A1): Promise_[T] = js.native
  def call[A1, T](fn: NodeFn1[A1, T], arg1: Promise_[A1]): Promise_[T] = js.native
  def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: A1, arg2: A2): Promise_[T] = js.native
  def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: A1, arg2: Promise_[A2]): Promise_[T] = js.native
  def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: Promise_[A1], arg2: A2): Promise_[T] = js.native
  def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: Promise_[A1], arg2: Promise_[A2]): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: A3): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: Promise_[A3]): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: Promise_[A2], arg3: A3): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: Promise_[A2], arg3: Promise_[A3]): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise_[A1], arg2: A2, arg3: A3): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise_[A1], arg2: A2, arg3: Promise_[A3]): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise_[A1], arg2: Promise_[A2], arg3: A3): Promise_[T] = js.native
  def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise_[A1], arg2: Promise_[A2], arg3: Promise_[A3]): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise_[A4]): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise_[A3], arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise_[A3], arg4: Promise_[A4]): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise_[A2], arg3: A3, arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise_[A2], arg3: A3, arg4: Promise_[A4]): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise_[A2], arg3: Promise_[A3], arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: Promise_[A2],
    arg3: Promise_[A3],
    arg4: Promise_[A4]
  ): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise_[A1], arg2: A2, arg3: A3, arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise_[A1], arg2: A2, arg3: A3, arg4: Promise_[A4]): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise_[A1], arg2: A2, arg3: Promise_[A3], arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: Promise_[A1],
    arg2: A2,
    arg3: Promise_[A3],
    arg4: Promise_[A4]
  ): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise_[A1], arg2: Promise_[A2], arg3: A3, arg4: A4): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: Promise_[A1],
    arg2: Promise_[A2],
    arg3: A3,
    arg4: Promise_[A4]
  ): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: Promise_[A1],
    arg2: Promise_[A2],
    arg3: Promise_[A3],
    arg4: A4
  ): Promise_[T] = js.native
  def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: Promise_[A1],
    arg2: Promise_[A2],
    arg3: Promise_[A3],
    arg4: Promise_[A4]
  ): Promise_[T] = js.native
  def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1 | Promise_[A1],
    arg2: A2 | Promise_[A2],
    arg3: A3 | Promise_[A3],
    arg4: A4 | Promise_[A4],
    arg5: A5 | Promise_[A5]
  ): Promise_[T] = js.native
  def createCallback[TArg](resolver: Resolver[TArg]): js.Function2[/* err */ js.Any, /* arg */ TArg, Unit] = js.native
  def lift[T](fn: NodeFn0[T]): LiftedFn0[T] = js.native
  def lift[A1, T](fn: NodeFn1[A1, T]): LiftedFn1[A1, T] = js.native
  def lift[A1, A2, T](fn: NodeFn2[A1, A2, T]): LiftedFn2[A1, A2, T] = js.native
  def lift[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T]): LiftedFn3[A1, A2, A3, T] = js.native
  def lift[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T]): LiftedFn4[A1, A2, A3, A4, T] = js.native
  def lift[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T]): LiftedFn5[A1, A2, A3, A4, A5, T] = js.native
  def liftAll(srcApi: js.Any): js.Any = js.native
  def liftAll(
    srcApi: js.Any,
    transform: js.Function3[/* destApi */ js.Any, /* liftedFunc */ js.Function, /* name */ String, _]
  ): js.Any = js.native
  def liftAll(
    srcApi: js.Any,
    transform: js.Function3[/* destApi */ js.Any, /* liftedFunc */ js.Function, /* name */ String, _],
    destApi: js.Any
  ): js.Any = js.native
  def liftCallback[TArg](callback: js.Function2[/* err */ js.Any, /* arg */ TArg, Unit]): js.Function1[/* value */ Promise_[TArg], Promise_[TArg]] = js.native
}

