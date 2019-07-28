package typings.vegaDashTooltip.buildSrcHandlerMod

import typings.std.MouseEvent
import typings.std.Partial
import typings.vegaDashTooltip.buildSrcDefaultsMod.Options
import typings.vegaDashTypings.typesRuntimeMod.Item
import typings.vegaDashTypings.typesRuntimeMod.TooltipHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/src/Handler", "Handler")
@js.native
/**
  * Create the tooltip handler and initialize the element and style.
  *
  * @param options Tooltip Options
  */
class Handler () extends js.Object {
  def this(options: Partial[Options]) = this()
  /**
    * The handler function. We bind this to this function in the constructor.
    */
  @JSName("call")
  var call_Original: TooltipHandler = js.native
  /**
    * The tooltip html element.
    */
  var el: js.Any = js.native
  /**
    * Complete tooltip options.
    */
  var options: js.Any = js.native
  /**
    * The tooltip handler function.
    */
  var tooltipHandler: js.Any = js.native
  /**
    * The handler function. We bind this to this function in the constructor.
    */
  def call(handler: js.Any, event: MouseEvent, item: Item[_], value: js.Any): Unit = js.native
}

