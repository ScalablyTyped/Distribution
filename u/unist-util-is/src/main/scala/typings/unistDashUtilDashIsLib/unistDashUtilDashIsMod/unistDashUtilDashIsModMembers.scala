package typings
package unistDashUtilDashIsLib.unistDashUtilDashIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unist-util-is", JSImport.Namespace)
@js.native
object unistDashUtilDashIsModMembers extends js.Object {
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
  def apply(
    test: unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test | js.Array[unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test],
    node: js.Any
  ): scala.Boolean = js.native
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
  def apply(
    test: unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test | js.Array[unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test],
    node: js.Any,
    index: scala.Double
  ): scala.Boolean = js.native
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
  def apply(
    test: unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test | js.Array[unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test],
    node: js.Any,
    index: scala.Double,
    parent: unistLib.unistMod.Parent
  ): scala.Boolean = js.native
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
  def apply(
    test: unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test | js.Array[unistDashUtilDashIsLib.unistDashUtilDashIsMod.unistUtilIsNs.Test],
    node: js.Any,
    index: scala.Double,
    parent: unistLib.unistMod.Parent,
    context: js.Any
  ): scala.Boolean = js.native
}

