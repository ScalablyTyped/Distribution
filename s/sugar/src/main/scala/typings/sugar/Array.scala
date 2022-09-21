package typings.sugar

import typings.sugar.sugarjs.Array.mapFn
import typings.sugar.sugarjs.Array.searchFn
import typings.sugar.sugarjs.Array.sortMapFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends StObject {
  
  def add(item: T): Array[T] = js.native
  def add(item: T, index: Double): Array[T] = js.native
  def add(item: Array[T]): Array[T] = js.native
  def add(item: Array[T], index: Double): Array[T] = js.native
  
  def append(item: T): Array[T] = js.native
  def append(item: T, index: Double): Array[T] = js.native
  def append(item: Array[T]): Array[T] = js.native
  def append(item: Array[T], index: Double): Array[T] = js.native
  
  def at(index: Double): T = js.native
  def at(index: Double, loop: Boolean): T = js.native
  def at(index: Array[Double]): T = js.native
  def at(index: Array[Double], loop: Boolean): T = js.native
  
  def average[U](): Double = js.native
  def average[U](map: java.lang.String): Double = js.native
  def average[U](map: mapFn[T, U]): Double = js.native
  
  def compact(): Array[T] = js.native
  def compact(all: Boolean): Array[T] = js.native
  
  def count(search: T): Double = js.native
  def count(search: T, context: Any): Double = js.native
  def count(search: searchFn[T]): Double = js.native
  def count(search: searchFn[T], context: Any): Double = js.native
  
  def every(search: T): Boolean = js.native
  def every(search: T, context: Any): Boolean = js.native
  def every(search: searchFn[T]): Boolean = js.native
  def every(search: searchFn[T], context: Any): Boolean = js.native
  
  def everyFromIndex(startIndex: Double, args: Any*): T = js.native
  def everyFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def everyFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def exclude(search: T): Array[T] = js.native
  def exclude(search: searchFn[T]): Array[T] = js.native
  
  def filter(search: T): Array[T] = js.native
  def filter(search: T, context: Any): Array[T] = js.native
  def filter(search: searchFn[T]): Array[T] = js.native
  def filter(search: searchFn[T], context: Any): Array[T] = js.native
  
  def filterFromIndex(startIndex: Double, args: Any*): T = js.native
  def filterFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def filterFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def find(search: T): T = js.native
  def find(search: T, context: Any): T = js.native
  def find(search: searchFn[T]): T = js.native
  def find(search: searchFn[T], context: Any): T = js.native
  
  def findFromIndex(startIndex: Double, args: Any*): T = js.native
  def findFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def findFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def findIndex(search: T): Double = js.native
  def findIndex(search: T, context: Any): Double = js.native
  def findIndex(search: searchFn[T]): Double = js.native
  def findIndex(search: searchFn[T], context: Any): Double = js.native
  
  def findIndexFromIndex(startIndex: Double, args: Any*): T = js.native
  def findIndexFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def findIndexFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def first(): T = js.native
  def first(num: Double): T = js.native
  
  def flatten(): Array[T] = js.native
  def flatten(limit: Double): Array[T] = js.native
  
  def forEachFromIndex(startIndex: Double, args: Any*): T = js.native
  def forEachFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def forEachFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def from(index: Double): Array[T] = js.native
  
  def groupBy[U](map: java.lang.String): js.Object = js.native
  def groupBy[U](
    map: java.lang.String,
    groupFn: js.Function3[/* arr */ Array[T], /* key */ java.lang.String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  def groupBy[U](map: mapFn[T, U]): js.Object = js.native
  def groupBy[U](
    map: mapFn[T, U],
    groupFn: js.Function3[/* arr */ Array[T], /* key */ java.lang.String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  
  def inGroups(num: Double): Array[T] = js.native
  def inGroups(num: Double, padding: Any): Array[T] = js.native
  
  def inGroupsOf(num: Double): Array[T] = js.native
  def inGroupsOf(num: Double, padding: Any): Array[T] = js.native
  
  def insert(item: T): Array[T] = js.native
  def insert(item: T, index: Double): Array[T] = js.native
  def insert(item: Array[T]): Array[T] = js.native
  def insert(item: Array[T], index: Double): Array[T] = js.native
  
  def intersect(arr: Array[T]): Array[T] = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isEqual(arr: Array[T]): Boolean = js.native
  
  def last(): T = js.native
  def last(num: Double): T = js.native
  
  def least[U](): Array[T] = js.native
  def least[U](all: Boolean): Array[T] = js.native
  def least[U](all: Boolean, map: java.lang.String): Array[T] = js.native
  def least[U](all: Boolean, map: mapFn[T, U]): Array[T] = js.native
  def least[U](all: Unit, map: java.lang.String): Array[T] = js.native
  def least[U](all: Unit, map: mapFn[T, U]): Array[T] = js.native
  def least[U](map: java.lang.String): Array[T] = js.native
  def least[U](map: mapFn[T, U]): Array[T] = js.native
  
  def map[U](map: java.lang.String): Array[U] = js.native
  def map[U](map: java.lang.String, context: Any): Array[U] = js.native
  def map[U](map: mapFn[T, U]): Array[U] = js.native
  def map[U](map: mapFn[T, U], context: Any): Array[U] = js.native
  
  def mapFromIndex(startIndex: Double, args: Any*): T = js.native
  def mapFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def mapFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def max[U](): T = js.native
  def max[U](all: Boolean): T = js.native
  def max[U](all: Boolean, map: java.lang.String): T = js.native
  def max[U](all: Boolean, map: mapFn[T, U]): T = js.native
  def max[U](all: Unit, map: java.lang.String): T = js.native
  def max[U](all: Unit, map: mapFn[T, U]): T = js.native
  def max[U](map: java.lang.String): T = js.native
  def max[U](map: mapFn[T, U]): T = js.native
  
  def median[U](): Double = js.native
  def median[U](map: java.lang.String): Double = js.native
  def median[U](map: mapFn[T, U]): Double = js.native
  
  def min[U](): T = js.native
  def min[U](all: Boolean): T = js.native
  def min[U](all: Boolean, map: java.lang.String): T = js.native
  def min[U](all: Boolean, map: mapFn[T, U]): T = js.native
  def min[U](all: Unit, map: java.lang.String): T = js.native
  def min[U](all: Unit, map: mapFn[T, U]): T = js.native
  def min[U](map: java.lang.String): T = js.native
  def min[U](map: mapFn[T, U]): T = js.native
  
  def most[U](): Array[T] = js.native
  def most[U](all: Boolean): Array[T] = js.native
  def most[U](all: Boolean, map: java.lang.String): Array[T] = js.native
  def most[U](all: Boolean, map: mapFn[T, U]): Array[T] = js.native
  def most[U](all: Unit, map: java.lang.String): Array[T] = js.native
  def most[U](all: Unit, map: mapFn[T, U]): Array[T] = js.native
  def most[U](map: java.lang.String): Array[T] = js.native
  def most[U](map: mapFn[T, U]): Array[T] = js.native
  
  def none(search: T): Boolean = js.native
  def none(search: T, context: Any): Boolean = js.native
  def none(search: searchFn[T]): Boolean = js.native
  def none(search: searchFn[T], context: Any): Boolean = js.native
  
  def reduceFromIndex(startIndex: Double, args: Any*): T = js.native
  def reduceFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def reduceFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def reduceRightFromIndex(startIndex: Double, args: Any*): T = js.native
  def reduceRightFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def reduceRightFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def remove(search: T): Array[T] = js.native
  def remove(search: searchFn[T]): Array[T] = js.native
  
  def removeAt(start: Double): Array[T] = js.native
  def removeAt(start: Double, end: Double): Array[T] = js.native
  
  def sample(): T = js.native
  def sample(num: Double): T = js.native
  def sample(num: Double, remove: Boolean): T = js.native
  def sample(num: Unit, remove: Boolean): T = js.native
  
  def shuffle(): Array[T] = js.native
  
  def some(search: T): Boolean = js.native
  def some(search: T, context: Any): Boolean = js.native
  def some(search: searchFn[T]): Boolean = js.native
  def some(search: searchFn[T], context: Any): Boolean = js.native
  
  def someFromIndex(startIndex: Double, args: Any*): T = js.native
  def someFromIndex(startIndex: Double, loop: Boolean, args: Any*): T = js.native
  def someFromIndex(startIndex: Double, loop: Unit, args: Any*): T = js.native
  
  def sortBy[U](): Array[T] = js.native
  def sortBy[U](map: java.lang.String): Array[T] = js.native
  def sortBy[U](map: java.lang.String, desc: Boolean): Array[T] = js.native
  def sortBy[U](map: Unit, desc: Boolean): Array[T] = js.native
  def sortBy[U](map: sortMapFn[T, U]): Array[T] = js.native
  def sortBy[U](map: sortMapFn[T, U], desc: Boolean): Array[T] = js.native
  
  def subtract(item: T): Array[T] = js.native
  def subtract(item: Array[T]): Array[T] = js.native
  
  def sum[U](): Double = js.native
  def sum[U](map: java.lang.String): Double = js.native
  def sum[U](map: mapFn[T, U]): Double = js.native
  
  def to(index: Double): Array[T] = js.native
  
  def union(arr: Array[T]): Array[T] = js.native
  
  def unique[U](): Array[T] = js.native
  def unique[U](map: java.lang.String): Array[T] = js.native
  def unique[U](map: mapFn[T, U]): Array[T] = js.native
  
  def zip(args: Any*): Array[T] = js.native
}
