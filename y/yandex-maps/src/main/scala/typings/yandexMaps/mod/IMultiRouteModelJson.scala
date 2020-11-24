package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRouteModelJson extends js.Object {
  
  var params: IMultiRouteParams = js.native
  
  var referencePoints: js.Array[IMultiRouteReferencePoint] = js.native
}
object IMultiRouteModelJson {
  
  @scala.inline
  def apply(params: IMultiRouteParams, referencePoints: js.Array[IMultiRouteReferencePoint]): IMultiRouteModelJson = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], referencePoints = referencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiRouteModelJson]
  }
  
  @scala.inline
  implicit class IMultiRouteModelJsonOps[Self <: IMultiRouteModelJson] (val x: Self) extends AnyVal {
    
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
    def setParams(value: IMultiRouteParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencePointsVarargs(value: IMultiRouteReferencePoint*): Self = this.set("referencePoints", js.Array(value :_*))
    
    @scala.inline
    def setReferencePoints(value: js.Array[IMultiRouteReferencePoint]): Self = this.set("referencePoints", value.asInstanceOf[js.Any])
  }
}
