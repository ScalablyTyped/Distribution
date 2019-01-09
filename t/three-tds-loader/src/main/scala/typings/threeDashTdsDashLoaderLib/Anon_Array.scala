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

