package typings.vegaTypings

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.backgroundMod.Background
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.scopeMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec", JSImport.Namespace)
@js.native
object specMod extends js.Object {
  @js.native
  trait Spec
    extends Scope
       with Encodable[EncodeEntry] {
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    var autosize: js.UndefOr[AutoSize] = js.native
    var background: js.UndefOr[Background] = js.native
    var config: js.UndefOr[Config] = js.native
    var description: js.UndefOr[String] = js.native
    var height: js.UndefOr[Double] = js.native
    var padding: js.UndefOr[Padding] = js.native
    var style: js.UndefOr[String | js.Array[String]] = js.native
    var width: js.UndefOr[Double] = js.native
  }
  
}

