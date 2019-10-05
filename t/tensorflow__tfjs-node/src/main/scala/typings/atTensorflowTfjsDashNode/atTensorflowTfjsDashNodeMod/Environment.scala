package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "Environment")
@js.native
class Environment protected ()
  extends typings.atTensorflowTfjs.atTensorflowTfjsMod.Environment {
  def this(global: js.Any) = this()
}

@JSImport("@tensorflow/tfjs-node", "environment")
@js.native
object environment extends js.Object {
  @js.native
  class Environment protected ()
    extends typings.atTensorflowTfjs.atTensorflowTfjsMod.environment.Environment {
    def this(global: js.Any) = this()
  }
  
  var ENV: typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment = js.native
  def getQueryParams(queryString: String): StringDictionary[String] = js.native
  def setEnvironmentGlobal(environment: typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment): Unit = js.native
}

