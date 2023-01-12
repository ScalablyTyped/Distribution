package typings.unistUtilRemove

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unistUtilIs.mod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * Mutate the given tree by removing all nodes that pass test. The tree is walked in preorder (NLR), visiting the node itself, then its head, etc.
    *
    * @param tree      Tree to filter
    * @param test      is-compatible test (such as a type)
    */
  /**
    *
    * Mutate the given tree by removing all nodes that pass test. The tree is walked in preorder (NLR), visiting the node itself, then its head, etc.
    *
    * @param tree      Tree to filter
    * @param options   Whether to drop parent nodes if they had children, but all their children were filtered out. Default is {cascade: true}
    * @param test      is-compatible test (such as a type)
    */
  inline def apply[T /* <: Node[Data] */](tree: T): T | Null = ^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def apply[T /* <: Node[Data] */](tree: T, options: Unit, test: Test): T | Null = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: Node[Data] */](tree: T, options: RemoveOptions): T | Null = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: Node[Data] */](tree: T, options: RemoveOptions, test: Test): T | Null = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: Node[Data] */](tree: T, test: Test): T | Null = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @JSImport("unist-util-remove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RemoveOptions extends StObject {
    
    /**
      * Whether to drop parent nodes if they had children, but all their children were filtered out test
      */
    var cascade: js.UndefOr[Boolean] = js.undefined
  }
  object RemoveOptions {
    
    inline def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    }
  }
}
