package typings.styledSystemProps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@styled-system/props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omit(props: PropsMap): PropsMap = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(props.asInstanceOf[js.Any]).asInstanceOf[PropsMap]
  
  inline def pick(props: PropsMap): PropsMap = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(props.asInstanceOf[js.Any]).asInstanceOf[PropsMap]
  
  type PropsMap = StringDictionary[Any]
}
