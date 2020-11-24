package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executive extends js.Object {
  
  /**
    * A filter on the list of people returned based on whether these people are
    * directors of the account’s company.
    */
  var director: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter on the list of people returned based on whether these people are
    * executives of the account’s company.
    */
  var executive: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter on the list of people returned based on whether these people are
    * owners of the account’s company.
    */
  var owner: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter on the list of people returned based on whether these people are
    * the representative of the account’s company.
    */
  var representative: js.UndefOr[Boolean] = js.native
}
object Executive {
  
  @scala.inline
  def apply(): Executive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Executive]
  }
  
  @scala.inline
  implicit class ExecutiveOps[Self <: Executive] (val x: Self) extends AnyVal {
    
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
    def setDirector(value: Boolean): Self = this.set("director", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirector: Self = this.set("director", js.undefined)
    
    @scala.inline
    def setExecutive(value: Boolean): Self = this.set("executive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutive: Self = this.set("executive", js.undefined)
    
    @scala.inline
    def setOwner(value: Boolean): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRepresentative(value: Boolean): Self = this.set("representative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepresentative: Self = this.set("representative", js.undefined)
  }
}
