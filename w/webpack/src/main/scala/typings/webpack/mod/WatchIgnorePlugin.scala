package typings.webpack.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "WatchIgnorePlugin")
@js.native
class WatchIgnorePlugin protected () extends Plugin {
  def this(paths: js.Array[String | RegExp]) = this()
}

