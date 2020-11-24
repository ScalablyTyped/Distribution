package typings.xmldsigjs.signedXmlMod

import typings.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSignReference extends js.Object {
  
  /**
    * Hash algorithm
    *
    * @type {AlgorithmIdentifier}
    * @memberOf OptionsSignReference
    */
  var hash: AlgorithmIdentifier = js.native
  
  /**
    * Id of Reference
    *
    * @type {string}
    * @memberOf OptionsSignReference
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * List of transforms
    *
    * @type {OptionsSignTransform[]}
    * @memberOf OptionsSignReference
    */
  var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object OptionsSignReference {
  
  @scala.inline
  def apply(hash: AlgorithmIdentifier): OptionsSignReference = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSignReference]
  }
  
  @scala.inline
  implicit class OptionsSignReferenceOps[Self <: OptionsSignReference] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: OptionsSignTransform*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: js.Array[OptionsSignTransform]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
