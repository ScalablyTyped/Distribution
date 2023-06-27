package typings.vectorious

import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.IteratorResult
import typings.std.IteratorReturnResult
import typings.std.IteratorYieldResult
import typings.vectorious.mod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsSingleMod {
  
  @JSImport("vectorious/dist/iterators/single", "NDIter")
  @js.native
  open class NDIter protected ()
    extends StObject
       with Iterator[js.Array[Double], Any, Unit] {
    def this(x: ArrayLike[Any]) = this()
    def this(x: NDArray) = this()
    
    /**
      * @name backstrides
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var backstrides: js.Array[Double] = js.native
    
    /**
      * @name coords
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var coords: js.Array[Double] = js.native
    
    /**
      * @function current
      * @memberof NDIter.prototype
      * @description Returns the current element of the iterator
      * @returns {Object} current
      * @returns {Number} [current.value]
      * @returns {Boolean} current.done
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDIter } from 'vectorious/iterator';
      *
      * const iter = new NDIter(array([1, 2, 3]));
      * iter.current(); // { value: 1, done: false }
      */
    def current(): IteratorResult[js.Array[Double] | Any, Any] = js.native
    
    /**
      * @function done
      * @memberof NDIter.prototype
      * @description Returns true if the iterator is done, false otherwise
      * @returns {Boolean}
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDIter } from 'vectorious/iterator';
      *
      * const iter = new NDIter(array([1, 2, 3]));
      * iter.done(); // false
      */
    def done(): Boolean = js.native
    
    /**
      * @name factors
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var factors: js.Array[Double] = js.native
    
    /**
      * @name index
      * @memberof NDIter.prototype
      * @type Number
      */
    var index: Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[this.type] = js.native
    
    /**
      * @name length
      * @memberof NDIter.prototype
      * @type Number
      */
    var length: Double = js.native
    
    /**
      * @name lengthm1
      * @memberof NDIter.prototype
      * @type Number
      */
    var lengthm1: Double = js.native
    
    /**
      * @name nd
      * @memberof NDIter.prototype
      * @type Number
      */
    var nd: Double = js.native
    
    /**
      * @name ndm1
      * @memberof NDIter.prototype
      * @type Number
      */
    var ndm1: Double = js.native
    
    /**
      * @function next
      * @memberof NDIter.prototype
      * @description
      * Steps to the next position in the iterator.
      * Returns the current index of the iterator, or undefined if done.
      * @returns {Object}
      * @example
      * import { array } from 'vectorious/core/array';
      * import { NDIter } from 'vectorious/iterator';
      *
      * const iter = new NDIter(array([1, 2, 3]));
      * iter.next(); // { value: 2, done: false }
      * iter.next(); // { value: 3, done: false }
      * iter.next(); // { done: true }
      */
    def next(): IteratorReturnResult[Any] | IteratorYieldResult[Any] = js.native
    
    /**
      * @name pos
      * @memberof NDIter.prototype
      * @type Number
      */
    var pos: Double = js.native
    
    /**
      * @name shape
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var shape: js.Array[Double] = js.native
    
    /**
      * @name shapem1
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var shapem1: js.Array[Double] = js.native
    
    /**
      * @name strides
      * @memberof NDIter.prototype
      * @type Number[]
      */
    var strides: js.Array[Double] = js.native
    
    /**
      * @name x
      * @memberof NDIter.prototype
      * @type NDArray
      */
    var x: NDArray = js.native
  }
}
