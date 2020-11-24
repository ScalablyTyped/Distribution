package typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This represents an IDXGISurface and can be used to interop between Windows Runtime components that need to exchange IDXGISurface references. */
@js.native
trait IDirect3DSurface extends IClosable {
  
  /** Gets a Direct3DSurfaceDescription describing the surface. */
  var description: Direct3DSurfaceDescription = js.native
}
object IDirect3DSurface {
  
  @scala.inline
  def apply(close: () => Unit, description: Direct3DSurfaceDescription): IDirect3DSurface = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirect3DSurface]
  }
  
  @scala.inline
  implicit class IDirect3DSurfaceOps[Self <: IDirect3DSurface] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Direct3DSurfaceDescription): Self = this.set("description", value.asInstanceOf[js.Any])
  }
}
