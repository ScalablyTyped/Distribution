package typings
package trouterLib.trouterMod.TrouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResult[T] extends js.Object {
  var handlers: js.Array[T]
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object FindResult {
  @scala.inline
  def apply[T](handlers: js.Array[T], params: org.scalablytyped.runtime.StringDictionary[java.lang.String]): FindResult[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers, params = params)
  
    __obj.asInstanceOf[FindResult[T]]
  }
}

