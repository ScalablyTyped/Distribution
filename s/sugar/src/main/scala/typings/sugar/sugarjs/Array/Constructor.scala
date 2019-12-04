package typings.sugar.sugarjs.Array

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ArrayLike
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[js.Object, typings.sugar.Array[js.Object]]]
     with Instantiable2[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      /* clone */ Boolean, 
      Chainable[js.Object, typings.sugar.Array[js.Object]]
    ]
     with Instantiable1[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      Chainable[js.Object, typings.sugar.Array[js.Object]]
    ] {
  def apply[T](): Chainable[T, typings.sugar.Array[T]] = js.native
  def apply[T](obj: Double): Chainable[T, typings.sugar.Array[T]] = js.native
  def apply[T](obj: Double, clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T]): Chainable[T, typings.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
  def add[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
  def add[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
  def add[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def add[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
  def append[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
  def append[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
  def append[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def append[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
  def at[T](instance: typings.sugar.Array[T], index: Double): T = js.native
  def at[T](instance: typings.sugar.Array[T], index: Double, loop: Boolean): T = js.native
  def at[T](instance: typings.sugar.Array[T], index: typings.sugar.Array[Double]): T = js.native
  def at[T](instance: typings.sugar.Array[T], index: typings.sugar.Array[Double], loop: Boolean): T = js.native
  def average[T, U](instance: typings.sugar.Array[T]): Double = js.native
  def average[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
  def average[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def clone[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def compact[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def compact[T](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): typings.sugar.Array[T] = js.native
  def count[T](instance: typings.sugar.Array[T], search: T): Double = js.native
  def count[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def count[T](instance: typings.sugar.Array[T], search: searchFn[T]): Double = js.native
  def count[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def create[T](): typings.sugar.Array[T] = js.native
  def create[T](obj: Double): typings.sugar.Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): typings.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T]): typings.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): typings.sugar.Array[T] = js.native
  def every[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
  def every[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def every[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def every[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def everyFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def everyFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def everyFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def exclude[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
  def exclude[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
  def filter[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
  def filter[T](instance: typings.sugar.Array[T], search: T, context: js.Any): typings.sugar.Array[T] = js.native
  def filter[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
  def filter[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): typings.sugar.Array[T] = js.native
  def filterFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def filterFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def filterFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def find[T](instance: typings.sugar.Array[T], search: T): T = js.native
  def find[T](instance: typings.sugar.Array[T], search: T, context: js.Any): T = js.native
  def find[T](instance: typings.sugar.Array[T], search: searchFn[T]): T = js.native
  def find[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): T = js.native
  def findFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def findFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def findIndex[T](instance: typings.sugar.Array[T], search: T): Double = js.native
  def findIndex[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def findIndex[T](instance: typings.sugar.Array[T], search: searchFn[T]): Double = js.native
  def findIndex[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def findIndexFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def findIndexFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findIndexFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def first[T](instance: typings.sugar.Array[T]): T = js.native
  def first[T](instance: typings.sugar.Array[T], num: Double): T = js.native
  def flatten[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def flatten[T](instance: typings.sugar.Array[T], limit: Double): typings.sugar.Array[T] = js.native
  def forEachFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def forEachFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def forEachFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def from[T](instance: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
  def getOption[T](name: java.lang.String): T = js.native
  def groupBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String): js.Object = js.native
  def groupBy[T, U](
    instance: typings.sugar.Array[T],
    map: java.lang.String,
    groupFn: js.Function3[
      /* arr */ typings.sugar.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      Unit
    ]
  ): js.Object = js.native
  def groupBy[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): js.Object = js.native
  def groupBy[T, U](
    instance: typings.sugar.Array[T],
    map: mapFn[T, U],
    groupFn: js.Function3[
      /* arr */ typings.sugar.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      Unit
    ]
  ): js.Object = js.native
  def inGroups[T](instance: typings.sugar.Array[T], num: Double): typings.sugar.Array[T] = js.native
  def inGroups[T](instance: typings.sugar.Array[T], num: Double, padding: js.Any): typings.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typings.sugar.Array[T], num: Double): typings.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typings.sugar.Array[T], num: Double, padding: js.Any): typings.sugar.Array[T] = js.native
  def insert[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
  def insert[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
  def insert[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def insert[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
  def intersect[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def isEmpty[T](instance: typings.sugar.Array[T]): Boolean = js.native
  def isEqual[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): Boolean = js.native
  def last[T](instance: typings.sugar.Array[T]): T = js.native
  def last[T](instance: typings.sugar.Array[T], num: Double): T = js.native
  def least[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def least[T, U](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
  def least[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): typings.sugar.Array[T] = js.native
  def least[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typings.sugar.Array[T] = js.native
  def least[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
  def least[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
  def map[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[U] = js.native
  def map[T, U](instance: typings.sugar.Array[T], map: java.lang.String, context: js.Any): typings.sugar.Array[U] = js.native
  def map[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[U] = js.native
  def map[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U], context: js.Any): typings.sugar.Array[U] = js.native
  def mapFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def mapFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def mapFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def max[T, U](instance: typings.sugar.Array[T]): T = js.native
  def max[T, U](instance: typings.sugar.Array[T], all: Boolean): T = js.native
  def max[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
  def max[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: typings.sugar.Array[T], map: java.lang.String): T = js.native
  def max[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def median[T, U](instance: typings.sugar.Array[T]): Double = js.native
  def median[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
  def median[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def min[T, U](instance: typings.sugar.Array[T]): T = js.native
  def min[T, U](instance: typings.sugar.Array[T], all: Boolean): T = js.native
  def min[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
  def min[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: typings.sugar.Array[T], map: java.lang.String): T = js.native
  def min[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def most[T, U](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
  def most[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): typings.sugar.Array[T] = js.native
  def most[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typings.sugar.Array[T] = js.native
  def most[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
  def most[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
  def none[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
  def none[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def none[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def none[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def reduceFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def reduceFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def reduceRightFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def remove[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
  def remove[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
  def removeAt[T](instance: typings.sugar.Array[T], start: Double): typings.sugar.Array[T] = js.native
  def removeAt[T](instance: typings.sugar.Array[T], start: Double, end: Double): typings.sugar.Array[T] = js.native
  def sample[T](instance: typings.sugar.Array[T]): T = js.native
  def sample[T](instance: typings.sugar.Array[T], num: Double): T = js.native
  def sample[T](instance: typings.sugar.Array[T], num: Double, remove: Boolean): T = js.native
  def setOption(name: java.lang.String, value: js.Any): Unit = js.native
  def setOption(options: ArrayOptions): Unit = js.native
  def shuffle[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def some[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
  def some[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def some[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def some[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def someFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double): T = js.native
  def someFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def someFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def sortBy[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String, desc: Boolean): typings.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typings.sugar.Array[T], map: sortMapFn[T, U]): typings.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typings.sugar.Array[T], map: sortMapFn[T, U], desc: Boolean): typings.sugar.Array[T] = js.native
  def subtract[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
  def subtract[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def sum[T, U](instance: typings.sugar.Array[T]): Double = js.native
  def sum[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
  def sum[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def to[T](instance: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
  def union[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def unique[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
  def unique[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
  def unique[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
  def zip[T](instance: typings.sugar.Array[T], args: js.Any*): typings.sugar.Array[T] = js.native
}

