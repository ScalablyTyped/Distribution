package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecEncodeMod.Encodable
import typings.vegaTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaTypings.typesSpecScopeMod.Scope
import typings.vegaTypings.vegaTypingsStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMark
  extends StObject
     with BaseMark
     with Scope
     with Encodable[GroupEncodeEntry]
     with Mark {
  
  @JSName("from")
  var from_GroupMark: js.UndefOr[FromFacet] = js.undefined
  
  var `type`: group
}
object GroupMark {
  
  inline def apply(): GroupMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[GroupMark]
  }
  
  extension [Self <: GroupMark](x: Self) {
    
    inline def setFrom(value: FromFacet): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
