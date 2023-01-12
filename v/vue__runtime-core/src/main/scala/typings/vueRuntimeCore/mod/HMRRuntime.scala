package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HMRRuntime extends StObject {
  
  def createRecord(id: String, initialDef: HMRComponent): Boolean
  @JSName("createRecord")
  var createRecord_Original: js.Function2[/* id */ String, /* initialDef */ HMRComponent, Boolean]
  
  def reload(id: String, newComp: HMRComponent): Unit
  @JSName("reload")
  var reload_Original: js.Function2[/* id */ String, /* newComp */ HMRComponent, Unit]
  
  def rerender(id: String): Unit
  def rerender(id: String, newRender: js.Function): Unit
  @JSName("rerender")
  var rerender_Original: js.Function2[/* id */ String, /* newRender */ js.UndefOr[js.Function], Unit]
}
object HMRRuntime {
  
  inline def apply(
    createRecord: (/* id */ String, /* initialDef */ HMRComponent) => Boolean,
    reload: (/* id */ String, /* newComp */ HMRComponent) => Unit,
    rerender: (/* id */ String, /* newRender */ js.UndefOr[js.Function]) => Unit
  ): HMRRuntime = {
    val __obj = js.Dynamic.literal(createRecord = js.Any.fromFunction2(createRecord), reload = js.Any.fromFunction2(reload), rerender = js.Any.fromFunction2(rerender))
    __obj.asInstanceOf[HMRRuntime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HMRRuntime] (val x: Self) extends AnyVal {
    
    inline def setCreateRecord(value: (/* id */ String, /* initialDef */ HMRComponent) => Boolean): Self = StObject.set(x, "createRecord", js.Any.fromFunction2(value))
    
    inline def setReload(value: (/* id */ String, /* newComp */ HMRComponent) => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction2(value))
    
    inline def setRerender(value: (/* id */ String, /* newRender */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "rerender", js.Any.fromFunction2(value))
  }
}
