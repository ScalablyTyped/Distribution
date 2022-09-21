package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSInterface")
@js.native
open class TSInterface protected () extends TSTypeDeclaration {
  def this(p: TSModelElement[Any], name: String) = this()
  
  def decl(): String = js.native
  
  var `extends`: js.Array[TSTypeReference[Any]] = js.native
  
  /* private */ def extendsString(): Any = js.native
  
  var implements: js.Array[TSTypeReference[Any]] = js.native
  
  /* private */ def implementsString(): Any = js.native
  
  def insertComment(): String = js.native
  
  /* protected */ def isImpl(): Boolean = js.native
  
  var name: String = js.native
  
  var typeParameters: js.Array[String] = js.native
  
  def typeSignature(): String = js.native
}
