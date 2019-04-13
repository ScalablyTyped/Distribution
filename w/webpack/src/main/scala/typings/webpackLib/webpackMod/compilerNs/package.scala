package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compilerNs {
  /** @deprecated use webpack.Compiler */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Compiler = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.compiler.Compiler */ js.Object
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = webpackLib.webpackMod.CompilerNs.Handler
  /** @deprecated use webpack.Stats */
  // tslint:disable-next-line:no-unnecessary-qualifier
  type Stats = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.compiler.Stats */ js.Object
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = webpackLib.webpackMod.StatsNs.ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = webpackLib.webpackMod.StatsNs.ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = webpackLib.webpackMod.CompilerNs.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = webpackLib.webpackMod.CompilerNs.Watching
}
