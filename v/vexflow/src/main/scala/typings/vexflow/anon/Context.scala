package typings.vexflow.anon

import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var align_rests: js.UndefOr[Boolean] = js.undefined
  
  var context: IRenderContext
}
object Context {
  
  @scala.inline
  def apply(context: IRenderContext): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign_rests(value: Boolean): Self = StObject.set(x, "align_rests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign_restsUndefined: Self = StObject.set(x, "align_rests", js.undefined)
    
    @scala.inline
    def setContext(value: IRenderContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
