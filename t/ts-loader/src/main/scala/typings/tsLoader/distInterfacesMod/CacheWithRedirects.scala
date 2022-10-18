package typings.tsLoader.distInterfacesMod

import typings.std.Map
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Path
import typings.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheWithRedirects[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def getOrCreateMapOfCacheRedirects(): Map[String, T] = js.native
  def getOrCreateMapOfCacheRedirects(redirectedReference: ResolvedProjectReference): Map[String, T] = js.native
  
  var ownMap: Map[String, T] = js.native
  
  var redirectsMap: Map[Path, Map[String, T]] = js.native
  
  def setOwnMap(newOwnMap: Map[String, T]): Unit = js.native
  
  def setOwnOptions(newOptions: CompilerOptions): Unit = js.native
}
