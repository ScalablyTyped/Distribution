package typings.useSidecar

import typings.useSidecar.distEs5TypesMod.SideCarMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[T /* <: js.Array[Any] */] extends StObject {
    
    def children(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
    ): Any
  }
  object Children {
    
    inline def apply[T /* <: js.Array[Any] */](children: T => Any): Children[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[T]]
    }
    
    extension [Self <: Children[?], T /* <: js.Array[Any] */](x: Self & Children[T]) {
      
      inline def setChildren(value: T => Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Default[T] extends StObject {
    
    var default: T
  }
  object Default {
    
    inline def apply[T](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    extension [Self <: Default[?], T](x: Self & Default[T]) {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
  trait PartialIConfig extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
  }
  object PartialIConfig {
    
    inline def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    extension [Self <: PartialIConfig](x: Self) {
      
      inline def setOnError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  /* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/types.SideCarHOC<{}>> */
  trait PartialSideCarHOC extends StObject {
    
    var sideCar: js.UndefOr[SideCarMedium[js.Object]] = js.undefined
  }
  object PartialSideCarHOC {
    
    inline def apply(): PartialSideCarHOC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSideCarHOC]
    }
    
    extension [Self <: PartialSideCarHOC](x: Self) {
      
      inline def setSideCar(value: SideCarMedium[js.Object]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
      
      inline def setSideCarUndefined: Self = StObject.set(x, "sideCar", js.undefined)
    }
  }
}
