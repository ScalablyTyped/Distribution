package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CashtagWithIndices extends EntityWithIndices {
  
  var cashtag: String = js.native
  
  var indices: js.Tuple2[Double, Double] = js.native
}
object CashtagWithIndices {
  
  @scala.inline
  def apply(cashtag: String, indices: js.Tuple2[Double, Double]): CashtagWithIndices = {
    val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashtagWithIndices]
  }
  
  @scala.inline
  implicit class CashtagWithIndicesOps[Self <: CashtagWithIndices] (val x: Self) extends AnyVal {
    
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
    def setCashtag(value: String): Self = this.set("cashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
  }
}
