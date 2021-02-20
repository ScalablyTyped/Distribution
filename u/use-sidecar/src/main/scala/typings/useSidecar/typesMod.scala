package typings.useSidecar

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.useSidecar.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DefaultOrNot[T] = Default[T] | T
  
  type Importer[T] = js.Function0[js.Promise[DefaultOrNot[ComponentType[T]]]]
  
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ Boolean, T]
  
  type SideCarComponent[T] = FunctionComponent[T with SideCarHOC]
  
  @js.native
  trait SideCarHOC extends StObject {
    
    var sideCar: SideCarMedium = js.native
  }
  object SideCarHOC {
    
    @scala.inline
    def apply(sideCar: SideCarMedium): SideCarHOC = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideCarHOC]
    }
    
    @scala.inline
    implicit class SideCarHOCMutableBuilder[Self <: SideCarHOC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSideCar(value: SideCarMedium): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
    }
  }
  
  type SideCarMedium = SideMedium[ComponentType[js.Object]]
  
  @js.native
  trait SideCarMediumOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var ssr: js.UndefOr[Boolean] = js.native
  }
  object SideCarMediumOptions {
    
    @scala.inline
    def apply(): SideCarMediumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideCarMediumOptions]
    }
    
    @scala.inline
    implicit class SideCarMediumOptionsMutableBuilder[Self <: SideCarMediumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  @js.native
  trait SideMedium[T] extends StObject {
    
    def assignMedium(handler: MediumCallback[T]): Unit = js.native
    
    def assignSyncMedium(handler: MediumCallback[T]): Unit = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    def read(): js.UndefOr[T] = js.native
    
    def useMedium(effect: T): removeCb = js.native
  }
  object SideMedium {
    
    @scala.inline
    def apply[T](
      assignMedium: MediumCallback[T] => Unit,
      assignSyncMedium: MediumCallback[T] => Unit,
      read: () => js.UndefOr[T],
      useMedium: T => removeCb
    ): SideMedium[T] = {
      val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
      __obj.asInstanceOf[SideMedium[T]]
    }
    
    @scala.inline
    implicit class SideMediumMutableBuilder[Self <: SideMedium[_], T] (val x: Self with SideMedium[T]) extends AnyVal {
      
      @scala.inline
      def setAssignMedium(value: MediumCallback[T] => Unit): Self = StObject.set(x, "assignMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAssignSyncMedium(value: MediumCallback[T] => Unit): Self = StObject.set(x, "assignSyncMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRead(value: () => js.UndefOr[T]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUseMedium(value: T => removeCb): Self = StObject.set(x, "useMedium", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SidePush[T] extends StObject {
    
    def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    def push(data: T): Unit = js.native
  }
  object SidePush {
    
    @scala.inline
    def apply[T](filter: js.Function1[/* x */ T, Boolean] => SidePush[T], push: T => Unit): SidePush[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[SidePush[T]]
    }
    
    @scala.inline
    implicit class SidePushMutableBuilder[Self <: SidePush[_], T] (val x: Self with SidePush[T]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Function1[/* x */ T, Boolean] => SidePush[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  type removeCb = js.Function0[Unit]
}
