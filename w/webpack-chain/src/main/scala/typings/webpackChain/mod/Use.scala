package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Use")
@js.native
class Use[Parent] ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Parent, js.Any]
     with Orderable {
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  /* CompleteClass */
  override def end(): Parent = js.native
  def loader(value: String): this.type = js.native
  def options(value: LoaderOptions): this.type = js.native
  def tap(f: js.Function1[/* options */ LoaderOptions, LoaderOptions]): this.type = js.native
}

