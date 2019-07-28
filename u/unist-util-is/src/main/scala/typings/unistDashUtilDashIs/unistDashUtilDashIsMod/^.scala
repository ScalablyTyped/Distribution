package typings.unistDashUtilDashIs.unistDashUtilDashIsMod

import typings.unist.unistMod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unist-util-is", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Unist utility to check if a node passes a test.
    *
    * @param test When not given, checks if `node` is a `Node`.
    * When `string`, works like passing `function (node) {return node.type === test}`.
    * When `array`, checks any one of the subtests pass.
    * When `object`, checks that all keys in test are in node, and that they have (strictly) equal values
    * @param node Node to check. `false` is returned
    * @param index Position of `node` in `parent`
    * @param parent Parent of `node`
    * @param context Context object to invoke `test` with
    * @returns Whether test passed and `node` is a `Node` (object with `type` set to non-empty `string`).
    */
  def apply(test: Test | js.Array[Test], node: js.Any): Boolean = js.native
  def apply(test: Test | js.Array[Test], node: js.Any, index: Double): Boolean = js.native
  def apply(test: Test | js.Array[Test], node: js.Any, index: Double, parent: Parent): Boolean = js.native
  def apply(test: Test | js.Array[Test], node: js.Any, index: Double, parent: Parent, context: js.Any): Boolean = js.native
}

