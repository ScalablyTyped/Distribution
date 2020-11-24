package typings.webgme.GmeClasses

import typings.webgme.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaNodeParameters extends js.Object {
  
  /**
    * if given, 
    * the query filters to contain only types 
    * that are visible in the given aspect.
    */
  var aspect: js.UndefOr[String] = js.native
  
  /**
    * if true, 
    * the query tries to filter out even 
    * more nodes according to the multiplicity rules 
    * (the default value is false, 
    * the check is only meaningful if all the children were passed)
    */
  var multiplicity: js.UndefOr[Boolean] = js.native
  
  /** the input parameters of the query. */
  var `object`: Children = js.native
  
  /** 
    * if true, the query filters out the 
    * abstract and connection-like nodes 
    * (the default value is false) 
    */
  var sensitive: js.UndefOr[Boolean] = js.native
}
object MetaNodeParameters {
  
  @scala.inline
  def apply(`object`: Children): MetaNodeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaNodeParameters]
  }
  
  @scala.inline
  implicit class MetaNodeParametersOps[Self <: MetaNodeParameters] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Children): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setMultiplicity(value: Boolean): Self = this.set("multiplicity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplicity: Self = this.set("multiplicity", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
  }
}
