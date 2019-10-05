package typings.webicon

import typings.webicon.systemIconPreloaderMod.IconPreloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/System/IconLoadedEventHandler", JSImport.Namespace)
@js.native
object systemIconLoadedEventHandlerMod extends js.Object {
  type IconLoadedEventHandler = js.Function1[/* preloader */ IconPreloader, js.Any]
}

