package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlRulesApi extends js.Object {
  /** See: [[UrlRules.initial]] */ var initial: js.Function1[
    /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
    scala.Unit
  ]
  /** See: [[UrlRules.otherwise]] */ var otherwise: js.Function1[
    /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
    scala.Unit
  ]
  /** See: [[UrlRules.removeRule]] */ var removeRule: js.Function1[/* rule */ js.Any, scala.Unit]
  /** See: [[UrlRules.rule]] */ var rule: js.Function1[/* rule */ UrlRule, js.Function]
  /** See: [[UrlRules.rules]] */ var rules: js.Function0[js.Array[UrlRule]]
  /** See: [[UrlRules.sort]] */ var sort: js.Function1[
    /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, scala.Double]], 
    scala.Unit
  ]
  /** See: [[UrlRules.when]] */ var when: js.Function3[
    /* matcher */ stdLib.RegExp | atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher | java.lang.String, 
    /* handler */ java.lang.String | UrlRuleHandlerFn, 
    /* options */ js.UndefOr[atUirouterCoreLib.Anon_Priority], 
    UrlRule
  ]
}

object UrlRulesApi {
  @scala.inline
  def apply(
    initial: js.Function1[
      /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
      scala.Unit
    ],
    otherwise: js.Function1[
      /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
      scala.Unit
    ],
    removeRule: js.Function1[/* rule */ js.Any, scala.Unit],
    rule: js.Function1[/* rule */ UrlRule, js.Function],
    rules: js.Function0[js.Array[UrlRule]],
    sort: js.Function1[
      /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, scala.Double]], 
      scala.Unit
    ],
    when: js.Function3[
      /* matcher */ stdLib.RegExp | atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher | java.lang.String, 
      /* handler */ java.lang.String | UrlRuleHandlerFn, 
      /* options */ js.UndefOr[atUirouterCoreLib.Anon_Priority], 
      UrlRule
    ]
  ): UrlRulesApi = {
    val __obj = js.Dynamic.literal(initial = initial, otherwise = otherwise, removeRule = removeRule, rule = rule, rules = rules, sort = sort, when = when)
  
    __obj.asInstanceOf[UrlRulesApi]
  }
}

