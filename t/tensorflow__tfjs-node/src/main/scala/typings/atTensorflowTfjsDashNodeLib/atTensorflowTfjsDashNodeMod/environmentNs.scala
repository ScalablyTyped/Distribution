package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "environment")
@js.native
object environmentNs extends js.Object {
  @js.native
  class Environment protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.environmentNs.Environment {
    def this(global: js.Any) = this()
  }
  
  var ENV: atTensorflowTfjsDashCoreLib.distEnvironmentMod.Environment = js.native
  def getQueryParams(queryString: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def setEnvironmentGlobal(environment: atTensorflowTfjsDashCoreLib.distEnvironmentMod.Environment): scala.Unit = js.native
}

