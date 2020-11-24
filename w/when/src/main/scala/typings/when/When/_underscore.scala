package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Helper interfaces
@JSGlobal("When._")
@js.native
object _underscore extends js.Object {
  
  type Fn0[T] = js.Function0[T]
  
  type Fn1[A1, T] = js.Function1[/* a1 */ A1, T]
  
  type Fn2[A1, A2, T] = js.Function2[/* a1 */ A1, /* a2 */ A2, T]
  
  type Fn3[A1, A2, A3, T] = js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, T]
  
  type Fn4[A1, A2, A3, A4, T] = js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, T]
  
  type Fn5[A1, A2, A3, A4, A5, T] = js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, T]
  
  type Fn6[A1, A2, A3, A4, A5, A6, T] = js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, T]
  
  type LiftedFn0[T] = Fn0[Promise[T]]
  
  type LiftedFn1[A1, T] = Fn1[A1 | Promise[A1], Promise[T]]
  
  type LiftedFn2[A1, A2, T] = Fn2[A1 | Promise[A1], A2 | Promise[A2], Promise[T]]
  
  type LiftedFn3[A1, A2, A3, T] = Fn3[A1 | Promise[A1], A2 | Promise[A2], A3 | Promise[A3], Promise[T]]
  
  type LiftedFn4[A1, A2, A3, A4, T] = Fn4[A1 | Promise[A1], A2 | Promise[A2], A3 | Promise[A3], A4 | Promise[A4], Promise[T]]
  
  type LiftedFn5[A1, A2, A3, A4, A5, T] = Fn5[
    A1 | Promise[A1], 
    A2 | Promise[A2], 
    A3 | Promise[A3], 
    A4 | Promise[A4], 
    A5 | Promise[A5], 
    Promise[T]
  ]
  
  type NodeCallback[T] = js.Function2[/* err */ js.Any, /* result */ T, Unit]
  
  type NodeFn0[T] = Fn1[NodeCallback[T], Unit]
  
  type NodeFn1[A1, T] = Fn2[A1, NodeCallback[T], Unit]
  
  type NodeFn2[A1, A2, T] = Fn3[A1, A2, NodeCallback[T], Unit]
  
  type NodeFn3[A1, A2, A3, T] = Fn4[A1, A2, A3, NodeCallback[T], Unit]
  
  type NodeFn4[A1, A2, A3, A4, T] = Fn5[A1, A2, A3, A4, NodeCallback[T], Unit]
  
  type NodeFn5[A1, A2, A3, A4, A5, T] = Fn6[A1, A2, A3, A4, A5, NodeCallback[T], Unit]
}
