package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The analysis of objects returned by the **Element classification** method. */
trait ClassifyReturn extends StObject {
  
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
  
  inline def apply(): ClassifyReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyReturn]
  }
  
  extension [Self <: ClassifyReturn](x: Self) {
    
    inline def setContract_amounts(value: js.Array[ContractAmts]): Self = StObject.set(x, "contract_amounts", value.asInstanceOf[js.Any])
    
    inline def setContract_amountsUndefined: Self = StObject.set(x, "contract_amounts", js.undefined)
    
    inline def setContract_amountsVarargs(value: ContractAmts*): Self = StObject.set(x, "contract_amounts", js.Array(value*))
    
    inline def setContract_type(value: js.Array[ContractType]): Self = StObject.set(x, "contract_type", value.asInstanceOf[js.Any])
    
    inline def setContract_typeUndefined: Self = StObject.set(x, "contract_type", js.undefined)
    
    inline def setContract_typeVarargs(value: ContractType*): Self = StObject.set(x, "contract_type", js.Array(value*))
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setDocument_structure(value: DocStructure): Self = StObject.set(x, "document_structure", value.asInstanceOf[js.Any])
    
    inline def setDocument_structureUndefined: Self = StObject.set(x, "document_structure", js.undefined)
    
    inline def setEffective_dates(value: js.Array[EffectiveDates]): Self = StObject.set(x, "effective_dates", value.asInstanceOf[js.Any])
    
    inline def setEffective_datesUndefined: Self = StObject.set(x, "effective_dates", js.undefined)
    
    inline def setEffective_datesVarargs(value: EffectiveDates*): Self = StObject.set(x, "effective_dates", js.Array(value*))
    
    inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    inline def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    inline def setParties(value: js.Array[Parties]): Self = StObject.set(x, "parties", value.asInstanceOf[js.Any])
    
    inline def setPartiesUndefined: Self = StObject.set(x, "parties", js.undefined)
    
    inline def setPartiesVarargs(value: Parties*): Self = StObject.set(x, "parties", js.Array(value*))
    
    inline def setTables(value: js.Array[Tables]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: Tables*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTermination_dates(value: js.Array[TerminationDates]): Self = StObject.set(x, "termination_dates", value.asInstanceOf[js.Any])
    
    inline def setTermination_datesUndefined: Self = StObject.set(x, "termination_dates", js.undefined)
    
    inline def setTermination_datesVarargs(value: TerminationDates*): Self = StObject.set(x, "termination_dates", js.Array(value*))
  }
}
