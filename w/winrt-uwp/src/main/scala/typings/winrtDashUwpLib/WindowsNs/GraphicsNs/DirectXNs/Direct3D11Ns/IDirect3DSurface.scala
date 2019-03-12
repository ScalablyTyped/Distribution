package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This represents an IDXGISurface and can be used to interop between Windows Runtime components that need to exchange IDXGISurface references. */
trait IDirect3DSurface
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /** Gets a Direct3DSurfaceDescription describing the surface. */
  var description: Direct3DSurfaceDescription
}

object IDirect3DSurface {
  @scala.inline
  def apply(close: () => scala.Unit, description: Direct3DSurfaceDescription): IDirect3DSurface = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), description = description)
  
    __obj.asInstanceOf[IDirect3DSurface]
  }
}

