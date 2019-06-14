package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

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
  sealed trait printing3DDouble
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** A buffer of type uint. */
  @js.native
  sealed trait printing3DUInt
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** A four-component, 128-bit floating-point format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32Float
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** A four-component, 128-bit unsigned-integer format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32UInt
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** A three-component, 96-bit floating-point format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32Float
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** A three-component, 96-bit unsigned-integer format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32UInt
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /** The format is not known. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat
  
  /* 5 */ val printing3DDouble: printing3DDouble with scala.Double = js.native
  /* 6 */ val printing3DUInt: printing3DUInt with scala.Double = js.native
  /* 1 */ val r32G32B32A32Float: r32G32B32A32Float with scala.Double = js.native
  /* 2 */ val r32G32B32A32UInt: r32G32B32A32UInt with scala.Double = js.native
  /* 3 */ val r32G32B32Float: r32G32B32Float with scala.Double = js.native
  /* 4 */ val r32G32B32UInt: r32G32B32UInt with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DBufferFormat with scala.Double
  ] = js.native
}

