package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsModuleTraceItem extends StObject {
  
  var dependencies: js.UndefOr[js.Array[StatsModuleTraceDependency]] = js.undefined
  
  var moduleId: js.UndefOr[String | Double] = js.undefined
  
  var moduleIdentifier: js.UndefOr[String] = js.undefined
  
  var moduleName: js.UndefOr[String] = js.undefined
  
  var originId: js.UndefOr[String | Double] = js.undefined
  
  var originIdentifier: js.UndefOr[String] = js.undefined
  
  var originName: js.UndefOr[String] = js.undefined
}
object KnownStatsModuleTraceItem {
  
  inline def apply(): KnownStatsModuleTraceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsModuleTraceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsModuleTraceItem] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: js.Array[StatsModuleTraceDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: StatsModuleTraceDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setModuleId(value: String | Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setModuleIdentifier(value: String): Self = StObject.set(x, "moduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setModuleIdentifierUndefined: Self = StObject.set(x, "moduleIdentifier", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setOriginId(value: String | Double): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
    
    inline def setOriginIdUndefined: Self = StObject.set(x, "originId", js.undefined)
    
    inline def setOriginIdentifier(value: String): Self = StObject.set(x, "originIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOriginIdentifierUndefined: Self = StObject.set(x, "originIdentifier", js.undefined)
    
    inline def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
    
    inline def setOriginNameUndefined: Self = StObject.set(x, "originName", js.undefined)
  }
}
