package typings.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransform extends js.Object {
  
  /**
    * Rotation in degrees.
    */
  var rotate: Double = js.native
  
  /**
    * Translation in pixels.
    */
  var translate: js.Tuple2[Double, Double] = js.native
}
object ITransform {
  
  @scala.inline
  def apply(rotate: Double, translate: js.Tuple2[Double, Double]): ITransform = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransform]
  }
  
  @scala.inline
  implicit class ITransformOps[Self <: ITransform] (val x: Self) extends AnyVal {
    
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
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate(value: js.Tuple2[Double, Double]): Self = this.set("translate", value.asInstanceOf[js.Any])
  }
}
