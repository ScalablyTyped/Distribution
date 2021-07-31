package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReadyLicense class iterator. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable")
@js.native
/** Initializes a new instance of the PlayReadyLicenseIterable class. */
class PlayReadyLicenseIterable ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable {
  /**
    * Initializes a new instance of the PlayReadyLicenseIterable class.
    * @param contentHeader The content header used to locate associated licenses.
    * @param fullyEvaluated Indicates whether evaluated license chains should be enumerated or if all licenses (including those that are unusable) should be enumerated. This parameter is true if evaluated license chains should be enumerated, or false if all licenses should be enumerated.
    */
  def this(
    contentHeader: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader,
    fullyEvaluated: Boolean
  ) = this()
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  /* CompleteClass */
  override def first(): IIterator[IPlayReadyLicense] = js.native
}
