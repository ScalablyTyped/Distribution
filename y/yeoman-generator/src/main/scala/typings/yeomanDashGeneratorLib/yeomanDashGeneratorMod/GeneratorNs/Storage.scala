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
    defaults: js.Function1[js.Object, js.Object],
    delete: js.Function1[java.lang.String, scala.Unit],
    get: js.Function1[java.lang.String, js.Any],
    getAll: js.Function0[org.scalablytyped.runtime.StringDictionary[js.Any]],
    save: js.Function0[scala.Unit],
    set: js.Function2[java.lang.String, js.Any, js.Any]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getAll")(getAll)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Storage]
  }
}

