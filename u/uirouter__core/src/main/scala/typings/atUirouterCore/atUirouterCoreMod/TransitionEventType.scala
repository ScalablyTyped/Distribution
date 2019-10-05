package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.libTransitionInterfaceMod.PathType
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "TransitionEventType")
@js.native
class TransitionEventType protected ()
  extends typings.atUirouterCore.libTransitionMod.TransitionEventType {
  def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ) = this()
  def this(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    synchronous: Boolean
  ) = this()
}

