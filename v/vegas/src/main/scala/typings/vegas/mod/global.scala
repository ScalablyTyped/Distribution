package typings.vegas.mod

import typings.jquery.JQuery.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery[TElement] extends js.Object {
    
    def on(
      events: VegasEnd,
      handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
    ): this.type = js.native
    def on(events: VegasInitEvent, handler: js.Function2[/* event */ Event, /* settings */ Settings, Unit]): this.type = js.native
    def on(
      events: VegasPause,
      handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
    ): this.type = js.native
    def on(
      events: VegasPlay,
      handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
    ): this.type = js.native
    def on(
      events: VegasWalk,
      handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
    ): this.type = js.native
    
    def vegas(): JQuery[HTMLElement] = js.native
    def vegas(config: Settings): JQuery[HTMLElement] = js.native
    @JSName("vegas")
    var vegas_Original: JQueryExtension = js.native
  }
  
  @js.native
  trait JQueryStatic extends js.Object {
    
    def vegas(): JQuery[HTMLElement] = js.native
    def vegas(config: Settings): JQuery[HTMLElement] = js.native
    @JSName("vegas")
    var vegas_Original: JQueryExtension = js.native
  }
}
