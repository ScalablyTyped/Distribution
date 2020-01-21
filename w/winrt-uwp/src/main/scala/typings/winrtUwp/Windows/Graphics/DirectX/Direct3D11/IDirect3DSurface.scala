package typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This represents an IDXGISurface and can be used to interop between Windows Runtime components that need to exchange IDXGISurface references. */
trait IDirect3DSurface extends IClosable {
  /** Gets a Direct3DSurfaceDescription describing the surface. */
  var description: Direct3DSurfaceDescription
}

object IDirect3DSurface {
  @scala.inline
  def apply(close: () => Unit, description: Direct3DSurfaceDescription): IDirect3DSurface = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), description = description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDirect3DSurface]
  }
}

