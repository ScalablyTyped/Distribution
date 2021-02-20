package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.OpExecutor
import typings.tensorflowTfjsConverter.operationsTypesMod.OpMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/register", "deregisterOp")
  @js.native
  def deregisterOp(name: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/register", "getRegisteredOp")
  @js.native
  def getRegisteredOp(name: String): OpMapper = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/register", "registerOp")
  @js.native
  def registerOp(name: String, opFunc: OpExecutor): Unit = js.native
}
