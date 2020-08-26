package typings.xadesjs.signedXmlMod

import typings.xadesjs.objectIdentifierMod.IdentifierQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPolicyIdentifier extends js.Object {
  var description: js.UndefOr[String] = js.native
  var qualifier: IdentifierQualifier = js.native
  var references: js.UndefOr[js.Array[String]] = js.native
  var value: String = js.native
}

object OptionsPolicyIdentifier {
  @scala.inline
  def apply(qualifier: IdentifierQualifier, value: String): OptionsPolicyIdentifier = {
    val __obj = js.Dynamic.literal(qualifier = qualifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPolicyIdentifier]
  }
  @scala.inline
  implicit class OptionsPolicyIdentifierOps[Self <: OptionsPolicyIdentifier] (val x: Self) extends AnyVal {
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
    def setQualifier(value: IdentifierQualifier): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setReferencesVarargs(value: String*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[String]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
  
}

