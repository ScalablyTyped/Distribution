package typings
package twigLib.twigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  def compile(options: js.Any): java.lang.String = js.native
  def getLoaderMethod(): java.lang.String = js.native
  def importBlocks(file: java.lang.String): scala.Unit = js.native
  def importBlocks(file: java.lang.String, `override`: scala.Boolean): scala.Unit = js.native
  def importFile(file: java.lang.String): Template = js.native
  def importMacros(file: java.lang.String): Template = js.native
  def render(): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(context: js.Any): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(context: js.Any, params: js.Any): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(context: js.Any, params: js.Any, allow_async: scala.Boolean): java.lang.String | js.Promise[java.lang.String] = js.native
  def renderAsync(): js.Promise[java.lang.String] = js.native
  def renderAsync(context: js.Any): js.Promise[java.lang.String] = js.native
  def renderAsync(context: js.Any, params: js.Any): js.Promise[java.lang.String] = js.native
  def reset(blocks: js.Any): scala.Unit = js.native
}

