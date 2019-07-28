package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisionFromXmlDocumentResults extends js.Object {
  var allElementsProvisioned: Boolean
  var provisionResultsXml: String
}

object IProvisionFromXmlDocumentResults {
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): IProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned, provisionResultsXml = provisionResultsXml)
  
    __obj.asInstanceOf[IProvisionFromXmlDocumentResults]
  }
}

