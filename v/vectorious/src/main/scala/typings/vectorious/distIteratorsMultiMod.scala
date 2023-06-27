package typings.vectorious

import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.IteratorResult
import typings.std.IteratorReturnResult
import typings.std.IteratorYieldResult
import typings.vectorious.distIteratorsSingleMod.NDIter
import typings.vectorious.mod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsMultiMod {
  
  @JSImport("vectorious/dist/iterators/multi", "NDMultiIter")
  @js.native
  open class NDMultiIter protected ()
    extends StObject
       with Iterator[js.Array[Double], Any, Unit] {
    def this(args: (NDArray | ArrayLike[Any])*) = this()
    
    /**
      * @function current
      * @memberof NDMultiIter
      * @description Returns the current indices of the iterators
      * @returns {Object} current
      * @returns {Number[]} [current.value]
      * @returns {Boolean} current.done
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDMultiIter } from 'vectorious/iterator';
      *
      * const iter = new NDMultiIter(array([1, 2, 3]), array([4, 5, 6]));
      * iter.current(); // { value: [0, 0], done: false }
      */
    def current(): IteratorResult[js.Array[Double] | Any, Any] = js.native
    
    /**
      * @function done
      * @memberof NDMultiIter
      * @description Returns true if the iterator is done, false otherwise
      * @returns {Boolean}
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDMultiIter } from 'vectorious/iterator';
      *
      * const iter = new NDMultiIter(array([1, 2, 3]), array([4, 5, 6]));
      * iter.done(); // false
      */
    def done(): Boolean = js.native
    
    /**
      * @name index
      * @memberof NDMultiIter.prototype
      * @type Number
      */
    var index: Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[this.type] = js.native
    
    /**
      * @name iters
      * @memberof NDMultiIter.prototype
      * @type NDIter[]
      */
    var iters: js.Array[NDIter] = js.native
    
    /**
      * @name length
      * @memberof NDMultiIter.prototype
      * @type Number
      */
    var length: Double = js.native
    
    /**
      * @name lengthm1
      * @memberof NDMultiIter.prototype
      * @type Number
      */
    var lengthm1: Double = js.native
    
    /**
      * @name nd
      * @memberof NDMultiIter.prototype
      * @type Number
      */
    var nd: Double = js.native
    
    /**
      * @function next
      * @memberof NDMultiIter
      * @description
      * Steps to the next position in the iterator.
      * Returns the current indices of the iterators, or undefined if done.
      * @returns {Object} current
      * @returns {Number[]} [current.value]
      * @returns {Boolean} current.done
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDMultiIter } from 'vectorious/iterator';
      *
      * const iter = new NDMultiIter(array([1, 2, 3]), array([4, 5, 6]));
      * iter.next(); // { value: [0, 0], done: false }
      * iter.next(); // { value: [1, 1], done: false }
      * iter.next(); // { value: [2, 2], done: false },
      * iter.next(); // { value: undefined, done: true },
      */
    def next(): IteratorReturnResult[Any] | IteratorYieldResult[Any] = js.native
    
    /**
      * @name numiter
      * @memberof NDMultiIter.prototype
      * @type Number
      */
    var numiter: Double = js.native
    
    /**
      * @name pos
      * @memberof NDMultiIter.prototype
      * @type Number[]
      */
    var pos: js.Array[Double] = js.native
    
    /**
      * @name shape
      * @memberof NDMultiIter.prototype
      * @type Number[]
      */
    var shape: js.Array[Double] = js.native
  }
}
