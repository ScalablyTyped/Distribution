package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReferenceContainer[T] extends js.Object {
  var sources: js.Array[T]
}

object SourceReferenceContainer {
  @scala.inline
  def apply[T](sources: js.Array[T]): SourceReferenceContainer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[SourceReferenceContainer[T]]
  }
}

