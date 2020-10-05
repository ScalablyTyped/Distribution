package typings.typescript.mod

import typings.typescript.typescriptStrings.camelCase
import typings.typescript.typescriptStrings.exact
import typings.typescript.typescriptStrings.prefix
import typings.typescript.typescriptStrings.substring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToItem extends js.Object {
  var containerKind: ScriptElementKind = js.native
  var containerName: java.lang.String = js.native
  var fileName: java.lang.String = js.native
  var isCaseSensitive: Boolean = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var matchKind: exact | prefix | substring | camelCase = js.native
  var name: java.lang.String = js.native
  var textSpan: TextSpan = js.native
}

object NavigateToItem {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: exact | prefix | substring | camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  @scala.inline
  implicit class NavigateToItemOps[Self <: NavigateToItem] (val x: Self) extends AnyVal {
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
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = this.set("isCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchKind(value: exact | prefix | substring | camelCase): Self = this.set("matchKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
  }
  
}

