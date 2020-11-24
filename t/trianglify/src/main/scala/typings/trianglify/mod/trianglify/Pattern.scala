package typings.trianglify.mod.trianglify

import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends js.Object {
  
  def canvas(): HTMLCanvasElement = js.native
  def canvas(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
  
  var opts: Options = js.native
  
  def png(): String = js.native
  
  var polys: js.Any = js.native
  
  def svg(): SVGElement = js.native
  def svg(opts: SVGOptions): SVGElement = js.native
}
