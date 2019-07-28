package typings.webpackDashChain.webpackDashChainMod

import typings.webpack.webpackMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "OneOf")
@js.native
class OneOf ()
  extends ChainedMap[Rule]
     with Orderable {
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  def resourceQuery(value: js.Array[Condition]): this.type = js.native
  def resourceQuery(value: Condition): this.type = js.native
  def use(name: String): Use[this.type] = js.native
}

