package typings.webicon

import typings.webicon.systemIconPreloaderMod.IconPreloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemIconLoadedEventHandlerMod {
  type IconLoadedEventHandler = js.Function1[/* preloader */ IconPreloader, js.Any]
}
