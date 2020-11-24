package typings.vegaTypings.markMod

import typings.vegaTypings.onTriggerMod.OnMarkTrigger
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMark extends js.Object {
  
  var aria: js.UndefOr[Boolean] = js.native
  
  var clip: js.UndefOr[Clip] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[From] = js.native
  
  var interactive: js.UndefOr[Boolean | SignalRef] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var on: js.UndefOr[js.Array[OnMarkTrigger]] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var style: js.UndefOr[String | js.Array[String]] = js.native
  
  var transform: js.UndefOr[js.Array[Transforms]] = js.native
  
  var zindex: js.UndefOr[Double] = js.native
}
object BaseMark {
  
  @scala.inline
  def apply(): BaseMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMark]
  }
  
  @scala.inline
  implicit class BaseMarkOps[Self <: BaseMark] (val x: Self) extends AnyVal {
    
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
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setClip(value: Clip): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFrom(value: From): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean | SignalRef): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnVarargs(value: OnMarkTrigger*): Self = this.set("on", js.Array(value :_*))
    
    @scala.inline
    def setOn(value: js.Array[OnMarkTrigger]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Transforms*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Transforms]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
