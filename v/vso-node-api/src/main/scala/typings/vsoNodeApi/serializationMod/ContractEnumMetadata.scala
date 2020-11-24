package typings.vsoNodeApi.serializationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContractEnumMetadata extends js.Object {
  
  var enumValues: js.UndefOr[StringDictionary[Double]] = js.native
}
object ContractEnumMetadata {
  
  @scala.inline
  def apply(): ContractEnumMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractEnumMetadata]
  }
  
  @scala.inline
  implicit class ContractEnumMetadataOps[Self <: ContractEnumMetadata] (val x: Self) extends AnyVal {
    
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
    def setEnumValues(value: StringDictionary[Double]): Self = this.set("enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumValues: Self = this.set("enumValues", js.undefined)
  }
}
