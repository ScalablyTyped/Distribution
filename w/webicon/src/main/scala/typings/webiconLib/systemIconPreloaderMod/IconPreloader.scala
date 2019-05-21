package typings
package webiconLib.systemIconPreloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconPreloader
  extends stdLib.Promise[scala.Unit] {
  /**
    * The names of the icons to download.
    */
  var iconSets: js.Array[java.lang.String] = js.native
}

