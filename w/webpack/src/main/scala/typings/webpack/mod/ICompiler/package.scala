package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ICompiler {
  type Handler = js.Function2[/* err */ typings.std.Error, /* stats */ typings.webpack.mod.Stats, scala.Unit]
}
