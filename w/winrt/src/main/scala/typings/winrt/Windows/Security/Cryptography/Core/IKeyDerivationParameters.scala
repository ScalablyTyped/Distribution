package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyDerivationParameters extends StObject {
  
  var iterationCount: Double = js.native
  
  var kdfGenericBinary: IBuffer = js.native
}
object IKeyDerivationParameters {
  
  @scala.inline
  def apply(iterationCount: Double, kdfGenericBinary: IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
  
  @scala.inline
  implicit class IKeyDerivationParametersMutableBuilder[Self <: IKeyDerivationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdfGenericBinary(value: IBuffer): Self = StObject.set(x, "kdfGenericBinary", value.asInstanceOf[js.Any])
  }
}
