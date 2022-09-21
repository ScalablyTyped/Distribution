package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.`0`
import typings.vscodeLanguageserver.serverMod.Feature
import typings.vscodeLanguageserver.serverMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monikerMod {
  
  @JSImport("vscode-languageserver/lib/common/moniker", "MonikerFeature")
  @js.native
  val MonikerFeature: Feature[_Languages, MonikerFeatureShape] = js.native
  
  trait MonikerFeatureShape extends StObject {
    
    var moniker: `0`
  }
  object MonikerFeatureShape {
    
    inline def apply(moniker: `0`): MonikerFeatureShape = {
      val __obj = js.Dynamic.literal(moniker = moniker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonikerFeatureShape]
    }
    
    extension [Self <: MonikerFeatureShape](x: Self) {
      
      inline def setMoniker(value: `0`): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
    }
  }
}
