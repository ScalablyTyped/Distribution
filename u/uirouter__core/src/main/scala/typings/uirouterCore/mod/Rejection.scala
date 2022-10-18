package typings.uirouterCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "Rejection")
@js.native
open class Rejection protected ()
  extends typings.uirouterCore.libTransitionMod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: String, detail: Any) = this()
  def this(`type`: Double, message: Unit, detail: Any) = this()
}
/* static members */
object Rejection {
  
  @JSImport("@uirouter/core", "Rejection")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a Rejection due to aborted transition */
  inline def aborted(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def aborted(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to aborted transition */
  inline def errored(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def errored(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to ignored transition */
  inline def ignored(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def ignored(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to invalid transition */
  inline def invalid(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def invalid(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
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
  inline def normalize(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: js.Error): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: typings.uirouterCore.libTransitionRejectFactoryMod.Rejection): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to redirected transition */
  inline def redirected(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def redirected(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to transition superseded */
  inline def superseded(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Any, options: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Unit, options: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
}
