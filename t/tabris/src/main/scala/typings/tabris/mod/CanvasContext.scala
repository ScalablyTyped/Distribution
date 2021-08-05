package typings.tabris.mod

import typings.tabris.tabrisStrings.alphabetic
import typings.tabris.tabrisStrings.bevel
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.butt
import typings.tabris.tabrisStrings.center
import typings.tabris.tabrisStrings.end
import typings.tabris.tabrisStrings.hanging
import typings.tabris.tabrisStrings.ideographic
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.middle
import typings.tabris.tabrisStrings.miter
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.round
import typings.tabris.tabrisStrings.square
import typings.tabris.tabrisStrings.start
import typings.tabris.tabrisStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "CanvasContext")
@js.native
/* private */ class CanvasContext () extends StObject {
  
  /**
    * Adds an arc to the path which is centered at *(x, y)* position with radius *r* starting at
    * *startAngle* and ending at *endAngle* going in the given direction by *anticlockwise* (defaulting to
    * clockwise).
    * @param x The x coordinate of the arc's center.
    * @param y The y coordinate of the arc's center.
    * @param radius The arc's radius.
    * @param startAngle The angle in radians at which the arc starts, measured clockwise from the positive x axis.
    * @param endAngle The angle in radians at which the arc ends, measured clockwise from the positive x axis.
    * @param anticlockwise if true, causes the arc to be drawn counter-clockwise between the two angles.
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
  
  /**
    * Starts a new path by emptying the list of sub-paths.
    */
  def beginPath(): Unit = js.native
  
  /**
    * Adds a cubic Bézier curve to the path. The starting point is the last point in the current path.
    * @param cp1x The x axis of the coordinate for the first control point.
    * @param cp1y The y axis of the coordinate for the first control point.
    * @param cp2x The x axis of the coordinate for the second control point.
    * @param cp2y The y axis of the coordinate for the second control point.
    * @param x The x axis of the coordinate for the end point.
    * @param y The y axis of the coordinate for the end point.
    */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * Sets all pixels in the rectangle defined by starting point *(x, y)* and size *(width, height)* to
    * transparent, erasing any previously drawn content.
    * @param x The x axis of the rectangle's upper-left corner.
    * @param y The y axis of the rectangle's upper-left corner.
    * @param width The rectangle's width.
    * @param height The rectangles height.
    */
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Adds a straight line from the current point to the start of the current sub-path.
    */
  def closePath(): Unit = js.native
  
  /**
    * creates a new, blank ImageData object with the same dimensions as the specified existing ImageData
    * object. All of the pixels in the new object are transparent black.
    * @param imageData An existing ImageData object from which to copy the width and height.
    */
  def createImageData(imageData: typings.tabris.ImageData): typings.tabris.ImageData = js.native
  /**
    * creates a new, blank ImageData object with the specified dimensions. All of the pixels in the new
    * object are transparent black.
    * @param width The width of the new ImageData object.
    * @param height The height of the new ImageData object.
    */
  def createImageData(width: Double, height: Double): typings.tabris.ImageData = js.native
  
  /**
    * Draws the entire given ImageBitmap at the given coordinates (dx, dy) in its natural size.
    * @param image An ImageBitmap object that has not been closed yet.
    * @param dx Destination x-coordinate of the upper-left corner of the image
    * @param dy Destination y-coordinate of the upper-left corner of the image
    */
  def drawImage(image: ImageBitmap, dx: Double, dy: Double): Unit = js.native
  /**
    * Draws the entire given ImageBitmap at the given coordinates (dx, dy) in the given dimension (dWidth,
    * dHeight).
    * @param image An ImageBitmap object that has not been closed yet.
    * @param dx Destination x-coordinate of the upper-left corner of the image
    * @param dy Destination y-coordinate of the upper-left corner of the image
    * @param dWidth Destination width of the image
    * @param dHeight Destination height of the image
    */
  def drawImage(image: ImageBitmap, dx: Double, dy: Double, dWidth: Double, dHeight: Double): Unit = js.native
  /**
    * Draws a section (sx, sy, sWidth, sHeight) of the given ImageBitmap at the given coordinates (dx, dy)
    * in the given dimension (dWidth, dHeight).
    * @param image An ImageBitmap object that has not been closed yet.
    * @param sx Source x-coordinate of the upper-left corner of the image
    * @param sy Source y-coordinate of the upper-left corner of the image
    * @param sWidth Source width of the image
    * @param sHeight Source height of the image
    * @param dx Destination x-coordinate of the upper-left corner of the image
    * @param dy Destination y-coordinate of the upper-left corner of the image
    * @param dWidth Destination width of the image
    * @param dHeight Destination height of the image
    */
  def drawImage(
    image: ImageBitmap,
    sx: Double,
    sy: Double,
    sWidth: Double,
    sHeight: Double,
    dx: Double,
    dy: Double,
    dWidth: Double,
    dHeight: Double
  ): Unit = js.native
  
  /**
    * Fills the current or path with the current fill style.
    */
  def fill(): Unit = js.native
  
  /**
    * draws a filled rectangle at *(x, y)* position whose size is determined by *width* and *height*. and
    * whose color is determined by the fillStyle attribute.
    * @param x The x axis of the rectangle's upper-left corner.
    * @param y The y axis of the rectangle's upper-left corner.
    * @param width The rectangle's width.
    * @param height The rectangles height.
    */
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Specifies the color to use inside shapes.
    */
  var fillStyle: ColorValue = js.native
  
  /**
    * Fills a given text at the given *(x, y)* position using the current *textAlign* and *textBaseline*
    * values.
    * @param text The text to render.
    * @param x The x axis of the coordinate for the text starting point.
    * @param y The y axis of the coordinate for the text starting point.
    */
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  
  /**
    * Specifies the current text style being used when drawing text.
    */
  var font: FontValue = js.native
  
  /**
    * Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted
    * by the given rectangle.
    * @param x The x axis of the rectangle's upper-left corner.
    * @param y The y axis of the rectangle's upper-left corner.
    * @param width The rectangle's width.
    * @param height The rectangle's height.
    */
  def getImageData(x: Double, y: Double, width: Double, height: Double): typings.tabris.ImageData = js.native
  
  /**
    * Determines how the end points of every line are drawn.
    */
  var lineCap: butt | round | square = js.native
  
  /**
    * Determines how two connecting segments in a shape are joined together.
    */
  var lineJoin: bevel | miter | round = js.native
  
  /**
    * Connects the last point in the sub-path to the *(x, y)* coordinates with a straight line.
    * @param x The x axis of the coordinate for the end of the line.
    * @param y The y axis of the coordinate for the end of the line.
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /**
    * The thickness of lines in space units.
    */
  var lineWidth: Double = js.native
  
  /**
    * Moves the starting point of a new sub-path to the *(x, y)* coordinates.
    * @param x The x axis of the point.
    * @param y The y axis of the point.
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /**
    * Paints data from the given ImageData object onto the bitmap at coordinates (x, y).
    * @param imageData An ImageData object containing the array of pixel values.
    * @param x x-coordinate of the upper-left corner of the image data rectangle
    * @param y y-coordinate of the upper-left corner of the image data rectangle
    */
  def putImageData(imageData: typings.tabris.ImageData, x: Double, y: Double): Unit = js.native
  
  /**
    * Adds a quadratic Bézier curve to the path. The starting point is the last point in the current path.
    * @param cpx The x axis of the coordinate for the control point.
    * @param cpy The y axis of the coordinate for the control point.
    * @param x The x axis of the coordinate for the end point.
    * @param y The y axis of the coordinate for the end point.
    */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * Creates a path for a rectangle with the top-left corner at *(x, y)*
    * @param x The x axis of the rectangle's upper-left corner.
    * @param y The y axis of the rectangle's upper-left corner.
    * @param width The rectangle's width.
    * @param height The rectangles height.
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Restores the most recently saved canvas state by popping the top entry in the drawing state stack.
    */
  def restore(): Unit = js.native
  
  /**
    * Adds a rotation to the transformation matrix.
    * @param angle  The angle to rotate clockwise in radians.
    */
  def rotate(angle: Double): Unit = js.native
  
  /**
    * Saves the entire state of the canvas by pushing the current state onto a stack.
    */
  def save(): Unit = js.native
  
  /**
    * Adds a scaling transformation to the canvas units by x horizontally and by y vertically.
    * @param x Scaling factor in the horizontal direction.
    * @param y Scaling factor in the vertical direction.
    */
  def scale(x: Double, y: Double): Unit = js.native
  
  /**
    * resets (overrides) the current transformation to the identity matrix and then invokes a
    * transformation described by the arguments of this method. The matrix has the following format:
    * [[a, c, e],
    * [b, d, f],
    * [0, 0, 1]]
    * @param a Horizontal scaling.
    * @param b Horizontal skewing.
    * @param c Vertical skewing.
    * @param d Vertical scaling.
    * @param e Horizontal moving.
    * @param f Vertical moving.
    */
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  /**
    * Strokes the current path with the current stroke style.
    */
  def stroke(): Unit = js.native
  
  /**
    * draws the outline of a rectangle at *(x, y)* position whose size is determined by *width* and
    * *height* using the current stroke style.
    * @param x The x axis of the rectangle's upper-left corner.
    * @param y The y axis of the rectangle's upper-left corner.
    * @param width The rectangle's width.
    * @param height The rectangles height.
    */
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Specifies the color to use for the lines around shapes.
    */
  var strokeStyle: ColorValue = js.native
  
  /**
    * Strokes a given text at the given *(x, y)* position using the current *textAlign* and *textBaseline*
    * values.
    * @param text The text to render.
    * @param x The x axis of the coordinate for the text starting point.
    * @param y The y axis of the coordinate for the text starting point.
    */
  def strokeText(text: String, x: Double, y: Double): Unit = js.native
  
  /**
    * Specifies the current text alignment being used when drawing text.
    */
  var textAlign: center | end | left | right | start = js.native
  
  /**
    * Specifies the current text baseline being used when drawing text.
    */
  var textBaseline: alphabetic | bottom | hanging | ideographic | middle | top = js.native
  
  /**
    * Multiplies the current transformation with the matrix described by the arguments of this method. The
    * matrix has the following format:
    * [[a, c, e],
    * [b, d, f],
    * [0, 0, 1]]
    * @param a Horizontal scaling.
    * @param b Horizontal skewing.
    * @param c Vertical skewing.
    * @param d Vertical scaling.
    * @param e Horizontal moving.
    * @param f Vertical moving.
    */
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  /**
    * Adds a translation transformation by moving the canvas and its origin *x* horizontally and *y*
    * vertically on the grid.
    * @param x The distance to move in the horizontal direction.
    * @param y The distance to move in the vertical direction.
    */
  def translate(x: Double, y: Double): Unit = js.native
}
