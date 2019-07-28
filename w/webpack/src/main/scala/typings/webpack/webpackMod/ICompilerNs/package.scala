package typings.webpack.webpackMod

import typings.std.Error
import typings.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ICompilerNs {
  type Handler = js.Function2[/* err */ Error, /* stats */ Stats, Unit]
}
