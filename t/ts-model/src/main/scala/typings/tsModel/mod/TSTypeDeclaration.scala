package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSTypeDeclaration")
@js.native
open class TSTypeDeclaration () extends TSModelElement[TSAPIElementDeclaration] {
  def this(parent: TSModelElement[Any]) = this()
  
  def addCode(code: String): Unit = js.native
  
  def canBeOmmited(): Boolean = js.native
  
  var extras: js.Array[String] = js.native
  
  def getFunctor(): TSAPIElementDeclaration = js.native
  
  def hash(): String = js.native
  
  def isFunctor(): Boolean = js.native
  
  var locked: Boolean = js.native
  
  def toReference(): TSTypeReference[Any] = js.native
  
  def visit(v: TSModelVisitor): Unit = js.native
}
