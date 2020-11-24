package typings.vegaTypings.configMod

import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.layoutMod.LayoutBounds
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLegendLayout extends js.Object {
  
  /**
    * The anchor point for legend orient group layout.
    */
  var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.native
  
  /**
    * The bounds calculation to use for legend orient group layout.
    */
  var bounds: js.UndefOr[LayoutBounds] = js.native
  
  /**
    * A flag to center legends within a shared orient group.
    */
  var center: js.UndefOr[Boolean | SignalRef] = js.native
  
  /**
    * The layout direction for legend orient group layout.
    */
  var direction: js.UndefOr[Orientation | SignalRef] = js.native
  
  /**
    * The pixel margin between legends within a orient group.
    */
  var margin: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The pixel offset from the chart body for a legend orient group.
    */
  var offset: js.UndefOr[Double | SignalRef] = js.native
}
object BaseLegendLayout {
  
  @scala.inline
  def apply(): BaseLegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegendLayout]
  }
  
  @scala.inline
  implicit class BaseLegendLayoutOps[Self <: BaseLegendLayout] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: TitleAnchor | SignalRef): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorNull: Self = this.set("anchor", null)
    
    @scala.inline
    def setBounds(value: LayoutBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean | SignalRef): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDirection(value: Orientation | SignalRef): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | SignalRef): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | SignalRef): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
