package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferencedSymbol extends js.Object {
  var definition: ReferencedSymbolDefinitionInfo = js.native
  var references: js.Array[ReferenceEntry] = js.native
}

object ReferencedSymbol {
  @scala.inline
  def apply(definition: ReferencedSymbolDefinitionInfo, references: js.Array[ReferenceEntry]): ReferencedSymbol = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbol]
  }
  @scala.inline
  implicit class ReferencedSymbolOps[Self <: ReferencedSymbol] (val x: Self) extends AnyVal {
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
    def setDefinition(value: ReferencedSymbolDefinitionInfo): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: ReferenceEntry*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[ReferenceEntry]): Self = this.set("references", value.asInstanceOf[js.Any])
  }
  
}

