package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    stylablePlugin: js.Any
  ): Unit
}
object Apply {
  
  @scala.inline
  def apply(
    apply: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any, js.Any) => Unit
  ): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply))
    __obj.asInstanceOf[Apply]
  }
  
  @scala.inline
  implicit class ApplyMutableBuilder[Self <: Apply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any, js.Any) => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
  }
}
