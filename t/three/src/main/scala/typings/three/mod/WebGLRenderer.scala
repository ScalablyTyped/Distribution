package typings.three.mod

import typings.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLRenderer")
@js.native
/**
	 * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
	 */
class WebGLRenderer ()
  extends typings.three.webGLRendererMod.WebGLRenderer {
  def this(parameters: WebGLRendererParameters) = this()
}

