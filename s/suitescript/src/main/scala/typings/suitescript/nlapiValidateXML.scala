package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiValidateXML")
@js.native
object nlapiValidateXML extends js.Object {
  /**
    * Validate that a given XML document conforms to a given XML schema. XML Schema Definition (XSD) is the expected schema format.
    *
    * @param {document} xmlDocument xml to validate
    * @param {document} schemaDocument schema to enforce
    * @param {string} schemaFolderId if your schema utilizes <import> or <include> tags which refer to sub-schemas by file name (as opposed to URL),
    *                 provide the Internal Id of File Cabinet folder containing these sub-schemas as the schemaFolderId argument
    * @throws {nlobjError} error containsing validation failure message(s) - limited to first 10
    *
    * @since 2014.1
    * @param xmlDocument
    * @param schemaDocument
    * @param schemaFolderId
    */
  def apply(xmlDocument: js.Any, schemaDocument: js.Any, schemaFolderId: String): Unit = js.native
}

