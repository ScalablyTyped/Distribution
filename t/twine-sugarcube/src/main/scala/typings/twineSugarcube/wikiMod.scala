package typings.twineSugarcube

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.DocumentFragment
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wikiMod {
  
  type OutputDestination = DocumentFragment | HTMLElement | JQuery
  
  @js.native
  trait WikifierAPI
    extends StObject
       with Instantiable2[
          (/* destination */ Null) | (/* destination */ OutputDestination), 
          /* source */ String, 
          Any
        ]
       with Instantiable3[
          (/* destination */ Null) | (/* destination */ OutputDestination), 
          /* source */ String, 
          /* options */ WikifierOptions, 
          Any
        ] {
    
    def createExternalLink(destination: OutputDestination, url: String, text: String): HTMLAnchorElement = js.native
    
    def createInternalLink(destination: OutputDestination, passage: String, text: String, callback: js.Function0[Unit]): HTMLAnchorElement = js.native
    
    def isExternalLink(link: String): Boolean = js.native
    
    def wikifyEval(text: String): DocumentFragment = js.native
  }
  
  trait WikifierOptions extends StObject {
    
    var ignoreTerminatorCase: js.UndefOr[Boolean] = js.undefined
    
    var profile: String
  }
  object WikifierOptions {
    
    inline def apply(profile: String): WikifierOptions = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[WikifierOptions]
    }
    
    extension [Self <: WikifierOptions](x: Self) {
      
      inline def setIgnoreTerminatorCase(value: Boolean): Self = StObject.set(x, "ignoreTerminatorCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTerminatorCaseUndefined: Self = StObject.set(x, "ignoreTerminatorCase", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
}
