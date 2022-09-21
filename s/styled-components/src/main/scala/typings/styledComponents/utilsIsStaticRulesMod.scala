package typings.styledComponents

import typings.styledComponents.nativeDistTypesMod.RuleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsIsStaticRulesMod {
  
  @JSImport("styled-components/native/dist/utils/isStaticRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](rules: RuleSet[Props]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rules.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
