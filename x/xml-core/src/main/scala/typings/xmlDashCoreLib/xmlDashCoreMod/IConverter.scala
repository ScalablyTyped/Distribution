package typings
package xmlDashCoreLib.xmlDashCoreMod

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
  def apply[T](get: T => js.UndefOr[java.lang.String], set: java.lang.String => T): IConverter[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[IConverter[T]]
  }
}

