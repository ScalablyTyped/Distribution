package typings.useSidecar

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Record
import typings.useSidecar.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TypesMod {
  
  type DefaultOrNot[T] = Default[T] | T
  
  type Importer[T] = js.Function0[js.Promise[DefaultOrNot[ComponentType[T]]]]
  
  type MediumCallback[T] = js.Function1[/* data */ T, Any]
  
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ Boolean, T]
  
  type SideCarComponent[T] = FunctionComponent[T & SideCarHOC[T]]
  
  trait SideCarHOC[T] extends StObject {
    
    val sideCar: SideCarMedium[T]
  }
  object SideCarHOC {
    
    inline def apply[T](sideCar: SideCarMedium[T]): SideCarHOC[T] = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideCarHOC[T]]
    }
    
    extension [Self <: SideCarHOC[?], T](x: Self & SideCarHOC[T]) {
      
      inline def setSideCar(value: SideCarMedium[T]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
    }
  }
  
  type SideCarMedium[T] = SideMedium[ComponentType[T]]
  
  trait SideCarMediumOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object SideCarMediumOptions {
    
    inline def apply(): SideCarMediumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideCarMediumOptions]
    }
    
    extension [Self <: SideCarMediumOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  trait SideMedium[T] extends StObject {
    
    /**
      * Assigns effect handler to the medium
      * @param {Function(effect: T)} handler effect handler
      */
    def assignMedium(handler: MediumCallback[T]): Unit
    
    /**
      * Assigns a synchronous effect handler to the medium, which would be executed right on call
      * @param {Function(effect: T)} handler effect handler
      */
    def assignSyncMedium(handler: MediumCallback[T]): Unit
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * reads the data stored in the medium
      */
    def read(): js.UndefOr[T]
    
    /**
      * Pushes effect to the medium
      * @param effect any information for real handler
      */
    def useMedium(effect: T): removeCb
  }
  object SideMedium {
    
    inline def apply[T](
      assignMedium: MediumCallback[T] => Unit,
      assignSyncMedium: MediumCallback[T] => Unit,
      read: () => js.UndefOr[T],
      useMedium: T => removeCb
    ): SideMedium[T] = {
      val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
      __obj.asInstanceOf[SideMedium[T]]
    }
    
    extension [Self <: SideMedium[?], T](x: Self & SideMedium[T]) {
      
      inline def setAssignMedium(value: MediumCallback[T] => Unit): Self = StObject.set(x, "assignMedium", js.Any.fromFunction1(value))
      
      inline def setAssignSyncMedium(value: MediumCallback[T] => Unit): Self = StObject.set(x, "assignSyncMedium", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRead(value: () => js.UndefOr[T]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setUseMedium(value: T => removeCb): Self = StObject.set(x, "useMedium", js.Any.fromFunction1(value))
    }
  }
  
  trait SidePush[T] extends StObject {
    
    def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T]
    
    var length: js.UndefOr[Double] = js.undefined
    
    def push(data: T): Unit
  }
  object SidePush {
    
    inline def apply[T](filter: js.Function1[/* x */ T, Boolean] => SidePush[T], push: T => Unit): SidePush[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[SidePush[T]]
    }
    
    extension [Self <: SidePush[?], T](x: Self & SidePush[T]) {
      
      inline def setFilter(value: js.Function1[/* x */ T, Boolean] => SidePush[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  type removeCb = js.Function0[Unit]
}
