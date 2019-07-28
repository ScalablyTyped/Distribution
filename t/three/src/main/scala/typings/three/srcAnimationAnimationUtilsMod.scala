package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationUtils", JSImport.Namespace)
@js.native
object srcAnimationAnimationUtilsMod extends js.Object {
  @JSName("AnimationUtils")
  @js.native
  object AnimationUtilsNs extends js.Object {
    def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
    def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
    def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
    def getKeyFrameOrder(times: Double): js.Array[Double] = js.native
    def isTypedArray(`object`: js.Any): Boolean = js.native
    def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
  }
  
}

