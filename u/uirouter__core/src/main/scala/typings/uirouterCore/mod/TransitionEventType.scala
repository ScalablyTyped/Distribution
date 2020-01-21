package typings.uirouterCore.mod

import typings.uirouterCore.transitionHookMod.GetErrorHandler
import typings.uirouterCore.transitionHookMod.GetResultHandler
import typings.uirouterCore.transitionInterfaceMod.PathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "TransitionEventType")
@js.native
class TransitionEventType protected ()
  extends typings.uirouterCore.transitionMod.TransitionEventType {
  def this(
    name: String,
    hookPhase: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType
  ) = this()
  def this(
    name: String,
    hookPhase: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
}

