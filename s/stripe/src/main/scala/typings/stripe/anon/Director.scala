package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Director extends StObject {
  
  /**
    * Whether the person is a director of the account’s legal entity. Currently only required for accounts in the EU.
    * Directors are typically members of the governing board of the company, or responsible for ensuring the
    * company meets its regulatory obligations.
    */
  var director: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the person has significant responsibility to control, manage, or direct the organization.
    */
  var executive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the person is an owner of the account’s legal entity.
    */
  var owner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The percent owned by the person of the account’s legal entity.
    */
  var percent_ownership: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the person is authorized as the primary representative of the account.
    * This is the person nominated by the business to provide information about themselves,
    * and general information about the account. There can only be one representative at any given time.
    * At the time the account is created, this person should be set to the person responsible for opening the account.
    */
  var representative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The person’s title (e.g., CEO, Support Engineer).
    */
  var title: js.UndefOr[String] = js.undefined
}
object Director {
  
  inline def apply(): Director = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Director]
  }
  
  extension [Self <: Director](x: Self) {
    
    inline def setDirector(value: Boolean): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
    
    inline def setDirectorUndefined: Self = StObject.set(x, "director", js.undefined)
    
    inline def setExecutive(value: Boolean): Self = StObject.set(x, "executive", value.asInstanceOf[js.Any])
    
    inline def setExecutiveUndefined: Self = StObject.set(x, "executive", js.undefined)
    
    inline def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPercent_ownership(value: Double): Self = StObject.set(x, "percent_ownership", value.asInstanceOf[js.Any])
    
    inline def setPercent_ownershipUndefined: Self = StObject.set(x, "percent_ownership", js.undefined)
    
    inline def setRepresentative(value: Boolean): Self = StObject.set(x, "representative", value.asInstanceOf[js.Any])
    
    inline def setRepresentativeUndefined: Self = StObject.set(x, "representative", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
