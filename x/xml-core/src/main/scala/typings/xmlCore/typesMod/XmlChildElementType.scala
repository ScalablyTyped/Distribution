package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlChildElementType[T]
  extends XmlSchemaItem[T]
     with XmlSchemaItemParser {
  
  /**
    * max occurs of items in collection
    *
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var maxOccurs: js.UndefOr[Double] = js.native
  
  /**
    * min occurs of items in collection
    *
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var minOccurs: js.UndefOr[Double] = js.native
  
  /**
    * Don't add root element of XmlCollection to compiled element
    *
    * @type {boolean}
    * @memberOf XmlChildElementType
    */
  var noRoot: js.UndefOr[Boolean] = js.native
}
object XmlChildElementType {
  
  @scala.inline
  def apply[T](): XmlChildElementType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlChildElementType[T]]
  }
  
  @scala.inline
  implicit class XmlChildElementTypeOps[Self <: XmlChildElementType[_], T] (val x: Self with XmlChildElementType[T]) extends AnyVal {
    
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
    def setMaxOccurs(value: Double): Self = this.set("maxOccurs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOccurs: Self = this.set("maxOccurs", js.undefined)
    
    @scala.inline
    def setMinOccurs(value: Double): Self = this.set("minOccurs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOccurs: Self = this.set("minOccurs", js.undefined)
    
    @scala.inline
    def setNoRoot(value: Boolean): Self = this.set("noRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRoot: Self = this.set("noRoot", js.undefined)
  }
}
