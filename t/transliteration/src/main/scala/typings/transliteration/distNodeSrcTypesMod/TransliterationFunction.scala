package typings.transliteration.distNodeSrcTypesMod

import typings.transliteration.distNodeDataCharmapMod.Charmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransliterationFunction[T] extends js.Object {
  /**
    * Used by browser
    */
  var noConflict: js.UndefOr[js.Function0[TransliterationFunction[T]]] = js.native
  def apply(source: String): String = js.native
  def apply(source: String, options: T): String = js.native
  /**
    * Set default config
    * @param options
    * @param reset
    */
  def config(): T = js.native
  def config(options: T): T = js.native
  def config(options: T, reset: Boolean): T = js.native
  /**
    * Set charmap data
    * @param data
    * @param reset
    * @memberof Transliterate
    */
  def setData(): Charmap = js.native
  def setData(data: Charmap): Charmap = js.native
  def setData(data: Charmap, reset: Boolean): Charmap = js.native
}

