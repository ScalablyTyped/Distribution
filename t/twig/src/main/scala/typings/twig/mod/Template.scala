package typings.twig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  def compile(options: js.Any): String = js.native
  def getLoaderMethod(): String = js.native
  def importBlocks(file: String): Unit = js.native
  def importBlocks(file: String, `override`: Boolean): Unit = js.native
  def importFile(file: String): Template = js.native
  def importMacros(file: String): Template = js.native
  def render(): String | js.Promise[String] = js.native
  def render(context: js.Any): String | js.Promise[String] = js.native
  def render(context: js.Any, params: js.Any): String | js.Promise[String] = js.native
  def render(context: js.Any, params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
  def renderAsync(): js.Promise[String] = js.native
  def renderAsync(context: js.Any): js.Promise[String] = js.native
  def renderAsync(context: js.Any, params: js.Any): js.Promise[String] = js.native
  def reset(blocks: js.Any): Unit = js.native
}

