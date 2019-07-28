package typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Printing3DBufferFormat extends js.Object

/** Specifies the format used by the buffer. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBufferFormat")
@js.native
object Printing3DBufferFormat extends js.Object {
  /** A buffer of type double. */
  @js.native
  sealed trait printing3DDouble extends Printing3DBufferFormat
  
  /** A buffer of type uint. */
  @js.native
  sealed trait printing3DUInt extends Printing3DBufferFormat
  
  /** A four-component, 128-bit floating-point format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32Float extends Printing3DBufferFormat
  
  /** A four-component, 128-bit unsigned-integer format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32UInt extends Printing3DBufferFormat
  
  /** A three-component, 96-bit floating-point format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32Float extends Printing3DBufferFormat
  
  /** A three-component, 96-bit unsigned-integer format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32UInt extends Printing3DBufferFormat
  
  /** The format is not known. */
  @js.native
  sealed trait unknown extends Printing3DBufferFormat
  
  /* 5 */ val printing3DDouble: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.printing3DDouble with Double = js.native
  /* 6 */ val printing3DUInt: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.printing3DUInt with Double = js.native
  /* 1 */ val r32G32B32A32Float: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.r32G32B32A32Float with Double = js.native
  /* 2 */ val r32G32B32A32UInt: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.r32G32B32A32UInt with Double = js.native
  /* 3 */ val r32G32B32Float: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.r32G32B32Float with Double = js.native
  /* 4 */ val r32G32B32UInt: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.r32G32B32UInt with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DBufferFormat with Double] = js.native
}

