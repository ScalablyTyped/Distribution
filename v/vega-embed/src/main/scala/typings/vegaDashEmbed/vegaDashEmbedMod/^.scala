package typings.vegaDashEmbed.vegaDashEmbedMod

import typings.std.HTMLElement
import typings.vegaDashEmbed.buildSrcTypesMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-embed", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(el: String, spec: String): js.Promise[Result] = js.native
  def default(el: String, spec: String, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: String, spec: VisualizationSpec): js.Promise[Result] = js.native
  def default(el: String, spec: VisualizationSpec, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: HTMLElement, spec: String): js.Promise[Result] = js.native
  def default(el: HTMLElement, spec: String, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: HTMLElement, spec: VisualizationSpec): js.Promise[Result] = js.native
  def default(el: HTMLElement, spec: VisualizationSpec, opt: EmbedOptions): js.Promise[Result] = js.native
  def guessMode(spec: VisualizationSpec): Mode = js.native
  def guessMode(spec: VisualizationSpec, providedMode: Mode): Mode = js.native
}

