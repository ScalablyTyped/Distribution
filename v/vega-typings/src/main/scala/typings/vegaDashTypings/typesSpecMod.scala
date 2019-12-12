package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaDashTypings.typesSpecBackgroundMod.Background
import typings.vegaDashTypings.typesSpecConfigMod.Config
import typings.vegaDashTypings.typesSpecEncodeMod.Encodable
import typings.vegaDashTypings.typesSpecEncodeMod.EncodeEntry
import typings.vegaDashTypings.typesSpecPaddingMod.Padding
import typings.vegaDashTypings.typesSpecScopeMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec", JSImport.Namespace)
@js.native
object typesSpecMod extends js.Object {
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

