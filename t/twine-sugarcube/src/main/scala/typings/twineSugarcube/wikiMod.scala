package typings.twineSugarcube

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.DocumentFragment
import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wikiMod {
  
  type OutputDestination = DocumentFragment | HTMLElement | JQuery
  
  @js.native
  trait WikifierAPI
    extends Instantiable2[
          (/* destination */ Null) | (/* destination */ OutputDestination), 
          /* source */ String, 
          js.Any
        ]
       with Instantiable3[
          (/* destination */ Null) | (/* destination */ OutputDestination), 
          /* source */ String, 
          /* options */ WikifierOptions, 
          js.Any
        ] {
    
    def createExternalLink(destination: OutputDestination, url: String, text: String): HTMLElement = js.native
    
    def createInternalLink(destination: OutputDestination, passage: String, text: String, callback: js.Function0[Unit]): HTMLElement = js.native
    
    def isExternalLink(link: String): Boolean = js.native
    
    def wikifyEval(text: String): String = js.native
  }
  
  @js.native
  trait WikifierOptions extends StObject {
    
    var ignoreTerminatorCase: js.UndefOr[Boolean] = js.native
    
    var profile: String = js.native
  }
  object WikifierOptions {
    
    @scala.inline
    def apply(profile: String): WikifierOptions = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[WikifierOptions]
    }
    
    @scala.inline
    implicit class WikifierOptionsMutableBuilder[Self <: WikifierOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreTerminatorCase(value: Boolean): Self = StObject.set(x, "ignoreTerminatorCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTerminatorCaseUndefined: Self = StObject.set(x, "ignoreTerminatorCase", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
}
