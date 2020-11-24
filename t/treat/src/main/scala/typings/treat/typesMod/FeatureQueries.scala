package typings.treat.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureQueries[StyleType] extends js.Object {
  
  var `@supports`: js.UndefOr[StringDictionary[StyleType]] = js.native
}
object FeatureQueries {
  
  @scala.inline
  def apply[StyleType](): FeatureQueries[StyleType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureQueries[StyleType]]
  }
  
  @scala.inline
  implicit class FeatureQueriesOps[Self <: FeatureQueries[_], StyleType] (val x: Self with FeatureQueries[StyleType]) extends AnyVal {
    
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
    def `set@supports`(value: StringDictionary[StyleType]): Self = this.set("@supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@supports`: Self = this.set("@supports", js.undefined)
  }
}
