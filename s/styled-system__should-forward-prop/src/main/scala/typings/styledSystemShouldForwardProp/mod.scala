package typings.styledSystemShouldForwardProp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@styled-system/should-forward-prop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@styled-system/should-forward-prop", JSImport.Default)
  @js.native
  val default: genericShouldForwardProp = js.native
  
  inline def createShouldForwardProp(props: js.Array[String]): genericShouldForwardProp = ^.asInstanceOf[js.Dynamic].applyDynamic("createShouldForwardProp")(props.asInstanceOf[js.Any]).asInstanceOf[genericShouldForwardProp]
  
  @JSImport("@styled-system/should-forward-prop", "props")
  @js.native
  val props: js.Array[String] = js.native
  
  type genericShouldForwardProp = js.Function1[/* prop */ String, Boolean]
}
