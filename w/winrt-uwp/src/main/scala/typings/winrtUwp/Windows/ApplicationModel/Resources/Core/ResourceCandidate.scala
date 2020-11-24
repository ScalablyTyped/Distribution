package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single possible value for a given NamedResource , the qualifiers associated with that resource, and how well those qualifiers match the context against which it was resolved. */
@js.native
trait ResourceCandidate extends js.Object {
  
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
  
  @scala.inline
  implicit class ResourceCandidateOps[Self <: ResourceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetQualifierValue(value: String => String): Self = this.set("getQualifierValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueAsFileAsync(value: () => IPromiseWithIAsyncOperation[StorageFile]): Self = this.set("getValueAsFileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAsStreamAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStream]): Self = this.set("getValueAsStreamAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMatch(value: Boolean): Self = this.set("isMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMatchAsDefault(value: Boolean): Self = this.set("isMatchAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiers(value: IVectorView[ResourceQualifier]): Self = this.set("qualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAsString(value: String): Self = this.set("valueAsString", value.asInstanceOf[js.Any])
  }
}
