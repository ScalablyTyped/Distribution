package typings.winrtUwp.Windows.Graphics.Printing3D

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
  
}

