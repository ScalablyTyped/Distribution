package typings.webicon

import typings.webicon.iconPreloaderMod.IconPreloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/System/IconLoadedEventHandler", JSImport.Namespace)
@js.native
object iconLoadedEventHandlerMod extends js.Object {
  type IconLoadedEventHandler = js.Function1[/* preloader */ IconPreloader, js.Any]
}

