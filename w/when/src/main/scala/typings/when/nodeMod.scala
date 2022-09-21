package typings.when

import typings.std.IArguments
import typings.when.When.Promise
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("when/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply[T](fn: NodeFn0[T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn0[T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn1[Any, T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn1[Any, T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn2[Any, Any, T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn2[Any, Any, T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn3[Any, Any, Any, T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn3[Any, Any, Any, T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn4[Any, Any, Any, Any, T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn4[Any, Any, Any, Any, T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn5[Any, Any, Any, Any, Any, T], args: js.Array[Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def apply[T](fn: NodeFn5[Any, Any, Any, Any, Any, T], args: IArguments): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def bindCallback[TArg](arg: Promise[TArg], callback: js.Function2[/* err */ Any, /* arg */ TArg, Unit]): Promise[TArg] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(arg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Promise[TArg]]
  
  inline def call[T](fn: NodeFn0[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  inline def call[A1, T](fn: NodeFn1[A1, T], arg1: A1): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, T](fn: NodeFn1[A1, T], arg1: Promise[A1]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: A1, arg2: A2): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: A1, arg2: Promise[A2]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: Promise[A1], arg2: A2): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, T](fn: NodeFn2[A1, A2, T], arg1: Promise[A1], arg2: Promise[A2]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: A3): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: Promise[A3]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: Promise[A2], arg3: A3): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise[A1], arg2: A2, arg3: A3): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T], arg1: Promise[A1], arg2: Promise[A2], arg3: Promise[A3]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3], arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3], arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3, arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3, arg4: Promise[A4]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: Promise[A3], arg4: A4): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, T](
    fn: NodeFn4[A1, A2, A3, A4, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: Promise[A4]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: Promise[A5]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise[A4], arg5: A5): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: A4, arg5: A5): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: A2,
    arg3: Promise[A3],
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: A2,
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: A2,
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: A4, arg5: A5): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: A3,
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: A3,
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: A3,
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: A4,
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: A1,
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: A4, arg5: A5): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: Promise[A3],
    arg4: A4,
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: Promise[A3],
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: A2,
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: A3,
    arg4: A4,
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: A3,
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: A3,
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: A3,
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: A4,
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: A4,
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: A5
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def call[A1, A2, A3, A4, A5, T](
    fn: NodeFn5[A1, A2, A3, A4, A5, T],
    arg1: Promise[A1],
    arg2: Promise[A2],
    arg3: Promise[A3],
    arg4: Promise[A4],
    arg5: Promise[A5]
  ): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def createCallback[TArg](resolver: Resolver[TArg]): js.Function2[/* err */ Any, /* arg */ TArg, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")(resolver.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* err */ Any, /* arg */ TArg, Unit]]
  
  inline def lift[T](fn: NodeFn0[T]): LiftedFn0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn0[T]]
  inline def lift[A1, T](fn: NodeFn1[A1, T]): LiftedFn1[A1, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn1[A1, T]]
  inline def lift[A1, A2, T](fn: NodeFn2[A1, A2, T]): LiftedFn2[A1, A2, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn2[A1, A2, T]]
  inline def lift[A1, A2, A3, T](fn: NodeFn3[A1, A2, A3, T]): LiftedFn3[A1, A2, A3, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn3[A1, A2, A3, T]]
  inline def lift[A1, A2, A3, A4, T](fn: NodeFn4[A1, A2, A3, A4, T]): LiftedFn4[A1, A2, A3, A4, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn4[A1, A2, A3, A4, T]]
  inline def lift[A1, A2, A3, A4, A5, T](fn: NodeFn5[A1, A2, A3, A4, A5, T]): LiftedFn5[A1, A2, A3, A4, A5, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(fn.asInstanceOf[js.Any]).asInstanceOf[LiftedFn5[A1, A2, A3, A4, A5, T]]
  
  inline def liftAll(srcApi: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("liftAll")(srcApi.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def liftAll(
    srcApi: Any,
    transform: js.Function3[/* destApi */ Any, /* liftedFunc */ js.Function, /* name */ String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAll")(srcApi.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def liftAll(
    srcApi: Any,
    transform: js.Function3[/* destApi */ Any, /* liftedFunc */ js.Function, /* name */ String, Any],
    destApi: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAll")(srcApi.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destApi.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def liftAll(srcApi: Any, transform: Unit, destApi: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAll")(srcApi.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destApi.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def liftCallback[TArg](callback: js.Function2[/* err */ Any, /* arg */ TArg, Unit]): js.Function1[/* value */ Promise[TArg], Promise[TArg]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Promise[TArg], Promise[TArg]]]
  
  @js.native
  trait Resolver[T] extends StObject {
    
    def reject(reason: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    def resolve(value: Promise[T]): Unit = js.native
  }
}
