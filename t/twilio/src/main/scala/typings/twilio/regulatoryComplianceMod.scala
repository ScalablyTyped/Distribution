package typings.twilio

import typings.twilio.bundleMod.BundleListInstance
import typings.twilio.endUserMod.EndUserListInstance
import typings.twilio.endUserTypeMod.EndUserTypeListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.regulationMod.RegulationListInstance
import typings.twilio.supportingDocumentMod.SupportingDocumentListInstance
import typings.twilio.supportingDocumentTypeMod.SupportingDocumentTypeListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regulatoryComplianceMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the RegulatoryComplianceList
    *
    * @param version - Version of the resource
    */
  inline def RegulatoryComplianceList(version: typings.twilio.numbersV2Mod.^): RegulatoryComplianceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RegulatoryComplianceList")(version.asInstanceOf[js.Any]).asInstanceOf[RegulatoryComplianceListInstance]
  
  trait RegulatoryComplianceListInstance extends StObject {
    
    var bundles: js.UndefOr[BundleListInstance] = js.undefined
    
    var endUserTypes: js.UndefOr[EndUserTypeListInstance] = js.undefined
    
    var endUsers: js.UndefOr[EndUserListInstance] = js.undefined
    
    var regulations: js.UndefOr[RegulationListInstance] = js.undefined
    
    var supportingDocumentTypes: js.UndefOr[SupportingDocumentTypeListInstance] = js.undefined
    
    var supportingDocuments: js.UndefOr[SupportingDocumentListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object RegulatoryComplianceListInstance {
    
    inline def apply(toJSON: () => Any): RegulatoryComplianceListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[RegulatoryComplianceListInstance]
    }
    
    extension [Self <: RegulatoryComplianceListInstance](x: Self) {
      
      inline def setBundles(value: BundleListInstance): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
      
      inline def setEndUserTypes(value: EndUserTypeListInstance): Self = StObject.set(x, "endUserTypes", value.asInstanceOf[js.Any])
      
      inline def setEndUserTypesUndefined: Self = StObject.set(x, "endUserTypes", js.undefined)
      
      inline def setEndUsers(value: EndUserListInstance): Self = StObject.set(x, "endUsers", value.asInstanceOf[js.Any])
      
      inline def setEndUsersUndefined: Self = StObject.set(x, "endUsers", js.undefined)
      
      inline def setRegulations(value: RegulationListInstance): Self = StObject.set(x, "regulations", value.asInstanceOf[js.Any])
      
      inline def setRegulationsUndefined: Self = StObject.set(x, "regulations", js.undefined)
      
      inline def setSupportingDocumentTypes(value: SupportingDocumentTypeListInstance): Self = StObject.set(x, "supportingDocumentTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportingDocumentTypesUndefined: Self = StObject.set(x, "supportingDocumentTypes", js.undefined)
      
      inline def setSupportingDocuments(value: SupportingDocumentListInstance): Self = StObject.set(x, "supportingDocuments", value.asInstanceOf[js.Any])
      
      inline def setSupportingDocumentsUndefined: Self = StObject.set(x, "supportingDocuments", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait RegulatoryCompliancePayload
    extends StObject
       with RegulatoryComplianceResource
       with TwilioResponsePayload
  object RegulatoryCompliancePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): RegulatoryCompliancePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegulatoryCompliancePayload]
    }
  }
  
  trait RegulatoryComplianceResource extends StObject
  
  trait RegulatoryComplianceSolution extends StObject
}
