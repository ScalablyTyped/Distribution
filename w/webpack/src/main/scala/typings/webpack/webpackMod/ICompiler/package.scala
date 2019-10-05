package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ICompiler {
  import typings.std.Error
  import typings.webpack.webpackMod.Stats

  type Handler = js.Function2[/* err */ Error, /* stats */ Stats, Unit]
}
