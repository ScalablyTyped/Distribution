package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherConfig extends js.Object {
  /** See: [[UrlConfig.caseInsensitive]] */ var caseInsensitive: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean]
  /** See: [[UrlConfig.defaultSquashPolicy]] */ var defaultSquashPolicy: js.Function1[
    /* value */ js.UndefOr[scala.Boolean | java.lang.String], 
    java.lang.String | scala.Boolean
  ]
  /** See: [[UrlConfig.strictMode]] */ var strictMode: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean]
  /** See: [[UrlConfig.type]] */ var `type`: js.Function3[
    /* name */ java.lang.String, 
    /* definition */ js.UndefOr[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition], 
    /* definitionFn */ js.UndefOr[js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]], 
    _
  ]
}

object UrlMatcherConfig {
  @scala.inline
  def apply(
    caseInsensitive: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean],
    defaultSquashPolicy: js.Function1[
      /* value */ js.UndefOr[scala.Boolean | java.lang.String], 
      java.lang.String | scala.Boolean
    ],
    strictMode: js.Function1[/* value */ js.UndefOr[scala.Boolean], scala.Boolean],
    `type`: js.Function3[
      /* name */ java.lang.String, 
      /* definition */ js.UndefOr[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition], 
      /* definitionFn */ js.UndefOr[js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]], 
      _
    ]
  ): UrlMatcherConfig = {
    val __obj = js.Dynamic.literal(caseInsensitive = caseInsensitive, defaultSquashPolicy = defaultSquashPolicy, strictMode = strictMode)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UrlMatcherConfig]
  }
}

