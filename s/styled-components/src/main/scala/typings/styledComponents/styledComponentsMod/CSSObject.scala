package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSObject
  extends StObject
     with Properties[String | Double]
     with CSSPseudos
     with /* key */ StringDictionary[js.UndefOr[CSSObject | String | Double]]
     with _InterpolationValue
object CSSObject {
  
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
}
