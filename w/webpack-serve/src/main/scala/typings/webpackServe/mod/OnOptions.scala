package typings.webpackServe.mod

import typings.webpackServe.anon.Compiler
import typings.webpackServe.anon.CompilerStats
import typings.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
trait OnOptions extends js.Object {
  var `build-finished`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.undefined
  var `build-started`: js.UndefOr[js.Function1[/* args */ Compiler, Unit]] = js.undefined
  var `compiler-error`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.undefined
  var `compiler-warning`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.undefined
  var listening: js.UndefOr[js.Function1[/* args */ typings.webpackServe.anon.Options, Unit]] = js.undefined
}

object OnOptions {
  @scala.inline
  def apply(
    `build-finished`: /* args */ Stats => Unit = null,
    `build-started`: /* args */ Compiler => Unit = null,
    `compiler-error`: /* args */ CompilerStats => Unit = null,
    `compiler-warning`: /* args */ CompilerStats => Unit = null,
    listening: /* args */ typings.webpackServe.anon.Options => Unit = null
  ): OnOptions = {
    val __obj = js.Dynamic.literal()
    if (`build-finished` != null) __obj.updateDynamic("build-finished")(js.Any.fromFunction1(`build-finished`))
    if (`build-started` != null) __obj.updateDynamic("build-started")(js.Any.fromFunction1(`build-started`))
    if (`compiler-error` != null) __obj.updateDynamic("compiler-error")(js.Any.fromFunction1(`compiler-error`))
    if (`compiler-warning` != null) __obj.updateDynamic("compiler-warning")(js.Any.fromFunction1(`compiler-warning`))
    if (listening != null) __obj.updateDynamic("listening")(js.Any.fromFunction1(listening))
    __obj.asInstanceOf[OnOptions]
  }
}

