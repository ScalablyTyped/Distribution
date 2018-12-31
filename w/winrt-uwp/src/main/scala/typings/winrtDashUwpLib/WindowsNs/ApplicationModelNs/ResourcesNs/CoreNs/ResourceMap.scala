package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of related resources, typically either for a particular app package, or a resource file for a particular package. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
@js.native
abstract class ResourceMap () extends js.Object {
  /** Gets the number of resources in the map. */
  var size: scala.Double = js.native
  /** Gets a URI that can be used to refer to this ResourceMap . */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Returns an iterator to enumerate the items in the map.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set if the map is empty.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Returns a ResourceMap that represents a subtree of another ResourceMap, typically used to access a particular resource file within an app package.
    * @param reference A resource map identifier that identifies the root of the new subtree.
    * @return The subtree ResourceMap .
    */
  def getSubtree(reference: java.lang.String): ResourceMap = js.native
  /**
    * Returns the most appropriate candidate for a resource that is specified by a resource identifier within the default context.
    * @param resource A resource identifier specified as a name or reference.
    * @return A ResourceCandidate that describes the most appropriate candidate.
    */
  def getValue(resource: java.lang.String): ResourceCandidate = js.native
  /**
    * Returns the most appropriate candidate for a resource that is specified by a resource identifier for the supplied context.
    * @param resource A resource specified as a name or reference.
    * @param context The context for which to select the most appropriate candidate.
    * @return A ResourceCandidate that describes the most appropriate candidate.
    */
  def getValue(resource: java.lang.String, context: ResourceContext): ResourceCandidate = js.native
  /**
    * Determines whether the map can retrieve a resource with the specified resource identifier.
    * @param key The resource identifier to locate in the map.
    * @return TRUE if the key is found, otherwise FALSE.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the NamedResource at the specified resource identifier in the map.
    * @param key The resource identifier to use to locate the resource in the map.
    * @return The NamedResource associated with the specified key.
    */
  def lookup(key: java.lang.String): NamedResource = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): winrtDashUwpLib.Anon_Second = js.native
}

