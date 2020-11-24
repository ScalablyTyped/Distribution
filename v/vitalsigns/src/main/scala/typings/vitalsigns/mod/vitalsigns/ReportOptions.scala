package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Report options.
  * @interface
  */
@js.native
trait ReportOptions extends js.Object {
  
  /**
    * true to flatten the report object down to a single level by concatenating nested key names; false to keep the default hierarchical format.
    * @type {boolean}
    */
  var flatten: js.UndefOr[Boolean] = js.native
  
  /**
    * If flatten is true, this string will be used to separate key names when they are concatenated together.
    * @type {boolean}
    */
  var separator: js.UndefOr[String] = js.native
}
object ReportOptions {
  
  @scala.inline
  def apply(): ReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptions]
  }
  
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    
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
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
