package typings.stylelintWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lintDirtyModulesPluginMod {
  type Compiler = typings.webpack.mod.Compiler_
  type FileSystemInfoEntry = scala.Double | typings.stylelintWebpackPlugin.anon.Partialtimestampnumber
  type Lint = js.Function1[
    /* options */ typings.stylelintWebpackPlugin.getOptionsMod.Options, 
    js.Promise[typings.stylelint.mod.LinterResult]
  ]
  type LinterCallback = js.Function1[
    /* error */ js.UndefOr[typings.stylelintWebpackPlugin.stylelintErrorMod.default | scala.Null], 
    scala.Unit
  ]
}
