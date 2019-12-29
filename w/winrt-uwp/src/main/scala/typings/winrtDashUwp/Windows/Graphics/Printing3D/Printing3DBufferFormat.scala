package typings.winrtDashUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DBufferFormat with Double] = js.native
  /* 5 */ @js.native
  object printing3DDouble extends TopLevel[printing3DDouble with Double]
  
  /* 6 */ @js.native
  object printing3DUInt extends TopLevel[printing3DUInt with Double]
  
  /* 1 */ @js.native
  object r32G32B32A32Float extends TopLevel[r32G32B32A32Float with Double]
  
  /* 2 */ @js.native
  object r32G32B32A32UInt extends TopLevel[r32G32B32A32UInt with Double]
  
  /* 3 */ @js.native
  object r32G32B32Float extends TopLevel[r32G32B32Float with Double]
  
  /* 4 */ @js.native
  object r32G32B32UInt extends TopLevel[r32G32B32UInt with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

