package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessorArchitecture extends js.Object
/** Specifies the processor architecture supported by an app. */
@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends js.Object {
  
  /** The ARM processor architecture. */
  @js.native
  sealed trait arm extends ProcessorArchitecture
  
  /** A neutral processor architecture. */
  @js.native
  sealed trait neutral extends ProcessorArchitecture
  
  /** An unknown processor architecture. */
  @js.native
  sealed trait unknown extends ProcessorArchitecture
  
  /** The x64 processor architecture. */
  @js.native
  sealed trait x64 extends ProcessorArchitecture
  
  /** The x86 processor architecture. */
  @js.native
  sealed trait x86 extends ProcessorArchitecture
}
