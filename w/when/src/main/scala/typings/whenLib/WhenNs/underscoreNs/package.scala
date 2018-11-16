package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreNs {
  type Fn0[T] = js.Function0[T]
  type Fn1[A1, T] = js.Function1[/* a1 */ A1, T]
  type Fn2[A1, A2, T] = js.Function2[/* a1 */ A1, /* a2 */ A2, T]
  type Fn3[A1, A2, A3, T] = js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, T]
  type Fn4[A1, A2, A3, A4, T] = js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, T]
  type Fn5[A1, A2, A3, A4, A5, T] = js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, T]
  type Fn6[A1, A2, A3, A4, A5, A6, T] = js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, T]
  type LiftedFn0[T] = Fn0[whenLib.WhenNs.Promise[T]]
  type LiftedFn1[A1, T] = Fn1[A1 | whenLib.WhenNs.Promise[A1], whenLib.WhenNs.Promise[T]]
  type LiftedFn2[A1, A2, T] = Fn2[
    A1 | whenLib.WhenNs.Promise[A1], 
    A2 | whenLib.WhenNs.Promise[A2], 
    whenLib.WhenNs.Promise[T]
  ]
  type LiftedFn3[A1, A2, A3, T] = Fn3[
    A1 | whenLib.WhenNs.Promise[A1], 
    A2 | whenLib.WhenNs.Promise[A2], 
    A3 | whenLib.WhenNs.Promise[A3], 
    whenLib.WhenNs.Promise[T]
  ]
  type LiftedFn4[A1, A2, A3, A4, T] = Fn4[
    A1 | whenLib.WhenNs.Promise[A1], 
    A2 | whenLib.WhenNs.Promise[A2], 
    A3 | whenLib.WhenNs.Promise[A3], 
    A4 | whenLib.WhenNs.Promise[A4], 
    whenLib.WhenNs.Promise[T]
  ]
  type LiftedFn5[A1, A2, A3, A4, A5, T] = Fn5[
    A1 | whenLib.WhenNs.Promise[A1], 
    A2 | whenLib.WhenNs.Promise[A2], 
    A3 | whenLib.WhenNs.Promise[A3], 
    A4 | whenLib.WhenNs.Promise[A4], 
    A5 | whenLib.WhenNs.Promise[A5], 
    whenLib.WhenNs.Promise[T]
  ]
  type NodeCallback[T] = js.Function2[/* err */ js.Any, /* result */ T, scala.Unit]
  type NodeFn0[T] = Fn1[NodeCallback[T], scala.Unit]
  type NodeFn1[A1, T] = Fn2[A1, NodeCallback[T], scala.Unit]
  type NodeFn2[A1, A2, T] = Fn3[A1, A2, NodeCallback[T], scala.Unit]
  type NodeFn3[A1, A2, A3, T] = Fn4[A1, A2, A3, NodeCallback[T], scala.Unit]
  type NodeFn4[A1, A2, A3, A4, T] = Fn5[A1, A2, A3, A4, NodeCallback[T], scala.Unit]
  type NodeFn5[A1, A2, A3, A4, A5, T] = Fn6[A1, A2, A3, A4, A5, NodeCallback[T], scala.Unit]
}
