package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Second extends js.Object {
  
  /** The first part of the original map. */ var first: IMapView[String, _] = js.native
  
  /** The second part of the original map. */ var second: IMapView[String, _] = js.native
}
object Second {
  
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  
  @scala.inline
  implicit class SecondOps[Self <: Second] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: IMapView[String, _]): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, _]): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
