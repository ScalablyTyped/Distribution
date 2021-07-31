package typings.unistUtilIs

import typings.std.Partial
import typings.unist.mod.Node
import typings.unist.mod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Double): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Double, parent: Unit, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Double, parent: Parent): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Double, parent: Parent, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Unit, parent: Unit, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Unit, parent: Parent): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[js.Any]], index: Unit, parent: Parent, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  /**
    * Unist utility to check if a node passes a test.
    *
    * @param node Node to check.
    * @param test When not given, checks if `node` is a `Node`.
    * When `string`, works like passing `function (node) {return node.type === test}`.
    * When `function` checks if function passed the node is true.
    * When `object`, checks that all keys in test are in node, and that they have (strictly) equal values.
    * When `array`, checks any one of the subtests pass.
    * @param index Position of `node` in `parent`
    * @param parent Parent of `node`
    * @param context Context object to invoke `test` with
    * @typeParam T type that node is compared with
    * @returns Whether test passed and `node` is a `Node` (object with `type` set to non-empty `string`).
    */
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double, parent: Unit, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double, parent: Parent): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double, parent: Parent, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Unit, parent: Unit, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Unit, parent: Parent): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Unit, parent: Parent, context: js.Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], test.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  @JSImport("unist-util-is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  type TestType[T /* <: Node */] = /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
}
