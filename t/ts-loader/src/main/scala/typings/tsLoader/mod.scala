package typings.tsLoader

import typings.tsLoader.interfacesMod.LoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * The entry point for ts-loader
    */
  def apply(contents: String): Unit = js.native
  
  type Options = LoaderOptions
}
