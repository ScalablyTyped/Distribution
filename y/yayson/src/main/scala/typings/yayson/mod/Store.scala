package typings.yayson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  
  def find(`type`: String, id: String): js.Any = js.native
  
  def findAll(`type`: String): js.Array[_] = js.native
  
  var records: js.Array[Record] = js.native
  
  var relations: StringDictionary[js.Any] = js.native
  
  def remove(`type`: String): Unit = js.native
  def remove(`type`: String, id: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def sync(obj: js.Object): js.Any = js.native
}
