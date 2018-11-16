package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-node", "TSError")
@js.native
class TSError protected ()
  extends makeDashErrorLib.makeDashErrorMod.BaseError {
  def this(diagnosticText: java.lang.String, diagnosticCodes: js.Array[scala.Double]) = this()
  var diagnosticCodes: js.Array[scala.Double] = js.native
  var diagnosticText: java.lang.String = js.native
}

