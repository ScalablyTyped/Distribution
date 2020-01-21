package typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direct3DBindings with Double] = js.native
  /* 2 */ @js.native
  object constantBuffer extends TopLevel[constantBuffer with Double]
  
  /* 8 */ @js.native
  object decoder extends TopLevel[decoder with Double]
  
  /* 6 */ @js.native
  object depthStencil extends TopLevel[depthStencil with Double]
  
  /* 1 */ @js.native
  object indexBuffer extends TopLevel[indexBuffer with Double]
  
  /* 5 */ @js.native
  object renderTarget extends TopLevel[renderTarget with Double]
  
  /* 3 */ @js.native
  object shaderResource extends TopLevel[shaderResource with Double]
  
  /* 4 */ @js.native
  object streamOutput extends TopLevel[streamOutput with Double]
  
  /* 7 */ @js.native
  object unorderedAccess extends TopLevel[unorderedAccess with Double]
  
  /* 0 */ @js.native
  object vertexBuffer extends TopLevel[vertexBuffer with Double]
  
  /* 9 */ @js.native
  object videoEncoder extends TopLevel[videoEncoder with Double]
  
}

