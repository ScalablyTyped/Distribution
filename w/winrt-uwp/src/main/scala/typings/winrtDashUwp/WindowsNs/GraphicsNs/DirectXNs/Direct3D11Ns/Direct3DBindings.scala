package typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns

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
  sealed trait constantBuffer extends Direct3DBindings
  
  /** Set this flag to indicate that a 2D texture is used to receive output from the decoder API. */
  @js.native
  sealed trait decoder extends Direct3DBindings
  
  /** Bind a texture as a depth-stencil target for the output-merger stage. */
  @js.native
  sealed trait depthStencil extends Direct3DBindings
  
  /** Bind a buffer as an index buffer to the input-assembler stage. */
  @js.native
  sealed trait indexBuffer extends Direct3DBindings
  
  /** Bind a texture as a render target for the output-merger stage. */
  @js.native
  sealed trait renderTarget extends Direct3DBindings
  
  /** Bind a buffer or texture to a shader stage. */
  @js.native
  sealed trait shaderResource extends Direct3DBindings
  
  /** Bind an output buffer for the stream-output stage. */
  @js.native
  sealed trait streamOutput extends Direct3DBindings
  
  /** Bind an unordered access resource. */
  @js.native
  sealed trait unorderedAccess extends Direct3DBindings
  
  /** Bind a buffer as a vertex buffer to the input-assembler stage. */
  @js.native
  sealed trait vertexBuffer extends Direct3DBindings
  
  /** Set this flag to indicate that a 2D texture is used to receive input from the video encoder API. */
  @js.native
  sealed trait videoEncoder extends Direct3DBindings
  
  /* 2 */ val constantBuffer: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.constantBuffer with Double = js.native
  /* 8 */ val decoder: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.decoder with Double = js.native
  /* 6 */ val depthStencil: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.depthStencil with Double = js.native
  /* 1 */ val indexBuffer: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.indexBuffer with Double = js.native
  /* 5 */ val renderTarget: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.renderTarget with Double = js.native
  /* 3 */ val shaderResource: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.shaderResource with Double = js.native
  /* 4 */ val streamOutput: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.streamOutput with Double = js.native
  /* 7 */ val unorderedAccess: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.unorderedAccess with Double = js.native
  /* 0 */ val vertexBuffer: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.vertexBuffer with Double = js.native
  /* 9 */ val videoEncoder: typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.Direct3DBindings.videoEncoder with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direct3DBindings with Double] = js.native
}

