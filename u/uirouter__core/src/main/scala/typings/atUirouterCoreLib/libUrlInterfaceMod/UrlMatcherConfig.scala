package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatcherConfig extends js.Object {
  /** See: [[UrlConfig.caseInsensitive]] */ @JSName("caseInsensitive")
  var caseInsensitive_Original: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean] = js.native
  /** See: [[UrlConfig.defaultSquashPolicy]] */ @JSName("defaultSquashPolicy")
  var defaultSquashPolicy_Original: js.Function1[
    /* value */ js.UndefOr[scala.Boolean | java.lang.String], 
    java.lang.String | scala.Boolean
  ] = js.native
  /** See: [[UrlConfig.strictMode]] */ @JSName("strictMode")
  var strictMode_Original: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean] = js.native
  /** See: [[UrlConfig.type]] */ @JSName("type")
  var type_Original: js.Function3[
    /* name */ java.lang.String, 
    /* definition */ js.UndefOr[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition], 
    /* definitionFn */ js.UndefOr[js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]], 
    _
  ] = js.native
  /** See: [[UrlConfig.caseInsensitive]] */ def caseInsensitive(): scala.Boolean = js.native
  def caseInsensitive(value: scala.Boolean): scala.Boolean = js.native
  /** See: [[UrlConfig.defaultSquashPolicy]] */ def defaultSquashPolicy(): java.lang.String | scala.Boolean = js.native
  def defaultSquashPolicy(value: java.lang.String): java.lang.String | scala.Boolean = js.native
  def defaultSquashPolicy(value: scala.Boolean): java.lang.String | scala.Boolean = js.native
  /** See: [[UrlConfig.strictMode]] */ def strictMode(): scala.Boolean = js.native
  def strictMode(value: scala.Boolean): scala.Boolean = js.native
  /** See: [[UrlConfig.type]] */ def `type`(name: java.lang.String): js.Any = js.native
  def `type`(name: java.lang.String, definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition): js.Any = js.native
  def `type`(
    name: java.lang.String,
    definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition,
    definitionFn: js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]
  ): js.Any = js.native
}

