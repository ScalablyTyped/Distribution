package typings
package vegaDashTooltipLib.buildSrcHandlerMod

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
  def this(options: stdLib.Partial[vegaDashTooltipLib.buildSrcDefaultsMod.Options]) = this()
  /**
    * The handler function. We bind this to this function in the constructor.
    */
  @JSName("call")
  var call_Original: vegaDashTypingsLib.typesRuntimeMod.TooltipHandler = js.native
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
  def call(
    handler: js.Any,
    event: stdLib.MouseEvent,
    item: vegaDashTypingsLib.typesRuntimeMod.Item[_],
    value: js.Any
  ): scala.Unit = js.native
}

