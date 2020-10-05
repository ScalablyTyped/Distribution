package typings.three.anon

import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  var data: String = js.native
  var isInterleavedBufferAttribute: `true` = js.native
  var itemSize: Double = js.native
  var normalized: Boolean = js.native
  var offset: Double = js.native
}

object Data {
  @scala.inline
  def apply(
    data: String,
    isInterleavedBufferAttribute: `true`,
    itemSize: Double,
    normalized: Boolean,
    offset: Double
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isInterleavedBufferAttribute = isInterleavedBufferAttribute.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInterleavedBufferAttribute(value: `true`): Self = this.set("isInterleavedBufferAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemSize(value: Double): Self = this.set("itemSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalized(value: Boolean): Self = this.set("normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

