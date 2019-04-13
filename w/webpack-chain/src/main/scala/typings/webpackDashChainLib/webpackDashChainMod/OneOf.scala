package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "OneOf")
@js.native
class OneOf ()
  extends ChainedMap[Rule]
     with Orderable {
  /* CompleteClass */
  override def after(name: java.lang.String): this.type = js.native
  /* CompleteClass */
  override def before(name: java.lang.String): this.type = js.native
  def resourceQuery(value: js.Array[webpackLib.webpackMod.Condition]): this.type = js.native
  def resourceQuery(value: webpackLib.webpackMod.Condition): this.type = js.native
  def use(name: java.lang.String): Use[this.type] = js.native
}

