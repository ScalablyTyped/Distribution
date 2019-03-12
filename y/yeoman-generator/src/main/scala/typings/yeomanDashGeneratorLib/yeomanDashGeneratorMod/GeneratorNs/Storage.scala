package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def defaults(defaults: js.Object): js.Object
  def delete(key: java.lang.String): scala.Unit
  def get(key: java.lang.String): js.Any
  def getAll(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def save(): scala.Unit
  def set(key: java.lang.String, value: js.Any): js.Any
}

object Storage {
  @scala.inline
  def apply(
    defaults: js.Object => js.Object,
    delete: java.lang.String => scala.Unit,
    get: java.lang.String => js.Any,
    getAll: () => org.scalablytyped.runtime.StringDictionary[js.Any],
    save: () => scala.Unit,
    set: (java.lang.String, js.Any) => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), save = js.Any.fromFunction0(save), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Storage]
  }
}

