package typings.webpackDashDevDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashDevDashMiddlewareMod {
  type Logger = typings.loglevel.loglevelMod.Logger
  type Reporter = js.Function2[/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions, Unit]
}
