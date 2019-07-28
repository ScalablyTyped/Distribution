package typings.atUirouterAngularjs.atUirouterAngularjsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Rejection")
@js.native
class Rejection protected ()
  extends typings.atUirouterCore.atUirouterCoreMod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: String, detail: js.Any) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "Rejection")
@js.native
object Rejection extends js.Object {
  /** Returns a Rejection due to aborted transition */
  def aborted(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def aborted(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to aborted transition */
  def errored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def errored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to ignored transition */
  def ignored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def ignored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to invalid transition */
  def invalid(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def invalid(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
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
  def normalize(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: Error): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to redirected transition */
  def redirected(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def redirected(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to transition superseded */
  def superseded(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any, options: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
}

