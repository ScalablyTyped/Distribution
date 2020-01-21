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
  /** @deprecated use webpack.Compiler */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Compiler = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias webpack.webpack.compiler.Compiler */ js.Object
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = Handler
  /** @deprecated use webpack.Stats */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Stats = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias webpack.webpack.compiler.Stats */ js.Object
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = typings.webpack.mod.Compiler_.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = typings.webpack.mod.Compiler_.Watching
}

