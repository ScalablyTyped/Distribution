package typings.theo.theoMod

import typings.immutable.Immutable.Map
import typings.theo.theoStrings.aliases
import typings.theo.theoStrings.global
import typings.theo.theoStrings.imports
import typings.theo.theoStrings.meta
import typings.theo.theoStrings.options
import typings.theo.theoStrings.props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableStyleMap
  extends Map[String, js.Any] {
  @JSName("get")
  def get_aliases(key: aliases): Aliases = js.native
  @JSName("get")
  def get_global(key: global): Props = js.native
  @JSName("get")
  def get_imports(key: imports): js.Array[String] = js.native
  @JSName("get")
  def get_meta(key: meta): Meta = js.native
  @JSName("get")
  def get_options(key: options): js.Object = js.native
  @JSName("get")
  def get_props(key: props): Props = js.native
}

