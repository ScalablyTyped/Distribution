package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitHelper extends StObject {
  
  val dependencies: js.UndefOr[js.Array[EmitHelper]] = js.undefined
  
  val name: java.lang.String
  
  val priority: js.UndefOr[Double] = js.undefined
  
  val scoped: Boolean
  
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
}
object EmitHelper {
  
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): EmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
  
  @scala.inline
  implicit class EmitHelperMutableBuilder[Self <: EmitHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: js.Array[EmitHelper]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: EmitHelper*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(
      value: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFunction1(value: /* node */ EmitHelperUniqueNameCallback => java.lang.String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
