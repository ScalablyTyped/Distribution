package typings.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URIOptions extends js.Object {
  
  var absolutePath: js.UndefOr[Boolean] = js.native
  
  var domainHost: js.UndefOr[Boolean] = js.native
  
  var iri: js.UndefOr[Boolean] = js.native
  
  var reference: js.UndefOr[String] = js.native
  
  var scheme: js.UndefOr[String] = js.native
  
  var tolerant: js.UndefOr[Boolean] = js.native
  
  var unicodeSupport: js.UndefOr[Boolean] = js.native
}
object URIOptions {
  
  @scala.inline
  def apply(): URIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URIOptions]
  }
  
  @scala.inline
  implicit class URIOptionsOps[Self <: URIOptions] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePath(value: Boolean): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    
    @scala.inline
    def setDomainHost(value: Boolean): Self = this.set("domainHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainHost: Self = this.set("domainHost", js.undefined)
    
    @scala.inline
    def setIri(value: Boolean): Self = this.set("iri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIri: Self = this.set("iri", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
    
    @scala.inline
    def setUnicodeSupport(value: Boolean): Self = this.set("unicodeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeSupport: Self = this.set("unicodeSupport", js.undefined)
  }
}
