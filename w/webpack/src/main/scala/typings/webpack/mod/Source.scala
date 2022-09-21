package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  def buffer(): Buffer = js.native
  
  def map(): js.Object = js.native
  def map(options: MapOptions): js.Object = js.native
  
  def size(): Double = js.native
  
  def source(): String | Buffer = js.native
  
  def sourceAndMap(): Map = js.native
  def sourceAndMap(options: MapOptions): Map = js.native
  
  def updateHash(hash: Hash): Unit = js.native
}
