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

