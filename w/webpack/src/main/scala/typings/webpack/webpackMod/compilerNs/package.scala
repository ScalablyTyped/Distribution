package typings.webpack.webpackMod

import typings.webpack.webpackMod.CompilerNs.Handler
import typings.webpack.webpackMod.StatsNs.ToJsonOptions
import typings.webpack.webpackMod.StatsNs.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compilerNs {
  /** @deprecated use webpack.Compiler */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Compiler = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.compiler.Compiler */ js.Object
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = Handler
  /** @deprecated use webpack.Stats */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Stats = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.compiler.Stats */ js.Object
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = typings.webpack.webpackMod.CompilerNs.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = typings.webpack.webpackMod.CompilerNs.Watching
}
