package typings.victory.anon

import typings.victory.mod.OrientationTypes
import typings.victory.victoryStrings.horizontal
import typings.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gutter :number | undefined,   orientation :'vertical' | 'horizontal' | undefined,   titleOrientation :victory.victory.OrientationTypes | undefined,   style :{  data :react.react.CSSProperties & {  type :victory.victory.ScatterSymbolType | undefined} | undefined,   labels :react.react.CSSProperties | undefined,   title :react.react.CSSProperties | undefined} | undefined} & victory.victory.ThemeBaseProps */
@js.native
trait gutternumberundefinedorie extends js.Object {
  
  var colorScale: js.Array[String] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
  
  var height: Double = js.native
  
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[Labels] = js.native
  
  var titleOrientation: js.UndefOr[OrientationTypes] = js.native
  
  var width: Double = js.native
}
object gutternumberundefinedorie {
  
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): gutternumberundefinedorie = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[gutternumberundefinedorie]
  }
  
  @scala.inline
  implicit class gutternumberundefinedorieOps[Self <: gutternumberundefinedorie] (val x: Self) extends AnyVal {
    
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
    def setColorScaleVarargs(value: String*): Self = this.set("colorScale", js.Array(value :_*))
    
    @scala.inline
    def setColorScale(value: js.Array[String]): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStyle(value: Labels): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitleOrientation(value: OrientationTypes): Self = this.set("titleOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOrientation: Self = this.set("titleOrientation", js.undefined)
  }
}
