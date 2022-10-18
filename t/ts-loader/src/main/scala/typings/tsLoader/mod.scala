package typings.tsLoader

import typings.tsLoader.distInterfacesMod.LoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The entry point for ts-loader
    */
  inline def apply(contents: String): Unit = ^.asInstanceOf[js.Dynamic].apply(contents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("ts-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = LoaderOptions
}
