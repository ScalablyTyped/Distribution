package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConverter[T] extends js.Object {
  
  /**
    * Converts value from Object to Xml element
    *
    * @memberOf IConverter
    */
  def get(value: T): js.UndefOr[String] = js.native
  
  /**
    * Converts value from Xml element to Object
    *
    * @memberOf IConverter
    */
  def set(value: String): T = js.native
}
object IConverter {
  
  @scala.inline
  def apply[T](get: T => js.UndefOr[String], set: String => T): IConverter[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IConverter[T]]
  }
  
  @scala.inline
  implicit class IConverterOps[Self <: IConverter[_], T] (val x: Self with IConverter[T]) extends AnyVal {
    
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
    def setGet(value: T => js.UndefOr[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: String => T): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
