package typings
package svgDashInjectorLib.svgDashInjectorMod.SVGInjectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGInjector extends js.Object {
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: js.Array[stdLib.Node]): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: js.Array[stdLib.Node], options: SVGInjectorOptions): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(
    elements: js.Array[stdLib.Node],
    options: SVGInjectorOptions,
    done: js.Function1[/* elementCount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: stdLib.Node): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: stdLib.NodeList): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: stdLib.NodeList, options: SVGInjectorOptions): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(
    elements: stdLib.NodeList,
    options: SVGInjectorOptions,
    done: js.Function1[/* elementCount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(elements: stdLib.Node, options: SVGInjectorOptions): scala.Unit = js.native
  /**
           * Replace the given elements with their full inline SVG DOM elements.
           *
           * @param elements Array of or single DOM element.
           * @param options Injector options.
           * @param done Callback that receives the injected element count as parameter.
           */
  def apply(
    elements: stdLib.Node,
    options: SVGInjectorOptions,
    done: js.Function1[/* elementCount */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

