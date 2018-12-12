package typings
package unistDashUtilDashIsLib.unistDashUtilDashIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unistUtilIsNs {
  type Test = TestFunction | stdLib.Partial[unistLib.unistMod.Node] | java.lang.String | scala.Null
  /**
       * @param node Node to test
       * @param index Position of node in parent
       * @param parent Parent of node
       */
  type TestFunction = js.Function3[
    /* node */ js.Any, 
    /* index */ js.UndefOr[scala.Double], 
    /* parent */ js.UndefOr[unistLib.unistMod.Parent], 
    scala.Boolean | scala.Unit
  ]
}
