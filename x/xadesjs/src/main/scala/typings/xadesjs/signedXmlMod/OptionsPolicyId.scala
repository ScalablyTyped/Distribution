package typings.xadesjs.signedXmlMod

import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.signedXmlMod.OptionsSignTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsPolicyId extends js.Object {
  
  var digestValue: js.UndefOr[String] = js.native
  
  var hash: AlgorithmIdentifier = js.native
  
  var identifier: OptionsPolicyIdentifier = js.native
  
  var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | String]] = js.native
  
  var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.native
}
object OptionsPolicyId {
  
  @scala.inline
  def apply(hash: AlgorithmIdentifier, identifier: OptionsPolicyIdentifier): OptionsPolicyId = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPolicyId]
  }
  
  @scala.inline
  implicit class OptionsPolicyIdOps[Self <: OptionsPolicyId] (val x: Self) extends AnyVal {
    
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
    def setHash(value: AlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: OptionsPolicyIdentifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestValue(value: String): Self = this.set("digestValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestValue: Self = this.set("digestValue", js.undefined)
    
    @scala.inline
    def setQualifiersVarargs(value: (OptionsPolicyUserNotice | String)*): Self = this.set("qualifiers", js.Array(value :_*))
    
    @scala.inline
    def setQualifiers(value: js.Array[OptionsPolicyUserNotice | String]): Self = this.set("qualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifiers: Self = this.set("qualifiers", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: OptionsSignTransform*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: js.Array[OptionsSignTransform]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
}
