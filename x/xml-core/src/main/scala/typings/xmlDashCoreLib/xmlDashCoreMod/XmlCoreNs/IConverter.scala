package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConverter[T] extends js.Object {
  /**
    * Converts value from Object to Xmml element
    * 
    * @memberOf IConverter
    */
  def get(value: T): js.UndefOr[java.lang.String]
  /**
    * Converts value from Xml element to Object
    * 
    * @memberOf IConverter
    */
  def set(value: java.lang.String): T
}

object IConverter {
  @scala.inline
  def apply[T](get: js.Function1[T, js.UndefOr[java.lang.String]], set: js.Function1[java.lang.String, T]): IConverter[T] = {
    val __obj = js.Dynamic.literal(get = get, set = set)
  
    __obj.asInstanceOf[IConverter[T]]
  }
}

