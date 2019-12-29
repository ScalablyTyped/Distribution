package typings.sugar.sugarjs.Array

import typings.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[T, RawValue] extends js.Object {
  var raw: RawValue = js.native
  def add(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def add(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def add(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def add(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def append(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def append(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def append(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def append(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def at(index: Double): SugarDefaultChainable[T] = js.native
  def at(index: Double, loop: Boolean): SugarDefaultChainable[T] = js.native
  def at(index: typings.sugar.Array[Double]): SugarDefaultChainable[T] = js.native
  def at(index: typings.sugar.Array[Double], loop: Boolean): SugarDefaultChainable[T] = js.native
  def average[U](): SugarDefaultChainable[Double] = js.native
  def average[U](map: String): SugarDefaultChainable[Double] = js.native
  def average[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def compact(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def compact(all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def concat(items: (typings.sugar.Array[T] | T)*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def copyWithin(target: Double, start: Double): SugarDefaultChainable[this.type] = js.native
  def copyWithin(target: Double, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
  def count(search: T): SugarDefaultChainable[Double] = js.native
  def count(search: T, context: js.Any): SugarDefaultChainable[Double] = js.native
  def count(search: searchFn[T]): SugarDefaultChainable[Double] = js.native
  def count(search: searchFn[T], context: js.Any): SugarDefaultChainable[Double] = js.native
  def every(search: T): SugarDefaultChainable[Boolean] = js.native
  def every(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
  def every(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T]
  ): SugarDefaultChainable[Boolean] = js.native
  def every(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T],
    context: js.Any
  ): SugarDefaultChainable[Boolean] = js.native
  def everyFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def everyFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def everyFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def exclude(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def exclude(search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def fill(value: T): SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: Double): SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
  def filter(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def filter(search: T, context: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def filter(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], _]) | searchFn[T]
  ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def filter(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], _]) | searchFn[T],
    context: js.Any
  ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def filterFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def filterFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def filterFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def find(search: T): SugarDefaultChainable[T] = js.native
  def find(search: T, context: js.Any): SugarDefaultChainable[T] = js.native
  def find(
    search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T]
  ): SugarDefaultChainable[T] = js.native
  def find(
    search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T],
    context: js.Any
  ): SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def findIndex(search: T): SugarDefaultChainable[Double] = js.native
  def findIndex(search: T, context: js.Any): SugarDefaultChainable[Double] = js.native
  def findIndex(
    search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T]
  ): SugarDefaultChainable[Double] = js.native
  def findIndex(
    search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T],
    context: js.Any
  ): SugarDefaultChainable[Double] = js.native
  def findIndexFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def findIndexFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def findIndexFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def first(): SugarDefaultChainable[T] = js.native
  def first(num: Double): SugarDefaultChainable[T] = js.native
  def flatten(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def flatten(limit: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Unit]
  ): SugarDefaultChainable[Unit] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Unit],
    thisArg: js.Any
  ): SugarDefaultChainable[Unit] = js.native
  def forEachFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def forEachFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def forEachFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def from(index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def groupBy[U](map: String): SugarDefaultChainable[js.Object] = js.native
  def groupBy[U](
    map: String,
    groupFn: js.Function3[
      /* arr */ typings.sugar.Array[T], 
      /* key */ String, 
      /* obj */ js.Object, 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Object] = js.native
  def groupBy[U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
  def groupBy[U](
    map: mapFn[T, U],
    groupFn: js.Function3[
      /* arr */ typings.sugar.Array[T], 
      /* key */ String, 
      /* obj */ js.Object, 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Object] = js.native
  def inGroups(num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def inGroups(num: Double, padding: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def inGroupsOf(num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def inGroupsOf(num: Double, padding: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def indexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
  def indexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
  def insert(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def insert(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def insert(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def insert(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def intersect(arr: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def isEmpty(): SugarDefaultChainable[Boolean] = js.native
  def isEqual(arr: typings.sugar.Array[T]): SugarDefaultChainable[Boolean] = js.native
  def join(): SugarDefaultChainable[String] = js.native
  def join(separator: String): SugarDefaultChainable[String] = js.native
  def last(): SugarDefaultChainable[T] = js.native
  def last(num: Double): SugarDefaultChainable[T] = js.native
  def lastIndexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
  def lastIndexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
  def least[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def least[U](all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def least[U](all: Boolean, map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def least[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def least[U](map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def least[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def map[U](
    map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], U]) | (mapFn[T, U])
  ): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
  def map[U](
    map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], U]) | (mapFn[T, U]),
    context: js.Any
  ): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
  def map[U](map: String): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
  def map[U](map: String, context: js.Any): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
  def mapFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def mapFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def mapFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def max[U](): SugarDefaultChainable[T] = js.native
  def max[U](all: Boolean): SugarDefaultChainable[T] = js.native
  def max[U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def max[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def max[U](map: String): SugarDefaultChainable[T] = js.native
  def max[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def median[U](): SugarDefaultChainable[Double] = js.native
  def median[U](map: String): SugarDefaultChainable[Double] = js.native
  def median[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def min[U](): SugarDefaultChainable[T] = js.native
  def min[U](all: Boolean): SugarDefaultChainable[T] = js.native
  def min[U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def min[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def min[U](map: String): SugarDefaultChainable[T] = js.native
  def min[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def most[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def most[U](all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def most[U](all: Boolean, map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def most[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def most[U](map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def most[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def none(search: T): SugarDefaultChainable[Boolean] = js.native
  def none(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
  def none(search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
  def none(search: searchFn[T], context: js.Any): SugarDefaultChainable[Boolean] = js.native
  def pop(): SugarDefaultChainable[js.UndefOr[T]] = js.native
  def push(items: T*): SugarDefaultChainable[Double] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      T
    ]
  ): SugarDefaultChainable[T] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      T
    ],
    initialValue: T
  ): SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      T
    ]
  ): SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      T
    ],
    initialValue: T
  ): SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  @JSName("reduceRight")
  def reduceRight_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      U
    ],
    initialValue: U
  ): SugarDefaultChainable[U] = js.native
  @JSName("reduce")
  def reduce_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ typings.sugar.Array[T], 
      U
    ],
    initialValue: U
  ): SugarDefaultChainable[U] = js.native
  def remove(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def remove(search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def removeAt(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def removeAt(start: Double, end: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def reverse(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sample(): SugarDefaultChainable[T] = js.native
  def sample(num: Double): SugarDefaultChainable[T] = js.native
  def sample(num: Double, remove: Boolean): SugarDefaultChainable[T] = js.native
  def shift(): SugarDefaultChainable[js.UndefOr[T]] = js.native
  def shuffle(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def slice(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def slice(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def slice(start: Double, end: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def some(search: T): SugarDefaultChainable[Boolean] = js.native
  def some(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
  def some(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T]
  ): SugarDefaultChainable[Boolean] = js.native
  def some(
    search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T],
    context: js.Any
  ): SugarDefaultChainable[Boolean] = js.native
  def someFromIndex(startIndex: Double): SugarDefaultChainable[T] = js.native
  def someFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
  def someFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
  def sort(): SugarDefaultChainable[this.type] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): SugarDefaultChainable[this.type] = js.native
  def sortBy[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sortBy[U](map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sortBy[U](map: String, desc: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sortBy[U](map: sortMapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sortBy[U](map: sortMapFn[T, U], desc: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def splice(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def splice(start: Double, deleteCount: Double, items: T*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def subtract(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def subtract(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def sum[U](): SugarDefaultChainable[Double] = js.native
  def sum[U](map: String): SugarDefaultChainable[Double] = js.native
  def sum[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def to(index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def union(arr: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def unique[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def unique[U](map: String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def unique[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  def unshift(items: T*): SugarDefaultChainable[Double] = js.native
  def zip(args: js.Any*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
}

