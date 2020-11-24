package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A full query descriptor for a filtering predicate.
  */
@js.native
trait MediaQueryInfoType extends js.Object {
  
  /**
    * Whether or not the predicate is for an exact match.  The default is `true`.
    */
  var exact: js.UndefOr[Boolean] = js.native
  
  /**
    * The value for the given predicate. See the descriptions in <MediaQueryType> for information about which properties require which values.
    */
  var value: js.UndefOr[Double | String | Boolean] = js.native
}
object MediaQueryInfoType {
  
  @scala.inline
  def apply(): MediaQueryInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryInfoType]
  }
  
  @scala.inline
  implicit class MediaQueryInfoTypeOps[Self <: MediaQueryInfoType] (val x: Self) extends AnyVal {
    
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
