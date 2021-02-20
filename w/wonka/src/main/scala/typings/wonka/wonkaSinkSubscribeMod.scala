package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSinkSubscribeMod {
  
  @JSImport("wonka/src/sinks/wonka_sink_subscribe", "forEach")
  @js.native
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = js.native
  
  @JSImport("wonka/src/sinks/wonka_sink_subscribe", "subscribe")
  @js.native
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = js.native
}
