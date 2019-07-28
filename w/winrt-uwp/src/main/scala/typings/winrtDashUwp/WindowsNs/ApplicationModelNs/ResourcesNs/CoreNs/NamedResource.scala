package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single logical, named resource, such as a string resource named 'Header1'. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
@js.native
abstract class NamedResource () extends js.Object {
  /** Gets all possible candidate values for this named resource. */
  var candidates: IVectorView[ResourceCandidate] = js.native
  /** Gets a URI that can be used to refer to this named resource. */
  var uri: Uri = js.native
  /**
    * Resolves this NamedResource object against the default context and returns the most appropriate candidate.
    * @return The most appropriate candidate for the default context.
    */
  def resolve(): ResourceCandidate = js.native
  /**
    * Resolves this NamedResource object against a supplied context and returns the most appropriate candidate.
    * @param resourceContext The context against which the NamedResource should be resolved.
    * @return The most appropriate candidate for the specified context.
    */
  def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
  /**
    * Resolves this NamedResource object against the default context and returns a list of all possible candidates in preference order.
    * @return A list of ResourceCandidate objects, in order of preference. The object in first position in the list is the most appropriate candidate for the corresponding context, and the object in last position is the least appropriate.
    */
  def resolveAll(): IVectorView[ResourceCandidate] = js.native
  /**
    * Resolves this NamedResource object against a supplied context and returns a list of all possible candidates in preference order.
    * @param resourceContext The context against which the NamedResource should be resolved.
    * @return A list of ResourceCandidate objects, in order of preference. The object in first position in the list is the most appropriate candidate for the corresponding context, and the object in last position is the least appropriate.
    */
  def resolveAll(resourceContext: ResourceContext): IVectorView[ResourceCandidate] = js.native
}

