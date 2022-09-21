package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyTemplates extends StObject {
  
  def get(dependency: DependencyConstructor): DependencyTemplate
  
  def getHash(): String
  
  def set(dependency: DependencyConstructor, dependencyTemplate: DependencyTemplate): Unit
  
  def updateHash(part: String): Unit
}
object DependencyTemplates {
  
  inline def apply(
    get: DependencyConstructor => DependencyTemplate,
    getHash: () => String,
    set: (DependencyConstructor, DependencyTemplate) => Unit,
    updateHash: String => Unit
  ): DependencyTemplates = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getHash = js.Any.fromFunction0(getHash), set = js.Any.fromFunction2(set), updateHash = js.Any.fromFunction1(updateHash))
    __obj.asInstanceOf[DependencyTemplates]
  }
  
  extension [Self <: DependencyTemplates](x: Self) {
    
    inline def setGet(value: DependencyConstructor => DependencyTemplate): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetHash(value: () => String): Self = StObject.set(x, "getHash", js.Any.fromFunction0(value))
    
    inline def setSet(value: (DependencyConstructor, DependencyTemplate) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setUpdateHash(value: String => Unit): Self = StObject.set(x, "updateHash", js.Any.fromFunction1(value))
  }
}
