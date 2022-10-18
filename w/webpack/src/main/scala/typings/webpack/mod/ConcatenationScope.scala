package typings.webpack.mod

import typings.webpack.anon.PartialModuleReferenceOpt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenationScope extends StObject {
  
  def createModuleReference(module: Module, __1: PartialModuleReferenceOpt): String
  
  def isModuleInScope(module: Module): Boolean
  
  def registerExport(exportName: String, symbol: String): Unit
  
  def registerNamespaceExport(symbol: String): Unit
  
  def registerRawExport(exportName: String, expression: String): Unit
}
object ConcatenationScope {
  
  inline def apply(
    createModuleReference: (Module, PartialModuleReferenceOpt) => String,
    isModuleInScope: Module => Boolean,
    registerExport: (String, String) => Unit,
    registerNamespaceExport: String => Unit,
    registerRawExport: (String, String) => Unit
  ): ConcatenationScope = {
    val __obj = js.Dynamic.literal(createModuleReference = js.Any.fromFunction2(createModuleReference), isModuleInScope = js.Any.fromFunction1(isModuleInScope), registerExport = js.Any.fromFunction2(registerExport), registerNamespaceExport = js.Any.fromFunction1(registerNamespaceExport), registerRawExport = js.Any.fromFunction2(registerRawExport))
    __obj.asInstanceOf[ConcatenationScope]
  }
  
  extension [Self <: ConcatenationScope](x: Self) {
    
    inline def setCreateModuleReference(value: (Module, PartialModuleReferenceOpt) => String): Self = StObject.set(x, "createModuleReference", js.Any.fromFunction2(value))
    
    inline def setIsModuleInScope(value: Module => Boolean): Self = StObject.set(x, "isModuleInScope", js.Any.fromFunction1(value))
    
    inline def setRegisterExport(value: (String, String) => Unit): Self = StObject.set(x, "registerExport", js.Any.fromFunction2(value))
    
    inline def setRegisterNamespaceExport(value: String => Unit): Self = StObject.set(x, "registerNamespaceExport", js.Any.fromFunction1(value))
    
    inline def setRegisterRawExport(value: (String, String) => Unit): Self = StObject.set(x, "registerRawExport", js.Any.fromFunction2(value))
  }
}
