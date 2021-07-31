package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executive extends StObject {
  
  /**
    * A filter on the list of people returned based on whether these people are
    * directors of the account’s company.
    */
  var director: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A filter on the list of people returned based on whether these people are
    * executives of the account’s company.
    */
  var executive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A filter on the list of people returned based on whether these people are
    * owners of the account’s company.
    */
  var owner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A filter on the list of people returned based on whether these people are
    * the representative of the account’s company.
    */
  var representative: js.UndefOr[Boolean] = js.undefined
}
object Executive {
  
  @scala.inline
  def apply(): Executive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Executive]
  }
  
  @scala.inline
  implicit class ExecutiveMutableBuilder[Self <: Executive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirector(value: Boolean): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorUndefined: Self = StObject.set(x, "director", js.undefined)
    
    @scala.inline
    def setExecutive(value: Boolean): Self = StObject.set(x, "executive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutiveUndefined: Self = StObject.set(x, "executive", js.undefined)
    
    @scala.inline
    def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRepresentative(value: Boolean): Self = StObject.set(x, "representative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentativeUndefined: Self = StObject.set(x, "representative", js.undefined)
  }
}
