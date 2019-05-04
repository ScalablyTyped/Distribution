package typings
package vegaDashLiteLib.buildSrcCompileModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameMapInterface extends js.Object {
  def get(name: java.lang.String): java.lang.String
  def has(name: java.lang.String): scala.Boolean
  def rename(oldname: java.lang.String, newName: java.lang.String): scala.Unit
}

object NameMapInterface {
  @scala.inline
  def apply(
    get: java.lang.String => java.lang.String,
    has: java.lang.String => scala.Boolean,
    rename: (java.lang.String, java.lang.String) => scala.Unit
  ): NameMapInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), rename = js.Any.fromFunction2(rename))
  
    __obj.asInstanceOf[NameMapInterface]
  }
}

