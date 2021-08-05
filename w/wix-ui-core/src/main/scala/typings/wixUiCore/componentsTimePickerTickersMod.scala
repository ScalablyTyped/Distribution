package typings.wixUiCore

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTimePickerTickersMod {
  
  @JSImport("wix-ui-core/src/components/time-picker/Tickers", "Tickers")
  @js.native
  class Tickers protected ()
    extends PureComponent[TickersProps, js.Object, js.Any] {
    def this(props: TickersProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TickersProps, context: js.Any) = this()
    
    def handleDecrement(e: js.Any): Unit = js.native
    
    def handleIncrement(e: js.Any): Unit = js.native
  }
  
  trait TickersProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** set buttons as disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** decrement handler */
    var onDecrement: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** increment handler */
    var onIncrement: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** down ticker icon */
    var tickerDownIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** up ticker icon */
    var tickerUpIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object TickersProps {
    
    inline def apply(): TickersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TickersProps]
    }
    
    extension [Self <: TickersProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnDecrement(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1(value))
      
      inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      inline def setOnIncrement(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1(value))
      
      inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      inline def setTickerDownIcon(value: ReactNode): Self = StObject.set(x, "tickerDownIcon", value.asInstanceOf[js.Any])
      
      inline def setTickerDownIconUndefined: Self = StObject.set(x, "tickerDownIcon", js.undefined)
      
      inline def setTickerUpIcon(value: ReactNode): Self = StObject.set(x, "tickerUpIcon", value.asInstanceOf[js.Any])
      
      inline def setTickerUpIconUndefined: Self = StObject.set(x, "tickerUpIcon", js.undefined)
    }
  }
}
