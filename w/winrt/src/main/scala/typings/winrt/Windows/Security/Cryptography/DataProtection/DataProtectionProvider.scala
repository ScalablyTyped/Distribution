package typings.winrt.Windows.Security.Cryptography.DataProtection

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProtectionProvider extends IDataProtectionProvider
object DataProtectionProvider {
  
  @scala.inline
  def apply(
    protectAsync: IBuffer => IAsyncOperation[IBuffer],
    protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
    unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
    unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
  ): DataProtectionProvider = {
    val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
    __obj.asInstanceOf[DataProtectionProvider]
  }
}
