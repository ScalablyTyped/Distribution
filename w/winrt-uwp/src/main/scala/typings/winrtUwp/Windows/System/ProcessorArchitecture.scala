package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessorArchitecture extends StObject
/** Specifies the processor architecture supported by an app. */
@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends StObject {
  
  /** The ARM processor architecture. */
  @js.native
  sealed trait arm
    extends StObject
       with ProcessorArchitecture
  
  /** A neutral processor architecture. */
  @js.native
  sealed trait neutral
    extends StObject
       with ProcessorArchitecture
  
  /** An unknown processor architecture. */
  @js.native
  sealed trait unknown
    extends StObject
       with ProcessorArchitecture
  
  /** The x64 processor architecture. */
  @js.native
  sealed trait x64
    extends StObject
       with ProcessorArchitecture
  
  /** The x86 processor architecture. */
  @js.native
  sealed trait x86
    extends StObject
       with ProcessorArchitecture
}
