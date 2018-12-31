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

