package typings
package atTensorflowTfjsDashConverterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/custom_op/register", JSImport.Namespace)
@js.native
object distSrcOperationsCustomUnderscoreOpRegisterMod extends js.Object {
  def deregisterOp(name: java.lang.String): scala.Unit = js.native
  def getRegisteredOp(name: java.lang.String): atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod.OpMapper = js.native
  def registerOp(
    name: java.lang.String,
    opFunc: atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod.OpExecutor
  ): scala.Unit = js.native
}

