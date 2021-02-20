package typings.winrt.Windows.System

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Profile {
  
  @js.native
  trait HardwareIdentification extends StObject
  
  @js.native
  trait HardwareToken extends IHardwareToken
  object HardwareToken {
    
    @scala.inline
    def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): HardwareToken = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[HardwareToken]
    }
  }
  
  @js.native
  trait IHardwareIdentificationStatics extends StObject {
    
    def getPackageSpecificToken(nonce: IBuffer): HardwareToken = js.native
  }
  object IHardwareIdentificationStatics {
    
    @scala.inline
    def apply(getPackageSpecificToken: IBuffer => HardwareToken): IHardwareIdentificationStatics = {
      val __obj = js.Dynamic.literal(getPackageSpecificToken = js.Any.fromFunction1(getPackageSpecificToken))
      __obj.asInstanceOf[IHardwareIdentificationStatics]
    }
    
    @scala.inline
    implicit class IHardwareIdentificationStaticsMutableBuilder[Self <: IHardwareIdentificationStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPackageSpecificToken(value: IBuffer => HardwareToken): Self = StObject.set(x, "getPackageSpecificToken", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IHardwareToken extends StObject {
    
    var certificate: IBuffer = js.native
    
    var id: IBuffer = js.native
    
    var signature: IBuffer = js.native
  }
  object IHardwareToken {
    
    @scala.inline
    def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): IHardwareToken = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHardwareToken]
    }
    
    @scala.inline
    implicit class IHardwareTokenMutableBuilder[Self <: IHardwareToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: IBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: IBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: IBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
