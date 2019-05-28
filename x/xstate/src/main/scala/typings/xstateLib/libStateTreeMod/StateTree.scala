package typings
package xstateLib.libStateTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/StateTree", "StateTree")
@js.native
class StateTree protected () extends js.Object {
  def this(stateNode: xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ]) = this()
  def this(stateNode: xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ], stateValue: xstateLib.libTypesMod.StateValue) = this()
  def this(stateNode: xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ], stateValue: xstateLib.libTypesMod.StateValue | js.UndefOr[scala.Nothing], options: StateTreeOptions) = this()
  def this(stateNode: xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ], stateValue: xstateLib.libTypesMod.StateValue | js.UndefOr[scala.Nothing], options: StateTreeOptions, parent: StateTree) = this()
  val absolute: StateTree = js.native
  val atomicNodes: js.Array[
    xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ]
  ] = js.native
  val done: scala.Boolean = js.native
  var isResolved: scala.Boolean = js.native
  val nextEvents: js.Array[xstateLib.libTypesMod.EventType] = js.native
  var nodes: stdLib.Record[java.lang.String, StateTree] = js.native
  var parent: js.UndefOr[StateTree] = js.native
  val paths: js.Array[js.Array[java.lang.String]] = js.native
  var reentryNodes: js.Any = js.native
  val resolved: StateTree = js.native
  var root: StateTree = js.native
  var stateNode: xstateLib.libStateNodeMod.StateNode[
    xstateLib.libTypesMod.DefaultContext, 
    _, 
    xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
  ] = js.native
  var stateValue: js.UndefOr[xstateLib.libTypesMod.StateValue] = js.native
  val value: xstateLib.libTypesMod.StateValue = js.native
  def addReentryNode(
    reentryNode: xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ]
  ): scala.Unit = js.native
  def combine(tree: StateTree): StateTree = js.native
  def getDoneData[TContext](context: TContext, event: xstateLib.libTypesMod.EventObject): js.Any = js.native
  def getDoneEvents(): js.Array[xstateLib.libTypesMod.EventObject] = js.native
  def getDoneEvents(
    entryStateNodes: stdLib.Set[
      xstateLib.libStateNodeMod.StateNode[
        xstateLib.libTypesMod.DefaultContext, 
        _, 
        xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
      ]
    ]
  ): js.Array[xstateLib.libTypesMod.EventObject] = js.native
  def getEntryExitStates(): xstateLib.libTypesMod.EntryExitStateArrays[_] = js.native
  def getEntryExitStates(prevTree: StateTree): xstateLib.libTypesMod.EntryExitStateArrays[_] = js.native
  def getEntryStates(): js.Array[
    xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ]
  ] = js.native
  def getExitStates(): js.Array[
    xstateLib.libStateNodeMod.StateNode[
      xstateLib.libTypesMod.DefaultContext, 
      _, 
      xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject]
    ]
  ] = js.native
  def matches(parentValue: xstateLib.libTypesMod.StateValue): scala.Boolean = js.native
}

