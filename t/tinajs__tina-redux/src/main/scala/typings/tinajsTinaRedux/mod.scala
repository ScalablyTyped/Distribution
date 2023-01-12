package typings.tinajsTinaRedux

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina-redux", JSImport.Namespace)
  @js.native
  open class ^[S, A /* <: Action[Any] */] protected ()
    extends StObject
       with TinaRedux[S, A] {
    def this(reduxStore: Store[S, A]) = this()
  }
  
  trait HOC extends StObject {
    
    var methods: js.Object
    
    def onLoad(): Unit
    
    def onUnload(): Unit
  }
  object HOC {
    
    inline def apply(methods: js.Object, onLoad: () => Unit, onUnload: () => Unit): HOC = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], onLoad = js.Any.fromFunction0(onLoad), onUnload = js.Any.fromFunction0(onUnload))
      __obj.asInstanceOf[HOC]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HOC] (val x: Self) extends AnyVal {
      
      inline def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    }
  }
  
  type MapStateToProps = js.Function1[/* state */ Any, Any]
  
  @js.native
  trait TinaRedux[S, A /* <: Action[Any] */] extends StObject {
    
    def connect(): HOC = js.native
    def connect(mapState: Unit, mapDispatch: mapDispatchToProps): HOC = js.native
    def connect(mapState: MapStateToProps): HOC = js.native
    def connect(mapState: MapStateToProps, mapDispatch: mapDispatchToProps): HOC = js.native
  }
  
  type mapDispatchToProps = js.Function1[/* dispatch */ Dispatch[AnyAction], Any]
}
