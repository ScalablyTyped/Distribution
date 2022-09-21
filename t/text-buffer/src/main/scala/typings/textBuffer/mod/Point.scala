package typings.textBuffer.mod

import typings.textBuffer.anon.ReadonlyPoint
import typings.textBuffer.mod.global.TextBuffer.PointCompatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("text-buffer", "Point")
@js.native
/** Construct a Point object */
open class Point ()
  extends StObject
     with typings.textBuffer.mod.global.TextBuffer.Point {
  def this(row: Double) = this()
  def this(row: Double, column: Double) = this()
  def this(row: Unit, column: Double) = this()
  
  /** A zero-indexed number representing the column of the Point. */
  /* CompleteClass */
  var column: Double = js.native
  
  // Comparison
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  /* CompleteClass */
  override def compare(other: PointCompatible): Double = js.native
  
  // Construction
  /** Returns a new Point with the same row and column. */
  /* CompleteClass */
  override def copy(): typings.textBuffer.mod.global.TextBuffer.Point = js.native
  
  // Operations
  /** Makes this point immutable and returns itself. */
  /* CompleteClass */
  override def freeze(): ReadonlyPoint = js.native
  
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  /* CompleteClass */
  override def isEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a Boolean indicating whether this point follows the given Point. */
  /* CompleteClass */
  override def isGreaterThan(other: PointCompatible): Boolean = js.native
  
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  /* CompleteClass */
  override def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  /* CompleteClass */
  override def isLessThan(other: PointCompatible): Boolean = js.native
  
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  /* CompleteClass */
  override def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  
  /** Returns a new Point with the row and column negated. */
  /* CompleteClass */
  override def negate(): typings.textBuffer.mod.global.TextBuffer.Point = js.native
  
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  /* CompleteClass */
  var row: Double = js.native
  
  /** Returns an array of this point's row and column. */
  /* CompleteClass */
  override def serialize(): js.Tuple2[Double, Double] = js.native
  
  /** Returns an array of this point's row and column. */
  /* CompleteClass */
  override def toArray(): js.Tuple2[Double, Double] = js.native
  
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  /* CompleteClass */
  override def translate(other: PointCompatible): typings.textBuffer.mod.global.TextBuffer.Point = js.native
  
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  /* CompleteClass */
  override def traverse(other: PointCompatible): typings.textBuffer.mod.global.TextBuffer.Point = js.native
}
