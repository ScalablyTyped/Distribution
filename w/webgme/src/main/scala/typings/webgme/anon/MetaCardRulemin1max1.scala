package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import typings.webgme.webgmeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webgme.GmeCommon.MetaCardRule & {  min :1,   max :1} */
@js.native
trait MetaCardRulemin1max1 extends js.Object {
  var items: js.Array[Path] = js.native
  var max: `1` = js.native
  var maxItems: js.Array[Double] = js.native
  var min: `1` = js.native
  var minItems: js.Array[Double] = js.native
}

object MetaCardRulemin1max1 {
  @scala.inline
  def apply(items: js.Array[Path], max: `1`, maxItems: js.Array[Double], min: `1`, minItems: js.Array[Double]): MetaCardRulemin1max1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRulemin1max1]
  }
  @scala.inline
  implicit class MetaCardRulemin1max1Ops[Self <: MetaCardRulemin1max1] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Path*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Path]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: `1`): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItemsVarargs(value: Double*): Self = this.set("maxItems", js.Array(value :_*))
    @scala.inline
    def setMaxItems(value: js.Array[Double]): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: `1`): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinItemsVarargs(value: Double*): Self = this.set("minItems", js.Array(value :_*))
    @scala.inline
    def setMinItems(value: js.Array[Double]): Self = this.set("minItems", value.asInstanceOf[js.Any])
  }
  
}

