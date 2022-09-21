package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSAPIElementDeclaration")
@js.native
open class TSAPIElementDeclaration protected () extends TSMember[TSTypeReference[Any]] {
  def this(p: TSModelElement[Any], name: String) = this()
  
  var _body: String = js.native
  
  def body(): String = js.native
  
  def commentCode(): String = js.native
  
  /* private */ def escapeDot(name: Any): Any = js.native
  
  def isAnonymousFunction(): Boolean = js.native
  
  var isFunc: Boolean = js.native
  
  def isFunction(): Boolean = js.native
  
  def isInterfaceMethodWithBody(): Boolean = js.native
  
  var isPrivate: Boolean = js.native
  
  var isStatic: Boolean = js.native
  
  var name: String = js.native
  
  def paramStr(): String = js.native
  def paramStr(appendDefault: Boolean): String = js.native
  
  var parameters: js.Array[Param] = js.native
  
  var rangeType: TSTypeReference[Any] = js.native
  
  def returnStr(): String = js.native
  
  /* protected */ def serializeParam(p: Param, appendDefault: Boolean): String = js.native
  
  var value: Value = js.native
  
  def visit(v: TSModelVisitor): Unit = js.native
}
