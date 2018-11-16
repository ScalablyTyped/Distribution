package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direct3DBindings extends js.Object

/** A Windows Runtime projection of the D3D11_BIND_FLAG enumeration. Identifies the ways in which a resource may be bound to the graphics pipeline. */
@JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DBindings")
@js.native
object Direct3DBindings extends js.Object {
  /** Bind a buffer as a constant buffer to a shader stage. */
  @js.native
  sealed trait constantBuffer
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Set this flag to indicate that a 2D texture is used to receive output from the decoder API. */
  @js.native
  sealed trait decoder
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind a texture as a depth-stencil target for the output-merger stage. */
  @js.native
  sealed trait depthStencil
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind a buffer as an index buffer to the input-assembler stage. */
  @js.native
  sealed trait indexBuffer
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind a texture as a render target for the output-merger stage. */
  @js.native
  sealed trait renderTarget
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind a buffer or texture to a shader stage. */
  @js.native
  sealed trait shaderResource
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind an output buffer for the stream-output stage. */
  @js.native
  sealed trait streamOutput
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind an unordered access resource. */
  @js.native
  sealed trait unorderedAccess
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Bind a buffer as a vertex buffer to the input-assembler stage. */
  @js.native
  sealed trait vertexBuffer
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  /** Set this flag to indicate that a 2D texture is used to receive input from the video encoder API. */
  @js.native
  sealed trait videoEncoder
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings
  
  val constantBuffer: constantBuffer with java.lang.String = js.native
  val decoder: decoder with java.lang.String = js.native
  val depthStencil: depthStencil with java.lang.String = js.native
  val indexBuffer: indexBuffer with java.lang.String = js.native
  val renderTarget: renderTarget with java.lang.String = js.native
  val shaderResource: shaderResource with java.lang.String = js.native
  val streamOutput: streamOutput with java.lang.String = js.native
  val unorderedAccess: unorderedAccess with java.lang.String = js.native
  val vertexBuffer: vertexBuffer with java.lang.String = js.native
  val videoEncoder: videoEncoder with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings with java.lang.String
  ] = js.native
}

