package typings.valiant

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("valiant", "createInterval")
  @js.native
  def createInterval[T](): IntervalConstructor[T] = js.native
  @JSImport("valiant", "createInterval")
  @js.native
  def createInterval[T](compareValues: js.Function2[/* a */ T, /* b */ T, Double]): IntervalConstructor[T] = js.native
  
  @js.native
  trait Endpoint[T] extends StObject {
    
    var finite: Boolean = js.native
    
    var inclusive: Boolean = js.native
    
    var value: T = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply[T](finite: Boolean, inclusive: Boolean, value: T): Endpoint[T] = {
      val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint[T]]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint[_], T] (val x: Self with Endpoint[T]) extends AnyVal {
      
      @scala.inline
      def setFinite(value: Boolean): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Interval[T] extends StObject {
    
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
    implicit class IntervalMutableBuilder[Self <: Interval[_], T] (val x: Self with Interval[T]) extends AnyVal {
      
      @scala.inline
      def setConstructor(value: IntervalConstructor[Double]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContiguousWith(value: Interval[T] => Boolean): Self = StObject.set(x, "contiguousWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEqualTo(value: Interval[T] => Boolean): Self = StObject.set(x, "equalTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFrom(value: Endpoint[T]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = StObject.set(x, "fromComparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHull(value: Interval[T] => Interval[T]): Self = StObject.set(x, "hull", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntersection(value: Interval[T] => Boolean): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSubsetOf(value: Interval[T] => Boolean): Self = StObject.set(x, "isSubsetOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTo(value: Endpoint[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = StObject.set(x, "toComparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnify(value: Interval[T] => Interval[T]): Self = StObject.set(x, "unify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IntervalConstructor[T] extends Instantiable2[/* from */ Endpoint[T], /* to */ Endpoint[T], Interval[T]] {
    
    def adjacentEndpoint(endpoint: Endpoint[T]): Endpoint[T] = js.native
    
    def compareEndpoints(a: Endpoint[T], b: Endpoint[T]): Double = js.native
    
    def compareValues(a: T, b: T): Double = js.native
    
    var empty: Interval[T] = js.native
    
    def excEnd(value: T): Endpoint[T] = js.native
    
    def exclusiveEndpoint(value: T): Endpoint[T] = js.native
    
    def incEnd(value: T): Endpoint[T] = js.native
    
    def inclusiveEndpoint(value: T): Endpoint[T] = js.native
    
    var negInf: Endpoint[T] = js.native
    
    var negativeInfinity: Endpoint[T] = js.native
    
    var posInf: Endpoint[T] = js.native
    
    var positiveInfinity: Endpoint[T] = js.native
    
    def singleton(value: T): Interval[T] = js.native
    
    var whole: Interval[T] = js.native
  }
}
