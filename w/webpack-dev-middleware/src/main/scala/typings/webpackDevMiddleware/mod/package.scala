package typings.webpackDevMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Logger = typings.loglevel.mod.Logger
  type Reporter = js.Function2[
    /* middlewareOptions */ typings.webpackDevMiddleware.mod.Options, 
    /* reporterOptions */ typings.webpackDevMiddleware.mod.ReporterOptions, 
    scala.Unit
  ]
}
