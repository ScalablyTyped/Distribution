package typings.winrt.Windows.System

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Profile {
  
  trait HardwareIdentification extends StObject
  
  trait HardwareToken
    extends StObject
       with IHardwareToken
  object HardwareToken {
    
    inline def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): HardwareToken = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[HardwareToken]
    }
  }
  
  trait IHardwareIdentificationStatics extends StObject {
    
    def getPackageSpecificToken(nonce: IBuffer): HardwareToken
  }
  object IHardwareIdentificationStatics {
    
    inline def apply(getPackageSpecificToken: IBuffer => HardwareToken): IHardwareIdentificationStatics = {
      val __obj = js.Dynamic.literal(getPackageSpecificToken = js.Any.fromFunction1(getPackageSpecificToken))
      __obj.asInstanceOf[IHardwareIdentificationStatics]
    }
    
    extension [Self <: IHardwareIdentificationStatics](x: Self) {
      
      inline def setGetPackageSpecificToken(value: IBuffer => HardwareToken): Self = StObject.set(x, "getPackageSpecificToken", js.Any.fromFunction1(value))
    }
  }
  
  trait IHardwareToken extends StObject {
    
    var certificate: IBuffer
    
    var id: IBuffer
    
    var signature: IBuffer
  }
  object IHardwareToken {
    
    inline def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): IHardwareToken = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHardwareToken]
    }
    
    extension [Self <: IHardwareToken](x: Self) {
      
      inline def setCertificate(value: IBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setId(value: IBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: IBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
