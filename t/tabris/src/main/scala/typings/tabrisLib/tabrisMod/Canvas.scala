package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Canvas is a widget that can be used to draw graphics using a [canvas context](./CanvasContext.md).
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._CanvasProperties because Already inherited */ @JSImport("tabris", "Canvas")
@js.native
class Canvas () extends Composite {
  def this(properties: Properties[Canvas, TypeScriptPropertiesKey]) = this()
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Canvas: CanvasProperties = js.native
  /**
    * Returns the drawing context with the given size.
    * @param contextType The context identifier. Only `"2d"` is currently supported.
    * @param width the width of the canvas context to create
    * @param height the height of the canvas context to create
    */
  def getContext(contextType: java.lang.String, width: scala.Double, height: scala.Double): CanvasContext = js.native
}

