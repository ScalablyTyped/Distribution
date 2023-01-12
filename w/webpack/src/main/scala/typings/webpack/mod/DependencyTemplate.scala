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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependencyTemplate] (val x: Self) extends AnyVal {
    
    inline def setApply(value: (Dependency, ReplaceSource, DependencyTemplateContext) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
  }
}
