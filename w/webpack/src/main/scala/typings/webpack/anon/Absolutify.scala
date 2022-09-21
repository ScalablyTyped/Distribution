package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolutify extends StObject {
  
  def absolutify(context: String, request: String): String = js.native
  
  def contextify(context: String, request: String): String = js.native
  
  def createHash(): typings.webpack.mod.Hash = js.native
  def createHash(algorithm: String): typings.webpack.mod.Hash = js.native
}
