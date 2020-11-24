package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends js.Object {
  
  var full: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var oneLevel: scala.Double = js.native
  
  var oneLevelPlusNestedEmptyFolders: scala.Double = js.native
}
object Full {
  
  @scala.inline
  def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
    
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
    def setFull(value: scala.Double): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneLevel(value: scala.Double): Self = this.set("oneLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneLevelPlusNestedEmptyFolders(value: scala.Double): Self = this.set("oneLevelPlusNestedEmptyFolders", value.asInstanceOf[js.Any])
  }
}
