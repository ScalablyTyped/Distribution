package typings.unistDashUtilDashIs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unistDashUtilDashIsMod {
  import typings.std.Partial
  import typings.unist.unistMod.Node
  import typings.unist.unistMod.Parent

  /**
    * Union of all the types of tests
    *
    * @typeParam T type of node that passes test
    */
  type Test[T /* <: Node */] = TestType[T] | TestObject[T] | TestFunction[T]
  /**
    * Check if a node passes a test
    *
    * @param node node to check
    * @param index index of node in parent
    * @param parent parent of node
    * @typeParam T type of node that passes test
    * @returns true if type T is found, false otherwise
    */
  type TestFunction[T /* <: Node */] = js.Function3[
    /* node */ js.Any, 
    /* index */ js.UndefOr[Double], 
    /* parent */ js.UndefOr[Parent], 
    /* is T */ Boolean
  ]
  /**
    * Check that some attributes on a node are matched
    *
    * @typeParam T type of node that passes test
    */
  type TestObject[T /* <: Node */] = Partial[T]
  /**
    * Check that type property matches expectation for a node
    *
    * @typeParam T type of node that passes test
    */
  type TestType[T /* <: Node */] = /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any
}
