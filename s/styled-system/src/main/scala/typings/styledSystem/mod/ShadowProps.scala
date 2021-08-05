package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with BoxShadowProps[ThemeType]
     with TextShadowProps[ThemeType]
object ShadowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowProps[ThemeType]]
  }
}
