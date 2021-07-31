package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildMeta extends StObject {
  
  /**
  		 * Meta information about the module
  		 */
  var buildMeta: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
  		 * Information about the provided exports of the module
  		 */
  var exports: js.UndefOr[`true` | js.Array[String]] = js.undefined
  
  /**
  		 * Module ID
  		 */
  var id: Double | String
}
object BuildMeta {
  
  @scala.inline
  def apply(id: Double | String): BuildMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildMeta]
  }
  
  @scala.inline
  implicit class BuildMetaMutableBuilder[Self <: BuildMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildMeta(value: StringDictionary[js.Any]): Self = StObject.set(x, "buildMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildMetaUndefined: Self = StObject.set(x, "buildMeta", js.undefined)
    
    @scala.inline
    def setExports(value: `true` | js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
