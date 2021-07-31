package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Printing3DBufferFormat extends StObject
/** Specifies the format used by the buffer. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBufferFormat")
@js.native
object Printing3DBufferFormat extends StObject {
  
  /** A buffer of type double. */
  @js.native
  sealed trait printing3DDouble
    extends StObject
       with Printing3DBufferFormat
  
  /** A buffer of type uint. */
  @js.native
  sealed trait printing3DUInt
    extends StObject
       with Printing3DBufferFormat
  
  /** A four-component, 128-bit floating-point format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32Float
    extends StObject
       with Printing3DBufferFormat
  
  /** A four-component, 128-bit unsigned-integer format that supports 32 bits per channel including alpha. */
  @js.native
  sealed trait r32G32B32A32UInt
    extends StObject
       with Printing3DBufferFormat
  
  /** A three-component, 96-bit floating-point format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32Float
    extends StObject
       with Printing3DBufferFormat
  
  /** A three-component, 96-bit unsigned-integer format that supports 32 bits per color channel. */
  @js.native
  sealed trait r32G32B32UInt
    extends StObject
       with Printing3DBufferFormat
  
  /** The format is not known. */
  @js.native
  sealed trait unknown
    extends StObject
       with Printing3DBufferFormat
}
