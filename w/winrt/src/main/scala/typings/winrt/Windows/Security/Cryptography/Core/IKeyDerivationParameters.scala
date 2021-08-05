package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyDerivationParameters extends StObject {
  
  var iterationCount: Double
  
  var kdfGenericBinary: IBuffer
}
object IKeyDerivationParameters {
  
  inline def apply(iterationCount: Double, kdfGenericBinary: IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
  
  extension [Self <: IKeyDerivationParameters](x: Self) {
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setKdfGenericBinary(value: IBuffer): Self = StObject.set(x, "kdfGenericBinary", value.asInstanceOf[js.Any])
  }
}
