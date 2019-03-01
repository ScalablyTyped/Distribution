package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConfigNs {
  type ChainedMap[Parent] = webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Parent, js.Any]
  type ChainedSet[Parent] = webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedSet[Parent, js.Any]
  type DevTool = _DevTool | scala.Boolean
  type EntryPoint = TypedChainedSet[webpackDashChainLib.webpackDashChainMod.Config, java.lang.String]
  type Plugins[Parent] = TypedChainedMap[Parent, Plugin[Parent]]
  type RuntimeChunkFunction = js.Function1[/* entryPoint */ EntryPoint, java.lang.String]
}
