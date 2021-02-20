package typings.uirouterAngularjs.mod.core

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.Rejection")
@js.native
class Rejection protected ()
  extends typings.uirouterCore.mod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: js.UndefOr[scala.Nothing], detail: js.Any) = this()
  def this(`type`: Double, message: String, detail: js.Any) = this()
}
/* static members */
object Rejection {
  
  /** Returns a Rejection due to aborted transition */
  @JSImport("@uirouter/angularjs", "core.Rejection.aborted")
  @js.native
  def aborted(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.aborted")
  @js.native
  def aborted(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to aborted transition */
  @JSImport("@uirouter/angularjs", "core.Rejection.errored")
  @js.native
  def errored(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.errored")
  @js.native
  def errored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to ignored transition */
  @JSImport("@uirouter/angularjs", "core.Rejection.ignored")
  @js.native
  def ignored(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.ignored")
  @js.native
  def ignored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to invalid transition */
  @JSImport("@uirouter/angularjs", "core.Rejection.invalid")
  @js.native
  def invalid(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.invalid")
  @js.native
  def invalid(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
  @JSImport("@uirouter/angularjs", "core.Rejection.isRejectionPromise")
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
  @JSImport("@uirouter/angularjs", "core.Rejection.normalize")
  @js.native
  def normalize(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.normalize")
  @js.native
  def normalize(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.normalize")
  @js.native
  def normalize(detail: Error): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.normalize")
  @js.native
  def normalize(detail: typings.uirouterCore.rejectFactoryMod.Rejection): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to redirected transition */
  @JSImport("@uirouter/angularjs", "core.Rejection.redirected")
  @js.native
  def redirected(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.redirected")
  @js.native
  def redirected(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to transition superseded */
  @JSImport("@uirouter/angularjs", "core.Rejection.superseded")
  @js.native
  def superseded(): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.superseded")
  @js.native
  def superseded(detail: js.UndefOr[scala.Nothing], options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.superseded")
  @js.native
  def superseded(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "core.Rejection.superseded")
  @js.native
  def superseded(detail: js.Any, options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = js.native
}
