package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyTemplate extends StObject {
  
  @JSName("apply")
  def apply(dependency: Dependency, source: ReplaceSource, templateContext: DependencyTemplateContext): Unit
}
object DependencyTemplate {
  
  inline def apply(apply: (Dependency, ReplaceSource, DependencyTemplateContext) => Unit): DependencyTemplate = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply))
    __obj.asInstanceOf[DependencyTemplate]
  }
  
  extension [Self <: DependencyTemplate](x: Self) {
    
    inline def setApply(value: (Dependency, ReplaceSource, DependencyTemplateContext) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
  }
}
