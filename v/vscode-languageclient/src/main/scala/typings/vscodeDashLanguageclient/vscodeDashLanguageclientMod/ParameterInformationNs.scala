package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ParameterInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ParameterInformation")
@js.native
object ParameterInformationNs extends js.Object {
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def create(label: String): ParameterInformation = js.native
  def create(label: String, documentation: String): ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double]): ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): ParameterInformation = js.native
}

