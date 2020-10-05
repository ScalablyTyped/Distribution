package typings.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  var activeRouteAutoSelection: js.UndefOr[Boolean] = js.native
  var boundsAutoApply: js.UndefOr[Boolean] = js.native
  var dragUpdateInterval: js.UndefOr[String | Double] = js.native
  var preventDragUpdate: js.UndefOr[Boolean] = js.native
  var useMapMargin: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
}

object Dictindex {
  @scala.inline
  def apply(): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
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
    def setActiveRouteAutoSelection(value: Boolean): Self = this.set("activeRouteAutoSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveRouteAutoSelection: Self = this.set("activeRouteAutoSelection", js.undefined)
    @scala.inline
    def setBoundsAutoApply(value: Boolean): Self = this.set("boundsAutoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsAutoApply: Self = this.set("boundsAutoApply", js.undefined)
    @scala.inline
    def setDragUpdateInterval(value: String | Double): Self = this.set("dragUpdateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragUpdateInterval: Self = this.set("dragUpdateInterval", js.undefined)
    @scala.inline
    def setPreventDragUpdate(value: Boolean): Self = this.set("preventDragUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDragUpdate: Self = this.set("preventDragUpdate", js.undefined)
    @scala.inline
    def setUseMapMargin(value: Boolean): Self = this.set("useMapMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapMargin: Self = this.set("useMapMargin", js.undefined)
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("zoomMargin", js.Array(value :_*))
    @scala.inline
    def setZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("zoomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMargin: Self = this.set("zoomMargin", js.undefined)
  }
  
}

