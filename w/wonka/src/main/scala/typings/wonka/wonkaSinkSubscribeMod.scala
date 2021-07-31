package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSinkSubscribeMod {
  
  @JSImport("wonka/src/sinks/wonka_sink_subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[A], Unit]]
  
  @scala.inline
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[A], Subscription]]
}
