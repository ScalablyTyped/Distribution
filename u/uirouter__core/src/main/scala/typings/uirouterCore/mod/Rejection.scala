package typings.uirouterCore.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "Rejection")
@js.native
class Rejection protected ()
  extends typings.uirouterCore.transitionMod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: String, detail: js.Any) = this()
  def this(`type`: Double, message: Unit, detail: js.Any) = this()
}
/* static members */
object Rejection {
  
  @JSImport("@uirouter/core", "Rejection")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a Rejection due to aborted transition */
  @scala.inline
  def aborted(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def aborted(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to aborted transition */
  @scala.inline
  def errored(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def errored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to ignored transition */
  @scala.inline
  def ignored(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def ignored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to invalid transition */
  @scala.inline
  def invalid(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def invalid(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
  @scala.inline
  def isRejectionPromise(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejectionPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns a Rejection
    *
    * Normalizes a value as a Rejection.
    * If the value is already a Rejection, returns it.
    * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
    *
    * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
    */
  @scala.inline
  def normalize(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def normalize(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def normalize(detail: Error): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def normalize(detail: typings.uirouterCore.rejectFactoryMod.Rejection): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to redirected transition */
  @scala.inline
  def redirected(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def redirected(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to transition superseded */
  @scala.inline
  def superseded(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def superseded(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def superseded(detail: js.Any, options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  @scala.inline
  def superseded(detail: Unit, options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
}
