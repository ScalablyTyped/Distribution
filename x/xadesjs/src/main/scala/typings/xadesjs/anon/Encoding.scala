package typings.xadesjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var Encoding: String = js.native
  
  var Id: String = js.native
  
  var ObjectReference: String = js.native
  
  var Qualifier: String = js.native
  
  var ReferencedData: String = js.native
  
  var Target: String = js.native
  
  var URI: String = js.native
  
  var Uri: String = js.native
}
object Encoding {
  
  @scala.inline
  def apply(
    Encoding: String,
    Id: String,
    ObjectReference: String,
    Qualifier: String,
    ReferencedData: String,
    Target: String,
    URI: String,
    Uri: String
  ): Encoding = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], Qualifier = Qualifier.asInstanceOf[js.Any], ReferencedData = ReferencedData.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectReference(value: String): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedData(value: String): Self = this.set("ReferencedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
  }
}
