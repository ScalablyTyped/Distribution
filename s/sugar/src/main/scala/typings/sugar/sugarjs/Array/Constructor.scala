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
     with Instantiable0[Chainable[js.Object, js.Array[js.Object]]]
     with Instantiable2[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      /* clone */ Boolean, 
      Chainable[js.Object, js.Array[js.Object]]
    ]
     with Instantiable1[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      Chainable[js.Object, js.Array[js.Object]]
    ] {
  def apply[T](): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: Double): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: Double, clone: Boolean): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T]): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, js.Array[T]] = js.native
  def add[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: T, index: Double): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: js.Array[T], index: Double): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: T, index: Double): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: js.Array[T], index: Double): js.Array[T] = js.native
  def at[T](instance: js.Array[T], index: js.Array[Double]): T = js.native
  def at[T](instance: js.Array[T], index: js.Array[Double], loop: Boolean): T = js.native
  def at[T](instance: js.Array[T], index: Double): T = js.native
  def at[T](instance: js.Array[T], index: Double, loop: Boolean): T = js.native
  def average[T, U](instance: js.Array[T]): Double = js.native
  def average[T, U](instance: js.Array[T], map: String): Double = js.native
  def average[T, U](instance: js.Array[T], map: mapFn[T, U]): Double = js.native
  def clone[T](instance: js.Array[T]): js.Array[T] = js.native
  def compact[T](instance: js.Array[T]): js.Array[T] = js.native
  def compact[T](instance: js.Array[T], all: Boolean): js.Array[T] = js.native
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): js.Array[T] = js.native
  def count[T](instance: js.Array[T], search: T): Double = js.native
  def count[T](instance: js.Array[T], search: T, context: js.Any): Double = js.native
  def count[T](instance: js.Array[T], search: searchFn[T]): Double = js.native
  def count[T](instance: js.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def create[T](): js.Array[T] = js.native
  def create[T](obj: Double): js.Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): js.Array[T] = js.native
  def create[T](obj: ArrayLike[T]): js.Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): js.Array[T] = js.native
  def every[T](instance: js.Array[T], search: T): Boolean = js.native
  def every[T](instance: js.Array[T], search: T, context: js.Any): Boolean = js.native
  def every[T](instance: js.Array[T], search: searchFn[T]): Boolean = js.native
  def every[T](instance: js.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def exclude[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def exclude[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: T, context: js.Any): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: searchFn[T], context: js.Any): js.Array[T] = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def find[T](instance: js.Array[T], search: T): T = js.native
  def find[T](instance: js.Array[T], search: T, context: js.Any): T = js.native
  def find[T](instance: js.Array[T], search: searchFn[T]): T = js.native
  def find[T](instance: js.Array[T], search: searchFn[T], context: js.Any): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def findIndex[T](instance: js.Array[T], search: T): Double = js.native
  def findIndex[T](instance: js.Array[T], search: T, context: js.Any): Double = js.native
  def findIndex[T](instance: js.Array[T], search: searchFn[T]): Double = js.native
  def findIndex[T](instance: js.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def first[T](instance: js.Array[T]): T = js.native
  def first[T](instance: js.Array[T], num: Double): T = js.native
  def flatten[T](instance: js.Array[T]): js.Array[T] = js.native
  def flatten[T](instance: js.Array[T], limit: Double): js.Array[T] = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def from[T](instance: js.Array[T], index: Double): js.Array[T] = js.native
  def getOption[T](name: String): T = js.native
  def groupBy[T, U](instance: js.Array[T], map: String): js.Object = js.native
  def groupBy[T, U](
    instance: js.Array[T],
    map: String,
    groupFn: js.Function3[/* arr */ js.Array[T], /* key */ String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  def groupBy[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Object = js.native
  def groupBy[T, U](
    instance: js.Array[T],
    map: mapFn[T, U],
    groupFn: js.Function3[/* arr */ js.Array[T], /* key */ String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  def inGroups[T](instance: js.Array[T], num: Double): js.Array[T] = js.native
  def inGroups[T](instance: js.Array[T], num: Double, padding: js.Any): js.Array[T] = js.native
  def inGroupsOf[T](instance: js.Array[T], num: Double): js.Array[T] = js.native
  def inGroupsOf[T](instance: js.Array[T], num: Double, padding: js.Any): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: T, index: Double): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: js.Array[T], index: Double): js.Array[T] = js.native
  def intersect[T](instance: js.Array[T], arr: js.Array[T]): js.Array[T] = js.native
  def isEmpty[T](instance: js.Array[T]): Boolean = js.native
  def isEqual[T](instance: js.Array[T], arr: js.Array[T]): Boolean = js.native
  def last[T](instance: js.Array[T]): T = js.native
  def last[T](instance: js.Array[T], num: Double): T = js.native
  def least[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: Boolean): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: Boolean, map: String): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: Boolean, map: mapFn[T, U]): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], map: String): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def map[T, U](instance: js.Array[T], map: String): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: String, context: js.Any): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: mapFn[T, U], context: js.Any): js.Array[U] = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def max[T, U](instance: js.Array[T]): T = js.native
  def max[T, U](instance: js.Array[T], all: Boolean): T = js.native
  def max[T, U](instance: js.Array[T], all: Boolean, map: String): T = js.native
  def max[T, U](instance: js.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: js.Array[T], map: String): T = js.native
  def max[T, U](instance: js.Array[T], map: mapFn[T, U]): T = js.native
  def median[T, U](instance: js.Array[T]): Double = js.native
  def median[T, U](instance: js.Array[T], map: String): Double = js.native
  def median[T, U](instance: js.Array[T], map: mapFn[T, U]): Double = js.native
  def min[T, U](instance: js.Array[T]): T = js.native
  def min[T, U](instance: js.Array[T], all: Boolean): T = js.native
  def min[T, U](instance: js.Array[T], all: Boolean, map: String): T = js.native
  def min[T, U](instance: js.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: js.Array[T], map: String): T = js.native
  def min[T, U](instance: js.Array[T], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: Boolean): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: Boolean, map: String): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: Boolean, map: mapFn[T, U]): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], map: String): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def none[T](instance: js.Array[T], search: T): Boolean = js.native
  def none[T](instance: js.Array[T], search: T, context: js.Any): Boolean = js.native
  def none[T](instance: js.Array[T], search: searchFn[T]): Boolean = js.native
  def none[T](instance: js.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def remove[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def remove[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def removeAt[T](instance: js.Array[T], start: Double): js.Array[T] = js.native
  def removeAt[T](instance: js.Array[T], start: Double, end: Double): js.Array[T] = js.native
  def sample[T](instance: js.Array[T]): T = js.native
  def sample[T](instance: js.Array[T], num: Double): T = js.native
  def sample[T](instance: js.Array[T], num: Double, remove: Boolean): T = js.native
  def setOption(name: String, value: js.Any): Unit = js.native
  def setOption(options: ArrayOptions): Unit = js.native
  def shuffle[T](instance: js.Array[T]): js.Array[T] = js.native
  def some[T](instance: js.Array[T], search: T): Boolean = js.native
  def some[T](instance: js.Array[T], search: T, context: js.Any): Boolean = js.native
  def some[T](instance: js.Array[T], search: searchFn[T]): Boolean = js.native
  def some[T](instance: js.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: Double): T = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def sortBy[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: String): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: String, desc: Boolean): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: sortMapFn[T, U]): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: sortMapFn[T, U], desc: Boolean): js.Array[T] = js.native
  def subtract[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def subtract[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def sum[T, U](instance: js.Array[T]): Double = js.native
  def sum[T, U](instance: js.Array[T], map: String): Double = js.native
  def sum[T, U](instance: js.Array[T], map: mapFn[T, U]): Double = js.native
  def to[T](instance: js.Array[T], index: Double): js.Array[T] = js.native
  def union[T](instance: js.Array[T], arr: js.Array[T]): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T], map: String): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def zip[T](instance: js.Array[T], args: js.Any*): js.Array[T] = js.native
}

