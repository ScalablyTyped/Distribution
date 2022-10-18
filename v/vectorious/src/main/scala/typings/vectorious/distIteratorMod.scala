package typings.vectorious

import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.IteratorResult
import typings.vectorious.mod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorMod {
  
  @JSImport("vectorious/dist/iterator", "NDIter")
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
    def next(): IteratorResult[Any, Any] = js.native
    
    /**
      * @function next1d
      * @memberof NDIter.prototype
      * @description Steps to the next position in the iterator, assuming it is 1 dimensional.
      */
    def next1d(): Unit = js.native
    
    /**
      * @function next2d
      * @memberof NDIter.prototype
      * @description Steps to the next position in the iterator, assuming it is 2 dimensional.
      */
    def next2d(): Unit = js.native
    
    /**
      * @function next2d
      * @memberof NDIter.prototype
      * @description Steps to the next position in the iterator
      */
    def nextnd(): Unit = js.native
    
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
  
  @JSImport("vectorious/dist/iterator", "NDMultiIter")
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
    def next(): IteratorResult[Any, Any] = js.native
    
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
  
  @JSImport("vectorious/dist/iterator", "V_MAXDIMS")
  @js.native
  val V_MAXDIMS: /* 32 */ Double = js.native
}
