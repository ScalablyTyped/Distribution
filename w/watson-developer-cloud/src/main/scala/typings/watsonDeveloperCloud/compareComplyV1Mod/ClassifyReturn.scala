package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The analysis of objects returned by the **Element classification** method. */
@js.native
trait ClassifyReturn extends StObject {
  
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
  implicit class ClassifyReturnMutableBuilder[Self <: ClassifyReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContract_amounts(value: js.Array[ContractAmts]): Self = StObject.set(x, "contract_amounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContract_amountsUndefined: Self = StObject.set(x, "contract_amounts", js.undefined)
    
    @scala.inline
    def setContract_amountsVarargs(value: ContractAmts*): Self = StObject.set(x, "contract_amounts", js.Array(value :_*))
    
    @scala.inline
    def setContract_type(value: js.Array[ContractType]): Self = StObject.set(x, "contract_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContract_typeUndefined: Self = StObject.set(x, "contract_type", js.undefined)
    
    @scala.inline
    def setContract_typeVarargs(value: ContractType*): Self = StObject.set(x, "contract_type", js.Array(value :_*))
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setDocument_structure(value: DocStructure): Self = StObject.set(x, "document_structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_structureUndefined: Self = StObject.set(x, "document_structure", js.undefined)
    
    @scala.inline
    def setEffective_dates(value: js.Array[EffectiveDates]): Self = StObject.set(x, "effective_dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffective_datesUndefined: Self = StObject.set(x, "effective_dates", js.undefined)
    
    @scala.inline
    def setEffective_datesVarargs(value: EffectiveDates*): Self = StObject.set(x, "effective_dates", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    @scala.inline
    def setParties(value: js.Array[Parties]): Self = StObject.set(x, "parties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiesUndefined: Self = StObject.set(x, "parties", js.undefined)
    
    @scala.inline
    def setPartiesVarargs(value: Parties*): Self = StObject.set(x, "parties", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[Tables]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: Tables*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setTermination_dates(value: js.Array[TerminationDates]): Self = StObject.set(x, "termination_dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermination_datesUndefined: Self = StObject.set(x, "termination_dates", js.undefined)
    
    @scala.inline
    def setTermination_datesVarargs(value: TerminationDates*): Self = StObject.set(x, "termination_dates", js.Array(value :_*))
  }
}
