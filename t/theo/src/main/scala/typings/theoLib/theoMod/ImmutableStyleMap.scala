package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableStyleMap
  extends immutableLib.immutableMod.Map[java.lang.String, js.Any] {
  @JSName("get")
  def get_aliases(key: theoLib.theoLibStrings.aliases): Aliases = js.native
  @JSName("get")
  def get_meta(key: theoLib.theoLibStrings.meta): Meta = js.native
  @JSName("get")
  def get_options(key: theoLib.theoLibStrings.options): js.Object = js.native
  @JSName("get")
  def get_props(key: theoLib.theoLibStrings.props): Props = js.native
}

