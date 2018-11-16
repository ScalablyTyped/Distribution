package typings
package sugarLib.sugarjsNs.ArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[T, RawValue] extends js.Object {
  var raw: RawValue = js.native
  def add(item: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def add(item: T, index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def add(item: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def add(item: js.Array[T], index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def append(item: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def append(item: T, index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def append(item: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def append(item: js.Array[T], index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def at(index: js.Array[scala.Double]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at(index: js.Array[scala.Double], loop: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at(index: scala.Double, loop: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def average(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def compact(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def compact(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def concat(items: (T | js.Array[T])*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def copyWithin(target: scala.Double, start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def copyWithin(target: scala.Double, start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def count(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def count(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def count(search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def count(search: searchFn, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def every(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]) | searchFn
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]) | searchFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def everyFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def everyFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def everyFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def exclude(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def exclude(search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def fill(value: T): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def filter(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]) | searchFn
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]) | searchFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filterFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def filterFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def filterFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def find(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def find(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def find(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]) | searchFn
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def find(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]) | searchFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findIndex(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def findIndex(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def findIndex(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]) | searchFn
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def findIndex(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]) | searchFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def findIndexFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findIndexFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def findIndexFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def first(): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def first(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def flatten(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def flatten(limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit],
    thisArg: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def forEachFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def forEachFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def forEachFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def from(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def groupBy(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def groupBy(
    map: java.lang.String,
    fn: js.Function3[
      /* arr */ js.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def groupBy(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def groupBy(
    map: mapFn,
    fn: js.Function3[
      /* arr */ js.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def inGroups(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def inGroups(num: scala.Double, padding: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def inGroupsOf(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def inGroupsOf(num: scala.Double, padding: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def indexOf(searchElement: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def indexOf(searchElement: T, fromIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def insert(item: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def insert(item: T, index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def insert(item: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def insert(item: js.Array[T], index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def intersect(arr: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def isEmpty(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isEqual(arr: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def join(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def join(separator: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def last(): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def last(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def lastIndexOf(searchElement: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def lastIndexOf(searchElement: T, fromIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def least(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least(all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least(all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def map[U](map: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U]) | mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def map[U](
    map: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U]) | mapFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def map[U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def map[U](map: java.lang.String, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def mapFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def mapFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def mapFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def median(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def min(): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min(all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min(all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def most(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def most(all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def most(all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def most(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def most(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def none(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def none(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def none(search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def none(search: searchFn, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def pop(): sugarLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def push(items: T*): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRightFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  @JSName("reduceRight")
  def reduceRight_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): sugarLib.sugarjsNs.SugarDefaultChainable[U] = js.native
  @JSName("reduce")
  def reduce_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): sugarLib.sugarjsNs.SugarDefaultChainable[U] = js.native
  def remove(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def remove(search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def removeAt(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def removeAt(start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def reverse(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sample(): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def sample(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def sample(num: scala.Double, remove: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def shift(): sugarLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def shuffle(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def slice(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def slice(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def slice(start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def some(search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some(search: T, context: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]) | searchFn
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some(
    search: (js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]) | searchFn,
    context: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def someFromIndex(startIndex: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def someFromIndex(startIndex: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def someFromIndex(startIndex: scala.Double, loop: scala.Boolean, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def sort(): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): sugarLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def sortBy(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sortBy(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sortBy(map: java.lang.String, desc: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sortBy(map: sortMapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sortBy(map: sortMapFn, desc: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def splice(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def subtract(item: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def subtract(item: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def sum(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def to(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def union(arr: js.Array[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def unique(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def unique(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def unique(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def unshift(items: T*): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def zip(args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
}

