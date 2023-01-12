package typings.webidl2.mod

import typings.webidl2.webidl2Strings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryType
  extends StObject
     with AbstractContainer
     with IDLRootType {
  
  /** A string giving the name of a dictionary this one inherits from, null otherwise. */
  var inheritance: String | Null
  
  @JSName("members")
  var members_DictionaryType: js.Array[DictionaryMemberType]
  
  @JSName("parent")
  var parent_DictionaryType: Null
  
  @JSName("type")
  var type_DictionaryType: dictionary
}
object DictionaryType {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[DictionaryMemberType],
    name: String,
    parent: Null,
    partial: Boolean
  ): DictionaryType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], inheritance = null)
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[DictionaryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictionaryType] (val x: Self) extends AnyVal {
    
    inline def setInheritance(value: String): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setInheritanceNull: Self = StObject.set(x, "inheritance", null)
    
    inline def setMembers(value: js.Array[DictionaryMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: DictionaryMemberType*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
