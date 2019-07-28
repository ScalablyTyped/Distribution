package typings.webicon.systemIconPreloaderMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconPreloader extends Promise[Unit] {
  /**
    * The names of the icons to download.
    */
  var iconSets: js.Array[String] = js.native
}

