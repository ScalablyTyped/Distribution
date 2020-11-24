package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUriRuntimeClassWithAbsoluteCanonicalUri extends js.Object {
  
  var absoluteCanonicalUri: String = js.native
  
  var displayIri: String = js.native
}
object IUriRuntimeClassWithAbsoluteCanonicalUri {
  
  @scala.inline
  def apply(absoluteCanonicalUri: String, displayIri: String): IUriRuntimeClassWithAbsoluteCanonicalUri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], displayIri = displayIri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClassWithAbsoluteCanonicalUri]
  }
  
  @scala.inline
  implicit class IUriRuntimeClassWithAbsoluteCanonicalUriOps[Self <: IUriRuntimeClassWithAbsoluteCanonicalUri] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteCanonicalUri(value: String): Self = this.set("absoluteCanonicalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIri(value: String): Self = this.set("displayIri", value.asInstanceOf[js.Any])
  }
}
