package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRendererParameters extends js.Object {
  /**
    * default is true.
    */
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default is false.
    */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A Canvas where the renderer draws its output.
    */
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * default is 0.
    */
  var clearAlpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * default is 0x000000.
    */
  var clearColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * A WebGL Rendering Context.
    * (https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
    *  Default is null
    */
  var context: js.UndefOr[stdLib.WebGLRenderingContext] = js.undefined
  var devicePixelRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * default is false.
    */
  var logarithmicDepthBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  shader precision. Can be "highp", "mediump" or "lowp".
    */
  var precision: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default is true.
    */
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default is false.
    */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default is true.
    */
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}

