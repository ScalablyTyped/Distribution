package typings.uiBox

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.uiBox.typesEnhancersMod.BoxPropValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandAliasesMod {
  
  @JSImport("ui-box/dist/src/expand-aliases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StringDictionary[BoxPropValue]): Map[String, BoxPropValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Map[String, BoxPropValue]]
}
