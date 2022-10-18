package typings.typedoc.anon

import typings.typedoc.distLibSerializationEventsMod.SerializeEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Begin extends StObject {
  
  var begin: js.UndefOr[SerializeEventData] = js.undefined
  
  var end: js.UndefOr[SerializeEventData] = js.undefined
}
object Begin {
  
  inline def apply(): Begin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Begin]
  }
  
  extension [Self <: Begin](x: Self) {
    
    inline def setBegin(value: SerializeEventData): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setEnd(value: SerializeEventData): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
