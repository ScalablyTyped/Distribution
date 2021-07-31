package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashComputation extends StObject {
  
  def append(data: IBuffer): Unit
  
  def getValueAndReset(): IBuffer
}
object IHashComputation {
  
  @scala.inline
  def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): IHashComputation = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
    __obj.asInstanceOf[IHashComputation]
  }
  
  @scala.inline
  implicit class IHashComputationMutableBuilder[Self <: IHashComputation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: IBuffer => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueAndReset(value: () => IBuffer): Self = StObject.set(x, "getValueAndReset", js.Any.fromFunction0(value))
  }
}
