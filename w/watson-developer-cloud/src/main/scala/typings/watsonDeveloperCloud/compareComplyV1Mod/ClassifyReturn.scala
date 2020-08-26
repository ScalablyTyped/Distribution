package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of objects returned by the **Element classification** method. */
@js.native
trait ClassifyReturn extends js.Object {
  /** The monetary amounts that identify the total amount of the contract that needs to be paid from one party to another. */
  var contract_amounts: js.UndefOr[js.Array[ContractAmts]] = js.native
  /** The document's contract type or types as declared in the document. */
  var contract_type: js.UndefOr[js.Array[ContractType]] = js.native
  /** Basic information about the input document. */
  var document: js.UndefOr[Document] = js.native
  /** The structure of the input document. */
  var document_structure: js.UndefOr[DocStructure] = js.native
  /** The date or dates on which the document becomes effective. */
  var effective_dates: js.UndefOr[js.Array[EffectiveDates]] = js.native
  /** Document elements identified by the service. */
  var elements: js.UndefOr[js.Array[Element]] = js.native
  /** The analysis model used to classify the input document. For the **Element classification** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.native
  /** Definitions of the parties identified in the input document. */
  var parties: js.UndefOr[js.Array[Parties]] = js.native
  /** Definition of tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.native
  /** The date or dates on which the document is to be terminated. */
  var termination_dates: js.UndefOr[js.Array[TerminationDates]] = js.native
}

object ClassifyReturn {
  @scala.inline
  def apply(): ClassifyReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyReturn]
  }
  @scala.inline
  implicit class ClassifyReturnOps[Self <: ClassifyReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContract_amountsVarargs(value: ContractAmts*): Self = this.set("contract_amounts", js.Array(value :_*))
    @scala.inline
    def setContract_amounts(value: js.Array[ContractAmts]): Self = this.set("contract_amounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContract_amounts: Self = this.set("contract_amounts", js.undefined)
    @scala.inline
    def setContract_typeVarargs(value: ContractType*): Self = this.set("contract_type", js.Array(value :_*))
    @scala.inline
    def setContract_type(value: js.Array[ContractType]): Self = this.set("contract_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContract_type: Self = this.set("contract_type", js.undefined)
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setDocument_structure(value: DocStructure): Self = this.set("document_structure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_structure: Self = this.set("document_structure", js.undefined)
    @scala.inline
    def setEffective_datesVarargs(value: EffectiveDates*): Self = this.set("effective_dates", js.Array(value :_*))
    @scala.inline
    def setEffective_dates(value: js.Array[EffectiveDates]): Self = this.set("effective_dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffective_dates: Self = this.set("effective_dates", js.undefined)
    @scala.inline
    def setElementsVarargs(value: Element*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Element]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
    @scala.inline
    def setPartiesVarargs(value: Parties*): Self = this.set("parties", js.Array(value :_*))
    @scala.inline
    def setParties(value: js.Array[Parties]): Self = this.set("parties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParties: Self = this.set("parties", js.undefined)
    @scala.inline
    def setTablesVarargs(value: Tables*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[Tables]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    @scala.inline
    def setTermination_datesVarargs(value: TerminationDates*): Self = this.set("termination_dates", js.Array(value :_*))
    @scala.inline
    def setTermination_dates(value: js.Array[TerminationDates]): Self = this.set("termination_dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermination_dates: Self = this.set("termination_dates", js.undefined)
  }
  
}

