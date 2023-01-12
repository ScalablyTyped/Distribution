package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ChannelGroupEntry> */
trait PartialChannelGroupEntry extends StObject {
  
  var cgid: js.UndefOr[String] = js.undefined
  
  var iconid: js.UndefOr[String] = js.undefined
  
  var nMemberAddp: js.UndefOr[Double] = js.undefined
  
  var nMemberRemovep: js.UndefOr[Double] = js.undefined
  
  var nModifyp: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namemode: js.UndefOr[Double] = js.undefined
  
  var savedb: js.UndefOr[Double] = js.undefined
  
  var sortid: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object PartialChannelGroupEntry {
  
  inline def apply(): PartialChannelGroupEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelGroupEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialChannelGroupEntry] (val x: Self) extends AnyVal {
    
    inline def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
    
    inline def setCgidUndefined: Self = StObject.set(x, "cgid", js.undefined)
    
    inline def setIconid(value: String): Self = StObject.set(x, "iconid", value.asInstanceOf[js.Any])
    
    inline def setIconidUndefined: Self = StObject.set(x, "iconid", js.undefined)
    
    inline def setNMemberAddp(value: Double): Self = StObject.set(x, "nMemberAddp", value.asInstanceOf[js.Any])
    
    inline def setNMemberAddpUndefined: Self = StObject.set(x, "nMemberAddp", js.undefined)
    
    inline def setNMemberRemovep(value: Double): Self = StObject.set(x, "nMemberRemovep", value.asInstanceOf[js.Any])
    
    inline def setNMemberRemovepUndefined: Self = StObject.set(x, "nMemberRemovep", js.undefined)
    
    inline def setNModifyp(value: Double): Self = StObject.set(x, "nModifyp", value.asInstanceOf[js.Any])
    
    inline def setNModifypUndefined: Self = StObject.set(x, "nModifyp", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamemode(value: Double): Self = StObject.set(x, "namemode", value.asInstanceOf[js.Any])
    
    inline def setNamemodeUndefined: Self = StObject.set(x, "namemode", js.undefined)
    
    inline def setSavedb(value: Double): Self = StObject.set(x, "savedb", value.asInstanceOf[js.Any])
    
    inline def setSavedbUndefined: Self = StObject.set(x, "savedb", js.undefined)
    
    inline def setSortid(value: Double): Self = StObject.set(x, "sortid", value.asInstanceOf[js.Any])
    
    inline def setSortidUndefined: Self = StObject.set(x, "sortid", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
