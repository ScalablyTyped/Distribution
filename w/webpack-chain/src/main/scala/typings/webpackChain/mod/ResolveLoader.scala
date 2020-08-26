package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "ResolveLoader")
@js.native
class ResolveLoader () extends Resolve[Config] {
  var moduleExtensions: ChainedSet[this.type] = js.native
  var packageMains: ChainedSet[this.type] = js.native
}

