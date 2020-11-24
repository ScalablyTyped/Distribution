package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/sinks/wonka_sink_subscribe", JSImport.Namespace)
@js.native
object wonkaSinkSubscribeMod extends js.Object {
  
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = js.native
  
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = js.native
}
