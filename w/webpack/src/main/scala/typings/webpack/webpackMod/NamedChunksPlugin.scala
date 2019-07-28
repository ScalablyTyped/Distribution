package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "NamedChunksPlugin")
@js.native
class NamedChunksPlugin () extends Plugin {
  def this(nameResolver: js.Function1[/* chunk */ js.Any, String | Null]) = this()
}

