package typings.webicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemIconLoadedEventHandlerMod {
  import typings.webicon.systemIconPreloaderMod.IconPreloader

  type IconLoadedEventHandler = js.Function1[/* preloader */ IconPreloader, js.Any]
}
