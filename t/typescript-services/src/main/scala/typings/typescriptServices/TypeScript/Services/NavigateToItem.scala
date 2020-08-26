package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToItem extends js.Object {
  var additionalSpans: js.Array[SpanInfo] = js.native
  var containerKind: String = js.native
  var containerName: String = js.native
  var fileName: String = js.native
  var kind: String = js.native
  var kindModifiers: String = js.native
  var limChar: Double = js.native
  var matchKind: String = js.native
  var minChar: Double = js.native
  var name: String = js.native
}

object NavigateToItem {
  @scala.inline
  def apply(
    additionalSpans: js.Array[SpanInfo],
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    kindModifiers: String,
    limChar: Double,
    matchKind: String,
    minChar: Double,
    name: String
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(additionalSpans = additionalSpans.asInstanceOf[js.Any], containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  @scala.inline
  implicit class NavigateToItemOps[Self <: NavigateToItem] (val x: Self) extends AnyVal {
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
    def setAdditionalSpansVarargs(value: SpanInfo*): Self = this.set("additionalSpans", js.Array(value :_*))
    @scala.inline
    def setAdditionalSpans(value: js.Array[SpanInfo]): Self = this.set("additionalSpans", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerKind(value: String): Self = this.set("containerKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimChar(value: Double): Self = this.set("limChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchKind(value: String): Self = this.set("matchKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

