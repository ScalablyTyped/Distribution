package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base type for associated arrays
  * 
  * @interface AssocArray
  * @template T
  */
trait AssocArray[T]
  extends /* index */ org.scalablytyped.runtime.StringDictionary[T]

object AssocArray {
  @scala.inline
  def apply[T](StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[T] = null): AssocArray[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AssocArray[T]]
  }
}

