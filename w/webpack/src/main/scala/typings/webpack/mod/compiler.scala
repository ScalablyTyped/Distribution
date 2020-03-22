package typings.webpack.mod

import typings.webpack.mod.Compiler_.Handler
import typings.webpack.mod.Stats.ToJsonOptions
import typings.webpack.mod.Stats.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated */
@JSImport("webpack", "compiler")
@js.native
object compiler extends js.Object {
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = Handler
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = typings.webpack.mod.Compiler_.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = typings.webpack.mod.Compiler_.Watching
}

