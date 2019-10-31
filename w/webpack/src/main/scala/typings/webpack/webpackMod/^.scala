package typings.webpack.webpackMod

import typings.std.Record
import typings.webpack.webpackMod.MultiCompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  def apply(
    options: js.Function2[
      (Record[String, Boolean | Double | String]) | String, 
      /* args */ Record[String, String], 
      js.Array[Configuration] | Configuration | (js.Promise[js.Array[Configuration] | Configuration])
    ],
    handler: typings.webpack.webpackMod.Compiler.Handler | Handler
  ): typings.webpack.webpackMod.Compiler.Watching | Compiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: typings.webpack.webpackMod.Compiler.Handler): typings.webpack.webpackMod.Compiler.Watching | Compiler = js.native
}

