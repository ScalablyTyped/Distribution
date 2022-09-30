package typings.webdriverio.typesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainablePromiseArray[T]
  extends StObject
     with Promise[T]
     with /**
  * allow to access a specific index of the element set
  */
/* n */ NumberDictionary[ChainablePromiseElement[js.UndefOr[typings.std.Element]]] {
  
  def every[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = js.native
  def every[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = js.native
  
  def everySeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = js.native
  def everySeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = js.native
  
  def filter[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[typings.std.Element]] = js.native
  def filter[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[js.Array[typings.std.Element]] = js.native
  
  def filterSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[typings.std.Element]] = js.native
  def filterSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[js.Array[typings.std.Element]] = js.native
  
  def find[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[T] = js.native
  def find[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[T] = js.native
  
  def findIndex[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Double] = js.native
  def findIndex[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Double] = js.native
  
  def findIndexSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Double] = js.native
  def findIndexSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Double] = js.native
  
  def findSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[T] = js.native
  def findSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[T] = js.native
  
  /**
    * Unwrap the nth element of the element list.
    */
  def forEach[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Unit
    ]
  ): js.Promise[Unit] = js.native
  def forEach[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Unit
    ],
    thisArg: Any
  ): js.Promise[Unit] = js.native
  
  def forEachSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Unit
    ]
  ): js.Promise[Unit] = js.native
  def forEachSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Unit
    ],
    thisArg: Any
  ): js.Promise[Unit] = js.native
  
  /**
    * Amount of element fetched.
    */
  var length: js.Promise[Double] = js.native
  
  def map[U](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ]
  ): js.Promise[js.Array[U]] = js.native
  def map[U](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ],
    thisArg: Any
  ): js.Promise[js.Array[U]] = js.native
  
  def mapSeries[T, U](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ]
  ): js.Promise[js.Array[U]] = js.native
  def mapSeries[T, U](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ],
    thisArg: Any
  ): js.Promise[js.Array[U]] = js.native
  
  /**
    * parent of the element if fetched via `$(parent).$(child)`
    */
  var parent: js.Promise[
    typings.std.Element | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any)
  ] = js.native
  
  def reduce[T, U](
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ typings.std.Element, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ]
  ): js.Promise[U] = js.native
  def reduce[T, U](
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ typings.std.Element, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ],
    initialValue: U
  ): js.Promise[U] = js.native
  
  /**
    * selector used to fetch this element, can be
    * - undefined if element was created via `$({ 'element-6066-11e4-a52e-4f735466cecf': 'ELEMENT-1' })`
    * - a string if `findElement` was used and a reference was found
    * - or a functin if element was found via e.g. `$(() => document.body)`
    */
  var selector: js.Promise[Selector] = js.native
  
  def some[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = js.native
  def some[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = js.native
  
  def someSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = js.native
  def someSeries[T](
    callback: js.Function3[
      /* currentValue */ typings.std.Element, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = js.native
}
