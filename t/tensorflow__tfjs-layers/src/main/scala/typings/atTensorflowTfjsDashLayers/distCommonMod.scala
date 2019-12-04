package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/common", JSImport.Namespace)
@js.native
object distCommonMod extends js.Object {
  def checkDataFormat(): Unit = js.native
  def checkDataFormat(value: String): Unit = js.native
  def checkPaddingMode(): Unit = js.native
  def checkPaddingMode(value: String): Unit = js.native
  def checkPoolMode(): Unit = js.native
  def checkPoolMode(value: String): Unit = js.native
  def getScopedTensorName(tensorName: String): String = js.native
  def getUniqueTensorName(scopedName: String): String = js.native
  def isValidTensorName(name: String): Boolean = js.native
  def nameScope[T](name: String, fn: js.Function0[T]): T = js.native
}

