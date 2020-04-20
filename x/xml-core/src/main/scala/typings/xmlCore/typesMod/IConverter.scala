package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConverter[T] extends js.Object {
  /**
    * Converts value from Object to Xml element
    *
    * @memberOf IConverter
    */
  def get(value: T): js.UndefOr[String]
  /**
    * Converts value from Xml element to Object
    *
    * @memberOf IConverter
    */
  def set(value: String): T
}

object IConverter {
  @scala.inline
  def apply[T](get: T => js.UndefOr[String], set: String => T): IConverter[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IConverter[T]]
  }
}

