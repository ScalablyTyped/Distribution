package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
@js.native
abstract class ResourceCandidate () extends js.Object {
  /** Indicates whether this ResourceCandidate can be used as a default fallback value for any context. */
  var isDefault: Boolean = js.native
  /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated. */
  var isMatch: Boolean = js.native
  /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated as a result of being a true match, a default fallback value, or a mixed match with default fallback (that is, a match in relation to some qualifiers but using default fallback values for other qualifiers). */
  var isMatchAsDefault: Boolean = js.native
  /** Gets the qualifiers associated with this ResourceCandidate . */
  var qualifiers: IVectorView[ResourceQualifier] = js.native
  /** Gets the value of this ResourceCandidate , expressed as a string. */
  var valueAsString: String = js.native
  /**
    * Returns the value of a qualifier, given its name.
    * @param qualifierName The name of the qualifier.
    * @return The value of the qualifier.
    */
  def getQualifierValue(qualifierName: String): String = js.native
  /**
    * Asynchronously returns a StorageFile that accesses the value of this ResourceCandidate . This only works on certain types of ResourceCandidates that are files.
    * @return An asynchronous operation to return the requested StorageFile .
    */
  def getValueAsFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Asynchronously returns an IRandomAccessStream that accesses the value of this ResourceCandidate .
    * @return An asynchronous operation to return the requested IRandomAccessStream .
    */
  def getValueAsStreamAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
}

