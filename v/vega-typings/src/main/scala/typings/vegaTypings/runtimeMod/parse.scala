package typings.vegaTypings.runtimeMod

import typings.vegaTypings.anon.Ast
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "parse")
@js.native
object parse extends js.Object {
  def apply(spec: Spec): Runtime = js.native
  def apply(spec: Spec, config: Config): Runtime = js.native
  def apply(spec: Spec, config: Config, opt: Ast): Runtime = js.native
}

