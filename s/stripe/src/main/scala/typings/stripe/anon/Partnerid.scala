package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partnerid extends StObject {
  
  var name: String
  
  var partner_id: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Partnerid {
  
  @scala.inline
  def apply(name: String): Partnerid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partnerid]
  }
  
  @scala.inline
  implicit class PartneridMutableBuilder[Self <: Partnerid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartner_id(value: String): Self = StObject.set(x, "partner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartner_idUndefined: Self = StObject.set(x, "partner_id", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
