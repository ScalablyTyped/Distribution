package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Use
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Rule, js.Any]
     with Orderable {
  def loader(value: java.lang.String): this.type = js.native
  def options(value: LoaderOptions): this.type = js.native
  def tap(f: js.Function1[/* options */ LoaderOptions, LoaderOptions]): this.type = js.native
}

