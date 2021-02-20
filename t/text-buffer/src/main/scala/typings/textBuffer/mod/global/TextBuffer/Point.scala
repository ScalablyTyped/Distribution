package typings.textBuffer.mod.global.TextBuffer

import typings.textBuffer.anon.ReadonlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a point in a buffer in row/column coordinates. */
@js.native
trait Point extends StObject {
  
  /** A zero-indexed number representing the column of the Point. */
  var column: Double = js.native
  
  // Comparison
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): Double = js.native
  
  // Construction
  /** Returns a new Point with the same row and column. */
  def copy(): Point = js.native
  
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): ReadonlyPoint = js.native
  
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): Boolean = js.native
  
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a new Point with the row and column negated. */
  def negate(): Point = js.native
  
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: Double = js.native
  
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[Double, Double] = js.native
  
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[Double, Double] = js.native
  
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  def translate(other: PointCompatible): Point = js.native
  
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  def traverse(other: PointCompatible): Point = js.native
}
object Point {
  
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: () => Point,
    freeze: () => ReadonlyPoint,
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: () => Point,
    row: Double,
    serialize: () => js.Tuple2[Double, Double],
    toArray: () => js.Tuple2[Double, Double],
    translate: PointCompatible => Point,
    traverse: PointCompatible => Point
  ): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompare(value: PointCompatible => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: () => Point): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFreeze(value: () => ReadonlyPoint): Self = StObject.set(x, "freeze", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNegate(value: () => Point): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArray(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranslate(value: PointCompatible => Point): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraverse(value: PointCompatible => Point): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
  }
}
