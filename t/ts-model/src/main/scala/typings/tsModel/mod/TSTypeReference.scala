package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeReference[T /* <: TSModelElement[Any] */] extends TSModelElement[T] {
  
  def array(): Boolean = js.native
  
  def canBeOmmited(): Boolean = js.native
  
  def getFunctor(): TSAPIElementDeclaration = js.native
  
  def isFunctor(): Boolean = js.native
  
  var locked: Boolean = js.native
  
  def union(q: TSTypeReference[Any]): TSTypeReference[Any] = js.native
}
