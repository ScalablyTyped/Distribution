package typings.windowsProcessTree.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessDataFlag extends js.Object
@JSImport("windows-process-tree", "ProcessDataFlag")
@js.native
object ProcessDataFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessDataFlag with Double] = js.native
  
  @js.native
  sealed trait CommandLine extends ProcessDataFlag
  /* 2 */ @js.native
  object CommandLine extends TopLevel[CommandLine with Double]
  
  @js.native
  sealed trait Memory extends ProcessDataFlag
  /* 1 */ @js.native
  object Memory extends TopLevel[Memory with Double]
  
  @js.native
  sealed trait None extends ProcessDataFlag
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
