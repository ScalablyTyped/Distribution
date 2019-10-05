package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiXMLToPDF")
@js.native
object nlapiXMLToPDF extends js.Object {
  /**
    * Generate a PDF from XML using the BFO report writer (see http://big.faceless.org/products/report/).
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string} input string containing BFO compliant XHTML
    * @return {nlobjFile}
    *
    * @since 2009.1
    * @param input
    * @return
    */
  def apply(input: String): js.Any = js.native
}

