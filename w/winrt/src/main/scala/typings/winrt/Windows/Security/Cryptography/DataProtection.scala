package typings.winrt.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataProtection {
  
  trait DataProtectionProvider
    extends StObject
       with IDataProtectionProvider
  object DataProtectionProvider {
    
    inline def apply(
      protectAsync: IBuffer => IAsyncOperation[IBuffer],
      protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
      unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
      unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
    ): DataProtectionProvider = {
      val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
      __obj.asInstanceOf[DataProtectionProvider]
    }
  }
  
  trait IDataProtectionProvider extends StObject {
    
    def protectAsync(data: IBuffer): IAsyncOperation[IBuffer]
    
    def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
    
    def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer]
    
    def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
  }
  object IDataProtectionProvider {
    
    inline def apply(
      protectAsync: IBuffer => IAsyncOperation[IBuffer],
      protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
      unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
      unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
    ): IDataProtectionProvider = {
      val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
      __obj.asInstanceOf[IDataProtectionProvider]
    }
    
    extension [Self <: IDataProtectionProvider](x: Self) {
      
      inline def setProtectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = StObject.set(x, "protectAsync", js.Any.fromFunction1(value))
      
      inline def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = StObject.set(x, "protectStreamAsync", js.Any.fromFunction2(value))
      
      inline def setUnprotectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = StObject.set(x, "unprotectAsync", js.Any.fromFunction1(value))
      
      inline def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = StObject.set(x, "unprotectStreamAsync", js.Any.fromFunction2(value))
    }
  }
  
  trait IDataProtectionProviderFactory extends StObject {
    
    def createOverloadExplicit(protectionDescriptor: String): DataProtectionProvider
  }
  object IDataProtectionProviderFactory {
    
    inline def apply(createOverloadExplicit: String => DataProtectionProvider): IDataProtectionProviderFactory = {
      val __obj = js.Dynamic.literal(createOverloadExplicit = js.Any.fromFunction1(createOverloadExplicit))
      __obj.asInstanceOf[IDataProtectionProviderFactory]
    }
    
    extension [Self <: IDataProtectionProviderFactory](x: Self) {
      
      inline def setCreateOverloadExplicit(value: String => DataProtectionProvider): Self = StObject.set(x, "createOverloadExplicit", js.Any.fromFunction1(value))
    }
  }
}
