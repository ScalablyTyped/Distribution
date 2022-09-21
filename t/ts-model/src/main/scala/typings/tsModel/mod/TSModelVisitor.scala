package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModelVisitor extends StObject {
  
  def betweenElements(): Unit
  
  def endTypeDeclaration(decl: TSTypeDeclaration): Unit
  
  def endVisitElement(decl: TSAPIElementDeclaration): Unit
  
  def startTypeDeclaration(decl: TSTypeDeclaration): Boolean
  
  def startVisitElement(decl: TSAPIElementDeclaration): Boolean
}
object TSModelVisitor {
  
  inline def apply(
    betweenElements: () => Unit,
    endTypeDeclaration: TSTypeDeclaration => Unit,
    endVisitElement: TSAPIElementDeclaration => Unit,
    startTypeDeclaration: TSTypeDeclaration => Boolean,
    startVisitElement: TSAPIElementDeclaration => Boolean
  ): TSModelVisitor = {
    val __obj = js.Dynamic.literal(betweenElements = js.Any.fromFunction0(betweenElements), endTypeDeclaration = js.Any.fromFunction1(endTypeDeclaration), endVisitElement = js.Any.fromFunction1(endVisitElement), startTypeDeclaration = js.Any.fromFunction1(startTypeDeclaration), startVisitElement = js.Any.fromFunction1(startVisitElement))
    __obj.asInstanceOf[TSModelVisitor]
  }
  
  extension [Self <: TSModelVisitor](x: Self) {
    
    inline def setBetweenElements(value: () => Unit): Self = StObject.set(x, "betweenElements", js.Any.fromFunction0(value))
    
    inline def setEndTypeDeclaration(value: TSTypeDeclaration => Unit): Self = StObject.set(x, "endTypeDeclaration", js.Any.fromFunction1(value))
    
    inline def setEndVisitElement(value: TSAPIElementDeclaration => Unit): Self = StObject.set(x, "endVisitElement", js.Any.fromFunction1(value))
    
    inline def setStartTypeDeclaration(value: TSTypeDeclaration => Boolean): Self = StObject.set(x, "startTypeDeclaration", js.Any.fromFunction1(value))
    
    inline def setStartVisitElement(value: TSAPIElementDeclaration => Boolean): Self = StObject.set(x, "startVisitElement", js.Any.fromFunction1(value))
  }
}
