package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitializeWithCoreWindow extends StObject {
  
  def initialize(window: CoreWindow): Unit = js.native
}
object IInitializeWithCoreWindow {
  
  @scala.inline
  def apply(initialize: CoreWindow => Unit): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
  
  @scala.inline
  implicit class IInitializeWithCoreWindowMutableBuilder[Self <: IInitializeWithCoreWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: CoreWindow => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
  }
}
