package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxSize extends js.Object {
  
  /**
  		 * Sets the name delimiter for created chunks
  		 */
  var automaticNameDelimiter: js.UndefOr[String] = js.native
  
  /**
  		 * Maximal size hint for the created chunks
  		 */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
  		 * Minimal size for the created chunk
  		 */
  var minSize: js.UndefOr[Double] = js.native
}
object MaxSize {
  
  @scala.inline
  def apply(): MaxSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize]
  }
  
  @scala.inline
  implicit class MaxSizeOps[Self <: MaxSize] (val x: Self) extends AnyVal {
    
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
    def setAutomaticNameDelimiter(value: String): Self = this.set("automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticNameDelimiter: Self = this.set("automaticNameDelimiter", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
}
