package typings.webidl2.mod

import typings.webidl2.webidl2Strings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryType
  extends AbstractContainer
     with IDLRootType {
  
  /** A string giving the name of a dictionary this one inherits from, null otherwise. */
  var inheritance: String | Null = js.native
  
  @JSName("members")
  var members_DictionaryType: js.Array[DictionaryMemberType] = js.native
  
  @JSName("parent")
  var parent_DictionaryType: Null = js.native
  
  @JSName("type")
  var type_DictionaryType: dictionary = js.native
}
object DictionaryType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[DictionaryMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: dictionary
  ): DictionaryType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
  
  @scala.inline
  implicit class DictionaryTypeOps[Self <: DictionaryType] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: DictionaryMemberType*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[DictionaryMemberType]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: dictionary): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritance(value: String): Self = this.set("inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritanceNull: Self = this.set("inheritance", null)
  }
}
