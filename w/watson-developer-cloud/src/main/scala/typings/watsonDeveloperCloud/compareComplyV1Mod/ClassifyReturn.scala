package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of objects returned by the **Element classification** method. */
trait ClassifyReturn extends js.Object {
  /** The monetary amounts that identify the total amount of the contract that needs to be paid from one party to another. */
  var contract_amounts: js.UndefOr[js.Array[ContractAmts]] = js.undefined
  /** The document's contract type or types as declared in the document. */
  var contract_type: js.UndefOr[js.Array[ContractType]] = js.undefined
  /** Basic information about the input document. */
  var document: js.UndefOr[Document] = js.undefined
  /** The structure of the input document. */
  var document_structure: js.UndefOr[DocStructure] = js.undefined
  /** The date or dates on which the document becomes effective. */
  var effective_dates: js.UndefOr[js.Array[EffectiveDates]] = js.undefined
  /** Document elements identified by the service. */
  var elements: js.UndefOr[js.Array[Element]] = js.undefined
  /** The analysis model used to classify the input document. For the **Element classification** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.undefined
  /** Definitions of the parties identified in the input document. */
  var parties: js.UndefOr[js.Array[Parties]] = js.undefined
  /** Definition of tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.undefined
  /** The date or dates on which the document is to be terminated. */
  var termination_dates: js.UndefOr[js.Array[TerminationDates]] = js.undefined
}

object ClassifyReturn {
  @scala.inline
  def apply(
    contract_amounts: js.Array[ContractAmts] = null,
    contract_type: js.Array[ContractType] = null,
    document: Document = null,
    document_structure: DocStructure = null,
    effective_dates: js.Array[EffectiveDates] = null,
    elements: js.Array[Element] = null,
    model_id: String = null,
    model_version: String = null,
    parties: js.Array[Parties] = null,
    tables: js.Array[Tables] = null,
    termination_dates: js.Array[TerminationDates] = null
  ): ClassifyReturn = {
    val __obj = js.Dynamic.literal()
    if (contract_amounts != null) __obj.updateDynamic("contract_amounts")(contract_amounts.asInstanceOf[js.Any])
    if (contract_type != null) __obj.updateDynamic("contract_type")(contract_type.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (document_structure != null) __obj.updateDynamic("document_structure")(document_structure.asInstanceOf[js.Any])
    if (effective_dates != null) __obj.updateDynamic("effective_dates")(effective_dates.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (model_version != null) __obj.updateDynamic("model_version")(model_version.asInstanceOf[js.Any])
    if (parties != null) __obj.updateDynamic("parties")(parties.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (termination_dates != null) __obj.updateDynamic("termination_dates")(termination_dates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyReturn]
  }
}

