package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.DataProtection")
@js.native
object DataProtection extends js.Object {
  @js.native
  class DataProtectionProvider ()
    extends typings.winrt.Windows.Security.Cryptography.DataProtection.DataProtectionProvider {
    def this(protectionDescriptor: String) = this()
    /* CompleteClass */
    override def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
    /* CompleteClass */
    override def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
    /* CompleteClass */
    override def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
    /* CompleteClass */
    override def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  }
  
}

