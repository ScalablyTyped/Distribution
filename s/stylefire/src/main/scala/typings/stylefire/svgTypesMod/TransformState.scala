package typings.stylefire.svgTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformState extends /* key */ StringDictionary[String] {
  
  var rotate: String = js.native
  
  var scale: String = js.native
  
  var skewX: String = js.native
  
  var skewY: String = js.native
  
  var translate: String = js.native
}
object TransformState {
  
  @scala.inline
  def apply(rotate: String, scale: String, skewX: String, skewY: String, translate: String): TransformState = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformState]
  }
  
  @scala.inline
  implicit class TransformStateOps[Self <: TransformState] (val x: Self) extends AnyVal {
    
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
    def setRotate(value: String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewX(value: String): Self = this.set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewY(value: String): Self = this.set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate(value: String): Self = this.set("translate", value.asInstanceOf[js.Any])
  }
}
