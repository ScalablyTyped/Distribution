package typings.styletronReact.mod

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.styletronStandard.mod.StandardEngine
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyledOptions extends js.Object {
  
  var driver: StyletronDriver = js.native
  
  var getInitialStyle: StyletronGetInitialStyle = js.native
  
  var wrapper: StyletronWrapper = js.native
}
object CreateStyledOptions {
  
  @scala.inline
  def apply(
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    wrapper: /* fc */ FC[js.Any] => ComponentType[js.Any]
  ): CreateStyledOptions = {
    val __obj = js.Dynamic.literal(driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), wrapper = js.Any.fromFunction1(wrapper))
    __obj.asInstanceOf[CreateStyledOptions]
  }
  
  @scala.inline
  implicit class CreateStyledOptionsOps[Self <: CreateStyledOptions] (val x: Self) extends AnyVal {
    
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
    def setDriver(value: (/* style */ StyleObject, /* styletron */ StandardEngine) => String): Self = this.set("driver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInitialStyle(value: () => StyleObject): Self = this.set("getInitialStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrapper(value: /* fc */ FC[js.Any] => ComponentType[js.Any]): Self = this.set("wrapper", js.Any.fromFunction1(value))
  }
}
