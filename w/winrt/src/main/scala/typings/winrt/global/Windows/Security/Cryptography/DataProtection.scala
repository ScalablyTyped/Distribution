package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataProtection {
  
  @JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
  @js.native
  class DataProtectionProvider ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.DataProtection.DataProtectionProvider {
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
