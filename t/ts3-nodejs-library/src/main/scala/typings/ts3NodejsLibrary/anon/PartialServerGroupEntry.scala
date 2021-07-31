package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerGroupEntry> */
trait PartialServerGroupEntry extends StObject {
  
  var iconid: js.UndefOr[String] = js.undefined
  
  var nMemberAddp: js.UndefOr[Double] = js.undefined
  
  var nMemberRemovep: js.UndefOr[Double] = js.undefined
  
  var nModifyp: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namemode: js.UndefOr[Double] = js.undefined
  
  var savedb: js.UndefOr[Double] = js.undefined
  
  var sgid: js.UndefOr[String] = js.undefined
  
  var sortid: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object PartialServerGroupEntry {
  
  @scala.inline
  def apply(): PartialServerGroupEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerGroupEntry]
  }
  
  @scala.inline
  implicit class PartialServerGroupEntryMutableBuilder[Self <: PartialServerGroupEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconid(value: String): Self = StObject.set(x, "iconid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconidUndefined: Self = StObject.set(x, "iconid", js.undefined)
    
    @scala.inline
    def setNMemberAddp(value: Double): Self = StObject.set(x, "nMemberAddp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNMemberAddpUndefined: Self = StObject.set(x, "nMemberAddp", js.undefined)
    
    @scala.inline
    def setNMemberRemovep(value: Double): Self = StObject.set(x, "nMemberRemovep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNMemberRemovepUndefined: Self = StObject.set(x, "nMemberRemovep", js.undefined)
    
    @scala.inline
    def setNModifyp(value: Double): Self = StObject.set(x, "nModifyp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModifypUndefined: Self = StObject.set(x, "nModifyp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamemode(value: Double): Self = StObject.set(x, "namemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamemodeUndefined: Self = StObject.set(x, "namemode", js.undefined)
    
    @scala.inline
    def setSavedb(value: Double): Self = StObject.set(x, "savedb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedbUndefined: Self = StObject.set(x, "savedb", js.undefined)
    
    @scala.inline
    def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSgidUndefined: Self = StObject.set(x, "sgid", js.undefined)
    
    @scala.inline
    def setSortid(value: Double): Self = StObject.set(x, "sortid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortidUndefined: Self = StObject.set(x, "sortid", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
