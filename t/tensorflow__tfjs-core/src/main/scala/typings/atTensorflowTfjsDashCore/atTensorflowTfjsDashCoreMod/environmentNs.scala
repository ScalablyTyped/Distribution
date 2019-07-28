package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "environment")
@js.native
object environmentNs extends js.Object {
  @js.native
  class Environment protected ()
    extends typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment {
    def this(global: js.Any) = this()
  }
  
  var ENV: typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment = js.native
  def getQueryParams(queryString: String): StringDictionary[String] = js.native
  def setEnvironmentGlobal(environment: typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment): Unit = js.native
}

