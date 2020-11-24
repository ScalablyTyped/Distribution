package typings.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wonkaTypesMod {
  
  type List[T] = (js.Tuple2[T, js.Any]) | typings.wonka.wonkaNumbers.`0`
  
  type Observer[A] = js.Tuple2[js.Function1[/* value */ A, scala.Unit], js.Function0[scala.Unit]]
  
  type Operator[A, B] = js.Function1[
    /* source */ typings.wonka.wonkaTypesMod.Source[A], 
    typings.wonka.wonkaTypesMod.Source[B]
  ]
  
  type Signal[A] = (typings.wonka.anon.Tag with (js.Array[js.Function1[/* talkback */ typings.wonka.wonkaTypesMod.Talkback, scala.Unit]])) | (typings.wonka.anon.`0` with js.Array[A]) | typings.wonka.wonkaNumbers.`0`
  
  type Sink[A] = js.Function1[/* signal */ typings.wonka.wonkaTypesMod.Signal[A], scala.Unit]
  
  type Source[A] = js.Function1[/* sink */ typings.wonka.wonkaTypesMod.Sink[A], scala.Unit]
  
  type Subject[A] = js.Tuple3[
    typings.wonka.wonkaTypesMod.Source[A], 
    js.Function1[/* value */ A, scala.Unit], 
    js.Function0[scala.Unit]
  ]
  
  type Subscription = js.Array[js.Function0[scala.Unit]]
}
