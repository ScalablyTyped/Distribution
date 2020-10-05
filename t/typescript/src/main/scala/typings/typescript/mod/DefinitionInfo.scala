package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionInfo extends DocumentSpan {
  var containerKind: ScriptElementKind = js.native
  var containerName: java.lang.String = js.native
  var kind: ScriptElementKind = js.native
  var name: java.lang.String = js.native
}

object DefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    textSpan: TextSpan
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
  @scala.inline
  implicit class DefinitionInfoOps[Self <: DefinitionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerKind(value: ScriptElementKind): Self = this.set("containerKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerName(value: java.lang.String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

