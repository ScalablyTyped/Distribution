package typings.vueScrollto.mod

import typings.std.Element
import typings.std.Event
import typings.vueScrollto.vueScrolltoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollOptions extends js.Object {
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[ElementDescriptor] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String | (js.Tuple4[Double, Double, Double, Double])] = js.native
  
  var el: js.UndefOr[ElementDescriptor] = js.native
  
  var element: js.UndefOr[ElementDescriptor] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[
    Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
  ] = js.native
  
  var onCancel: js.UndefOr[(js.Function2[/* event */ Event, /* element */ Element, _]) | `false`] = js.native
  
  var onDone: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
  
  var onStart: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
  
  var x: js.UndefOr[Boolean] = js.native
  
  var y: js.UndefOr[Boolean] = js.native
}
object ScrollOptions {
  
  @scala.inline
  def apply(): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollOptions]
  }
  
  @scala.inline
  implicit class ScrollOptionsOps[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    
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
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setContainer(value: ElementDescriptor): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String | (js.Tuple4[Double, Double, Double, Double])): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEl(value: ElementDescriptor): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setElement(value: ElementDescriptor): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setOffsetFunction2(value: (/* element */ ElementDescriptor, /* container */ ElementDescriptor) => Double): Self = this.set("offset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOffset(
      value: Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnCancelFunction2(value: (/* event */ Event, /* element */ Element) => _): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCancel(value: (js.Function2[/* event */ Event, /* element */ Element, _]) | `false`): Self = this.set("onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnDoneFunction1(value: /* element */ Element => _): Self = this.set("onDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDone(value: (js.Function1[/* element */ Element, _]) | `false`): Self = this.set("onDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    
    @scala.inline
    def setOnStartFunction1(value: /* element */ Element => _): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStart(value: (js.Function1[/* element */ Element, _]) | `false`): Self = this.set("onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setX(value: Boolean): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Boolean): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
