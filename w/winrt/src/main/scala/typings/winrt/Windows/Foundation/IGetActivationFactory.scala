package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetActivationFactory extends js.Object {
  
  def getActivationFactory(activatableClassId: String): js.Any = js.native
}
object IGetActivationFactory {
  
  @scala.inline
  def apply(getActivationFactory: String => js.Any): IGetActivationFactory = {
    val __obj = js.Dynamic.literal(getActivationFactory = js.Any.fromFunction1(getActivationFactory))
    __obj.asInstanceOf[IGetActivationFactory]
  }
  
  @scala.inline
  implicit class IGetActivationFactoryOps[Self <: IGetActivationFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetActivationFactory(value: String => js.Any): Self = this.set("getActivationFactory", js.Any.fromFunction1(value))
  }
}
