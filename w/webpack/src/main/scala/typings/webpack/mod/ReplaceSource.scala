package typings.webpack.mod

import typings.webpack.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceSource
  extends StObject
     with Source {
  
  def getName(): String = js.native
  
  def getReplacements(): js.Array[End] = js.native
  
  def insert(pos: Double, newValue: String): Unit = js.native
  def insert(pos: Double, newValue: String, name: String): Unit = js.native
  
  def original(): String = js.native
  
  def replace(start: Double, end: Double, newValue: String): Unit = js.native
  def replace(start: Double, end: Double, newValue: String, name: String): Unit = js.native
}
