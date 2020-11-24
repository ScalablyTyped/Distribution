package typings.svgSprite.mod

import typings.svgSprite.anon.Attributes
import typings.svgSprite.anon.Box
import typings.svgSprite.anon.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All settings affecting the SVG shapes of the sprite
  */
@js.native
trait Shape extends js.Object {
  
  /**
    * Path to YAML file with extended alignment data
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * Output directory for optimized intermediate SVG shapes
    */
  var dest: js.UndefOr[String] = js.native
  
  /**
    * Dimension related options
    */
  var dimension: js.UndefOr[Attributes] = js.native
  
  /**
    * SVG shape ID related options
    */
  var id: js.UndefOr[Generator] = js.native
  
  /**
    * Path to YAML file with meta / accessibility data
    */
  var meta: js.UndefOr[String] = js.native
  
  /**
    * Spacing related options
    */
  var spacing: js.UndefOr[Box] = js.native
  
  /**
    * List of transformations / optimizations
    */
  var transform: js.UndefOr[js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]] = js.native
}
object Shape {
  
  @scala.inline
  def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setDimension(value: Attributes): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setId(value: Generator): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setSpacing(value: Box): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: (String | CustomConfigurationTransform | CustomCallbackTransform)*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
