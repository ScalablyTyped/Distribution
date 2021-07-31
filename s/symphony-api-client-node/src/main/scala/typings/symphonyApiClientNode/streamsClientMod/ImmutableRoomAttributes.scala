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
  
  @scala.inline
  def apply(): ImmutableRoomAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmutableRoomAttributes]
  }
  
  @scala.inline
  implicit class ImmutableRoomAttributesMutableBuilder[Self <: ImmutableRoomAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyProtected(value: Boolean): Self = StObject.set(x, "copyProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyProtectedUndefined: Self = StObject.set(x, "copyProtected", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
