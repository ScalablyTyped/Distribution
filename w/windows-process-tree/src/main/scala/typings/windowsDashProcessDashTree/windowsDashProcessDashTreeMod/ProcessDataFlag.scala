package typings.windowsDashProcessDashTree.windowsDashProcessDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessDataFlag extends js.Object

@JSImport("windows-process-tree", "ProcessDataFlag")
@js.native
object ProcessDataFlag extends js.Object {
  @js.native
  sealed trait CommandLine extends ProcessDataFlag
  
  @js.native
  sealed trait Memory extends ProcessDataFlag
  
  @js.native
  sealed trait None extends ProcessDataFlag
  
  /* 2 */ val CommandLine: typings.windowsDashProcessDashTree.windowsDashProcessDashTreeMod.ProcessDataFlag.CommandLine with Double = js.native
  /* 1 */ val Memory: typings.windowsDashProcessDashTree.windowsDashProcessDashTreeMod.ProcessDataFlag.Memory with Double = js.native
  /* 0 */ val None: typings.windowsDashProcessDashTree.windowsDashProcessDashTreeMod.ProcessDataFlag.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessDataFlag with Double] = js.native
}

