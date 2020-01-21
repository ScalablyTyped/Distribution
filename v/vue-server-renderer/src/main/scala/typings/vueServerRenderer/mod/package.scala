package typings.vueServerRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RenderCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* html */ java.lang.String, scala.Unit]
}
