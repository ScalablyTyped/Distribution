package typings.winrt.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataProtection {
  
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
  
  @js.native
  trait IDataProtectionProvider extends StObject {
    
    def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
    
    def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
    
    def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
    
    def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  }
  object IDataProtectionProvider {
    
    @scala.inline
    def apply(
      protectAsync: IBuffer => IAsyncOperation[IBuffer],
      protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
      unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
      unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
    ): IDataProtectionProvider = {
      val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
      __obj.asInstanceOf[IDataProtectionProvider]
    }
    
    @scala.inline
    implicit class IDataProtectionProviderMutableBuilder[Self <: IDataProtectionProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = StObject.set(x, "protectAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = StObject.set(x, "protectStreamAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnprotectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = StObject.set(x, "unprotectAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = StObject.set(x, "unprotectStreamAsync", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IDataProtectionProviderFactory extends StObject {
    
    def createOverloadExplicit(protectionDescriptor: String): DataProtectionProvider = js.native
  }
  object IDataProtectionProviderFactory {
    
    @scala.inline
    def apply(createOverloadExplicit: String => DataProtectionProvider): IDataProtectionProviderFactory = {
      val __obj = js.Dynamic.literal(createOverloadExplicit = js.Any.fromFunction1(createOverloadExplicit))
      __obj.asInstanceOf[IDataProtectionProviderFactory]
    }
    
    @scala.inline
    implicit class IDataProtectionProviderFactoryMutableBuilder[Self <: IDataProtectionProviderFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateOverloadExplicit(value: String => DataProtectionProvider): Self = StObject.set(x, "createOverloadExplicit", js.Any.fromFunction1(value))
    }
  }
}
