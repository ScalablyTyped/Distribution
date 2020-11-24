package typings.treat.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueries[StyleType] extends js.Object {
  
  var `@media`: js.UndefOr[StringDictionary[StyleType]] = js.native
}
object MediaQueries {
  
  @scala.inline
  def apply[StyleType](): MediaQueries[StyleType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueries[StyleType]]
  }
  
  @scala.inline
  implicit class MediaQueriesOps[Self <: MediaQueries[_], StyleType] (val x: Self with MediaQueries[StyleType]) extends AnyVal {
    
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
    def `set@media`(value: StringDictionary[StyleType]): Self = this.set("@media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@media`: Self = this.set("@media", js.undefined)
  }
}
