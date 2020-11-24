package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.OpExecutor
import typings.tensorflowTfjsConverter.operationsTypesMod.OpMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  
  def deregisterOp(name: String): Unit = js.native
  
  def getRegisteredOp(name: String): OpMapper = js.native
  
  def registerOp(name: String, opFunc: OpExecutor): Unit = js.native
}
