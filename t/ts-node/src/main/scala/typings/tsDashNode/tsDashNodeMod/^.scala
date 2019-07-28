package typings.tsDashNode.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULTS: Options = js.native
  val INSPECT_CUSTOM: js.Symbol = js.native
  val VERSION: js.Any = js.native
  def normalizeSlashes(value: String): String = js.native
  def parse(): js.UndefOr[js.Object] = js.native
  def parse(value: String): js.UndefOr[js.Object] = js.native
  def register(): Register = js.native
  def register(opts: Options): Register = js.native
  def split(): js.UndefOr[js.Array[String]] = js.native
  def split(value: String): js.UndefOr[js.Array[String]] = js.native
}

