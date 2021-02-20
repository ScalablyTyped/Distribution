package typings.winrtUwp.Windows.Security.Cryptography

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a class that enables you to easily encrypt and decrypt static data or a data stream. */
object DataProtection {
  
  /** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
  @js.native
  trait DataProtectionProvider extends StObject {
    
    /**
      * Asynchronously protects static data.
      * @param data Data to protect.
      * @return Represents an asynchronous operation.
      */
    def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
    
    /**
      * Asynchronously protects a data stream.
      * @param src Stream to be protected.
      * @param dest Protected stream.
      * @return Represents an asynchronous action.
      */
    def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously decrypts static data.
      * @param data Data to decrypt.
      * @return Represents an asynchronous operation.
      */
    def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
    
    /**
      * Asynchronously decrypts a data stream.
      * @param src Stream to decrypt.
      * @param dest Decrypted stream.
      * @return Represents an asynchronous action.
      */
    def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
  }
  object DataProtectionProvider {
    
    @scala.inline
    def apply(
      protectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
      protectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction,
      unprotectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
      unprotectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction
    ): DataProtectionProvider = {
      val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
      __obj.asInstanceOf[DataProtectionProvider]
    }
    
    @scala.inline
    implicit class DataProtectionProviderMutableBuilder[Self <: DataProtectionProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "protectAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = StObject.set(x, "protectStreamAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnprotectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "unprotectAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = StObject.set(x, "unprotectStreamAsync", js.Any.fromFunction2(value))
    }
  }
}
