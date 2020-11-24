package typings.typeorm.utilStringUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShortenOptions extends js.Object {
  
  /** Maximum length of any "segment" */
  var segmentLength: js.UndefOr[Double] = js.native
  
  /** String used to split "segments" of the alias/column name */
  var separator: js.UndefOr[String] = js.native
  
  /** Length of any "term" in a "segment"; "OrderItem" is a segment, "Order" and "Items" are terms */
  var termLength: js.UndefOr[Double] = js.native
}
object IShortenOptions {
  
  @scala.inline
  def apply(): IShortenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShortenOptions]
  }
  
  @scala.inline
  implicit class IShortenOptionsOps[Self <: IShortenOptions] (val x: Self) extends AnyVal {
    
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
    def setSegmentLength(value: Double): Self = this.set("segmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLength: Self = this.set("segmentLength", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTermLength(value: Double): Self = this.set("termLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermLength: Self = this.set("termLength", js.undefined)
  }
}
