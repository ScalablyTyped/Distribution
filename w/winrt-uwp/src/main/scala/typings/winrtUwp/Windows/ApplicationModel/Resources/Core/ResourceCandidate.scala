package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
trait ResourceCandidate extends js.Object {
  /** Indicates whether this ResourceCandidate can be used as a default fallback value for any context. */
  var isDefault: Boolean
  /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated. */
  var isMatch: Boolean
  /** Indicates whether this ResourceCandidate matched the ResourceContext against which it was evaluated as a result of being a true match, a default fallback value, or a mixed match with default fallback (that is, a match in relation to some qualifiers but using default fallback values for other qualifiers). */
  var isMatchAsDefault: Boolean
  /** Gets the qualifiers associated with this ResourceCandidate . */
  var qualifiers: IVectorView[ResourceQualifier]
  /** Gets the value of this ResourceCandidate , expressed as a string. */
  var valueAsString: String
  /**
    * Returns the value of a qualifier, given its name.
    * @param qualifierName The name of the qualifier.
    * @return The value of the qualifier.
    */
  def getQualifierValue(qualifierName: String): String
  /**
    * Asynchronously returns a StorageFile that accesses the value of this ResourceCandidate . This only works on certain types of ResourceCandidates that are files.
    * @return An asynchronous operation to return the requested StorageFile .
    */
  def getValueAsFileAsync(): IPromiseWithIAsyncOperation[StorageFile]
  /**
    * Asynchronously returns an IRandomAccessStream that accesses the value of this ResourceCandidate .
    * @return An asynchronous operation to return the requested IRandomAccessStream .
    */
  def getValueAsStreamAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream]
}

object ResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    getValueAsFileAsync: () => IPromiseWithIAsyncOperation[StorageFile],
    getValueAsStreamAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStream],
    isDefault: Boolean,
    isMatch: Boolean,
    isMatchAsDefault: Boolean,
    qualifiers: IVectorView[ResourceQualifier],
    valueAsString: String
  ): ResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), getValueAsStreamAsync = js.Any.fromFunction0(getValueAsStreamAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCandidate]
  }
}

