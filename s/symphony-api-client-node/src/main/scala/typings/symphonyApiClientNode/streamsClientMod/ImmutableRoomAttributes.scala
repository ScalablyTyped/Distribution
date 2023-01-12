package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmutableRoomAttributes extends StObject {
  
  var copyProtected: js.UndefOr[Boolean] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object ImmutableRoomAttributes {
  
  inline def apply(): ImmutableRoomAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmutableRoomAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmutableRoomAttributes] (val x: Self) extends AnyVal {
    
    inline def setCopyProtected(value: Boolean): Self = StObject.set(x, "copyProtected", value.asInstanceOf[js.Any])
    
    inline def setCopyProtectedUndefined: Self = StObject.set(x, "copyProtected", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
