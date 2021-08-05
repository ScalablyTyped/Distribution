package typings.valiant

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("valiant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInterval[T](): IntervalConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")().asInstanceOf[IntervalConstructor[T]]
  inline def createInterval[T](compareValues: js.Function2[/* a */ T, /* b */ T, Double]): IntervalConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")(compareValues.asInstanceOf[js.Any]).asInstanceOf[IntervalConstructor[T]]
  
  trait Endpoint[T] extends StObject {
    
    var finite: Boolean
    
    var inclusive: Boolean
    
    var value: T
  }
  object Endpoint {
    
    inline def apply[T](finite: Boolean, inclusive: Boolean, value: T): Endpoint[T] = {
      val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint[T]]
    }
    
    extension [Self <: Endpoint[?], T](x: Self & Endpoint[T]) {
      
      inline def setFinite(value: Boolean): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interval[T] extends StObject {
    
    var constructor: IntervalConstructor[Double]
    
    def contains(value: T): Boolean
    
    def contiguousWith(interval: Interval[T]): Boolean
    
    var empty: Boolean
    
    def equalTo(interval: Interval[T]): Boolean
    
    var from: Endpoint[T]
    
    def fromComparator(a: Endpoint[T], b: Endpoint[T]): Double
    
    def hull(interval: Interval[T]): Interval[T]
    
    def intersection(interval: Interval[T]): Boolean
    
    def isEmpty(): Boolean
    
    def isSubsetOf(interval: Interval[T]): Boolean
    
    var to: Endpoint[T]
    
    def toComparator(a: Endpoint[T], b: Endpoint[T]): Double
    
    def unify(interval: Interval[T]): Interval[T]
  }
  object Interval {
    
    inline def apply[T](
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
    
    extension [Self <: Interval[?], T](x: Self & Interval[T]) {
      
      inline def setConstructor(value: IntervalConstructor[Double]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContiguousWith(value: Interval[T] => Boolean): Self = StObject.set(x, "contiguousWith", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEqualTo(value: Interval[T] => Boolean): Self = StObject.set(x, "equalTo", js.Any.fromFunction1(value))
      
      inline def setFrom(value: Endpoint[T]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = StObject.set(x, "fromComparator", js.Any.fromFunction2(value))
      
      inline def setHull(value: Interval[T] => Interval[T]): Self = StObject.set(x, "hull", js.Any.fromFunction1(value))
      
      inline def setIntersection(value: Interval[T] => Boolean): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsSubsetOf(value: Interval[T] => Boolean): Self = StObject.set(x, "isSubsetOf", js.Any.fromFunction1(value))
      
      inline def setTo(value: Endpoint[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToComparator(value: (Endpoint[T], Endpoint[T]) => Double): Self = StObject.set(x, "toComparator", js.Any.fromFunction2(value))
      
      inline def setUnify(value: Interval[T] => Interval[T]): Self = StObject.set(x, "unify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IntervalConstructor[T]
    extends StObject
       with Instantiable2[/* from */ Endpoint[T], /* to */ Endpoint[T], Interval[T]] {
    
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
