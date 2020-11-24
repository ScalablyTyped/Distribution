package typings.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interval[T] extends js.Object {
  
  var constructor: IntervalConstructor[Double] = js.native
  
  def contains(value: T): Boolean = js.native
  
  def contiguousWith(interval: Interval[T]): Boolean = js.native
  
  var empty: Boolean = js.native
  
  def equalTo(interval: Interval[T]): Boolean = js.native
  
  var from: Endpoint[T] = js.native
  
  def fromComparator(a: Endpoint[T], b: Endpoint[T]): Double = js.native
  
  def hull(interval: Interval[T]): Interval[T] = js.native
  
  def intersection(interval: Interval[T]): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isSubsetOf(interval: Interval[T]): Boolean = js.native
  
  var to: Endpoint[T] = js.native
  
  def toComparator(a: Endpoint[T], b: Endpoint[T]): Double = js.native
  
  def unify(interval: Interval[T]): Interval[T] = js.native
}
object Interval {
  
  @scala.inline
  def apply[T](
    constructor: IntervalConstructor[Double],
    contains: T => Boolean,
    contiguousWith: Interval[T] => Boolean,
    empty: Boolean,
    equalTo: Interval[T] => Boolean,
    from: Endpoint[T],
    fromComparator: (Endpoint[T], Endpoint[T]) => Double,
    hull: Interval[T] => Interval[T],
    intersection: Interval[T] => Boolean,
    isEmpty: () => Boolean,
    isSubsetOf: Interval[T] => Boolean,
    to: Endpoint[T],
    toComparator: (Endpoint[T], Endpoint[T]) => Double,
    unify: Interval[T] => Interval[T]
  ): Interval[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), contiguousWith = js.Any.fromFunction1(contiguousWith), empty = empty.asInstanceOf[js.Any], equalTo = js.Any.fromFunction1(equalTo), from = from.asInstanceOf[js.Any], fromComparator = js.Any.fromFunction2(fromComparator), hull = js.Any.fromFunction1(hull), intersection = js.Any.fromFunction1(intersection), isEmpty = js.Any.fromFunction0(isEmpty), isSubsetOf = js.Any.fromFunction1(isSubsetOf), to = to.asInstanceOf[js.Any], toComparator = js.Any.fromFunction2(toComparator), unify = js.Any.fromFunction1(unify))
    __obj.asInstanceOf[Interval[T]]
  }
  
  @scala.inline
  implicit class IntervalOps[Self <: Interval[_], T] (val x: Self with Interval[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstructor(value: IntervalConstructor[Double]): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: T => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContiguousWith(value: Interval[T] => Boolean): Self = this.set("contiguousWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualTo(value: Interval[T] => Boolean): Self = this.set("equalTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrom(value: Endpoint[T]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = this.set("fromComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHull(value: Interval[T] => Interval[T]): Self = this.set("hull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersection(value: Interval[T] => Boolean): Self = this.set("intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSubsetOf(value: Interval[T] => Boolean): Self = this.set("isSubsetOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: Endpoint[T]): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = this.set("toComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnify(value: Interval[T] => Interval[T]): Self = this.set("unify", js.Any.fromFunction1(value))
  }
}
