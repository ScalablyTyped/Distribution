package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Use")
@js.native
class Use[Parent] ()
  extends ChainedMap[Parent]
     with Orderable {
  /* CompleteClass */
  override def after(name: java.lang.String): this.type = js.native
  /* CompleteClass */
  override def before(name: java.lang.String): this.type = js.native
  def loader(value: java.lang.String): this.type = js.native
  def options(value: LoaderOptions): this.type = js.native
  def tap(f: js.Function1[/* options */ LoaderOptions, LoaderOptions]): this.type = js.native
}

