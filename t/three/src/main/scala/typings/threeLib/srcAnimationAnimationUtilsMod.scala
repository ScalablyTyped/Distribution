package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationUtils", JSImport.Namespace)
@js.native
object srcAnimationAnimationUtilsMod extends js.Object {
  @JSName("AnimationUtils")
  @js.native
  object AnimationUtilsNs extends js.Object {
    def arraySlice(array: js.Any, from: scala.Double, to: scala.Double): js.Any = js.native
    def convertArray(array: js.Any, `type`: js.Any, forceClone: scala.Boolean): js.Any = js.native
    def flattenJSON(
      jsonKeys: js.Array[java.lang.String],
      times: js.Array[_],
      values: js.Array[_],
      valuePropertyName: java.lang.String
    ): scala.Unit = js.native
    def getKeyFrameOrder(times: scala.Double): js.Array[scala.Double] = js.native
    def isTypedArray(`object`: js.Any): scala.Boolean = js.native
    def sortedArray(values: js.Array[_], stride: scala.Double, order: js.Array[scala.Double]): js.Array[_] = js.native
  }
  
}

