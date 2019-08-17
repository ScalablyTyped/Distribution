package typings.viewerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewerjsMod {
  import typings.std.HTMLImageElement

  type ImageSourceDelegate = js.Function1[/* image */ HTMLImageElement, String]
  type ViewerMethod = js.Function0[Unit]
}
