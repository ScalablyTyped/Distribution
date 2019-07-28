package typings.unistDashUtilDashIs

import typings.std.Partial
import typings.unist.unistMod.Node
import typings.unist.unistMod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unistDashUtilDashIsMod {
  type Test = TestFunction | Partial[Node] | String | Null
  /**
    * @param node Node to test
    * @param index Position of node in parent
    * @param parent Parent of node
    */
  type TestFunction = js.Function3[
    /* node */ js.Any, 
    /* index */ js.UndefOr[Double], 
    /* parent */ js.UndefOr[Parent], 
    Boolean | Unit
  ]
}
