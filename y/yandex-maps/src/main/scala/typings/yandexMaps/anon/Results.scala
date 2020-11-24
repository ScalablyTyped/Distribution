package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results extends js.Object {
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var strictBounds: js.UndefOr[Boolean] = js.native
}
object Results {
  
  @scala.inline
  def apply(): Results = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
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
    def setBoundedByVarargs(value: js.Array[Double]*): Self = this.set("boundedBy", js.Array(value :_*))
    
    @scala.inline
    def setBoundedBy(value: js.Array[js.Array[Double]]): Self = this.set("boundedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundedBy: Self = this.set("boundedBy", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStrictBounds(value: Boolean): Self = this.set("strictBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictBounds: Self = this.set("strictBounds", js.undefined)
  }
}
