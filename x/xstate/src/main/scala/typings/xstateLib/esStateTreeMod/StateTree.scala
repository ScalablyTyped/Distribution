package typings
package xstateLib.esStateTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/StateTree", "StateTree")
@js.native
class StateTree protected () extends js.Object {
  def this(stateNode: xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ]) = this()
  def this(stateNode: xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ], stateValue: xstateLib.esTypesMod.StateValue) = this()
  def this(stateNode: xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ], stateValue: js.UndefOr[xstateLib.esTypesMod.StateValue], options: StateTreeOptions) = this()
  def this(stateNode: xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ], stateValue: js.UndefOr[xstateLib.esTypesMod.StateValue], options: StateTreeOptions, parent: StateTree) = this()
  val absolute: StateTree = js.native
  val atomicNodes: js.Array[
    xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ]
  ] = js.native
  val done: scala.Boolean = js.native
  var isResolved: scala.Boolean = js.native
  val nextEvents: js.Array[xstateLib.esTypesMod.EventType] = js.native
  var nodes: stdLib.Record[java.lang.String, StateTree] = js.native
  var parent: js.UndefOr[StateTree] = js.native
  val paths: js.Array[js.Array[java.lang.String]] = js.native
  var reentryNodes: js.Any = js.native
  val resolved: StateTree = js.native
  var root: StateTree = js.native
  var stateNode: xstateLib.esStateNodeMod.StateNode[
    xstateLib.esTypesMod.DefaultContext, 
    _, 
    xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
  ] = js.native
  var stateValue: js.UndefOr[xstateLib.esTypesMod.StateValue] = js.native
  val value: xstateLib.esTypesMod.StateValue = js.native
  def addReentryNode(
    reentryNode: xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ]
  ): scala.Unit = js.native
  def combine(tree: StateTree): StateTree = js.native
  def getDoneData[TContext](context: TContext, event: xstateLib.esTypesMod.EventObject): js.Any = js.native
  def getDoneEvents(): js.Array[xstateLib.esTypesMod.EventObject] = js.native
  def getDoneEvents(
    entryStateNodes: stdLib.Set[
      xstateLib.esStateNodeMod.StateNode[
        xstateLib.esTypesMod.DefaultContext, 
        _, 
        xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
      ]
    ]
  ): js.Array[xstateLib.esTypesMod.EventObject] = js.native
  def getEntryExitStates(): xstateLib.esTypesMod.EntryExitStateArrays[_] = js.native
  def getEntryExitStates(prevTree: StateTree): xstateLib.esTypesMod.EntryExitStateArrays[_] = js.native
  def getEntryStates(): js.Array[
    xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ]
  ] = js.native
  def getExitStates(): js.Array[
    xstateLib.esStateNodeMod.StateNode[
      xstateLib.esTypesMod.DefaultContext, 
      _, 
      xstateLib.esTypesMod.OmniEventObject[xstateLib.esTypesMod.EventObject]
    ]
  ] = js.native
  def matches(parentValue: xstateLib.esTypesMod.StateValue): scala.Boolean = js.native
}

