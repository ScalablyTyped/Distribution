package typings.vegaDashLite.buildSrcCompileModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameMapInterface extends js.Object {
  def get(name: String): String
  def has(name: String): Boolean
  def rename(oldname: String, newName: String): Unit
}

object NameMapInterface {
  @scala.inline
  def apply(get: String => String, has: String => Boolean, rename: (String, String) => Unit): NameMapInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), rename = js.Any.fromFunction2(rename))
  
    __obj.asInstanceOf[NameMapInterface]
  }
}

