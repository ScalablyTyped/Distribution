package typings.uifabricUtilities

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.Error
import typings.uifabricUtilities.anon.AsyncPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asAsyncMod {
  
  @JSImport("@uifabric/utilities/lib/asAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asAsync[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[
    (PropsWithoutRef[TProps & AsyncPlaceholder]) & RefAttributes[ElementType[TProps]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asAsync")(options.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[TProps & AsyncPlaceholder]) & RefAttributes[ElementType[TProps]]
  ]]
  
  trait IAsAsyncOptions[TProps] extends StObject {
    
    /**
      * Callback which returns a promise resolving an object which exports the component.
      */
    def load(): js.Promise[ElementType[TProps]]
    
    /**
      * Callback when async loading fails.
      */
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    /**
      * Callback executed when async loading is complete.
      */
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IAsAsyncOptions {
    
    inline def apply[TProps](load: () => js.Promise[ElementType[TProps]]): IAsAsyncOptions[TProps] = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[IAsAsyncOptions[TProps]]
    }
    
    extension [Self <: IAsAsyncOptions[?], TProps](x: Self & IAsAsyncOptions[TProps]) {
      
      inline def setLoad(value: () => js.Promise[ElementType[TProps]]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      inline def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
}
