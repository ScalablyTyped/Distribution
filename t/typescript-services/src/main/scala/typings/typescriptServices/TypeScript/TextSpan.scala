package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpan extends StObject {
  
  var _length: js.Any
  
  var _start: js.Any
  
  def containsPosition(position: Double): Boolean
  
  def containsTextSpan(span: TextSpan): Boolean
  
  def end(): Double
  
  def intersection(span: TextSpan): TextSpan
  
  def intersectsWith(start: Double, length: Double): Boolean
  
  def intersectsWithPosition(position: Double): Boolean
  
  def intersectsWithTextSpan(span: TextSpan): Boolean
  
  def isEmpty(): Boolean
  
  def length(): Double
  
  def overlap(span: TextSpan): TextSpan
  
  def overlapsWith(span: TextSpan): Boolean
  
  def start(): Double
}
object TextSpan {
  
  @scala.inline
  def apply(
    _length: js.Any,
    _start: js.Any,
    containsPosition: Double => Boolean,
    containsTextSpan: TextSpan => Boolean,
    end: () => Double,
    intersection: TextSpan => TextSpan,
    intersectsWith: (Double, Double) => Boolean,
    intersectsWithPosition: Double => Boolean,
    intersectsWithTextSpan: TextSpan => Boolean,
    isEmpty: () => Boolean,
    length: () => Double,
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: () => Double
  ): TextSpan = {
    val __obj = js.Dynamic.literal(_length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = js.Any.fromFunction0(end), intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[TextSpan]
  }
  
  @scala.inline
  implicit class TextSpanMutableBuilder[Self <: TextSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsPosition(value: Double => Boolean): Self = StObject.set(x, "containsPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsTextSpan(value: TextSpan => Boolean): Self = StObject.set(x, "containsTextSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersection(value: TextSpan => TextSpan): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsWith(value: (Double, Double) => Boolean): Self = StObject.set(x, "intersectsWith", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIntersectsWithPosition(value: Double => Boolean): Self = StObject.set(x, "intersectsWithPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsWithTextSpan(value: TextSpan => Boolean): Self = StObject.set(x, "intersectsWithTextSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlap(value: TextSpan => TextSpan): Self = StObject.set(x, "overlap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlapsWith(value: TextSpan => Boolean): Self = StObject.set(x, "overlapsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_length(value: js.Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: js.Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
