package typings.tuyaPanelKit.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.tuyaPanelKit.nativeTypesMod.ServerContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native/ServerContext.ServerContextType & {  children :react.react.ReactNode} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.ServerContainerRef> */
@js.native
trait ServerContextTypechildren extends StObject {
  
  var children: ReactNode = js.native
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.native
  
  var location: js.UndefOr[Pathname] = js.native
  
  var ref: js.UndefOr[Ref[ServerContainerRef]] = js.native
}
object ServerContextTypechildren {
  
  @scala.inline
  def apply(): ServerContextTypechildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerContextTypechildren]
  }
  
  @scala.inline
  implicit class ServerContextTypechildrenMutableBuilder[Self <: ServerContextTypechildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocation(value: Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[ServerContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ServerContainerRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
