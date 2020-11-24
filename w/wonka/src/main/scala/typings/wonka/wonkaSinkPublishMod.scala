package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/sinks/wonka_sink_publish", JSImport.Namespace)
@js.native
object wonkaSinkPublishMod extends js.Object {
  
  def publish[A](source: Source[A]): Subscription = js.native
}
