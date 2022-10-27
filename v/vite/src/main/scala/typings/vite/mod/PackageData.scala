package typings.vite.mod

import typings.std.Record
import typings.vite.anon.Dictfield
import typings.vite.viteStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageData extends StObject {
  
  var data: Dictfield
  
  var dir: String
  
  def getResolvedCache(key: String, targetWeb: Boolean): js.UndefOr[String]
  
  def hasSideEffects(id: String): Boolean | `no-treeshake`
  
  var nodeResolvedImports: Record[String, js.UndefOr[String]]
  
  def setResolvedCache(key: String, entry: String, targetWeb: Boolean): Unit
  
  var webResolvedImports: Record[String, js.UndefOr[String]]
}
object PackageData {
  
  inline def apply(
    data: Dictfield,
    dir: String,
    getResolvedCache: (String, Boolean) => js.UndefOr[String],
    hasSideEffects: String => Boolean | `no-treeshake`,
    nodeResolvedImports: Record[String, js.UndefOr[String]],
    setResolvedCache: (String, String, Boolean) => Unit,
    webResolvedImports: Record[String, js.UndefOr[String]]
  ): PackageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], getResolvedCache = js.Any.fromFunction2(getResolvedCache), hasSideEffects = js.Any.fromFunction1(hasSideEffects), nodeResolvedImports = nodeResolvedImports.asInstanceOf[js.Any], setResolvedCache = js.Any.fromFunction3(setResolvedCache), webResolvedImports = webResolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageData]
  }
  
  extension [Self <: PackageData](x: Self) {
    
    inline def setData(value: Dictfield): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setGetResolvedCache(value: (String, Boolean) => js.UndefOr[String]): Self = StObject.set(x, "getResolvedCache", js.Any.fromFunction2(value))
    
    inline def setHasSideEffects(value: String => Boolean | `no-treeshake`): Self = StObject.set(x, "hasSideEffects", js.Any.fromFunction1(value))
    
    inline def setNodeResolvedImports(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "nodeResolvedImports", value.asInstanceOf[js.Any])
    
    inline def setSetResolvedCache(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "setResolvedCache", js.Any.fromFunction3(value))
    
    inline def setWebResolvedImports(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "webResolvedImports", value.asInstanceOf[js.Any])
  }
}
