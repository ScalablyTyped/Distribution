package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  def arraySlice(array: js.Any, from: scala.Double, to: scala.Double): js.Any
  def convertArray(array: js.Any, `type`: js.Any, forceClone: scala.Boolean): js.Any
  def flattenJSON(
    jsonKeys: js.Array[java.lang.String],
    times: js.Array[_],
    values: js.Array[_],
    valuePropertyName: java.lang.String
  ): scala.Unit
  def getKeyFrameOrder(times: scala.Double): js.Array[scala.Double]
  def isTypedArray(`object`: js.Any): scala.Boolean
  def sortedArray(values: js.Array[_], stride: scala.Double, order: js.Array[scala.Double]): js.Array[_]
}

object Anon_Array {
  @scala.inline
  def apply(
    arraySlice: (js.Any, scala.Double, scala.Double) => js.Any,
    convertArray: (js.Any, js.Any, scala.Boolean) => js.Any,
    flattenJSON: (js.Array[java.lang.String], js.Array[_], js.Array[_], java.lang.String) => scala.Unit,
    getKeyFrameOrder: scala.Double => js.Array[scala.Double],
    isTypedArray: js.Any => scala.Boolean,
    sortedArray: (js.Array[_], scala.Double, js.Array[scala.Double]) => js.Array[_]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(arraySlice = js.Any.fromFunction3(arraySlice), convertArray = js.Any.fromFunction3(convertArray), flattenJSON = js.Any.fromFunction4(flattenJSON), getKeyFrameOrder = js.Any.fromFunction1(getKeyFrameOrder), isTypedArray = js.Any.fromFunction1(isTypedArray), sortedArray = js.Any.fromFunction3(sortedArray))
  
    __obj.asInstanceOf[Anon_Array]
  }
}

