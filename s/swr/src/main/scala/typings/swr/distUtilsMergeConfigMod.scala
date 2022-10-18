package typings.swr

import typings.swr.anon.PartialFullConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMergeConfigMod {
  
  @JSImport("swr/dist/utils/merge-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeConfigs(a: PartialFullConfiguration): PartialFullConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigs")(a.asInstanceOf[js.Any]).asInstanceOf[PartialFullConfiguration]
  inline def mergeConfigs(a: PartialFullConfiguration, b: PartialFullConfiguration): PartialFullConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[PartialFullConfiguration]
}
