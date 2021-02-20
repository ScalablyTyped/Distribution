package typings.typedoc.anon

import typings.typedoc.serializationEventsMod.SerializeEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Begin extends StObject {
  
  var begin: js.UndefOr[SerializeEventData] = js.native
  
  var end: js.UndefOr[SerializeEventData] = js.native
}
object Begin {
  
  @scala.inline
  def apply(): Begin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Begin]
  }
  
  @scala.inline
  implicit class BeginMutableBuilder[Self <: Begin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: SerializeEventData): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setEnd(value: SerializeEventData): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
