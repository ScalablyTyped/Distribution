package typings.viewerjs

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewerjsMod {
  type ImageSourceDelegate = js.Function1[/* image */ HTMLImageElement, String]
  type ViewerMethod = js.Function0[Unit]
}
