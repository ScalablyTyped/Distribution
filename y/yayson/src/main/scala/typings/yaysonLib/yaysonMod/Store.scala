package typings
package yaysonLib.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var records: js.Array[Record] = js.native
  var relations: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def find(`type`: java.lang.String, id: java.lang.String): js.Any = js.native
  def findAll(`type`: java.lang.String): js.Array[_] = js.native
  def remove(`type`: java.lang.String): scala.Unit = js.native
  def remove(`type`: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def sync(obj: js.Object): js.Any = js.native
}

