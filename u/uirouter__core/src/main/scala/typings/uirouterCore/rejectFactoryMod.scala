package typings.uirouterCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rejectFactoryMod {
  
  @js.native
  sealed trait RejectType extends StObject
  @JSImport("@uirouter/core/lib/transition/rejectFactory", "RejectType")
  @js.native
  object RejectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RejectType with Double] = js.native
    
    /**
      * The transition was aborted
      *
      * The transition was aborted by a hook which returned `false`
      */
    @js.native
    sealed trait ABORTED extends RejectType
    /* 3 */ val ABORTED: typings.uirouterCore.rejectFactoryMod.RejectType.ABORTED with Double = js.native
    
    /**
      * The transition errored.
      *
      * This generally means a hook threw an error or returned a rejected promise
      */
    @js.native
    sealed trait ERROR extends RejectType
    /* 6 */ val ERROR: typings.uirouterCore.rejectFactoryMod.RejectType.ERROR with Double = js.native
    
    /**
      * The transition was ignored
      *
      * The transition was ignored because it would have no effect.
      *
      * Either:
      *
      * - The transition is targeting the current state and parameter values
      * - The transition is targeting the same state and parameter values as the currently running transition.
      */
    @js.native
    sealed trait IGNORED extends RejectType
    /* 5 */ val IGNORED: typings.uirouterCore.rejectFactoryMod.RejectType.IGNORED with Double = js.native
    
    /**
      * The transition was invalid
      *
      * The transition was never started because it was invalid
      */
    @js.native
    sealed trait INVALID extends RejectType
    /* 4 */ val INVALID: typings.uirouterCore.rejectFactoryMod.RejectType.INVALID with Double = js.native
    
    /**
      * A new transition superseded this one.
      *
      * While this transition was running, a new transition started.
      * This transition is cancelled because it was superseded by new transition.
      */
    @js.native
    sealed trait SUPERSEDED extends RejectType
    /* 2 */ val SUPERSEDED: typings.uirouterCore.rejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection")
  @js.native
  class Rejection protected () extends StObject {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: js.UndefOr[scala.Nothing], detail: js.Any) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
    
    /** @internal */
    @JSName("$id")
    var $id: Double = js.native
    
    /**
      * A detail object
      *
      * This value varies based on the mechanism for rejecting the transition.
      * For example, if an error was thrown from a hook, the `detail` will be the `Error` object.
      * If a hook returned a rejected promise, the `detail` will be the rejected value.
      */
    var detail: js.Any = js.native
    
    /**
      * A message describing the rejection
      */
    var message: String = js.native
    
    /**
      * Indicates if the transition was redirected.
      *
      * When a transition is redirected, the rejection [[type]] will be [[RejectType.SUPERSEDED]] and this flag will be true.
      */
    var redirected: Boolean = js.native
    
    def toPromise(): js.Promise[_] = js.native
    
    /**
      * The type of the rejection.
      *
      * This value is an number representing the type of transition rejection.
      * If using Typescript, this is a Typescript enum.
      *
      * - [[RejectType.SUPERSEDED]] (`2`)
      * - [[RejectType.ABORTED]] (`3`)
      * - [[RejectType.INVALID]] (`4`)
      * - [[RejectType.IGNORED]] (`5`)
      * - [[RejectType.ERROR]] (`6`)
      *
      */
    var `type`: RejectType = js.native
  }
  /* static members */
  object Rejection {
    
    /** Returns a Rejection due to aborted transition */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.aborted")
    @js.native
    def aborted(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.aborted")
    @js.native
    def aborted(detail: js.Any): Rejection = js.native
    
    /** Returns a Rejection due to aborted transition */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.errored")
    @js.native
    def errored(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.errored")
    @js.native
    def errored(detail: js.Any): Rejection = js.native
    
    /** Returns a Rejection due to ignored transition */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.ignored")
    @js.native
    def ignored(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.ignored")
    @js.native
    def ignored(detail: js.Any): Rejection = js.native
    
    /** Returns a Rejection due to invalid transition */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.invalid")
    @js.native
    def invalid(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.invalid")
    @js.native
    def invalid(detail: js.Any): Rejection = js.native
    
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.isRejectionPromise")
    @js.native
    def isRejectionPromise(obj: js.Any): Boolean = js.native
    
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.normalize")
    @js.native
    def normalize(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.normalize")
    @js.native
    def normalize(detail: js.Any): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.normalize")
    @js.native
    def normalize(detail: Error): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.normalize")
    @js.native
    def normalize(detail: Rejection): Rejection = js.native
    
    /** Returns a Rejection due to redirected transition */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.redirected")
    @js.native
    def redirected(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.redirected")
    @js.native
    def redirected(detail: js.Any): Rejection = js.native
    
    /** Returns a Rejection due to transition superseded */
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.superseded")
    @js.native
    def superseded(): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.superseded")
    @js.native
    def superseded(detail: js.UndefOr[scala.Nothing], options: js.Any): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.superseded")
    @js.native
    def superseded(detail: js.Any): Rejection = js.native
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection.superseded")
    @js.native
    def superseded(detail: js.Any, options: js.Any): Rejection = js.native
  }
}
