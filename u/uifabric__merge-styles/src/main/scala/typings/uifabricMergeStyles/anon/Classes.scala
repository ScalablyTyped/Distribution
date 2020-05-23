package typings.uifabricMergeStyles.anon

import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  var classes: js.Array[String]
  var objects: IStyleBaseArray
}

object Classes {
  @scala.inline
  def apply(classes: js.Array[String], objects: IStyleBaseArray): Classes = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
}

