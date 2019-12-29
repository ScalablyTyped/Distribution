package typings.winrt.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessorArchitecture extends js.Object

@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessorArchitecture with Double] = js.native
  /* 1 */ @js.native
  object arm extends TopLevel[arm with Double]
  
  /* 3 */ @js.native
  object neutral extends TopLevel[neutral with Double]
  
  /* 4 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object x64 extends TopLevel[x64 with Double]
  
  /* 0 */ @js.native
  object x86 extends TopLevel[x86 with Double]
  
}

