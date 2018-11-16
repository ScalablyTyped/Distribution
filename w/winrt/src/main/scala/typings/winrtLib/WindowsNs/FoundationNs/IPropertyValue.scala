package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPropertyValue extends js.Object {
  var isNumericScalar: scala.Boolean
  var `type`: PropertyType
  def getBoolean(): scala.Boolean
  def getBooleanArray(): js.Array[scala.Boolean]
  def getChar16(): java.lang.String
  def getChar16Array(): js.Array[java.lang.String]
  def getDateTime(): stdLib.Date
  def getDateTimeArray(): js.Array[stdLib.Date]
  def getDouble(): scala.Double
  def getDoubleArray(): stdLib.Float64Array
  def getGuid(): java.lang.String
  def getGuidArray(): js.Array[java.lang.String]
  def getInspectableArray(): js.Array[_]
  def getInt16(): scala.Double
  def getInt16Array(): stdLib.Int16Array
  def getInt32(): scala.Double
  def getInt32Array(): stdLib.Int32Array
  def getInt64(): scala.Double
  def getInt64Array(): js.Array[scala.Double]
  def getPoint(): Point
  def getPointArray(): js.Array[Point]
  def getRect(): Rect
  def getRectArray(): js.Array[Rect]
  def getSingle(): scala.Double
  def getSingleArray(): stdLib.Float32Array
  def getSize(): Size
  def getSizeArray(): js.Array[Size]
  def getString(): java.lang.String
  def getStringArray(): js.Array[java.lang.String]
  def getTimeSpan(): scala.Double
  def getTimeSpanArray(): js.Array[scala.Double]
  def getUInt16(): scala.Double
  def getUInt16Array(): stdLib.Uint16Array
  def getUInt32(): scala.Double
  def getUInt32Array(): stdLib.Uint32Array
  def getUInt64(): scala.Double
  def getUInt64Array(): js.Array[scala.Double]
  def getUInt8(): scala.Double
  def getUInt8Array(): stdLib.Uint8Array
}

