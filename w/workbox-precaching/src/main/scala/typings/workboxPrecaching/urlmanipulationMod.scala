package typings.workboxPrecaching

import typings.std.URL
import typings.workboxPrecaching.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-precaching/types/URLManipulation", JSImport.Namespace)
@js.native
object urlmanipulationMod extends js.Object {
  type URLManipulation = js.Function1[/* url */ Url, js.Array[URL]]
}

