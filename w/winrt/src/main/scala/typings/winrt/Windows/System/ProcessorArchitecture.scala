package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessorArchitecture extends StObject
@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends StObject {
  
  @js.native
  sealed trait arm extends ProcessorArchitecture
  
  @js.native
  sealed trait neutral extends ProcessorArchitecture
  
  @js.native
  sealed trait unknown extends ProcessorArchitecture
  
  @js.native
  sealed trait x64 extends ProcessorArchitecture
  
  @js.native
  sealed trait x86 extends ProcessorArchitecture
}
