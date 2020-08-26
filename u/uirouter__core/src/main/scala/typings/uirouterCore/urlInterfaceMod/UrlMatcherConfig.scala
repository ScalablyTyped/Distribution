package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatcherConfig extends js.Object {
  /** See: [[UrlConfig.caseInsensitive]] */ @JSName("caseInsensitive")
  var caseInsensitive_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean] = js.native
  /** See: [[UrlConfig.defaultSquashPolicy]] */ @JSName("defaultSquashPolicy")
  var defaultSquashPolicy_Original: js.Function1[/* value */ js.UndefOr[Boolean | String], String | Boolean] = js.native
  /** See: [[UrlConfig.strictMode]] */ @JSName("strictMode")
  var strictMode_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean] = js.native
  /** See: [[UrlConfig.type]] */ @JSName("type")
  var type_Original: js.Function3[
    /* name */ String, 
    /* definition */ js.UndefOr[ParamTypeDefinition], 
    /* definitionFn */ js.UndefOr[js.Function0[ParamTypeDefinition]], 
    _
  ] = js.native
  /** See: [[UrlConfig.caseInsensitive]] */ def caseInsensitive(): Boolean = js.native
  def caseInsensitive(value: Boolean): Boolean = js.native
  /** See: [[UrlConfig.defaultSquashPolicy]] */ def defaultSquashPolicy(): String | Boolean = js.native
  def defaultSquashPolicy(value: String): String | Boolean = js.native
  def defaultSquashPolicy(value: Boolean): String | Boolean = js.native
  /** See: [[UrlConfig.strictMode]] */ def strictMode(): Boolean = js.native
  def strictMode(value: Boolean): Boolean = js.native
  /** See: [[UrlConfig.type]] */ def `type`(name: String): js.Any = js.native
  def `type`(
    name: String,
    definition: js.UndefOr[scala.Nothing],
    definitionFn: js.Function0[ParamTypeDefinition]
  ): js.Any = js.native
  def `type`(name: String, definition: ParamTypeDefinition): js.Any = js.native
  def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): js.Any = js.native
}

