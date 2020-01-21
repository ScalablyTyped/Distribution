package typings.webicon

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/System/IconPreloader", JSImport.Namespace)
@js.native
object iconPreloaderMod extends js.Object {
  @js.native
  trait IconPreloader extends Promise[Unit] {
    /**
      * The names of the icons to download.
      */
    var iconSets: js.Array[String] = js.native
  }
  
}

