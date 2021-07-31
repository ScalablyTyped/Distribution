package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSinkPublishMod {
  
  @JSImport("wonka/src/sinks/wonka_sink_publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def publish[A](source: Source[A]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(source.asInstanceOf[js.Any]).asInstanceOf[Subscription]
}
