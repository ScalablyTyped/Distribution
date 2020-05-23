package typings.wordpressBlocks.anon

import typings.std.RegExp
import typings.wordpressBlocks.mod.TransformRawSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var children: js.UndefOr[TransformRawSchema] = js.undefined
  var classes: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var require: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.undefined
}

object Classes {
  @scala.inline
  def apply(
    attributes: js.Array[String] = null,
    children: TransformRawSchema = null,
    classes: js.Array[String | RegExp] = null,
    require: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ] = null
  ): Classes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
}

