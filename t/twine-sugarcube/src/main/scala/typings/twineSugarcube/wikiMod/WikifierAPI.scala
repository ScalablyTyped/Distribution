package typings.twineSugarcube.wikiMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
