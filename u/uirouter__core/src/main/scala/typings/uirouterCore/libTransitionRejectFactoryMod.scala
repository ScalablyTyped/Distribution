package typings.uirouterCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransitionRejectFactoryMod {
  
  @js.native
  sealed trait RejectType extends StObject
  @JSImport("@uirouter/core/lib/transition/rejectFactory", "RejectType")
  @js.native
  object RejectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RejectType & Double] = js.native
    
    /**
      * The transition was aborted
      *
      * The transition was aborted by a hook which returned `false`
      */
    @js.native
    sealed trait ABORTED
      extends StObject
         with RejectType
    /* 3 */ val ABORTED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED & Double = js.native
    
    /**
      * The transition errored.
      *
      * This generally means a hook threw an error or returned a rejected promise
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with RejectType
    /* 6 */ val ERROR: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR & Double = js.native
    
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
    sealed trait IGNORED
      extends StObject
         with RejectType
    /* 5 */ val IGNORED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED & Double = js.native
    
    /**
      * The transition was invalid
      *
      * The transition was never started because it was invalid
      */
    @js.native
    sealed trait INVALID
      extends StObject
         with RejectType
    /* 4 */ val INVALID: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID & Double = js.native
    
    /**
      * A new transition superseded this one.
      *
      * While this transition was running, a new transition started.
      * This transition is cancelled because it was superseded by new transition.
      */
    @js.native
    sealed trait SUPERSEDED
      extends StObject
         with RejectType
    /* 2 */ val SUPERSEDED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection")
  @js.native
  open class Rejection protected () extends StObject {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: Any) = this()
    def this(`type`: Double, message: Unit, detail: Any) = this()
    
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
    var detail: Any = js.native
    
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
    
    def toPromise(): js.Promise[Any] = js.native
    
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
    
    @JSImport("@uirouter/core/lib/transition/rejectFactory", "Rejection")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a Rejection due to aborted transition */
    inline def aborted(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[Rejection]
    inline def aborted(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns a Rejection due to aborted transition */
    inline def errored(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[Rejection]
    inline def errored(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns a Rejection due to ignored transition */
    inline def ignored(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[Rejection]
    inline def ignored(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns a Rejection due to invalid transition */
    inline def invalid(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[Rejection]
    inline def invalid(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    inline def isRejectionPromise(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejectionPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    inline def normalize(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[Rejection]
    inline def normalize(detail: js.Error): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    inline def normalize(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    inline def normalize(detail: Rejection): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns a Rejection due to redirected transition */
    inline def redirected(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[Rejection]
    inline def redirected(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    
    /** Returns a Rejection due to transition superseded */
    inline def superseded(): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[Rejection]
    inline def superseded(detail: Any): Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[Rejection]
    inline def superseded(detail: Any, options: Any): Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rejection]
    inline def superseded(detail: Unit, options: Any): Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rejection]
  }
}
