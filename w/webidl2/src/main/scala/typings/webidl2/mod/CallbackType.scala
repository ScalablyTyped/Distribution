package typings.webidl2.mod

import typings.webidl2.webidl2Strings.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackType
  extends StObject
     with AbstractBase
     with IDLRootType {
  
  /** A list of arguments, as in function paramters. */
  var arguments: js.Array[Argument]
  
  /** An IDL Type describing what the callback returns. */
  var idlType: IDLTypeDescription
  
  /** The name of the callback. */
  var name: String
  
  @JSName("parent")
  var parent_CallbackType: Null
  
  @JSName("type")
  var type_CallbackType: callback
}
object CallbackType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: Null
  ): CallbackType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("callback")
    __obj.asInstanceOf[CallbackType]
  }
  
  @scala.inline
  implicit class CallbackTypeMutableBuilder[Self <: CallbackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: callback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
