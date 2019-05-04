package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-embed", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(el: java.lang.String, spec: java.lang.String): js.Promise[Result] = js.native
  def default(el: java.lang.String, spec: java.lang.String, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: java.lang.String, spec: VisualizationSpec): js.Promise[Result] = js.native
  def default(el: java.lang.String, spec: VisualizationSpec, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: stdLib.HTMLElement, spec: java.lang.String): js.Promise[Result] = js.native
  def default(el: stdLib.HTMLElement, spec: java.lang.String, opt: EmbedOptions): js.Promise[Result] = js.native
  def default(el: stdLib.HTMLElement, spec: VisualizationSpec): js.Promise[Result] = js.native
  def default(el: stdLib.HTMLElement, spec: VisualizationSpec, opt: EmbedOptions): js.Promise[Result] = js.native
  def guessMode(spec: VisualizationSpec): vegaDashEmbedLib.buildSrcTypesMod.Mode = js.native
  def guessMode(spec: VisualizationSpec, providedMode: vegaDashEmbedLib.buildSrcTypesMod.Mode): vegaDashEmbedLib.buildSrcTypesMod.Mode = js.native
}

