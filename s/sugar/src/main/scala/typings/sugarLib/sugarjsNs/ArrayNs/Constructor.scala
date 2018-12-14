package typings
package sugarLib.sugarjsNs.ArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with org.scalablytyped.runtime.Instantiable0[Chainable[js.Object, js.Array[js.Object]]]
     with org.scalablytyped.runtime.Instantiable2[
      (/* obj */ scala.Double) | (/* obj */ stdLib.ArrayLike[js.Object]), 
      /* clone */ scala.Boolean, 
      Chainable[js.Object, js.Array[js.Object]]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* obj */ scala.Double) | (/* obj */ stdLib.ArrayLike[js.Object]), 
      Chainable[js.Object, js.Array[js.Object]]
    ] {
  def apply[T](): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: scala.Double): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: scala.Double, clone: scala.Boolean): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: stdLib.ArrayLike[T]): Chainable[T, js.Array[T]] = js.native
  def apply[T](obj: stdLib.ArrayLike[T], clone: scala.Boolean): Chainable[T, js.Array[T]] = js.native
  def add[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: T, index: scala.Double): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def add[T](instance: js.Array[T], item: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: T, index: scala.Double): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def append[T](instance: js.Array[T], item: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def at[T](instance: js.Array[T], index: js.Array[scala.Double]): T = js.native
  def at[T](instance: js.Array[T], index: js.Array[scala.Double], loop: scala.Boolean): T = js.native
  def at[T](instance: js.Array[T], index: scala.Double): T = js.native
  def at[T](instance: js.Array[T], index: scala.Double, loop: scala.Boolean): T = js.native
  def average[T, U](instance: js.Array[T]): scala.Double = js.native
  def average[T, U](instance: js.Array[T], map: java.lang.String): scala.Double = js.native
  def average[T, U](instance: js.Array[T], map: mapFn[T, U]): scala.Double = js.native
  def clone[T](instance: js.Array[T]): js.Array[T] = js.native
  def compact[T](instance: js.Array[T]): js.Array[T] = js.native
  def compact[T](instance: js.Array[T], all: scala.Boolean): js.Array[T] = js.native
  def construct[T](n: scala.Double, indexMapFn: js.Function1[/* i */ scala.Double, T]): js.Array[T] = js.native
  def count[T](instance: js.Array[T], search: T): scala.Double = js.native
  def count[T](instance: js.Array[T], search: T, context: js.Any): scala.Double = js.native
  def count[T](instance: js.Array[T], search: searchFn[T]): scala.Double = js.native
  def count[T](instance: js.Array[T], search: searchFn[T], context: js.Any): scala.Double = js.native
  def create[T](): js.Array[T] = js.native
  def create[T](obj: scala.Double): js.Array[T] = js.native
  def create[T](obj: scala.Double, clone: scala.Boolean): js.Array[T] = js.native
  def create[T](obj: stdLib.ArrayLike[T]): js.Array[T] = js.native
  def create[T](obj: stdLib.ArrayLike[T], clone: scala.Boolean): js.Array[T] = js.native
  def every[T](instance: js.Array[T], search: T): scala.Boolean = js.native
  def every[T](instance: js.Array[T], search: T, context: js.Any): scala.Boolean = js.native
  def every[T](instance: js.Array[T], search: searchFn[T]): scala.Boolean = js.native
  def every[T](instance: js.Array[T], search: searchFn[T], context: js.Any): scala.Boolean = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def everyFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def exclude[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def exclude[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: T, context: js.Any): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def filter[T](instance: js.Array[T], search: searchFn[T], context: js.Any): js.Array[T] = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def filterFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def find[T](instance: js.Array[T], search: T): T = js.native
  def find[T](instance: js.Array[T], search: T, context: js.Any): T = js.native
  def find[T](instance: js.Array[T], search: searchFn[T]): T = js.native
  def find[T](instance: js.Array[T], search: searchFn[T], context: js.Any): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def findFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def findIndex[T](instance: js.Array[T], search: T): scala.Double = js.native
  def findIndex[T](instance: js.Array[T], search: T, context: js.Any): scala.Double = js.native
  def findIndex[T](instance: js.Array[T], search: searchFn[T]): scala.Double = js.native
  def findIndex[T](instance: js.Array[T], search: searchFn[T], context: js.Any): scala.Double = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def findIndexFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def first[T](instance: js.Array[T]): T = js.native
  def first[T](instance: js.Array[T], num: scala.Double): T = js.native
  def flatten[T](instance: js.Array[T]): js.Array[T] = js.native
  def flatten[T](instance: js.Array[T], limit: scala.Double): js.Array[T] = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def forEachFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def from[T](instance: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def getOption[T](name: java.lang.String): T = js.native
  def groupBy[T, U](instance: js.Array[T], map: java.lang.String): js.Object = js.native
  def groupBy[T, U](
    instance: js.Array[T],
    map: java.lang.String,
    groupFn: js.Function3[/* arr */ js.Array[T], /* key */ java.lang.String, /* obj */ js.Object, scala.Unit]
  ): js.Object = js.native
  def groupBy[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Object = js.native
  def groupBy[T, U](
    instance: js.Array[T],
    map: mapFn[T, U],
    groupFn: js.Function3[/* arr */ js.Array[T], /* key */ java.lang.String, /* obj */ js.Object, scala.Unit]
  ): js.Object = js.native
  def inGroups[T](instance: js.Array[T], num: scala.Double): js.Array[T] = js.native
  def inGroups[T](instance: js.Array[T], num: scala.Double, padding: js.Any): js.Array[T] = js.native
  def inGroupsOf[T](instance: js.Array[T], num: scala.Double): js.Array[T] = js.native
  def inGroupsOf[T](instance: js.Array[T], num: scala.Double, padding: js.Any): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: T, index: scala.Double): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def insert[T](instance: js.Array[T], item: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def intersect[T](instance: js.Array[T], arr: js.Array[T]): js.Array[T] = js.native
  def isEmpty[T](instance: js.Array[T]): scala.Boolean = js.native
  def isEqual[T](instance: js.Array[T], arr: js.Array[T]): scala.Boolean = js.native
  def last[T](instance: js.Array[T]): T = js.native
  def last[T](instance: js.Array[T], num: scala.Double): T = js.native
  def least[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: scala.Boolean): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: scala.Boolean, map: java.lang.String): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], all: scala.Boolean, map: mapFn[T, U]): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], map: java.lang.String): js.Array[T] = js.native
  def least[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def map[T, U](instance: js.Array[T], map: java.lang.String): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: java.lang.String, context: js.Any): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[U] = js.native
  def map[T, U](instance: js.Array[T], map: mapFn[T, U], context: js.Any): js.Array[U] = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def mapFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def max[T, U](instance: js.Array[T]): T = js.native
  def max[T, U](instance: js.Array[T], all: scala.Boolean): T = js.native
  def max[T, U](instance: js.Array[T], all: scala.Boolean, map: java.lang.String): T = js.native
  def max[T, U](instance: js.Array[T], all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: js.Array[T], map: java.lang.String): T = js.native
  def max[T, U](instance: js.Array[T], map: mapFn[T, U]): T = js.native
  def median[T, U](instance: js.Array[T]): scala.Double = js.native
  def median[T, U](instance: js.Array[T], map: java.lang.String): scala.Double = js.native
  def median[T, U](instance: js.Array[T], map: mapFn[T, U]): scala.Double = js.native
  def min[T, U](instance: js.Array[T]): T = js.native
  def min[T, U](instance: js.Array[T], all: scala.Boolean): T = js.native
  def min[T, U](instance: js.Array[T], all: scala.Boolean, map: java.lang.String): T = js.native
  def min[T, U](instance: js.Array[T], all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: js.Array[T], map: java.lang.String): T = js.native
  def min[T, U](instance: js.Array[T], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: scala.Boolean): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: scala.Boolean, map: java.lang.String): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], all: scala.Boolean, map: mapFn[T, U]): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], map: java.lang.String): js.Array[T] = js.native
  def most[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def none[T](instance: js.Array[T], search: T): scala.Boolean = js.native
  def none[T](instance: js.Array[T], search: T, context: js.Any): scala.Boolean = js.native
  def none[T](instance: js.Array[T], search: searchFn[T]): scala.Boolean = js.native
  def none[T](instance: js.Array[T], search: searchFn[T], context: js.Any): scala.Boolean = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def reduceFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def remove[T](instance: js.Array[T], search: T): js.Array[T] = js.native
  def remove[T](instance: js.Array[T], search: searchFn[T]): js.Array[T] = js.native
  def removeAt[T](instance: js.Array[T], start: scala.Double): js.Array[T] = js.native
  def removeAt[T](instance: js.Array[T], start: scala.Double, end: scala.Double): js.Array[T] = js.native
  def sample[T](instance: js.Array[T]): T = js.native
  def sample[T](instance: js.Array[T], num: scala.Double): T = js.native
  def sample[T](instance: js.Array[T], num: scala.Double, remove: scala.Boolean): T = js.native
  def setOption(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOption(options: ArrayOptions): scala.Unit = js.native
  def shuffle[T](instance: js.Array[T]): js.Array[T] = js.native
  def some[T](instance: js.Array[T], search: T): scala.Boolean = js.native
  def some[T](instance: js.Array[T], search: T, context: js.Any): scala.Boolean = js.native
  def some[T](instance: js.Array[T], search: searchFn[T]): scala.Boolean = js.native
  def some[T](instance: js.Array[T], search: searchFn[T], context: js.Any): scala.Boolean = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: scala.Double): T = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: scala.Double, args: js.Any*): T = js.native
  def someFromIndex[T](instance: js.Array[T], startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): T = js.native
  def sortBy[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: java.lang.String): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: java.lang.String, desc: scala.Boolean): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: sortMapFn[T, U]): js.Array[T] = js.native
  def sortBy[T, U](instance: js.Array[T], map: sortMapFn[T, U], desc: scala.Boolean): js.Array[T] = js.native
  def subtract[T](instance: js.Array[T], item: T): js.Array[T] = js.native
  def subtract[T](instance: js.Array[T], item: js.Array[T]): js.Array[T] = js.native
  def sum[T, U](instance: js.Array[T]): scala.Double = js.native
  def sum[T, U](instance: js.Array[T], map: java.lang.String): scala.Double = js.native
  def sum[T, U](instance: js.Array[T], map: mapFn[T, U]): scala.Double = js.native
  def to[T](instance: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def union[T](instance: js.Array[T], arr: js.Array[T]): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T]): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T], map: java.lang.String): js.Array[T] = js.native
  def unique[T, U](instance: js.Array[T], map: mapFn[T, U]): js.Array[T] = js.native
  def zip[T](instance: js.Array[T], args: js.Any*): js.Array[T] = js.native
}

