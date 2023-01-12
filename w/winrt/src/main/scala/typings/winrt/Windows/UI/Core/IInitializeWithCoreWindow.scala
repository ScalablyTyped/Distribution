package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitializeWithCoreWindow extends StObject {
  
  def initialize(window: CoreWindow): Unit
}
object IInitializeWithCoreWindow {
  
  inline def apply(initialize: CoreWindow => Unit): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInitializeWithCoreWindow] (val x: Self) extends AnyVal {
    
    inline def setInitialize(value: CoreWindow => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
  }
}
