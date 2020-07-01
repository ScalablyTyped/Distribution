package typings.stylelintWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type Compiler = typings.webpack.mod.Compiler_
  type Lint = js.Function1[
    /* options */ typings.stylelintWebpackPlugin.linterMod.Options, 
    js.Promise[typings.stylelintWebpackPlugin.linterMod.LinterResult]
  ]
  type LintResult = typings.stylelint.mod.LintResult
  type LinterCallback = js.Function1[
    /* error */ js.UndefOr[typings.stylelintWebpackPlugin.stylelintErrorMod.default | scala.Null], 
    scala.Unit
  ]
  type LinterResult = typings.stylelint.mod.LinterResult
}
